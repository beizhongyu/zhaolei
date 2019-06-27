package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2ApplicationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    public static final O2Application o2Application = new O2Application();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.id")
    public static final SqlColumn<String> id = o2Application.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.client_id")
    public static final SqlColumn<String> clientId = o2Application.clientId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.category_id")
    public static final SqlColumn<String> categoryId = o2Application.categoryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.display_name")
    public static final SqlColumn<String> displayName = o2Application.displayName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.description")
    public static final SqlColumn<String> description = o2Application.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.url")
    public static final SqlColumn<String> url = o2Application.url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.status")
    public static final SqlColumn<String> status = o2Application.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.note")
    public static final SqlColumn<String> note = o2Application.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.create_at")
    public static final SqlColumn<Date> createAt = o2Application.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.modify_at")
    public static final SqlColumn<Date> modifyAt = o2Application.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.version")
    public static final SqlColumn<Integer> version = o2Application.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.logo")
    public static final SqlColumn<byte[]> logo = o2Application.logo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    public static final class O2Application extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> clientId = column("client_id", JDBCType.VARCHAR);

        public final SqlColumn<String> categoryId = column("category_id", JDBCType.VARCHAR);

        public final SqlColumn<String> displayName = column("display_name", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<byte[]> logo = column("logo", JDBCType.LONGVARBINARY);

        public O2Application() {
            super("o2_application");
        }
    }
}