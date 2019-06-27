package com.zl.first.test.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AmsAssetMarkDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_mark")
    public static final AmsAssetMark amsAssetMark = new AmsAssetMark();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_mark.id")
    public static final SqlColumn<String> id = amsAssetMark.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_mark.name")
    public static final SqlColumn<String> name = amsAssetMark.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_mark.category")
    public static final SqlColumn<Integer> category = amsAssetMark.category;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_mark.size")
    public static final SqlColumn<String> size = amsAssetMark.size;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_mark.note")
    public static final SqlColumn<String> note = amsAssetMark.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_mark.is_valite")
    public static final SqlColumn<Integer> isValite = amsAssetMark.isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_mark.create_time")
    public static final SqlColumn<Long> createTime = amsAssetMark.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_mark.modify_time")
    public static final SqlColumn<Long> modifyTime = amsAssetMark.modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_mark.version")
    public static final SqlColumn<Integer> version = amsAssetMark.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_mark.extra")
    public static final SqlColumn<String> extra = amsAssetMark.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_mark")
    public static final class AmsAssetMark extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> category = column("category", JDBCType.INTEGER);

        public final SqlColumn<String> size = column("size", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isValite = column("is_valite", JDBCType.INTEGER);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyTime = column("modify_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> extra = column("extra", JDBCType.VARCHAR);

        public AmsAssetMark() {
            super("ams_asset_mark");
        }
    }
}