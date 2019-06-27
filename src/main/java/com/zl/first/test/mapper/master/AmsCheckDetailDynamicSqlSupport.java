package com.zl.first.test.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AmsCheckDetailDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    public static final AmsCheckDetail amsCheckDetail = new AmsCheckDetail();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_detail.id")
    public static final SqlColumn<String> id = amsCheckDetail.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_detail.order_id")
    public static final SqlColumn<String> orderId = amsCheckDetail.orderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_detail.asset_id")
    public static final SqlColumn<String> assetId = amsCheckDetail.assetId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_detail.is_valite")
    public static final SqlColumn<Integer> isValite = amsCheckDetail.isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_detail.create_time")
    public static final SqlColumn<Long> createTime = amsCheckDetail.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_detail.modify_time")
    public static final SqlColumn<Long> modifyTime = amsCheckDetail.modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_detail.version")
    public static final SqlColumn<Integer> version = amsCheckDetail.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    public static final class AmsCheckDetail extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> orderId = column("order_id", JDBCType.VARCHAR);

        public final SqlColumn<String> assetId = column("asset_id", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isValite = column("is_valite", JDBCType.INTEGER);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyTime = column("modify_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public AmsCheckDetail() {
            super("ams_check_detail");
        }
    }
}