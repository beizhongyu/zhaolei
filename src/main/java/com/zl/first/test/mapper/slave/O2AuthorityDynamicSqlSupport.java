package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2AuthorityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    public static final O2Authority o2Authority = new O2Authority();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_authority.id")
    public static final SqlColumn<String> id = o2Authority.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_authority.group_id")
    public static final SqlColumn<String> groupId = o2Authority.groupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_authority.role_id")
    public static final SqlColumn<String> roleId = o2Authority.roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_authority.authorize")
    public static final SqlColumn<String> authorize = o2Authority.authorize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_authority.create_at")
    public static final SqlColumn<Date> createAt = o2Authority.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_authority.modify_at")
    public static final SqlColumn<Date> modifyAt = o2Authority.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_authority.version")
    public static final SqlColumn<Integer> version = o2Authority.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_authority.extra")
    public static final SqlColumn<String> extra = o2Authority.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    public static final class O2Authority extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> groupId = column("group_id", JDBCType.VARCHAR);

        public final SqlColumn<String> roleId = column("role_id", JDBCType.VARCHAR);

        public final SqlColumn<String> authorize = column("authorize", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> extra = column("extra", JDBCType.LONGVARCHAR);

        public O2Authority() {
            super("o2_authority");
        }
    }
}