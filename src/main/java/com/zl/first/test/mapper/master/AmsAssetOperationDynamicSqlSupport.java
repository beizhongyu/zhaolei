package com.zl.first.test.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AmsAssetOperationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    public static final AmsAssetOperation amsAssetOperation = new AmsAssetOperation();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.id")
    public static final SqlColumn<String> id = amsAssetOperation.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.asset_id")
    public static final SqlColumn<String> assetId = amsAssetOperation.assetId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.category")
    public static final SqlColumn<Integer> category = amsAssetOperation.category;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.reason")
    public static final SqlColumn<String> reason = amsAssetOperation.reason;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.time")
    public static final SqlColumn<Long> time = amsAssetOperation.time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.start_person")
    public static final SqlColumn<String> startPerson = amsAssetOperation.startPerson;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.handle_person")
    public static final SqlColumn<String> handlePerson = amsAssetOperation.handlePerson;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.note")
    public static final SqlColumn<String> note = amsAssetOperation.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.is_valite")
    public static final SqlColumn<Integer> isValite = amsAssetOperation.isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.create_time")
    public static final SqlColumn<Long> createTime = amsAssetOperation.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.modify_time")
    public static final SqlColumn<Long> modifyTime = amsAssetOperation.modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.version")
    public static final SqlColumn<Integer> version = amsAssetOperation.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.extra")
    public static final SqlColumn<String> extra = amsAssetOperation.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    public static final class AmsAssetOperation extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> assetId = column("asset_id", JDBCType.VARCHAR);

        public final SqlColumn<Integer> category = column("category", JDBCType.INTEGER);

        public final SqlColumn<String> reason = column("reason", JDBCType.VARCHAR);

        public final SqlColumn<Long> time = column("time", JDBCType.BIGINT);

        public final SqlColumn<String> startPerson = column("start_person", JDBCType.VARCHAR);

        public final SqlColumn<String> handlePerson = column("handle_person", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isValite = column("is_valite", JDBCType.INTEGER);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyTime = column("modify_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> extra = column("extra", JDBCType.VARCHAR);

        public AmsAssetOperation() {
            super("ams_asset_operation");
        }
    }
}