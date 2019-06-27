package com.zl.first.test.mapper.master;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AmsAssetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public static final AmsAsset amsAsset = new AmsAsset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.id")
    public static final SqlColumn<String> id = amsAsset.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.asset_code")
    public static final SqlColumn<String> assetCode = amsAsset.assetCode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.products_id")
    public static final SqlColumn<String> productsId = amsAsset.productsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.brand_id")
    public static final SqlColumn<String> brandId = amsAsset.brandId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.manufacture_id")
    public static final SqlColumn<String> manufactureId = amsAsset.manufactureId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.spec_id")
    public static final SqlColumn<String> specId = amsAsset.specId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.buy_time")
    public static final SqlColumn<Long> buyTime = amsAsset.buyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.use_time")
    public static final SqlColumn<Long> useTime = amsAsset.useTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.return_time")
    public static final SqlColumn<Long> returnTime = amsAsset.returnTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.price")
    public static final SqlColumn<BigDecimal> price = amsAsset.price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.now_price")
    public static final SqlColumn<BigDecimal> nowPrice = amsAsset.nowPrice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.use_long")
    public static final SqlColumn<String> useLong = amsAsset.useLong;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.depre_rate")
    public static final SqlColumn<String> depreRate = amsAsset.depreRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.person")
    public static final SqlColumn<String> person = amsAsset.person;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.warehouse_id")
    public static final SqlColumn<String> warehouseId = amsAsset.warehouseId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.person_position")
    public static final SqlColumn<String> personPosition = amsAsset.personPosition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.asset_status")
    public static final SqlColumn<Integer> assetStatus = amsAsset.assetStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.note")
    public static final SqlColumn<String> note = amsAsset.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.is_valite")
    public static final SqlColumn<Integer> isValite = amsAsset.isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.create_time")
    public static final SqlColumn<Long> createTime = amsAsset.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.modify_time")
    public static final SqlColumn<Long> modifyTime = amsAsset.modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.version")
    public static final SqlColumn<Integer> version = amsAsset.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.extra")
    public static final SqlColumn<String> extra = amsAsset.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.company")
    public static final SqlColumn<String> company = amsAsset.company;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.num")
    public static final SqlColumn<Integer> num = amsAsset.num;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.supplier")
    public static final SqlColumn<String> supplier = amsAsset.supplier;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.belone")
    public static final SqlColumn<String> belone = amsAsset.belone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public static final class AmsAsset extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> assetCode = column("asset_code", JDBCType.VARCHAR);

        public final SqlColumn<String> productsId = column("products_id", JDBCType.VARCHAR);

        public final SqlColumn<String> brandId = column("brand_id", JDBCType.VARCHAR);

        public final SqlColumn<String> manufactureId = column("manufacture_id", JDBCType.VARCHAR);

        public final SqlColumn<String> specId = column("spec_id", JDBCType.VARCHAR);

        public final SqlColumn<Long> buyTime = column("buy_time", JDBCType.BIGINT);

        public final SqlColumn<Long> useTime = column("use_time", JDBCType.BIGINT);

        public final SqlColumn<Long> returnTime = column("return_time", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> price = column("price", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> nowPrice = column("now_price", JDBCType.DECIMAL);

        public final SqlColumn<String> useLong = column("use_long", JDBCType.VARCHAR);

        public final SqlColumn<String> depreRate = column("depre_rate", JDBCType.VARCHAR);

        public final SqlColumn<String> person = column("person", JDBCType.VARCHAR);

        public final SqlColumn<String> warehouseId = column("warehouse_id", JDBCType.VARCHAR);

        public final SqlColumn<String> personPosition = column("person_position", JDBCType.VARCHAR);

        public final SqlColumn<Integer> assetStatus = column("asset_status", JDBCType.INTEGER);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isValite = column("is_valite", JDBCType.INTEGER);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyTime = column("modify_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> extra = column("extra", JDBCType.VARCHAR);

        public final SqlColumn<String> company = column("company", JDBCType.VARCHAR);

        public final SqlColumn<Integer> num = column("num", JDBCType.INTEGER);

        public final SqlColumn<String> supplier = column("supplier", JDBCType.VARCHAR);

        public final SqlColumn<String> belone = column("belone", JDBCType.VARCHAR);

        public AmsAsset() {
            super("ams_asset");
        }
    }
}