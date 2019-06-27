package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2ApplyPermissionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    public static final O2ApplyPermission o2ApplyPermission = new O2ApplyPermission();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_apply_permission.id")
    public static final SqlColumn<String> id = o2ApplyPermission.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_apply_permission.client_id")
    public static final SqlColumn<String> clientId = o2ApplyPermission.clientId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_apply_permission.group_id")
    public static final SqlColumn<String> groupId = o2ApplyPermission.groupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_apply_permission.role_id")
    public static final SqlColumn<String> roleId = o2ApplyPermission.roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_apply_permission.approve_id")
    public static final SqlColumn<String> approveId = o2ApplyPermission.approveId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_apply_permission.status")
    public static final SqlColumn<String> status = o2ApplyPermission.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_apply_permission.description")
    public static final SqlColumn<String> description = o2ApplyPermission.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_apply_permission.create_at")
    public static final SqlColumn<Date> createAt = o2ApplyPermission.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_apply_permission.modify_at")
    public static final SqlColumn<Date> modifyAt = o2ApplyPermission.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_apply_permission.version")
    public static final SqlColumn<Integer> version = o2ApplyPermission.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    public static final class O2ApplyPermission extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> clientId = column("client_id", JDBCType.VARCHAR);

        public final SqlColumn<String> groupId = column("group_id", JDBCType.VARCHAR);

        public final SqlColumn<String> roleId = column("role_id", JDBCType.VARCHAR);

        public final SqlColumn<String> approveId = column("approve_id", JDBCType.VARCHAR);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public O2ApplyPermission() {
            super("o2_apply_permission");
        }
    }
}