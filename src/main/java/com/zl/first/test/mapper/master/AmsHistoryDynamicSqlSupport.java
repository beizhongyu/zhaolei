package com.zl.first.test.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AmsHistoryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    public static final AmsHistory amsHistory = new AmsHistory();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_history.id")
    public static final SqlColumn<String> id = amsHistory.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_history.asset_code")
    public static final SqlColumn<String> assetCode = amsHistory.assetCode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_history.handler_time")
    public static final SqlColumn<Long> handlerTime = amsHistory.handlerTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_history.create_time")
    public static final SqlColumn<Long> createTime = amsHistory.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_history.modify_time")
    public static final SqlColumn<Long> modifyTime = amsHistory.modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_history.version")
    public static final SqlColumn<Integer> version = amsHistory.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_history.is_valite")
    public static final SqlColumn<Integer> isValite = amsHistory.isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_history.start_person")
    public static final SqlColumn<String> startPerson = amsHistory.startPerson;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_history.end_person")
    public static final SqlColumn<String> endPerson = amsHistory.endPerson;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_history.operate_type")
    public static final SqlColumn<String> operateType = amsHistory.operateType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_history.note")
    public static final SqlColumn<String> note = amsHistory.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_history.extra")
    public static final SqlColumn<String> extra = amsHistory.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    public static final class AmsHistory extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> assetCode = column("asset_code", JDBCType.VARCHAR);

        public final SqlColumn<Long> handlerTime = column("handler_time", JDBCType.BIGINT);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyTime = column("modify_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<Integer> isValite = column("is_valite", JDBCType.INTEGER);

        public final SqlColumn<String> startPerson = column("start_person", JDBCType.VARCHAR);

        public final SqlColumn<String> endPerson = column("end_person", JDBCType.VARCHAR);

        public final SqlColumn<String> operateType = column("operate_type", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<String> extra = column("extra", JDBCType.VARCHAR);

        public AmsHistory() {
            super("ams_history");
        }
    }
}