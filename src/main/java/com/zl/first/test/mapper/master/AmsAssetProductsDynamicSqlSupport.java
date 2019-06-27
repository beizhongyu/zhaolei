package com.zl.first.test.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AmsAssetProductsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    public static final AmsAssetProducts amsAssetProducts = new AmsAssetProducts();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_products.id")
    public static final SqlColumn<String> id = amsAssetProducts.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_products.name")
    public static final SqlColumn<String> name = amsAssetProducts.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_products.type_id")
    public static final SqlColumn<String> typeId = amsAssetProducts.typeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_products.mark_id")
    public static final SqlColumn<String> markId = amsAssetProducts.markId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_products.note")
    public static final SqlColumn<String> note = amsAssetProducts.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_products.is_valite")
    public static final SqlColumn<Integer> isValite = amsAssetProducts.isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_products.create_time")
    public static final SqlColumn<Long> createTime = amsAssetProducts.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_products.modify_time")
    public static final SqlColumn<Long> modifyTime = amsAssetProducts.modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_products.version")
    public static final SqlColumn<Integer> version = amsAssetProducts.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_products.extra")
    public static final SqlColumn<String> extra = amsAssetProducts.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    public static final class AmsAssetProducts extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> typeId = column("type_id", JDBCType.VARCHAR);

        public final SqlColumn<String> markId = column("mark_id", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isValite = column("is_valite", JDBCType.INTEGER);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyTime = column("modify_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> extra = column("extra", JDBCType.VARCHAR);

        public AmsAssetProducts() {
            super("ams_asset_products");
        }
    }
}