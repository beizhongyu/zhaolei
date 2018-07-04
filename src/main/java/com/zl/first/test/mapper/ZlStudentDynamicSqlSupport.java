package com.zl.first.test.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZlStudentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    public static final ZlStudent zlStudent = new ZlStudent();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_student.id")
    public static final SqlColumn<Long> id = zlStudent.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_student.name")
    public static final SqlColumn<String> name = zlStudent.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_student.display_name")
    public static final SqlColumn<String> displayName = zlStudent.displayName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_student.password")
    public static final SqlColumn<String> password = zlStudent.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_student.class_id")
    public static final SqlColumn<Long> classId = zlStudent.classId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_student.position")
    public static final SqlColumn<String> position = zlStudent.position;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_student.tel_phone")
    public static final SqlColumn<String> telPhone = zlStudent.telPhone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_student.age")
    public static final SqlColumn<Integer> age = zlStudent.age;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_student.log")
    public static final SqlColumn<String> log = zlStudent.log;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_student.status")
    public static final SqlColumn<Integer> status = zlStudent.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_student.create_at")
    public static final SqlColumn<Long> createAt = zlStudent.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_student.modify_at")
    public static final SqlColumn<Long> modifyAt = zlStudent.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_student.version")
    public static final SqlColumn<Integer> version = zlStudent.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    public static final class ZlStudent extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> displayName = column("display_name", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<Long> classId = column("class_id", JDBCType.BIGINT);

        public final SqlColumn<String> position = column("position", JDBCType.VARCHAR);

        public final SqlColumn<String> telPhone = column("tel_phone", JDBCType.VARCHAR);

        public final SqlColumn<Integer> age = column("age", JDBCType.INTEGER);

        public final SqlColumn<String> log = column("log", JDBCType.VARCHAR);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Long> createAt = column("create_at", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyAt = column("modify_at", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public ZlStudent() {
            super("zl_student");
        }
    }
}