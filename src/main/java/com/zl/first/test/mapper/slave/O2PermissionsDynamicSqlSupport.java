package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2PermissionsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_permissions")
    public static final O2Permissions o2Permissions = new O2Permissions();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_permissions.id")
    public static final SqlColumn<String> id = o2Permissions.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_permissions.category")
    public static final SqlColumn<String> category = o2Permissions.category;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_permissions.relation_id")
    public static final SqlColumn<String> relationId = o2Permissions.relationId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_permissions.create_at")
    public static final SqlColumn<Date> createAt = o2Permissions.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_permissions.modify_at")
    public static final SqlColumn<Date> modifyAt = o2Permissions.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_permissions.version")
    public static final SqlColumn<Integer> version = o2Permissions.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_permissions")
    public static final class O2Permissions extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> category = column("category", JDBCType.VARCHAR);

        public final SqlColumn<String> relationId = column("relation_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public O2Permissions() {
            super("o2_permissions");
        }
    }
}