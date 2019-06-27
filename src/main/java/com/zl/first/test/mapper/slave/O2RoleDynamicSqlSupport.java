package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2RoleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    public static final O2Role o2Role = new O2Role();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_role.id")
    public static final SqlColumn<String> id = o2Role.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_role.client_id")
    public static final SqlColumn<String> clientId = o2Role.clientId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_role.name")
    public static final SqlColumn<String> name = o2Role.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_role.display_name")
    public static final SqlColumn<String> displayName = o2Role.displayName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_role.description")
    public static final SqlColumn<String> description = o2Role.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_role.status")
    public static final SqlColumn<String> status = o2Role.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_role.category")
    public static final SqlColumn<String> category = o2Role.category;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_role.permission_id")
    public static final SqlColumn<String> permissionId = o2Role.permissionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_role.create_at")
    public static final SqlColumn<Date> createAt = o2Role.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_role.modify_at")
    public static final SqlColumn<Date> modifyAt = o2Role.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_role.version")
    public static final SqlColumn<Integer> version = o2Role.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_role.extra")
    public static final SqlColumn<String> extra = o2Role.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    public static final class O2Role extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> clientId = column("client_id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> displayName = column("display_name", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<String> category = column("category", JDBCType.VARCHAR);

        public final SqlColumn<String> permissionId = column("permission_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> extra = column("extra", JDBCType.LONGVARCHAR);

        public O2Role() {
            super("o2_role");
        }
    }
}