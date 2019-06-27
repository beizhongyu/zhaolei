package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2UserKeyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    public static final O2UserKey o2UserKey = new O2UserKey();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_key.u_key")
    public static final SqlColumn<String> uKey = o2UserKey.uKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_key.user_id")
    public static final SqlColumn<String> userId = o2UserKey.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_key.create_at")
    public static final SqlColumn<Date> createAt = o2UserKey.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_key.modify_at")
    public static final SqlColumn<Date> modifyAt = o2UserKey.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_key.version")
    public static final SqlColumn<Integer> version = o2UserKey.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    public static final class O2UserKey extends SqlTable {
        public final SqlColumn<String> uKey = column("u_key", JDBCType.VARCHAR);

        public final SqlColumn<String> userId = column("user_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public O2UserKey() {
            super("o2_user_key");
        }
    }
}