package com.zl.first.test.controller;

import com.zl.first.test.model.master.AmsAsset;
import com.zl.first.test.model.slave.O2Application;
import com.zl.first.test.service.IApplicationService;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value="/zl")
public class ApplicationController {
    private final static Logger logger = LoggerFactory.getLogger(ApplicationController.class);
    @Resource
    private IApplicationService applicationService;

    /**
     * 获取资产信息
     */
    @RequestMapping(value = {"/getApplication/list"},method = RequestMethod.GET)
    public Result<List<O2Application>> findAssetList(String categoryId){
        Result<List<O2Application>> result = new ResultSupport<>();
        List<O2Application> asetList = applicationService.findApplicationListByCateId(categoryId);
        result.setSuccess(true);
        result.setModel(asetList);
        result.setMessage("获取资源成功！");
        return result;
    }
}
