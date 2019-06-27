package com.zl.first.test.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AmsAssetManufactureDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    public static final AmsAssetManufacture amsAssetManufacture = new AmsAssetManufacture();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_manufacture.id")
    public static final SqlColumn<String> id = amsAssetManufacture.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_manufacture.brand_id")
    public static final SqlColumn<String> brandId = amsAssetManufacture.brandId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_manufacture.manufacture")
    public static final SqlColumn<String> manufacture = amsAssetManufacture.manufacture;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_manufacture.is_valite")
    public static final SqlColumn<Integer> isValite = amsAssetManufacture.isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_manufacture.create_time")
    public static final SqlColumn<Long> createTime = amsAssetManufacture.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_manufacture.modify_time")
    public static final SqlColumn<Long> modifyTime = amsAssetManufacture.modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_manufacture.version")
    public static final SqlColumn<Integer> version = amsAssetManufacture.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    public static final class AmsAssetManufacture extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> brandId = column("brand_id", JDBCType.VARCHAR);

        public final SqlColumn<String> manufacture = column("manufacture", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isValite = column("is_valite", JDBCType.INTEGER);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyTime = column("modify_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public AmsAssetManufacture() {
            super("ams_asset_manufacture");
        }
    }
}