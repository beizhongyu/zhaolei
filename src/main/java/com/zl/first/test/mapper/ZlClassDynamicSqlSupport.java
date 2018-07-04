package com.zl.first.test.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZlClassDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    public static final ZlClass zlClass = new ZlClass();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_class.id")
    public static final SqlColumn<Long> id = zlClass.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_class.name")
    public static final SqlColumn<String> name = zlClass.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_class.max_ount")
    public static final SqlColumn<Integer> maxOunt = zlClass.maxOunt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_class.teacher_id")
    public static final SqlColumn<String> teacherId = zlClass.teacherId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_class.academic_id")
    public static final SqlColumn<Integer> academicId = zlClass.academicId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_class.status")
    public static final SqlColumn<Integer> status = zlClass.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_class.create_at")
    public static final SqlColumn<Long> createAt = zlClass.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_class.modify_at")
    public static final SqlColumn<Long> modifyAt = zlClass.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_class.version")
    public static final SqlColumn<Integer> version = zlClass.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    public static final class ZlClass extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> maxOunt = column("max_ount", JDBCType.INTEGER);

        public final SqlColumn<String> teacherId = column("teacher_id", JDBCType.VARCHAR);

        public final SqlColumn<Integer> academicId = column("academic_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Long> createAt = column("create_at", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyAt = column("modify_at", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public ZlClass() {
            super("zl_class");
        }
    }
}