package com.zl.first.test.service.impl;

import com.zl.first.test.mapper.master.AmsAssetDynamicSqlSupport;
import com.zl.first.test.mapper.master.AmsAssetMapper;
import com.zl.first.test.mapper.slave.O2ApplicationDynamicSqlSupport;
import com.zl.first.test.mapper.slave.O2ApplicationMapper;
import com.zl.first.test.model.master.AmsAsset;
import com.zl.first.test.model.slave.O2Application;
import com.zl.first.test.service.IApplicationService;
import com.zl.first.test.service.IAssetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Service("applicationService")
public class ApplicationServiceImpl implements IApplicationService{
    @Resource
    private O2ApplicationMapper o2ApplicationMapper;
    @Override
    public List<O2Application> findApplicationListByCateId(String categoryId) {
        List<O2Application> assetList = o2ApplicationMapper.selectByExample()
                .where(O2ApplicationDynamicSqlSupport.status,isEqualTo("ENABLE"))
                .and(O2ApplicationDynamicSqlSupport.categoryId,isEqualTo(categoryId))
                .build()
                .execute();
        return  assetList;
    }
}
