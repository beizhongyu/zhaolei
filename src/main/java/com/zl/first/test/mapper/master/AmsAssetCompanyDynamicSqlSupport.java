package com.zl.first.test.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AmsAssetCompanyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    public static final AmsAssetCompany amsAssetCompany = new AmsAssetCompany();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_company.id")
    public static final SqlColumn<String> id = amsAssetCompany.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_company.group_id")
    public static final SqlColumn<String> groupId = amsAssetCompany.groupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_company.admin")
    public static final SqlColumn<String> admin = amsAssetCompany.admin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_company.note")
    public static final SqlColumn<String> note = amsAssetCompany.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_company.is_valite")
    public static final SqlColumn<Integer> isValite = amsAssetCompany.isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_company.create_time")
    public static final SqlColumn<Long> createTime = amsAssetCompany.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_company.modify_time")
    public static final SqlColumn<Long> modifyTime = amsAssetCompany.modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_company.version")
    public static final SqlColumn<Integer> version = amsAssetCompany.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_company.extra")
    public static final SqlColumn<String> extra = amsAssetCompany.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_company.userId")
    public static final SqlColumn<String> userid = amsAssetCompany.userid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    public static final class AmsAssetCompany extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> groupId = column("group_id", JDBCType.VARCHAR);

        public final SqlColumn<String> admin = column("admin", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isValite = column("is_valite", JDBCType.INTEGER);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyTime = column("modify_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> extra = column("extra", JDBCType.VARCHAR);

        public final SqlColumn<String> userid = column("userId", JDBCType.VARCHAR);

        public AmsAssetCompany() {
            super("ams_asset_company");
        }
    }
}