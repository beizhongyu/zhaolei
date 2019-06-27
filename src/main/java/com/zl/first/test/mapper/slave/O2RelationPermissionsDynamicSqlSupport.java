package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2RelationPermissionsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    public static final O2RelationPermissions o2RelationPermissions = new O2RelationPermissions();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.id")
    public static final SqlColumn<String> id = o2RelationPermissions.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.role_id")
    public static final SqlColumn<String> roleId = o2RelationPermissions.roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.child_id")
    public static final SqlColumn<String> childId = o2RelationPermissions.childId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.create_at")
    public static final SqlColumn<Date> createAt = o2RelationPermissions.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.modify_at")
    public static final SqlColumn<Date> modifyAt = o2RelationPermissions.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.version")
    public static final SqlColumn<Integer> version = o2RelationPermissions.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    public static final class O2RelationPermissions extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> roleId = column("role_id", JDBCType.VARCHAR);

        public final SqlColumn<String> childId = column("child_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public O2RelationPermissions() {
            super("o2_relation_permissions");
        }
    }
}