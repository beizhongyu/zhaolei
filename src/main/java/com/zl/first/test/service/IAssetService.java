package com.zl.first.test.service;

import com.zl.first.test.model.master.AmsAsset;

import java.util.List;

public interface IAssetService {
    /**
     * 根据条件查询资产信息
     *
     * @param userId 员工id
     * @return AmsAsset 数据对象
     */
    List<AmsAsset> findAssetListByUserId(String userId);

}
