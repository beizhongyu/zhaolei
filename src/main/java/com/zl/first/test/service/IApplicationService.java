package com.zl.first.test.service;

import com.zl.first.test.model.master.AmsAsset;
import com.zl.first.test.model.slave.O2Application;

import java.util.List;

public interface IApplicationService {
    /**
     * 根据条件查询资产信息
     *
     * @param categoryId 员工id
     * @return AmsAsset 数据对象
     */
    List<O2Application> findApplicationListByCateId(String categoryId);

}
