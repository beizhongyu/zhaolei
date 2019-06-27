package com.zl.first.test.service.impl;
import com.zl.first.test.mapper.master.AmsAssetDynamicSqlSupport;
import com.zl.first.test.mapper.master.AmsAssetMapper;
import com.zl.first.test.model.master.AmsAsset;
import com.zl.first.test.service.IAssetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Service("assetService")
public class AssetServiceImpl implements IAssetService{
    @Resource
    private AmsAssetMapper amsAssetMapper;
    @Override
    public List<AmsAsset> findAssetListByUserId(String userId) {
        List<AmsAsset> assetList = amsAssetMapper.selectByExample()
                .where(AmsAssetDynamicSqlSupport.isValite,isEqualTo(1))
                .and(AmsAssetDynamicSqlSupport.person,isEqualTo(userId))
                .build()
                .execute();
        return  assetList;
    }
}
