package com.zl.first.test.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZlCourseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    public static final ZlCourse zlCourse = new ZlCourse();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_course.id")
    public static final SqlColumn<Long> id = zlCourse.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_course.name")
    public static final SqlColumn<String> name = zlCourse.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_course.descript")
    public static final SqlColumn<String> descript = zlCourse.descript;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_course.teacher_id")
    public static final SqlColumn<String> teacherId = zlCourse.teacherId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_course.status")
    public static final SqlColumn<Integer> status = zlCourse.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_course.create_at")
    public static final SqlColumn<Long> createAt = zlCourse.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_course.modify_at")
    public static final SqlColumn<Long> modifyAt = zlCourse.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_course.version")
    public static final SqlColumn<Integer> version = zlCourse.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    public static final class ZlCourse extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> descript = column("descript", JDBCType.VARCHAR);

        public final SqlColumn<String> teacherId = column("teacher_id", JDBCType.VARCHAR);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Long> createAt = column("create_at", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyAt = column("modify_at", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public ZlCourse() {
            super("zl_course");
        }
    }
}