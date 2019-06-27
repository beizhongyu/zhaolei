package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2CompanyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public static final O2Company o2Company = new O2Company();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.id")
    public static final SqlColumn<String> id = o2Company.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.display_name")
    public static final SqlColumn<String> displayName = o2Company.displayName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.city")
    public static final SqlColumn<String> city = o2Company.city;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.address")
    public static final SqlColumn<String> address = o2Company.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.mail_suffix")
    public static final SqlColumn<String> mailSuffix = o2Company.mailSuffix;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.user_ding")
    public static final SqlColumn<Short> userDing = o2Company.userDing;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.sync_ding")
    public static final SqlColumn<Short> syncDing = o2Company.syncDing;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.corp_id")
    public static final SqlColumn<String> corpId = o2Company.corpId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.corps_ecret")
    public static final SqlColumn<String> corpsEcret = o2Company.corpsEcret;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.notice_ding")
    public static final SqlColumn<Short> noticeDing = o2Company.noticeDing;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.agent_id")
    public static final SqlColumn<String> agentId = o2Company.agentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.status")
    public static final SqlColumn<String> status = o2Company.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.create_at")
    public static final SqlColumn<Date> createAt = o2Company.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.modify_at")
    public static final SqlColumn<Date> modifyAt = o2Company.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.version")
    public static final SqlColumn<Integer> version = o2Company.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.access_code")
    public static final SqlColumn<String> accessCode = o2Company.accessCode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.access_password")
    public static final SqlColumn<String> accessPassword = o2Company.accessPassword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.group_id")
    public static final SqlColumn<String> groupId = o2Company.groupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.app_key")
    public static final SqlColumn<String> appKey = o2Company.appKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.app_secret")
    public static final SqlColumn<String> appSecret = o2Company.appSecret;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.use_mail")
    public static final SqlColumn<Short> useMail = o2Company.useMail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.mail_group")
    public static final SqlColumn<String> mailGroup = o2Company.mailGroup;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.logo")
    public static final SqlColumn<byte[]> logo = o2Company.logo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public static final class O2Company extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> displayName = column("display_name", JDBCType.VARCHAR);

        public final SqlColumn<String> city = column("city", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<String> mailSuffix = column("mail_suffix", JDBCType.VARCHAR);

        public final SqlColumn<Short> userDing = column("user_ding", JDBCType.SMALLINT);

        public final SqlColumn<Short> syncDing = column("sync_ding", JDBCType.SMALLINT);

        public final SqlColumn<String> corpId = column("corp_id", JDBCType.VARCHAR);

        public final SqlColumn<String> corpsEcret = column("corps_ecret", JDBCType.VARCHAR);

        public final SqlColumn<Short> noticeDing = column("notice_ding", JDBCType.SMALLINT);

        public final SqlColumn<String> agentId = column("agent_id", JDBCType.VARCHAR);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> accessCode = column("access_code", JDBCType.VARCHAR);

        public final SqlColumn<String> accessPassword = column("access_password", JDBCType.VARCHAR);

        public final SqlColumn<String> groupId = column("group_id", JDBCType.VARCHAR);

        public final SqlColumn<String> appKey = column("app_key", JDBCType.VARCHAR);

        public final SqlColumn<String> appSecret = column("app_secret", JDBCType.VARCHAR);

        public final SqlColumn<Short> useMail = column("use_mail", JDBCType.SMALLINT);

        public final SqlColumn<String> mailGroup = column("mail_group", JDBCType.VARCHAR);

        public final SqlColumn<byte[]> logo = column("logo", JDBCType.LONGVARBINARY);

        public O2Company() {
            super("o2_company");
        }
    }
}