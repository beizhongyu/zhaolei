package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2UserPasswordDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    public static final O2UserPassword o2UserPassword = new O2UserPassword();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_password.user_id")
    public static final SqlColumn<String> userId = o2UserPassword.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_password.password")
    public static final SqlColumn<String> password = o2UserPassword.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_password.create_at")
    public static final SqlColumn<Date> createAt = o2UserPassword.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_password.modify_at")
    public static final SqlColumn<Date> modifyAt = o2UserPassword.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_password.version")
    public static final SqlColumn<Integer> version = o2UserPassword.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    public static final class O2UserPassword extends SqlTable {
        public final SqlColumn<String> userId = column("user_id", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public O2UserPassword() {
            super("o2_user_password");
        }
    }
}