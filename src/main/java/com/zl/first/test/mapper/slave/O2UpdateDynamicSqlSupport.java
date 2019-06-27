package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2UpdateDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    public static final O2Update o2Update = new O2Update();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.sex")
    public static final SqlColumn<String> sex = o2Update.sex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.card_number")
    public static final SqlColumn<String> cardNumber = o2Update.cardNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.birthday")
    public static final SqlColumn<String> birthday = o2Update.birthday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.household")
    public static final SqlColumn<String> household = o2Update.household;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.marital_status")
    public static final SqlColumn<String> maritalStatus = o2Update.maritalStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.ethnic")
    public static final SqlColumn<String> ethnic = o2Update.ethnic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.household_address")
    public static final SqlColumn<String> householdAddress = o2Update.householdAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.home_address")
    public static final SqlColumn<String> homeAddress = o2Update.homeAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.school")
    public static final SqlColumn<String> school = o2Update.school;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.graduation_time")
    public static final SqlColumn<String> graduationTime = o2Update.graduationTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.specialty")
    public static final SqlColumn<String> specialty = o2Update.specialty;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.education")
    public static final SqlColumn<String> education = o2Update.education;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.political_status")
    public static final SqlColumn<String> politicalStatus = o2Update.politicalStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.linkman")
    public static final SqlColumn<String> linkman = o2Update.linkman;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.relation_ship")
    public static final SqlColumn<String> relationShip = o2Update.relationShip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.linkman_tel")
    public static final SqlColumn<String> linkmanTel = o2Update.linkmanTel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.entry_time")
    public static final SqlColumn<String> entryTime = o2Update.entryTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.bank_name")
    public static final SqlColumn<String> bankName = o2Update.bankName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.bank_card_no")
    public static final SqlColumn<String> bankCardNo = o2Update.bankCardNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.enabled_time")
    public static final SqlColumn<String> enabledTime = o2Update.enabledTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.status")
    public static final SqlColumn<String> status = o2Update.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_update.nick_name")
    public static final SqlColumn<String> nickName = o2Update.nickName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    public static final class O2Update extends SqlTable {
        public final SqlColumn<String> sex = column("sex", JDBCType.VARCHAR);

        public final SqlColumn<String> cardNumber = column("card_number", JDBCType.VARCHAR);

        public final SqlColumn<String> birthday = column("birthday", JDBCType.VARCHAR);

        public final SqlColumn<String> household = column("household", JDBCType.VARCHAR);

        public final SqlColumn<String> maritalStatus = column("marital_status", JDBCType.VARCHAR);

        public final SqlColumn<String> ethnic = column("ethnic", JDBCType.VARCHAR);

        public final SqlColumn<String> householdAddress = column("household_address", JDBCType.VARCHAR);

        public final SqlColumn<String> homeAddress = column("home_address", JDBCType.VARCHAR);

        public final SqlColumn<String> school = column("school", JDBCType.VARCHAR);

        public final SqlColumn<String> graduationTime = column("graduation_time", JDBCType.VARCHAR);

        public final SqlColumn<String> specialty = column("specialty", JDBCType.VARCHAR);

        public final SqlColumn<String> education = column("education", JDBCType.VARCHAR);

        public final SqlColumn<String> politicalStatus = column("political_status", JDBCType.VARCHAR);

        public final SqlColumn<String> linkman = column("linkman", JDBCType.VARCHAR);

        public final SqlColumn<String> relationShip = column("relation_ship", JDBCType.VARCHAR);

        public final SqlColumn<String> linkmanTel = column("linkman_tel", JDBCType.VARCHAR);

        public final SqlColumn<String> entryTime = column("entry_time", JDBCType.VARCHAR);

        public final SqlColumn<String> bankName = column("bank_name", JDBCType.VARCHAR);

        public final SqlColumn<String> bankCardNo = column("bank_card_no", JDBCType.VARCHAR);

        public final SqlColumn<String> enabledTime = column("enabled_time", JDBCType.VARCHAR);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<String> nickName = column("nick_name", JDBCType.VARCHAR);

        public O2Update() {
            super("o2_update");
        }
    }
}