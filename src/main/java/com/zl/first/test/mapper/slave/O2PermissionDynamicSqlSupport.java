package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2PermissionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_permission")
    public static final O2Permission o2Permission = new O2Permission();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_permission.id")
    public static final SqlColumn<String> id = o2Permission.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_permission.client_id")
    public static final SqlColumn<String> clientId = o2Permission.clientId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_permission.name")
    public static final SqlColumn<String> name = o2Permission.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_permission.display_name")
    public static final SqlColumn<String> displayName = o2Permission.displayName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_permission.description")
    public static final SqlColumn<String> description = o2Permission.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_permission.status")
    public static final SqlColumn<String> status = o2Permission.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_permission.create_at")
    public static final SqlColumn<Date> createAt = o2Permission.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_permission.modify_at")
    public static final SqlColumn<Date> modifyAt = o2Permission.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_permission.version")
    public static final SqlColumn<Integer> version = o2Permission.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_permission.extra")
    public static final SqlColumn<String> extra = o2Permission.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_permission")
    public static final class O2Permission extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> clientId = column("client_id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> displayName = column("display_name", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> extra = column("extra", JDBCType.LONGVARCHAR);

        public O2Permission() {
            super("o2_permission");
        }
    }
}