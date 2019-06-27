package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2DeletedDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    public static final O2Deleted o2Deleted = new O2Deleted();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.job_number")
    public static final SqlColumn<String> jobNumber = o2Deleted.jobNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.real_name")
    public static final SqlColumn<String> realName = o2Deleted.realName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.sex")
    public static final SqlColumn<String> sex = o2Deleted.sex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.position")
    public static final SqlColumn<String> position = o2Deleted.position;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.card_number")
    public static final SqlColumn<String> cardNumber = o2Deleted.cardNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.birthday")
    public static final SqlColumn<String> birthday = o2Deleted.birthday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.household")
    public static final SqlColumn<String> household = o2Deleted.household;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.marital_status")
    public static final SqlColumn<String> maritalStatus = o2Deleted.maritalStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.household_address")
    public static final SqlColumn<String> householdAddress = o2Deleted.householdAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.home_address")
    public static final SqlColumn<String> homeAddress = o2Deleted.homeAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.school")
    public static final SqlColumn<String> school = o2Deleted.school;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.graduation_time")
    public static final SqlColumn<String> graduationTime = o2Deleted.graduationTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.specialty")
    public static final SqlColumn<String> specialty = o2Deleted.specialty;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.education")
    public static final SqlColumn<String> education = o2Deleted.education;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.mobile")
    public static final SqlColumn<String> mobile = o2Deleted.mobile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.linkman")
    public static final SqlColumn<String> linkman = o2Deleted.linkman;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.relation_ship")
    public static final SqlColumn<String> relationShip = o2Deleted.relationShip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.linkman_tel")
    public static final SqlColumn<String> linkmanTel = o2Deleted.linkmanTel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.entry_time")
    public static final SqlColumn<String> entryTime = o2Deleted.entryTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.bank_name")
    public static final SqlColumn<String> bankName = o2Deleted.bankName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.bank_card_no")
    public static final SqlColumn<String> bankCardNo = o2Deleted.bankCardNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.enabled_time")
    public static final SqlColumn<String> enabledTime = o2Deleted.enabledTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.nick_name")
    public static final SqlColumn<String> nickName = o2Deleted.nickName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.deleted_time")
    public static final SqlColumn<String> deletedTime = o2Deleted.deletedTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_deleted.f25")
    public static final SqlColumn<String> f25 = o2Deleted.f25;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    public static final class O2Deleted extends SqlTable {
        public final SqlColumn<String> jobNumber = column("job_number", JDBCType.VARCHAR);

        public final SqlColumn<String> realName = column("real_name", JDBCType.VARCHAR);

        public final SqlColumn<String> sex = column("sex", JDBCType.VARCHAR);

        public final SqlColumn<String> position = column("position", JDBCType.VARCHAR);

        public final SqlColumn<String> cardNumber = column("card_number", JDBCType.VARCHAR);

        public final SqlColumn<String> birthday = column("birthday", JDBCType.VARCHAR);

        public final SqlColumn<String> household = column("household", JDBCType.VARCHAR);

        public final SqlColumn<String> maritalStatus = column("marital_status", JDBCType.VARCHAR);

        public final SqlColumn<String> householdAddress = column("household_address", JDBCType.VARCHAR);

        public final SqlColumn<String> homeAddress = column("home_address", JDBCType.VARCHAR);

        public final SqlColumn<String> school = column("school", JDBCType.VARCHAR);

        public final SqlColumn<String> graduationTime = column("graduation_time", JDBCType.VARCHAR);

        public final SqlColumn<String> specialty = column("specialty", JDBCType.VARCHAR);

        public final SqlColumn<String> education = column("education", JDBCType.VARCHAR);

        public final SqlColumn<String> mobile = column("mobile", JDBCType.VARCHAR);

        public final SqlColumn<String> linkman = column("linkman", JDBCType.VARCHAR);

        public final SqlColumn<String> relationShip = column("relation_ship", JDBCType.VARCHAR);

        public final SqlColumn<String> linkmanTel = column("linkman_tel", JDBCType.VARCHAR);

        public final SqlColumn<String> entryTime = column("entry_time", JDBCType.VARCHAR);

        public final SqlColumn<String> bankName = column("bank_name", JDBCType.VARCHAR);

        public final SqlColumn<String> bankCardNo = column("bank_card_no", JDBCType.VARCHAR);

        public final SqlColumn<String> enabledTime = column("enabled_time", JDBCType.VARCHAR);

        public final SqlColumn<String> nickName = column("nick_name", JDBCType.VARCHAR);

        public final SqlColumn<String> deletedTime = column("deleted_time", JDBCType.VARCHAR);

        public final SqlColumn<String> f25 = column("f25", JDBCType.VARCHAR);

        public O2Deleted() {
            super("o2_deleted");
        }
    }
}