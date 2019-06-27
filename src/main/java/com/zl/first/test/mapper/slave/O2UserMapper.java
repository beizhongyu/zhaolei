package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2UserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.slave.O2User;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface O2UserMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2User> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2UserResult")
    O2User selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2UserResult")
    List<O2User> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    default Function<SelectStatementProvider, List<O2User>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2UserResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ding_id", property="dingId", jdbcType=JdbcType.VARCHAR),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="real_name", property="realName", jdbcType=JdbcType.VARCHAR),
        @Result(column="position", property="position", jdbcType=JdbcType.VARCHAR),
        @Result(column="car_license", property="carLicense", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_number", property="jobNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_type", property="userType", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="tel", property="tel", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="home_address", property="homeAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="workplace", property="workplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="postal_code", property="postalCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="preferred_language", property="preferredLanguage", jdbcType=JdbcType.VARCHAR),
        @Result(column="avater", property="avater", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="spell", property="spell", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="locked", property="locked", jdbcType=JdbcType.BIT),
        @Result(column="expire_at", property="expireAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="belong_company", property="belongCompany", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="card_number", property="cardNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.VARCHAR),
        @Result(column="level", property="level", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="household", property="household", jdbcType=JdbcType.VARCHAR),
        @Result(column="household_address", property="householdAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="ethnic", property="ethnic", jdbcType=JdbcType.VARCHAR),
        @Result(column="political_status", property="politicalStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="marital_status", property="maritalStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="linkman", property="linkman", jdbcType=JdbcType.VARCHAR),
        @Result(column="relation_ship", property="relationShip", jdbcType=JdbcType.VARCHAR),
        @Result(column="linkman_tel", property="linkmanTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="education", property="education", jdbcType=JdbcType.VARCHAR),
        @Result(column="school", property="school", jdbcType=JdbcType.VARCHAR),
        @Result(column="specialty", property="specialty", jdbcType=JdbcType.VARCHAR),
        @Result(column="social_security", property="socialSecurity", jdbcType=JdbcType.VARCHAR),
        @Result(column="accumulation_Fund", property="accumulationFund", jdbcType=JdbcType.VARCHAR),
        @Result(column="bank_name", property="bankName", jdbcType=JdbcType.VARCHAR),
        @Result(column="bank_card_no", property="bankCardNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="entry_time", property="entryTime", jdbcType=JdbcType.INTEGER),
        @Result(column="enabled_time", property="enabledTime", jdbcType=JdbcType.INTEGER),
        @Result(column="freeze_time", property="freezeTime", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.INTEGER),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.INTEGER),
        @Result(column="graduation_time", property="graduationTime", jdbcType=JdbcType.INTEGER),
        @Result(column="dd_id", property="ddId", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_alias", property="companyAlias", jdbcType=JdbcType.VARCHAR),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_certificate", property="userCertificate", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="user_smime_certificate", property="userSmimeCertificate", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="user_pkcs12", property="userPkcs12", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="x500_unique_identifier", property="x500UniqueIdentifier", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="extra", property="extra", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="departments", property="departments", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<O2User> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2User);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2User);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2User)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    default int insert(O2User record) {
        return insert(SqlBuilder.insert(record)
                .into(o2User)
                .map(id).toProperty("id")
                .map(userName).toProperty("userName")
                .map(dingId).toProperty("dingId")
                .map(nickName).toProperty("nickName")
                .map(realName).toProperty("realName")
                .map(position).toProperty("position")
                .map(carLicense).toProperty("carLicense")
                .map(jobNumber).toProperty("jobNumber")
                .map(userType).toProperty("userType")
                .map(mobile).toProperty("mobile")
                .map(tel).toProperty("tel")
                .map(email).toProperty("email")
                .map(homeAddress).toProperty("homeAddress")
                .map(workplace).toProperty("workplace")
                .map(postalCode).toProperty("postalCode")
                .map(preferredLanguage).toProperty("preferredLanguage")
                .map(avater).toProperty("avater")
                .map(description).toProperty("description")
                .map(spell).toProperty("spell")
                .map(status).toProperty("status")
                .map(locked).toProperty("locked")
                .map(expireAt).toProperty("expireAt")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .map(belongCompany).toProperty("belongCompany")
                .map(userId).toProperty("userId")
                .map(cardNumber).toProperty("cardNumber")
                .map(sex).toProperty("sex")
                .map(companyId).toProperty("companyId")
                .map(level).toProperty("level")
                .map(type).toProperty("type")
                .map(household).toProperty("household")
                .map(householdAddress).toProperty("householdAddress")
                .map(ethnic).toProperty("ethnic")
                .map(politicalStatus).toProperty("politicalStatus")
                .map(maritalStatus).toProperty("maritalStatus")
                .map(linkman).toProperty("linkman")
                .map(relationShip).toProperty("relationShip")
                .map(linkmanTel).toProperty("linkmanTel")
                .map(education).toProperty("education")
                .map(school).toProperty("school")
                .map(specialty).toProperty("specialty")
                .map(socialSecurity).toProperty("socialSecurity")
                .map(accumulationFund).toProperty("accumulationFund")
                .map(bankName).toProperty("bankName")
                .map(bankCardNo).toProperty("bankCardNo")
                .map(title).toProperty("title")
                .map(entryTime).toProperty("entryTime")
                .map(enabledTime).toProperty("enabledTime")
                .map(freezeTime).toProperty("freezeTime")
                .map(deletedTime).toProperty("deletedTime")
                .map(birthday).toProperty("birthday")
                .map(graduationTime).toProperty("graduationTime")
                .map(ddId).toProperty("ddId")
                .map(companyAlias).toProperty("companyAlias")
                .map(groupId).toProperty("groupId")
                .map(userCertificate).toProperty("userCertificate")
                .map(userSmimeCertificate).toProperty("userSmimeCertificate")
                .map(userPkcs12).toProperty("userPkcs12")
                .map(x500UniqueIdentifier).toProperty("x500UniqueIdentifier")
                .map(extra).toProperty("extra")
                .map(departments).toProperty("departments")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    default int insertSelective(O2User record) {
        return insert(SqlBuilder.insert(record)
                .into(o2User)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(userName).toPropertyWhenPresent("userName", record::getUserName)
                .map(dingId).toPropertyWhenPresent("dingId", record::getDingId)
                .map(nickName).toPropertyWhenPresent("nickName", record::getNickName)
                .map(realName).toPropertyWhenPresent("realName", record::getRealName)
                .map(position).toPropertyWhenPresent("position", record::getPosition)
                .map(carLicense).toPropertyWhenPresent("carLicense", record::getCarLicense)
                .map(jobNumber).toPropertyWhenPresent("jobNumber", record::getJobNumber)
                .map(userType).toPropertyWhenPresent("userType", record::getUserType)
                .map(mobile).toPropertyWhenPresent("mobile", record::getMobile)
                .map(tel).toPropertyWhenPresent("tel", record::getTel)
                .map(email).toPropertyWhenPresent("email", record::getEmail)
                .map(homeAddress).toPropertyWhenPresent("homeAddress", record::getHomeAddress)
                .map(workplace).toPropertyWhenPresent("workplace", record::getWorkplace)
                .map(postalCode).toPropertyWhenPresent("postalCode", record::getPostalCode)
                .map(preferredLanguage).toPropertyWhenPresent("preferredLanguage", record::getPreferredLanguage)
                .map(avater).toPropertyWhenPresent("avater", record::getAvater)
                .map(description).toPropertyWhenPresent("description", record::getDescription)
                .map(spell).toPropertyWhenPresent("spell", record::getSpell)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(locked).toPropertyWhenPresent("locked", record::getLocked)
                .map(expireAt).toPropertyWhenPresent("expireAt", record::getExpireAt)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .map(belongCompany).toPropertyWhenPresent("belongCompany", record::getBelongCompany)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(cardNumber).toPropertyWhenPresent("cardNumber", record::getCardNumber)
                .map(sex).toPropertyWhenPresent("sex", record::getSex)
                .map(companyId).toPropertyWhenPresent("companyId", record::getCompanyId)
                .map(level).toPropertyWhenPresent("level", record::getLevel)
                .map(type).toPropertyWhenPresent("type", record::getType)
                .map(household).toPropertyWhenPresent("household", record::getHousehold)
                .map(householdAddress).toPropertyWhenPresent("householdAddress", record::getHouseholdAddress)
                .map(ethnic).toPropertyWhenPresent("ethnic", record::getEthnic)
                .map(politicalStatus).toPropertyWhenPresent("politicalStatus", record::getPoliticalStatus)
                .map(maritalStatus).toPropertyWhenPresent("maritalStatus", record::getMaritalStatus)
                .map(linkman).toPropertyWhenPresent("linkman", record::getLinkman)
                .map(relationShip).toPropertyWhenPresent("relationShip", record::getRelationShip)
                .map(linkmanTel).toPropertyWhenPresent("linkmanTel", record::getLinkmanTel)
                .map(education).toPropertyWhenPresent("education", record::getEducation)
                .map(school).toPropertyWhenPresent("school", record::getSchool)
                .map(specialty).toPropertyWhenPresent("specialty", record::getSpecialty)
                .map(socialSecurity).toPropertyWhenPresent("socialSecurity", record::getSocialSecurity)
                .map(accumulationFund).toPropertyWhenPresent("accumulationFund", record::getAccumulationFund)
                .map(bankName).toPropertyWhenPresent("bankName", record::getBankName)
                .map(bankCardNo).toPropertyWhenPresent("bankCardNo", record::getBankCardNo)
                .map(title).toPropertyWhenPresent("title", record::getTitle)
                .map(entryTime).toPropertyWhenPresent("entryTime", record::getEntryTime)
                .map(enabledTime).toPropertyWhenPresent("enabledTime", record::getEnabledTime)
                .map(freezeTime).toPropertyWhenPresent("freezeTime", record::getFreezeTime)
                .map(deletedTime).toPropertyWhenPresent("deletedTime", record::getDeletedTime)
                .map(birthday).toPropertyWhenPresent("birthday", record::getBirthday)
                .map(graduationTime).toPropertyWhenPresent("graduationTime", record::getGraduationTime)
                .map(ddId).toPropertyWhenPresent("ddId", record::getDdId)
                .map(companyAlias).toPropertyWhenPresent("companyAlias", record::getCompanyAlias)
                .map(groupId).toPropertyWhenPresent("groupId", record::getGroupId)
                .map(userCertificate).toPropertyWhenPresent("userCertificate", record::getUserCertificate)
                .map(userSmimeCertificate).toPropertyWhenPresent("userSmimeCertificate", record::getUserSmimeCertificate)
                .map(userPkcs12).toPropertyWhenPresent("userPkcs12", record::getUserPkcs12)
                .map(x500UniqueIdentifier).toPropertyWhenPresent("x500UniqueIdentifier", record::getX500UniqueIdentifier)
                .map(extra).toPropertyWhenPresent("extra", record::getExtra)
                .map(departments).toPropertyWhenPresent("departments", record::getDepartments)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2User>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, userName, dingId, nickName, realName, position, carLicense, jobNumber, userType, mobile, tel, email, homeAddress, workplace, postalCode, preferredLanguage, avater, description, spell, status, locked, expireAt, createAt, modifyAt, version, belongCompany, userId, cardNumber, sex, companyId, level, type, household, householdAddress, ethnic, politicalStatus, maritalStatus, linkman, relationShip, linkmanTel, education, school, specialty, socialSecurity, accumulationFund, bankName, bankCardNo, title, entryTime, enabledTime, freezeTime, deletedTime, birthday, graduationTime, ddId, companyAlias, groupId, userCertificate, userSmimeCertificate, userPkcs12, x500UniqueIdentifier, extra, departments)
                .from(o2User);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2User>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, userName, dingId, nickName, realName, position, carLicense, jobNumber, userType, mobile, tel, email, homeAddress, workplace, postalCode, preferredLanguage, avater, description, spell, status, locked, expireAt, createAt, modifyAt, version, belongCompany, userId, cardNumber, sex, companyId, level, type, household, householdAddress, ethnic, politicalStatus, maritalStatus, linkman, relationShip, linkmanTel, education, school, specialty, socialSecurity, accumulationFund, bankName, bankCardNo, title, entryTime, enabledTime, freezeTime, deletedTime, birthday, graduationTime, ddId, companyAlias, groupId, userCertificate, userSmimeCertificate, userPkcs12, x500UniqueIdentifier, extra, departments)
                .from(o2User);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2User>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, userName, dingId, nickName, realName, position, carLicense, jobNumber, userType, mobile, tel, email, homeAddress, workplace, postalCode, preferredLanguage, avater, description, spell, status, locked, expireAt, createAt, modifyAt, version, belongCompany, userId, cardNumber, sex, companyId, level, type, household, householdAddress, ethnic, politicalStatus, maritalStatus, linkman, relationShip, linkmanTel, education, school, specialty, socialSecurity, accumulationFund, bankName, bankCardNo, title, entryTime, enabledTime, freezeTime, deletedTime, birthday, graduationTime, ddId, companyAlias, groupId, userCertificate, userSmimeCertificate, userPkcs12, x500UniqueIdentifier, extra, departments)
                .from(o2User);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2User>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, userName, dingId, nickName, realName, position, carLicense, jobNumber, userType, mobile, tel, email, homeAddress, workplace, postalCode, preferredLanguage, avater, description, spell, status, locked, expireAt, createAt, modifyAt, version, belongCompany, userId, cardNumber, sex, companyId, level, type, household, householdAddress, ethnic, politicalStatus, maritalStatus, linkman, relationShip, linkmanTel, education, school, specialty, socialSecurity, accumulationFund, bankName, bankCardNo, title, entryTime, enabledTime, freezeTime, deletedTime, birthday, graduationTime, ddId, companyAlias, groupId, userCertificate, userSmimeCertificate, userPkcs12, x500UniqueIdentifier, extra, departments)
                .from(o2User);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    default O2User selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, userName, dingId, nickName, realName, position, carLicense, jobNumber, userType, mobile, tel, email, homeAddress, workplace, postalCode, preferredLanguage, avater, description, spell, status, locked, expireAt, createAt, modifyAt, version, belongCompany, userId, cardNumber, sex, companyId, level, type, household, householdAddress, ethnic, politicalStatus, maritalStatus, linkman, relationShip, linkmanTel, education, school, specialty, socialSecurity, accumulationFund, bankName, bankCardNo, title, entryTime, enabledTime, freezeTime, deletedTime, birthday, graduationTime, ddId, companyAlias, groupId, userCertificate, userSmimeCertificate, userPkcs12, x500UniqueIdentifier, extra, departments)
                .from(o2User)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2User record) {
        return UpdateDSL.updateWithMapper(this::update, o2User)
                .set(id).equalTo(record::getId)
                .set(userName).equalTo(record::getUserName)
                .set(dingId).equalTo(record::getDingId)
                .set(nickName).equalTo(record::getNickName)
                .set(realName).equalTo(record::getRealName)
                .set(position).equalTo(record::getPosition)
                .set(carLicense).equalTo(record::getCarLicense)
                .set(jobNumber).equalTo(record::getJobNumber)
                .set(userType).equalTo(record::getUserType)
                .set(mobile).equalTo(record::getMobile)
                .set(tel).equalTo(record::getTel)
                .set(email).equalTo(record::getEmail)
                .set(homeAddress).equalTo(record::getHomeAddress)
                .set(workplace).equalTo(record::getWorkplace)
                .set(postalCode).equalTo(record::getPostalCode)
                .set(preferredLanguage).equalTo(record::getPreferredLanguage)
                .set(avater).equalTo(record::getAvater)
                .set(description).equalTo(record::getDescription)
                .set(spell).equalTo(record::getSpell)
                .set(status).equalTo(record::getStatus)
                .set(locked).equalTo(record::getLocked)
                .set(expireAt).equalTo(record::getExpireAt)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .set(belongCompany).equalTo(record::getBelongCompany)
                .set(userId).equalTo(record::getUserId)
                .set(cardNumber).equalTo(record::getCardNumber)
                .set(sex).equalTo(record::getSex)
                .set(companyId).equalTo(record::getCompanyId)
                .set(level).equalTo(record::getLevel)
                .set(type).equalTo(record::getType)
                .set(household).equalTo(record::getHousehold)
                .set(householdAddress).equalTo(record::getHouseholdAddress)
                .set(ethnic).equalTo(record::getEthnic)
                .set(politicalStatus).equalTo(record::getPoliticalStatus)
                .set(maritalStatus).equalTo(record::getMaritalStatus)
                .set(linkman).equalTo(record::getLinkman)
                .set(relationShip).equalTo(record::getRelationShip)
                .set(linkmanTel).equalTo(record::getLinkmanTel)
                .set(education).equalTo(record::getEducation)
                .set(school).equalTo(record::getSchool)
                .set(specialty).equalTo(record::getSpecialty)
                .set(socialSecurity).equalTo(record::getSocialSecurity)
                .set(accumulationFund).equalTo(record::getAccumulationFund)
                .set(bankName).equalTo(record::getBankName)
                .set(bankCardNo).equalTo(record::getBankCardNo)
                .set(title).equalTo(record::getTitle)
                .set(entryTime).equalTo(record::getEntryTime)
                .set(enabledTime).equalTo(record::getEnabledTime)
                .set(freezeTime).equalTo(record::getFreezeTime)
                .set(deletedTime).equalTo(record::getDeletedTime)
                .set(birthday).equalTo(record::getBirthday)
                .set(graduationTime).equalTo(record::getGraduationTime)
                .set(ddId).equalTo(record::getDdId)
                .set(companyAlias).equalTo(record::getCompanyAlias)
                .set(groupId).equalTo(record::getGroupId)
                .set(userCertificate).equalTo(record::getUserCertificate)
                .set(userSmimeCertificate).equalTo(record::getUserSmimeCertificate)
                .set(userPkcs12).equalTo(record::getUserPkcs12)
                .set(x500UniqueIdentifier).equalTo(record::getX500UniqueIdentifier)
                .set(extra).equalTo(record::getExtra)
                .set(departments).equalTo(record::getDepartments);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2User record) {
        return UpdateDSL.updateWithMapper(this::update, o2User)
                .set(id).equalToWhenPresent(record::getId)
                .set(userName).equalToWhenPresent(record::getUserName)
                .set(dingId).equalToWhenPresent(record::getDingId)
                .set(nickName).equalToWhenPresent(record::getNickName)
                .set(realName).equalToWhenPresent(record::getRealName)
                .set(position).equalToWhenPresent(record::getPosition)
                .set(carLicense).equalToWhenPresent(record::getCarLicense)
                .set(jobNumber).equalToWhenPresent(record::getJobNumber)
                .set(userType).equalToWhenPresent(record::getUserType)
                .set(mobile).equalToWhenPresent(record::getMobile)
                .set(tel).equalToWhenPresent(record::getTel)
                .set(email).equalToWhenPresent(record::getEmail)
                .set(homeAddress).equalToWhenPresent(record::getHomeAddress)
                .set(workplace).equalToWhenPresent(record::getWorkplace)
                .set(postalCode).equalToWhenPresent(record::getPostalCode)
                .set(preferredLanguage).equalToWhenPresent(record::getPreferredLanguage)
                .set(avater).equalToWhenPresent(record::getAvater)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(spell).equalToWhenPresent(record::getSpell)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(locked).equalToWhenPresent(record::getLocked)
                .set(expireAt).equalToWhenPresent(record::getExpireAt)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(belongCompany).equalToWhenPresent(record::getBelongCompany)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(cardNumber).equalToWhenPresent(record::getCardNumber)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(companyId).equalToWhenPresent(record::getCompanyId)
                .set(level).equalToWhenPresent(record::getLevel)
                .set(type).equalToWhenPresent(record::getType)
                .set(household).equalToWhenPresent(record::getHousehold)
                .set(householdAddress).equalToWhenPresent(record::getHouseholdAddress)
                .set(ethnic).equalToWhenPresent(record::getEthnic)
                .set(politicalStatus).equalToWhenPresent(record::getPoliticalStatus)
                .set(maritalStatus).equalToWhenPresent(record::getMaritalStatus)
                .set(linkman).equalToWhenPresent(record::getLinkman)
                .set(relationShip).equalToWhenPresent(record::getRelationShip)
                .set(linkmanTel).equalToWhenPresent(record::getLinkmanTel)
                .set(education).equalToWhenPresent(record::getEducation)
                .set(school).equalToWhenPresent(record::getSchool)
                .set(specialty).equalToWhenPresent(record::getSpecialty)
                .set(socialSecurity).equalToWhenPresent(record::getSocialSecurity)
                .set(accumulationFund).equalToWhenPresent(record::getAccumulationFund)
                .set(bankName).equalToWhenPresent(record::getBankName)
                .set(bankCardNo).equalToWhenPresent(record::getBankCardNo)
                .set(title).equalToWhenPresent(record::getTitle)
                .set(entryTime).equalToWhenPresent(record::getEntryTime)
                .set(enabledTime).equalToWhenPresent(record::getEnabledTime)
                .set(freezeTime).equalToWhenPresent(record::getFreezeTime)
                .set(deletedTime).equalToWhenPresent(record::getDeletedTime)
                .set(birthday).equalToWhenPresent(record::getBirthday)
                .set(graduationTime).equalToWhenPresent(record::getGraduationTime)
                .set(ddId).equalToWhenPresent(record::getDdId)
                .set(companyAlias).equalToWhenPresent(record::getCompanyAlias)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(userCertificate).equalToWhenPresent(record::getUserCertificate)
                .set(userSmimeCertificate).equalToWhenPresent(record::getUserSmimeCertificate)
                .set(userPkcs12).equalToWhenPresent(record::getUserPkcs12)
                .set(x500UniqueIdentifier).equalToWhenPresent(record::getX500UniqueIdentifier)
                .set(extra).equalToWhenPresent(record::getExtra)
                .set(departments).equalToWhenPresent(record::getDepartments);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    default int updateByPrimaryKey(O2User record) {
        return UpdateDSL.updateWithMapper(this::update, o2User)
                .set(userName).equalTo(record::getUserName)
                .set(dingId).equalTo(record::getDingId)
                .set(nickName).equalTo(record::getNickName)
                .set(realName).equalTo(record::getRealName)
                .set(position).equalTo(record::getPosition)
                .set(carLicense).equalTo(record::getCarLicense)
                .set(jobNumber).equalTo(record::getJobNumber)
                .set(userType).equalTo(record::getUserType)
                .set(mobile).equalTo(record::getMobile)
                .set(tel).equalTo(record::getTel)
                .set(email).equalTo(record::getEmail)
                .set(homeAddress).equalTo(record::getHomeAddress)
                .set(workplace).equalTo(record::getWorkplace)
                .set(postalCode).equalTo(record::getPostalCode)
                .set(preferredLanguage).equalTo(record::getPreferredLanguage)
                .set(avater).equalTo(record::getAvater)
                .set(description).equalTo(record::getDescription)
                .set(spell).equalTo(record::getSpell)
                .set(status).equalTo(record::getStatus)
                .set(locked).equalTo(record::getLocked)
                .set(expireAt).equalTo(record::getExpireAt)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .set(belongCompany).equalTo(record::getBelongCompany)
                .set(userId).equalTo(record::getUserId)
                .set(cardNumber).equalTo(record::getCardNumber)
                .set(sex).equalTo(record::getSex)
                .set(companyId).equalTo(record::getCompanyId)
                .set(level).equalTo(record::getLevel)
                .set(type).equalTo(record::getType)
                .set(household).equalTo(record::getHousehold)
                .set(householdAddress).equalTo(record::getHouseholdAddress)
                .set(ethnic).equalTo(record::getEthnic)
                .set(politicalStatus).equalTo(record::getPoliticalStatus)
                .set(maritalStatus).equalTo(record::getMaritalStatus)
                .set(linkman).equalTo(record::getLinkman)
                .set(relationShip).equalTo(record::getRelationShip)
                .set(linkmanTel).equalTo(record::getLinkmanTel)
                .set(education).equalTo(record::getEducation)
                .set(school).equalTo(record::getSchool)
                .set(specialty).equalTo(record::getSpecialty)
                .set(socialSecurity).equalTo(record::getSocialSecurity)
                .set(accumulationFund).equalTo(record::getAccumulationFund)
                .set(bankName).equalTo(record::getBankName)
                .set(bankCardNo).equalTo(record::getBankCardNo)
                .set(title).equalTo(record::getTitle)
                .set(entryTime).equalTo(record::getEntryTime)
                .set(enabledTime).equalTo(record::getEnabledTime)
                .set(freezeTime).equalTo(record::getFreezeTime)
                .set(deletedTime).equalTo(record::getDeletedTime)
                .set(birthday).equalTo(record::getBirthday)
                .set(graduationTime).equalTo(record::getGraduationTime)
                .set(ddId).equalTo(record::getDdId)
                .set(companyAlias).equalTo(record::getCompanyAlias)
                .set(groupId).equalTo(record::getGroupId)
                .set(userCertificate).equalTo(record::getUserCertificate)
                .set(userSmimeCertificate).equalTo(record::getUserSmimeCertificate)
                .set(userPkcs12).equalTo(record::getUserPkcs12)
                .set(x500UniqueIdentifier).equalTo(record::getX500UniqueIdentifier)
                .set(extra).equalTo(record::getExtra)
                .set(departments).equalTo(record::getDepartments)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user")
    default int updateByPrimaryKeySelective(O2User record) {
        return UpdateDSL.updateWithMapper(this::update, o2User)
                .set(userName).equalToWhenPresent(record::getUserName)
                .set(dingId).equalToWhenPresent(record::getDingId)
                .set(nickName).equalToWhenPresent(record::getNickName)
                .set(realName).equalToWhenPresent(record::getRealName)
                .set(position).equalToWhenPresent(record::getPosition)
                .set(carLicense).equalToWhenPresent(record::getCarLicense)
                .set(jobNumber).equalToWhenPresent(record::getJobNumber)
                .set(userType).equalToWhenPresent(record::getUserType)
                .set(mobile).equalToWhenPresent(record::getMobile)
                .set(tel).equalToWhenPresent(record::getTel)
                .set(email).equalToWhenPresent(record::getEmail)
                .set(homeAddress).equalToWhenPresent(record::getHomeAddress)
                .set(workplace).equalToWhenPresent(record::getWorkplace)
                .set(postalCode).equalToWhenPresent(record::getPostalCode)
                .set(preferredLanguage).equalToWhenPresent(record::getPreferredLanguage)
                .set(avater).equalToWhenPresent(record::getAvater)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(spell).equalToWhenPresent(record::getSpell)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(locked).equalToWhenPresent(record::getLocked)
                .set(expireAt).equalToWhenPresent(record::getExpireAt)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(belongCompany).equalToWhenPresent(record::getBelongCompany)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(cardNumber).equalToWhenPresent(record::getCardNumber)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(companyId).equalToWhenPresent(record::getCompanyId)
                .set(level).equalToWhenPresent(record::getLevel)
                .set(type).equalToWhenPresent(record::getType)
                .set(household).equalToWhenPresent(record::getHousehold)
                .set(householdAddress).equalToWhenPresent(record::getHouseholdAddress)
                .set(ethnic).equalToWhenPresent(record::getEthnic)
                .set(politicalStatus).equalToWhenPresent(record::getPoliticalStatus)
                .set(maritalStatus).equalToWhenPresent(record::getMaritalStatus)
                .set(linkman).equalToWhenPresent(record::getLinkman)
                .set(relationShip).equalToWhenPresent(record::getRelationShip)
                .set(linkmanTel).equalToWhenPresent(record::getLinkmanTel)
                .set(education).equalToWhenPresent(record::getEducation)
                .set(school).equalToWhenPresent(record::getSchool)
                .set(specialty).equalToWhenPresent(record::getSpecialty)
                .set(socialSecurity).equalToWhenPresent(record::getSocialSecurity)
                .set(accumulationFund).equalToWhenPresent(record::getAccumulationFund)
                .set(bankName).equalToWhenPresent(record::getBankName)
                .set(bankCardNo).equalToWhenPresent(record::getBankCardNo)
                .set(title).equalToWhenPresent(record::getTitle)
                .set(entryTime).equalToWhenPresent(record::getEntryTime)
                .set(enabledTime).equalToWhenPresent(record::getEnabledTime)
                .set(freezeTime).equalToWhenPresent(record::getFreezeTime)
                .set(deletedTime).equalToWhenPresent(record::getDeletedTime)
                .set(birthday).equalToWhenPresent(record::getBirthday)
                .set(graduationTime).equalToWhenPresent(record::getGraduationTime)
                .set(ddId).equalToWhenPresent(record::getDdId)
                .set(companyAlias).equalToWhenPresent(record::getCompanyAlias)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(userCertificate).equalToWhenPresent(record::getUserCertificate)
                .set(userSmimeCertificate).equalToWhenPresent(record::getUserSmimeCertificate)
                .set(userPkcs12).equalToWhenPresent(record::getUserPkcs12)
                .set(x500UniqueIdentifier).equalToWhenPresent(record::getX500UniqueIdentifier)
                .set(extra).equalToWhenPresent(record::getExtra)
                .set(departments).equalToWhenPresent(record::getDepartments)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}