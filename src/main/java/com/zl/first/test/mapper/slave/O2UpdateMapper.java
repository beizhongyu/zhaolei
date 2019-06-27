package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2UpdateDynamicSqlSupport.*;

import com.zl.first.test.model.slave.O2Update;
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
public interface O2UpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2Update> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2UpdateResult")
    List<O2Update> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    default Function<SelectStatementProvider, List<O2Update>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2UpdateResult", value = {
        @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="card_number", property="cardNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.VARCHAR),
        @Result(column="household", property="household", jdbcType=JdbcType.VARCHAR),
        @Result(column="marital_status", property="maritalStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="ethnic", property="ethnic", jdbcType=JdbcType.VARCHAR),
        @Result(column="household_address", property="householdAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="home_address", property="homeAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="school", property="school", jdbcType=JdbcType.VARCHAR),
        @Result(column="graduation_time", property="graduationTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="specialty", property="specialty", jdbcType=JdbcType.VARCHAR),
        @Result(column="education", property="education", jdbcType=JdbcType.VARCHAR),
        @Result(column="political_status", property="politicalStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="linkman", property="linkman", jdbcType=JdbcType.VARCHAR),
        @Result(column="relation_ship", property="relationShip", jdbcType=JdbcType.VARCHAR),
        @Result(column="linkman_tel", property="linkmanTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="entry_time", property="entryTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="bank_name", property="bankName", jdbcType=JdbcType.VARCHAR),
        @Result(column="bank_card_no", property="bankCardNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="enabled_time", property="enabledTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR)
    })
    List<O2Update> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2Update);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2Update);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    default int insert(O2Update record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Update)
                .map(sex).toProperty("sex")
                .map(cardNumber).toProperty("cardNumber")
                .map(birthday).toProperty("birthday")
                .map(household).toProperty("household")
                .map(maritalStatus).toProperty("maritalStatus")
                .map(ethnic).toProperty("ethnic")
                .map(householdAddress).toProperty("householdAddress")
                .map(homeAddress).toProperty("homeAddress")
                .map(school).toProperty("school")
                .map(graduationTime).toProperty("graduationTime")
                .map(specialty).toProperty("specialty")
                .map(education).toProperty("education")
                .map(politicalStatus).toProperty("politicalStatus")
                .map(linkman).toProperty("linkman")
                .map(relationShip).toProperty("relationShip")
                .map(linkmanTel).toProperty("linkmanTel")
                .map(entryTime).toProperty("entryTime")
                .map(bankName).toProperty("bankName")
                .map(bankCardNo).toProperty("bankCardNo")
                .map(enabledTime).toProperty("enabledTime")
                .map(status).toProperty("status")
                .map(nickName).toProperty("nickName")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    default int insertSelective(O2Update record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Update)
                .map(sex).toPropertyWhenPresent("sex", record::getSex)
                .map(cardNumber).toPropertyWhenPresent("cardNumber", record::getCardNumber)
                .map(birthday).toPropertyWhenPresent("birthday", record::getBirthday)
                .map(household).toPropertyWhenPresent("household", record::getHousehold)
                .map(maritalStatus).toPropertyWhenPresent("maritalStatus", record::getMaritalStatus)
                .map(ethnic).toPropertyWhenPresent("ethnic", record::getEthnic)
                .map(householdAddress).toPropertyWhenPresent("householdAddress", record::getHouseholdAddress)
                .map(homeAddress).toPropertyWhenPresent("homeAddress", record::getHomeAddress)
                .map(school).toPropertyWhenPresent("school", record::getSchool)
                .map(graduationTime).toPropertyWhenPresent("graduationTime", record::getGraduationTime)
                .map(specialty).toPropertyWhenPresent("specialty", record::getSpecialty)
                .map(education).toPropertyWhenPresent("education", record::getEducation)
                .map(politicalStatus).toPropertyWhenPresent("politicalStatus", record::getPoliticalStatus)
                .map(linkman).toPropertyWhenPresent("linkman", record::getLinkman)
                .map(relationShip).toPropertyWhenPresent("relationShip", record::getRelationShip)
                .map(linkmanTel).toPropertyWhenPresent("linkmanTel", record::getLinkmanTel)
                .map(entryTime).toPropertyWhenPresent("entryTime", record::getEntryTime)
                .map(bankName).toPropertyWhenPresent("bankName", record::getBankName)
                .map(bankCardNo).toPropertyWhenPresent("bankCardNo", record::getBankCardNo)
                .map(enabledTime).toPropertyWhenPresent("enabledTime", record::getEnabledTime)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(nickName).toPropertyWhenPresent("nickName", record::getNickName)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Update>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), sex, cardNumber, birthday, household, maritalStatus, ethnic, householdAddress, homeAddress, school, graduationTime, specialty, education, politicalStatus, linkman, relationShip, linkmanTel, entryTime, bankName, bankCardNo, enabledTime, status, nickName)
                .from(o2Update);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Update>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, sex, cardNumber, birthday, household, maritalStatus, ethnic, householdAddress, homeAddress, school, graduationTime, specialty, education, politicalStatus, linkman, relationShip, linkmanTel, entryTime, bankName, bankCardNo, enabledTime, status, nickName)
                .from(o2Update);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Update>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), sex, cardNumber, birthday, household, maritalStatus, ethnic, householdAddress, homeAddress, school, graduationTime, specialty, education, politicalStatus, linkman, relationShip, linkmanTel, entryTime, bankName, bankCardNo, enabledTime, status, nickName)
                .from(o2Update);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Update>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, sex, cardNumber, birthday, household, maritalStatus, ethnic, householdAddress, homeAddress, school, graduationTime, specialty, education, politicalStatus, linkman, relationShip, linkmanTel, entryTime, bankName, bankCardNo, enabledTime, status, nickName)
                .from(o2Update);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2Update record) {
        return UpdateDSL.updateWithMapper(this::update, o2Update)
                .set(sex).equalTo(record::getSex)
                .set(cardNumber).equalTo(record::getCardNumber)
                .set(birthday).equalTo(record::getBirthday)
                .set(household).equalTo(record::getHousehold)
                .set(maritalStatus).equalTo(record::getMaritalStatus)
                .set(ethnic).equalTo(record::getEthnic)
                .set(householdAddress).equalTo(record::getHouseholdAddress)
                .set(homeAddress).equalTo(record::getHomeAddress)
                .set(school).equalTo(record::getSchool)
                .set(graduationTime).equalTo(record::getGraduationTime)
                .set(specialty).equalTo(record::getSpecialty)
                .set(education).equalTo(record::getEducation)
                .set(politicalStatus).equalTo(record::getPoliticalStatus)
                .set(linkman).equalTo(record::getLinkman)
                .set(relationShip).equalTo(record::getRelationShip)
                .set(linkmanTel).equalTo(record::getLinkmanTel)
                .set(entryTime).equalTo(record::getEntryTime)
                .set(bankName).equalTo(record::getBankName)
                .set(bankCardNo).equalTo(record::getBankCardNo)
                .set(enabledTime).equalTo(record::getEnabledTime)
                .set(status).equalTo(record::getStatus)
                .set(nickName).equalTo(record::getNickName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_update")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2Update record) {
        return UpdateDSL.updateWithMapper(this::update, o2Update)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(cardNumber).equalToWhenPresent(record::getCardNumber)
                .set(birthday).equalToWhenPresent(record::getBirthday)
                .set(household).equalToWhenPresent(record::getHousehold)
                .set(maritalStatus).equalToWhenPresent(record::getMaritalStatus)
                .set(ethnic).equalToWhenPresent(record::getEthnic)
                .set(householdAddress).equalToWhenPresent(record::getHouseholdAddress)
                .set(homeAddress).equalToWhenPresent(record::getHomeAddress)
                .set(school).equalToWhenPresent(record::getSchool)
                .set(graduationTime).equalToWhenPresent(record::getGraduationTime)
                .set(specialty).equalToWhenPresent(record::getSpecialty)
                .set(education).equalToWhenPresent(record::getEducation)
                .set(politicalStatus).equalToWhenPresent(record::getPoliticalStatus)
                .set(linkman).equalToWhenPresent(record::getLinkman)
                .set(relationShip).equalToWhenPresent(record::getRelationShip)
                .set(linkmanTel).equalToWhenPresent(record::getLinkmanTel)
                .set(entryTime).equalToWhenPresent(record::getEntryTime)
                .set(bankName).equalToWhenPresent(record::getBankName)
                .set(bankCardNo).equalToWhenPresent(record::getBankCardNo)
                .set(enabledTime).equalToWhenPresent(record::getEnabledTime)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(nickName).equalToWhenPresent(record::getNickName);
    }
}