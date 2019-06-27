package com.zl.first.test.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AmsAssetBrandDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_brand")
    public static final AmsAssetBrand amsAssetBrand = new AmsAssetBrand();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_brand.id")
    public static final SqlColumn<String> id = amsAssetBrand.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_brand.products_id")
    public static final SqlColumn<String> productsId = amsAssetBrand.productsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_brand.brand")
    public static final SqlColumn<String> brand = amsAssetBrand.brand;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_brand.is_valite")
    public static final SqlColumn<Integer> isValite = amsAssetBrand.isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_brand.create_time")
    public static final SqlColumn<Long> createTime = amsAssetBrand.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_brand.modify_time")
    public static final SqlColumn<Long> modifyTime = amsAssetBrand.modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_brand.version")
    public static final SqlColumn<Integer> version = amsAssetBrand.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_brand")
    public static final class AmsAssetBrand extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> productsId = column("products_id", JDBCType.VARCHAR);

        public final SqlColumn<String> brand = column("brand", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isValite = column("is_valite", JDBCType.INTEGER);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyTime = column("modify_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public AmsAssetBrand() {
            super("ams_asset_brand");
        }
    }
}