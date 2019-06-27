package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2LogFavoritesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    public static final O2LogFavorites o2LogFavorites = new O2LogFavorites();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.id")
    public static final SqlColumn<String> id = o2LogFavorites.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.user_id")
    public static final SqlColumn<String> userId = o2LogFavorites.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.app_id")
    public static final SqlColumn<String> appId = o2LogFavorites.appId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.kind")
    public static final SqlColumn<Byte> kind = o2LogFavorites.kind;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.is_valid")
    public static final SqlColumn<Byte> isValid = o2LogFavorites.isValid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.create_time")
    public static final SqlColumn<Long> createTime = o2LogFavorites.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.op_time")
    public static final SqlColumn<Long> opTime = o2LogFavorites.opTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.last_ver")
    public static final SqlColumn<Integer> lastVer = o2LogFavorites.lastVer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    public static final class O2LogFavorites extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> userId = column("user_id", JDBCType.VARCHAR);

        public final SqlColumn<String> appId = column("app_id", JDBCType.VARCHAR);

        public final SqlColumn<Byte> kind = column("kind", JDBCType.TINYINT);

        public final SqlColumn<Byte> isValid = column("is_valid", JDBCType.TINYINT);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> opTime = column("op_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> lastVer = column("last_ver", JDBCType.INTEGER);

        public O2LogFavorites() {
            super("o2_log_favorites");
        }
    }
}