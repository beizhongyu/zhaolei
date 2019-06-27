package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2NotificationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_notification")
    public static final O2Notification o2Notification = new O2Notification();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_notification.id")
    public static final SqlColumn<String> id = o2Notification.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_notification.content")
    public static final SqlColumn<String> content = o2Notification.content;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_notification.target")
    public static final SqlColumn<String> target = o2Notification.target;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_notification.status")
    public static final SqlColumn<String> status = o2Notification.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_notification.create_at")
    public static final SqlColumn<Date> createAt = o2Notification.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_notification.modify_at")
    public static final SqlColumn<Date> modifyAt = o2Notification.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_notification.version")
    public static final SqlColumn<Integer> version = o2Notification.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_notification.extra")
    public static final SqlColumn<String> extra = o2Notification.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_notification")
    public static final class O2Notification extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> content = column("content", JDBCType.VARCHAR);

        public final SqlColumn<String> target = column("target", JDBCType.VARCHAR);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> extra = column("extra", JDBCType.LONGVARCHAR);

        public O2Notification() {
            super("o2_notification");
        }
    }
}