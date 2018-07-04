package com.zl.first.test.mapper;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import java.sql.JDBCType;
import javax.annotation.Generated;

public final class ZlAcademicDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    public static final ZlAcademic zlAcademic = new ZlAcademic();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_academic.id")
    public static final SqlColumn<Long> id = zlAcademic.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_academic.name")
    public static final SqlColumn<String> name = zlAcademic.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_academic.descript")
    public static final SqlColumn<String> descript = zlAcademic.descript;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_academic.status")
    public static final SqlColumn<Integer> status = zlAcademic.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_academic.create_at")
    public static final SqlColumn<Long> createAt = zlAcademic.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_academic.modify_at")
    public static final SqlColumn<Long> modifyAt = zlAcademic.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: zl_academic.version")
    public static final SqlColumn<Integer> version = zlAcademic.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    public static final class ZlAcademic extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> descript = column("descript", JDBCType.VARCHAR);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Long> createAt = column("create_at", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyAt = column("modify_at", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public ZlAcademic() {
            super("zl_academic");
        }
    }
}