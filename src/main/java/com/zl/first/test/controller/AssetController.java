package com.zl.first.test.controller;

import com.zl.first.test.model.master.AmsAsset;
import com.zl.first.test.service.IAssetService;
import com.zl.first.test.service.Result;
import com.zl.first.test.service.impl.ResultSupport;
import com.zl.first.test.util.DateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.*;

@RestController
@RequestMapping(value="/zl")
public class AssetController {
    private final static Logger logger = LoggerFactory.getLogger(AssetController.class);
    @Resource
    private IAssetService assetService;

    /**
     * 获取资产信息
     */
    @RequestMapping(value = {"/getAsset/list"},method = RequestMethod.GET)
    public Result<List<AmsAsset>> findAssetList(String userId){
        Result<List<AmsAsset>> result = new ResultSupport<>();
        List<AmsAsset> asetList = assetService.findAssetListByUserId(userId);
        result.setSuccess(true);
        result.setModel(asetList);
        result.setMessage("获取资源成功！");
        return result;
    }

    /**
     *导入资产信息
     * @param file
     * @return
     */
    @RequestMapping("/importBatch")
    public Result<List<String>> importBatch( @RequestParam("file") MultipartFile file) {
        Result<List<String>> result = new ResultSupport<>();
        if (file == null || file.getSize() == 0) {//文件大小
            result.setSuccess(false);
            result.setMessage("请选择需要导入的文件！");
            return  result;
        }
        if (!file.getOriginalFilename().endsWith(".xlsx")) {//文件类型
            result.setSuccess(false);
            result.setMessage("该文件不是正规的Excel文件，目前只支持xls、xlsx格式，请检查!");
            return  result;
        }
        try {
            //文件内容校验
            InputStream in = file.getInputStream();
            XSSFWorkbook hssfWorkbook = new XSSFWorkbook(in);
            //Workbook workbook = WorkbookFactory.create(in);
            XSSFFormulaEvaluator formulaEvaluator = new XSSFFormulaEvaluator(hssfWorkbook);
            //Sheet sheet = workbook.getSheetAt(0);//第一个表格页

            XSSFSheet sheet = hssfWorkbook.getSheetAt(0);
            if (sheet.getLastRowNum() < 1) {//文件内容
                result.setSuccess(false);
                result.setMessage("文件内未找到需要导入的信息，请检查！");
                return  result;
            }
            if (sheet.getPhysicalNumberOfRows() > 50001) {
                result.setSuccess(false);
                result.setMessage("文件内容超出限制，每次导入最多允许5W条数据！");
                return  result;
            }
            result = getAmsAssetInfoFromRow(sheet,formulaEvaluator);
        } catch (Exception e) {
            logger.error("[companycard] CompanyCardController.importBatch() Exception.", e);
            result.setSuccess(false);
            result.setMessage("系统错误！");
            return  result;
        }
        return  result;
    }

    private  Result<List<String>> getAmsAssetInfoFromRow(Sheet sheet,XSSFFormulaEvaluator formulaEvaluator){
        Result<List<String>> result = new ResultSupport<>();
        List<AmsAsset> assetsList = new ArrayList<>();
        List<String> msgList = new ArrayList<>();
        //逐条校验数据有效性
        for (int i = 2; i <= sheet.getLastRowNum(); i++) {
            AmsAsset asset = new AmsAsset();
            Row row = sheet.getRow(i);
            if (isBlankRow(row)|| StringUtils.isEmpty(getValue(row.getCell(0)))|| StringUtils.isEmpty(getValue(row.getCell(3)))) {
                continue;
            }
            try{
                //isv_pid
                Cell isvPidCell = row.getCell(0);
                String isvPidValue= getValue(isvPidCell);
                if(StringUtils.isEmpty(isvPidValue)){
                    msgList.add("第" + i + "行，二维火的PID不能为空。");
                }else{
                    asset.setAssetCode(isvPidValue);
                }
            } catch (Exception e) {
                msgList.add("第" + i + "行，二维火的PID不能为空。");
            }

            try{
                //购买时间
                Cell buyTimeCell = row.getCell(1);
                if (buyTimeCell == null) {
                    asset.setBuyTime(0L);
                } else {
                    /*CellValue tempCellValue = formulaEvaluator.evaluate(buyTimeCell);
                    double iCellValue = tempCellValue.getNumberValue();
                    amsAsset.setBuyTime(Long.valueOf((long) iCellValue));*/
                    Date date = buyTimeCell.getDateCellValue();
                    if(date!=null){
                        asset.setBuyTime(DateUtil.date2long(date));
                    }else{
                        asset.setBuyTime(0L);
                    }
                }
            } catch (Exception e) {
                asset.setBuyTime(0L);
            }


            assetsList.add(asset);
        }
        if (org.springframework.util.CollectionUtils.isEmpty(msgList)) {
            if (assetsList.size() < 1 || assetsList.size() > 50000) {
                result.setSuccess(false);
                result.setMessage("文件内数据量不正确，导入数据应在1-5W条之间！");
                return result;
            }
           // result = koubeiService.importDatas(assetsList);
        }else{
            result.setSuccess(false);
            result.setMessage("导入失败!" + msgList);
        }
        return result;
    }
    /**
     * excell空行校验
     *
     * @param row 行
     * @return 结果
     */
    private boolean isBlankRow(Row row) {
        if (null == row) return true;
        boolean result = true;
        for (int i = row.getFirstCellNum(); i < row.getLastCellNum(); i++) {
            Cell cell = row.getCell(i, Row.RETURN_BLANK_AS_NULL);
            String value = "";
            if (null != cell) {
                switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        value = cell.getStringCellValue();
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        value = String.valueOf(cell.getNumericCellValue());
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        value = String.valueOf(cell.getBooleanCellValue());
                        break;
                    case Cell.CELL_TYPE_FORMULA:
                        value = cell.getCellFormula();
                        break;
                    default:
                        break;
                }
                if (value == null || !value.trim().equals("")) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

    /**
     * excell空行校验
     *
     * @param cell 行
     * @return 结果
     */
    private String getValue(Cell cell) {
        String value = "";
        DecimalFormat df = new DecimalFormat("#");
        if (null != cell) {
            switch (cell.getCellType()) {
                case Cell.CELL_TYPE_NUMERIC:
                    value = String.valueOf(df.format(cell.getNumericCellValue()));
                    break;
                case Cell.CELL_TYPE_STRING:
                    value = cell.getStringCellValue();
                    break;
                case Cell.CELL_TYPE_BOOLEAN:
                    value = String.valueOf(cell.getBooleanCellValue());
                    break;
                case Cell.CELL_TYPE_FORMULA:
                    value = cell.getCellFormula();
                    break;
                default:
                    value = "";
                    break;
            }
        }
        return value;
    }

}
