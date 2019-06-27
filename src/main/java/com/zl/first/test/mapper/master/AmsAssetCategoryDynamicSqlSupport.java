package com.zl.first.test.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AmsAssetCategoryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    public static final AmsAssetCategory amsAssetCategory = new AmsAssetCategory();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_category.id")
    public static final SqlColumn<String> id = amsAssetCategory.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_category.company_id")
    public static final SqlColumn<String> companyId = amsAssetCategory.companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_category.name")
    public static final SqlColumn<String> name = amsAssetCategory.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_category.asset_admin")
    public static final SqlColumn<String> assetAdmin = amsAssetCategory.assetAdmin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_category.finance_admin")
    public static final SqlColumn<String> financeAdmin = amsAssetCategory.financeAdmin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_category.purchase_admin")
    public static final SqlColumn<String> purchaseAdmin = amsAssetCategory.purchaseAdmin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_category.check_admin")
    public static final SqlColumn<String> checkAdmin = amsAssetCategory.checkAdmin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_category.maintain_admin")
    public static final SqlColumn<String> maintainAdmin = amsAssetCategory.maintainAdmin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_category.srap_admin")
    public static final SqlColumn<String> srapAdmin = amsAssetCategory.srapAdmin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_category.receive_admin")
    public static final SqlColumn<String> receiveAdmin = amsAssetCategory.receiveAdmin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_category.note")
    public static final SqlColumn<String> note = amsAssetCategory.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_category.is_valite")
    public static final SqlColumn<Integer> isValite = amsAssetCategory.isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_category.create_time")
    public static final SqlColumn<Long> createTime = amsAssetCategory.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_category.modify_time")
    public static final SqlColumn<Long> modifyTime = amsAssetCategory.modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_category.version")
    public static final SqlColumn<Integer> version = amsAssetCategory.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_category.extra")
    public static final SqlColumn<String> extra = amsAssetCategory.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    public static final class AmsAssetCategory extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> companyId = column("company_id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> assetAdmin = column("asset_admin", JDBCType.VARCHAR);

        public final SqlColumn<String> financeAdmin = column("finance_admin", JDBCType.VARCHAR);

        public final SqlColumn<String> purchaseAdmin = column("purchase_admin", JDBCType.VARCHAR);

        public final SqlColumn<String> checkAdmin = column("check_admin", JDBCType.VARCHAR);

        public final SqlColumn<String> maintainAdmin = column("maintain_admin", JDBCType.VARCHAR);

        public final SqlColumn<String> srapAdmin = column("srap_admin", JDBCType.VARCHAR);

        public final SqlColumn<String> receiveAdmin = column("receive_admin", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isValite = column("is_valite", JDBCType.INTEGER);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyTime = column("modify_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> extra = column("extra", JDBCType.VARCHAR);

        public AmsAssetCategory() {
            super("ams_asset_category");
        }
    }
}