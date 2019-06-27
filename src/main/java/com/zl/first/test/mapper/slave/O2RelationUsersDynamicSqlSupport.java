package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2RelationUsersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    public static final O2RelationUsers o2RelationUsers = new O2RelationUsers();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_users.id")
    public static final SqlColumn<String> id = o2RelationUsers.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_users.group_id")
    public static final SqlColumn<String> groupId = o2RelationUsers.groupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_users.child_id")
    public static final SqlColumn<String> childId = o2RelationUsers.childId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_users.category")
    public static final SqlColumn<String> category = o2RelationUsers.category;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_users.create_at")
    public static final SqlColumn<Date> createAt = o2RelationUsers.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_users.modify_at")
    public static final SqlColumn<Date> modifyAt = o2RelationUsers.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_users.version")
    public static final SqlColumn<Integer> version = o2RelationUsers.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    public static final class O2RelationUsers extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> groupId = column("group_id", JDBCType.VARCHAR);

        public final SqlColumn<String> childId = column("child_id", JDBCType.VARCHAR);

        public final SqlColumn<String> category = column("category", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public O2RelationUsers() {
            super("o2_relation_users");
        }
    }
}