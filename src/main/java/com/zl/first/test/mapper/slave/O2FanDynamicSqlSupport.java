package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2FanDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_fan")
    public static final O2Fan o2Fan = new O2Fan();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.sex")
    public static final SqlColumn<String> sex = o2Fan.sex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.card_number")
    public static final SqlColumn<String> cardNumber = o2Fan.cardNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.birthday")
    public static final SqlColumn<String> birthday = o2Fan.birthday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.household")
    public static final SqlColumn<String> household = o2Fan.household;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.marital_status")
    public static final SqlColumn<String> maritalStatus = o2Fan.maritalStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.ethnic")
    public static final SqlColumn<String> ethnic = o2Fan.ethnic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.household_address")
    public static final SqlColumn<String> householdAddress = o2Fan.householdAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.home_address")
    public static final SqlColumn<String> homeAddress = o2Fan.homeAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.school")
    public static final SqlColumn<String> school = o2Fan.school;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.graduation_time")
    public static final SqlColumn<String> graduationTime = o2Fan.graduationTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.specialty")
    public static final SqlColumn<String> specialty = o2Fan.specialty;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.education")
    public static final SqlColumn<String> education = o2Fan.education;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.political_status")
    public static final SqlColumn<String> politicalStatus = o2Fan.politicalStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.linkman")
    public static final SqlColumn<String> linkman = o2Fan.linkman;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.relation_ship")
    public static final SqlColumn<String> relationShip = o2Fan.relationShip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.linkman_tel")
    public static final SqlColumn<String> linkmanTel = o2Fan.linkmanTel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.entry_time")
    public static final SqlColumn<String> entryTime = o2Fan.entryTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.bank_name")
    public static final SqlColumn<String> bankName = o2Fan.bankName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.bank_card_no")
    public static final SqlColumn<String> bankCardNo = o2Fan.bankCardNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.enabled_time")
    public static final SqlColumn<String> enabledTime = o2Fan.enabledTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.status")
    public static final SqlColumn<String> status = o2Fan.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_fan.nick_name")
    public static final SqlColumn<String> nickName = o2Fan.nickName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_fan")
    public static final class O2Fan extends SqlTable {
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

        public O2Fan() {
            super("o2_fan");
        }
    }
}