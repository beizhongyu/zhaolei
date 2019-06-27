package com.zl.first.test.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AmsWorkflowDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    public static final AmsWorkflow amsWorkflow = new AmsWorkflow();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.id")
    public static final SqlColumn<String> id = amsWorkflow.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.name")
    public static final SqlColumn<String> name = amsWorkflow.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.data_info")
    public static final SqlColumn<String> dataInfo = amsWorkflow.dataInfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.start_person")
    public static final SqlColumn<String> startPerson = amsWorkflow.startPerson;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.end_person")
    public static final SqlColumn<String> endPerson = amsWorkflow.endPerson;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.create_time")
    public static final SqlColumn<Long> createTime = amsWorkflow.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.modify_time")
    public static final SqlColumn<Long> modifyTime = amsWorkflow.modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.version")
    public static final SqlColumn<Integer> version = amsWorkflow.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.extra")
    public static final SqlColumn<String> extra = amsWorkflow.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.is_valite")
    public static final SqlColumn<Integer> isValite = amsWorkflow.isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    public static final class AmsWorkflow extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> dataInfo = column("data_info", JDBCType.VARCHAR);

        public final SqlColumn<String> startPerson = column("start_person", JDBCType.VARCHAR);

        public final SqlColumn<String> endPerson = column("end_person", JDBCType.VARCHAR);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyTime = column("modify_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> extra = column("extra", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isValite = column("is_valite", JDBCType.INTEGER);

        public AmsWorkflow() {
            super("ams_workflow");
        }
    }
}