package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2UserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    public static final O2User o2User = new O2User();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.id")
    public static final SqlColumn<String> id = o2User.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.user_name")
    public static final SqlColumn<String> userName = o2User.userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.ding_id")
    public static final SqlColumn<String> dingId = o2User.dingId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.nick_name")
    public static final SqlColumn<String> nickName = o2User.nickName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.real_name")
    public static final SqlColumn<String> realName = o2User.realName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.position")
    public static final SqlColumn<String> position = o2User.position;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.car_license")
    public static final SqlColumn<String> carLicense = o2User.carLicense;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.job_number")
    public static final SqlColumn<String> jobNumber = o2User.jobNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.user_type")
    public static final SqlColumn<String> userType = o2User.userType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.mobile")
    public static final SqlColumn<String> mobile = o2User.mobile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.tel")
    public static final SqlColumn<String> tel = o2User.tel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.email")
    public static final SqlColumn<String> email = o2User.email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.home_address")
    public static final SqlColumn<String> homeAddress = o2User.homeAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.workplace")
    public static final SqlColumn<String> workplace = o2User.workplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.postal_code")
    public static final SqlColumn<String> postalCode = o2User.postalCode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.preferred_language")
    public static final SqlColumn<String> preferredLanguage = o2User.preferredLanguage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.avater")
    public static final SqlColumn<String> avater = o2User.avater;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.description")
    public static final SqlColumn<String> description = o2User.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.spell")
    public static final SqlColumn<String> spell = o2User.spell;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.status")
    public static final SqlColumn<String> status = o2User.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.locked")
    public static final SqlColumn<Boolean> locked = o2User.locked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.expire_at")
    public static final SqlColumn<Date> expireAt = o2User.expireAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.create_at")
    public static final SqlColumn<Date> createAt = o2User.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.modify_at")
    public static final SqlColumn<Date> modifyAt = o2User.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.version")
    public static final SqlColumn<Integer> version = o2User.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.belong_company")
    public static final SqlColumn<String> belongCompany = o2User.belongCompany;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.user_id")
    public static final SqlColumn<String> userId = o2User.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.card_number")
    public static final SqlColumn<String> cardNumber = o2User.cardNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.sex")
    public static final SqlColumn<String> sex = o2User.sex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.company_id")
    public static final SqlColumn<String> companyId = o2User.companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.level")
    public static final SqlColumn<String> level = o2User.level;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.type")
    public static final SqlColumn<String> type = o2User.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.household")
    public static final SqlColumn<String> household = o2User.household;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.household_address")
    public static final SqlColumn<String> householdAddress = o2User.householdAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.ethnic")
    public static final SqlColumn<String> ethnic = o2User.ethnic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.political_status")
    public static final SqlColumn<String> politicalStatus = o2User.politicalStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.marital_status")
    public static final SqlColumn<String> maritalStatus = o2User.maritalStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.linkman")
    public static final SqlColumn<String> linkman = o2User.linkman;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.relation_ship")
    public static final SqlColumn<String> relationShip = o2User.relationShip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.linkman_tel")
    public static final SqlColumn<String> linkmanTel = o2User.linkmanTel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.education")
    public static final SqlColumn<String> education = o2User.education;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.school")
    public static final SqlColumn<String> school = o2User.school;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.specialty")
    public static final SqlColumn<String> specialty = o2User.specialty;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.social_security")
    public static final SqlColumn<String> socialSecurity = o2User.socialSecurity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.accumulation_Fund")
    public static final SqlColumn<String> accumulationFund = o2User.accumulationFund;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.bank_name")
    public static final SqlColumn<String> bankName = o2User.bankName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.bank_card_no")
    public static final SqlColumn<String> bankCardNo = o2User.bankCardNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.title")
    public static final SqlColumn<String> title = o2User.title;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.entry_time")
    public static final SqlColumn<Integer> entryTime = o2User.entryTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.enabled_time")
    public static final SqlColumn<Integer> enabledTime = o2User.enabledTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.freeze_time")
    public static final SqlColumn<Integer> freezeTime = o2User.freezeTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.deleted_time")
    public static final SqlColumn<Integer> deletedTime = o2User.deletedTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.birthday")
    public static final SqlColumn<Integer> birthday = o2User.birthday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.graduation_time")
    public static final SqlColumn<Integer> graduationTime = o2User.graduationTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.dd_id")
    public static final SqlColumn<String> ddId = o2User.ddId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.company_alias")
    public static final SqlColumn<String> companyAlias = o2User.companyAlias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.group_id")
    public static final SqlColumn<String> groupId = o2User.groupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.user_certificate")
    public static final SqlColumn<String> userCertificate = o2User.userCertificate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.user_smime_certificate")
    public static final SqlColumn<String> userSmimeCertificate = o2User.userSmimeCertificate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.user_pkcs12")
    public static final SqlColumn<String> userPkcs12 = o2User.userPkcs12;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.x500_unique_identifier")
    public static final SqlColumn<String> x500UniqueIdentifier = o2User.x500UniqueIdentifier;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.extra")
    public static final SqlColumn<String> extra = o2User.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user.departments")
    public static final SqlColumn<String> departments = o2User.departments;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    public static final class O2User extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> userName = column("user_name", JDBCType.VARCHAR);

        public final SqlColumn<String> dingId = column("ding_id", JDBCType.VARCHAR);

        public final SqlColumn<String> nickName = column("nick_name", JDBCType.VARCHAR);

        public final SqlColumn<String> realName = column("real_name", JDBCType.VARCHAR);

        public final SqlColumn<String> position = column("position", JDBCType.VARCHAR);

        public final SqlColumn<String> carLicense = column("car_license", JDBCType.VARCHAR);

        public final SqlColumn<String> jobNumber = column("job_number", JDBCType.VARCHAR);

        public final SqlColumn<String> userType = column("user_type", JDBCType.VARCHAR);

        public final SqlColumn<String> mobile = column("mobile", JDBCType.VARCHAR);

        public final SqlColumn<String> tel = column("tel", JDBCType.VARCHAR);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<String> homeAddress = column("home_address", JDBCType.VARCHAR);

        public final SqlColumn<String> workplace = column("workplace", JDBCType.VARCHAR);

        public final SqlColumn<String> postalCode = column("postal_code", JDBCType.VARCHAR);

        public final SqlColumn<String> preferredLanguage = column("preferred_language", JDBCType.VARCHAR);

        public final SqlColumn<String> avater = column("avater", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> spell = column("spell", JDBCType.VARCHAR);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> locked = column("locked", JDBCType.BIT);

        public final SqlColumn<Date> expireAt = column("expire_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> belongCompany = column("belong_company", JDBCType.VARCHAR);

        public final SqlColumn<String> userId = column("user_id", JDBCType.VARCHAR);

        public final SqlColumn<String> cardNumber = column("card_number", JDBCType.VARCHAR);

        public final SqlColumn<String> sex = column("sex", JDBCType.VARCHAR);

        public final SqlColumn<String> companyId = column("company_id", JDBCType.VARCHAR);

        public final SqlColumn<String> level = column("level", JDBCType.VARCHAR);

        public final SqlColumn<String> type = column("type", JDBCType.VARCHAR);

        public final SqlColumn<String> household = column("household", JDBCType.VARCHAR);

        public final SqlColumn<String> householdAddress = column("household_address", JDBCType.VARCHAR);

        public final SqlColumn<String> ethnic = column("ethnic", JDBCType.VARCHAR);

        public final SqlColumn<String> politicalStatus = column("political_status", JDBCType.VARCHAR);

        public final SqlColumn<String> maritalStatus = column("marital_status", JDBCType.VARCHAR);

        public final SqlColumn<String> linkman = column("linkman", JDBCType.VARCHAR);

        public final SqlColumn<String> relationShip = column("relation_ship", JDBCType.VARCHAR);

        public final SqlColumn<String> linkmanTel = column("linkman_tel", JDBCType.VARCHAR);

        public final SqlColumn<String> education = column("education", JDBCType.VARCHAR);

        public final SqlColumn<String> school = column("school", JDBCType.VARCHAR);

        public final SqlColumn<String> specialty = column("specialty", JDBCType.VARCHAR);

        public final SqlColumn<String> socialSecurity = column("social_security", JDBCType.VARCHAR);

        public final SqlColumn<String> accumulationFund = column("accumulation_Fund", JDBCType.VARCHAR);

        public final SqlColumn<String> bankName = column("bank_name", JDBCType.VARCHAR);

        public final SqlColumn<String> bankCardNo = column("bank_card_no", JDBCType.VARCHAR);

        public final SqlColumn<String> title = column("title", JDBCType.VARCHAR);

        public final SqlColumn<Integer> entryTime = column("entry_time", JDBCType.INTEGER);

        public final SqlColumn<Integer> enabledTime = column("enabled_time", JDBCType.INTEGER);

        public final SqlColumn<Integer> freezeTime = column("freeze_time", JDBCType.INTEGER);

        public final SqlColumn<Integer> deletedTime = column("deleted_time", JDBCType.INTEGER);

        public final SqlColumn<Integer> birthday = column("birthday", JDBCType.INTEGER);

        public final SqlColumn<Integer> graduationTime = column("graduation_time", JDBCType.INTEGER);

        public final SqlColumn<String> ddId = column("dd_id", JDBCType.VARCHAR);

        public final SqlColumn<String> companyAlias = column("company_alias", JDBCType.VARCHAR);

        public final SqlColumn<String> groupId = column("group_id", JDBCType.VARCHAR);

        public final SqlColumn<String> userCertificate = column("user_certificate", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> userSmimeCertificate = column("user_smime_certificate", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> userPkcs12 = column("user_pkcs12", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> x500UniqueIdentifier = column("x500_unique_identifier", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> extra = column("extra", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> departments = column("departments", JDBCType.LONGVARCHAR);

        public O2User() {
            super("o2_user");
        }
    }
}