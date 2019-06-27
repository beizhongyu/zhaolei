package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2UsersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    public static final O2Users o2Users = new O2Users();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_users.id")
    public static final SqlColumn<String> id = o2Users.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_users.name")
    public static final SqlColumn<String> name = o2Users.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_users.display_name")
    public static final SqlColumn<String> displayName = o2Users.displayName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_users.description")
    public static final SqlColumn<String> description = o2Users.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_users.status")
    public static final SqlColumn<String> status = o2Users.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_users.category")
    public static final SqlColumn<String> category = o2Users.category;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_users.user_id")
    public static final SqlColumn<String> userId = o2Users.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_users.department_id")
    public static final SqlColumn<String> departmentId = o2Users.departmentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_users.create_at")
    public static final SqlColumn<Date> createAt = o2Users.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_users.modify_at")
    public static final SqlColumn<Date> modifyAt = o2Users.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_users.version")
    public static final SqlColumn<Integer> version = o2Users.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_users.relation_id")
    public static final SqlColumn<String> relationId = o2Users.relationId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_users.extra")
    public static final SqlColumn<String> extra = o2Users.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    public static final class O2Users extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> displayName = column("display_name", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<String> category = column("category", JDBCType.VARCHAR);

        public final SqlColumn<String> userId = column("user_id", JDBCType.VARCHAR);

        public final SqlColumn<String> departmentId = column("department_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> relationId = column("relation_id", JDBCType.VARCHAR);

        public final SqlColumn<String> extra = column("extra", JDBCType.LONGVARCHAR);

        public O2Users() {
            super("o2_users");
        }
    }
}