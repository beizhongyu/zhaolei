package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2ResourceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    public static final O2Resource o2Resource = new O2Resource();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_resource.id")
    public static final SqlColumn<String> id = o2Resource.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_resource.client_id")
    public static final SqlColumn<String> clientId = o2Resource.clientId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_resource.group_id")
    public static final SqlColumn<String> groupId = o2Resource.groupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_resource.category")
    public static final SqlColumn<String> category = o2Resource.category;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_resource.resource_id")
    public static final SqlColumn<String> resourceId = o2Resource.resourceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_resource.action")
    public static final SqlColumn<String> action = o2Resource.action;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_resource.authorize")
    public static final SqlColumn<String> authorize = o2Resource.authorize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_resource.create_at")
    public static final SqlColumn<Date> createAt = o2Resource.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_resource.modify_at")
    public static final SqlColumn<Date> modifyAt = o2Resource.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_resource.version")
    public static final SqlColumn<Integer> version = o2Resource.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    public static final class O2Resource extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> clientId = column("client_id", JDBCType.VARCHAR);

        public final SqlColumn<String> groupId = column("group_id", JDBCType.VARCHAR);

        public final SqlColumn<String> category = column("category", JDBCType.VARCHAR);

        public final SqlColumn<String> resourceId = column("resource_id", JDBCType.VARCHAR);

        public final SqlColumn<String> action = column("action", JDBCType.VARCHAR);

        public final SqlColumn<String> authorize = column("authorize", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public O2Resource() {
            super("o2_resource");
        }
    }
}