package com.zl.first.test.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AmsAssetWarehouseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    public static final AmsAssetWarehouse amsAssetWarehouse = new AmsAssetWarehouse();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_warehouse.id")
    public static final SqlColumn<String> id = amsAssetWarehouse.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_warehouse.warehouse")
    public static final SqlColumn<String> warehouse = amsAssetWarehouse.warehouse;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_warehouse.company_id")
    public static final SqlColumn<String> companyId = amsAssetWarehouse.companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_warehouse.admin")
    public static final SqlColumn<String> admin = amsAssetWarehouse.admin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_warehouse.note")
    public static final SqlColumn<String> note = amsAssetWarehouse.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_warehouse.is_valite")
    public static final SqlColumn<Integer> isValite = amsAssetWarehouse.isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_warehouse.create_time")
    public static final SqlColumn<Long> createTime = amsAssetWarehouse.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_warehouse.modify_time")
    public static final SqlColumn<Long> modifyTime = amsAssetWarehouse.modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_warehouse.version")
    public static final SqlColumn<Integer> version = amsAssetWarehouse.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_warehouse.extra")
    public static final SqlColumn<String> extra = amsAssetWarehouse.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_warehouse.address")
    public static final SqlColumn<String> address = amsAssetWarehouse.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    public static final class AmsAssetWarehouse extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> warehouse = column("warehouse", JDBCType.VARCHAR);

        public final SqlColumn<String> companyId = column("company_id", JDBCType.VARCHAR);

        public final SqlColumn<String> admin = column("admin", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isValite = column("is_valite", JDBCType.INTEGER);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyTime = column("modify_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> extra = column("extra", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public AmsAssetWarehouse() {
            super("ams_asset_warehouse");
        }
    }
}