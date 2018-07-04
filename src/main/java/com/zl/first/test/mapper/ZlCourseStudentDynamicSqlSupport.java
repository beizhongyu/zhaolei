package com.zl.first.test.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZlCourseStudentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course_student")
    public static final ZlCourseStudent zlCourseStudent = new ZlCourseStudent();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_course_student.id")
    public static final SqlColumn<Long> id = zlCourseStudent.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_course_student.student_id")
    public static final SqlColumn<Long> studentId = zlCourseStudent.studentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_course_student.course_id")
    public static final SqlColumn<Long> courseId = zlCourseStudent.courseId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_course_student.status")
    public static final SqlColumn<Integer> status = zlCourseStudent.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_course_student.create_at")
    public static final SqlColumn<Long> createAt = zlCourseStudent.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_course_student.modify_at")
    public static final SqlColumn<Long> modifyAt = zlCourseStudent.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_course_student.version")
    public static final SqlColumn<Integer> version = zlCourseStudent.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course_student")
    public static final class ZlCourseStudent extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> studentId = column("student_id", JDBCType.BIGINT);

        public final SqlColumn<Long> courseId = column("course_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Long> createAt = column("create_at", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyAt = column("modify_at", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public ZlCourseStudent() {
            super("zl_course_student");
        }
    }
}