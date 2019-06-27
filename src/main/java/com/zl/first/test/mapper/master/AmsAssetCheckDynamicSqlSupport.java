package com.zl.first.test.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AmsAssetCheckDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    public static final AmsAssetCheck amsAssetCheck = new AmsAssetCheck();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_check.id")
    public static final SqlColumn<String> id = amsAssetCheck.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_check.name")
    public static final SqlColumn<String> name = amsAssetCheck.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_check.company_id")
    public static final SqlColumn<String> companyId = amsAssetCheck.companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_check.dept")
    public static final SqlColumn<String> dept = amsAssetCheck.dept;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_check.startTime")
    public static final SqlColumn<Long> starttime = amsAssetCheck.starttime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_check.endTime")
    public static final SqlColumn<Long> endtime = amsAssetCheck.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_check.category")
    public static final SqlColumn<String> category = amsAssetCheck.category;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_check.product")
    public static final SqlColumn<String> product = amsAssetCheck.product;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_check.user_id")
    public static final SqlColumn<String> userId = amsAssetCheck.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_check.note")
    public static final SqlColumn<String> note = amsAssetCheck.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_check.is_valite")
    public static final SqlColumn<Integer> isValite = amsAssetCheck.isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_check.create_time")
    public static final SqlColumn<Long> createTime = amsAssetCheck.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_check.modify_time")
    public static final SqlColumn<Long> modifyTime = amsAssetCheck.modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_check.version")
    public static final SqlColumn<Integer> version = amsAssetCheck.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    public static final class AmsAssetCheck extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> companyId = column("company_id", JDBCType.VARCHAR);

        public final SqlColumn<String> dept = column("dept", JDBCType.VARCHAR);

        public final SqlColumn<Long> starttime = column("startTime", JDBCType.BIGINT);

        public final SqlColumn<Long> endtime = column("endTime", JDBCType.BIGINT);

        public final SqlColumn<String> category = column("category", JDBCType.VARCHAR);

        public final SqlColumn<String> product = column("product", JDBCType.VARCHAR);

        public final SqlColumn<String> userId = column("user_id", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isValite = column("is_valite", JDBCType.INTEGER);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyTime = column("modify_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public AmsAssetCheck() {
            super("ams_asset_check");
        }
    }
}