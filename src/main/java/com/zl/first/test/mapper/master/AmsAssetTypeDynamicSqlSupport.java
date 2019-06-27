package com.zl.first.test.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AmsAssetTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_type")
    public static final AmsAssetType amsAssetType = new AmsAssetType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_type.id")
    public static final SqlColumn<String> id = amsAssetType.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_type.name")
    public static final SqlColumn<String> name = amsAssetType.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_type.category_id")
    public static final SqlColumn<String> categoryId = amsAssetType.categoryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_type.note")
    public static final SqlColumn<String> note = amsAssetType.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_type.is_valite")
    public static final SqlColumn<Integer> isValite = amsAssetType.isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_type.create_time")
    public static final SqlColumn<Long> createTime = amsAssetType.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_type.modify_time")
    public static final SqlColumn<Long> modifyTime = amsAssetType.modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_type.version")
    public static final SqlColumn<Integer> version = amsAssetType.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_type.extra")
    public static final SqlColumn<String> extra = amsAssetType.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_type")
    public static final class AmsAssetType extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> categoryId = column("category_id", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isValite = column("is_valite", JDBCType.INTEGER);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyTime = column("modify_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> extra = column("extra", JDBCType.VARCHAR);

        public AmsAssetType() {
            super("ams_asset_type");
        }
    }
}