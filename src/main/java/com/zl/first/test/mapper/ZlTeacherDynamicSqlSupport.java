package com.zl.first.test.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZlTeacherDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    public static final ZlTeacher zlTeacher = new ZlTeacher();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_teacher.id")
    public static final SqlColumn<Long> id = zlTeacher.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_teacher.name")
    public static final SqlColumn<String> name = zlTeacher.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_teacher.academic_id")
    public static final SqlColumn<String> academicId = zlTeacher.academicId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_teacher.create_at")
    public static final SqlColumn<Long> createAt = zlTeacher.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_teacher.modify_at")
    public static final SqlColumn<Long> modifyAt = zlTeacher.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_teacher.version")
    public static final SqlColumn<Integer> version = zlTeacher.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_teacher.status")
    public static final SqlColumn<Integer> status = zlTeacher.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    public static final class ZlTeacher extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> academicId = column("academic_id", JDBCType.VARCHAR);

        public final SqlColumn<Long> createAt = column("create_at", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyAt = column("modify_at", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public ZlTeacher() {
            super("zl_teacher");
        }
    }
}