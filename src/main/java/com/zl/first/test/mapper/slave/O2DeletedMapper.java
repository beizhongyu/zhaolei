package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2DeletedDynamicSqlSupport.*;

import com.zl.first.test.model.slave.O2Deleted;
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
public interface O2DeletedMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2Deleted> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2DeletedResult")
    List<O2Deleted> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    default Function<SelectStatementProvider, List<O2Deleted>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2DeletedResult", value = {
        @Result(column="job_number", property="jobNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="real_name", property="realName", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="position", property="position", jdbcType=JdbcType.VARCHAR),
        @Result(column="card_number", property="cardNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.VARCHAR),
        @Result(column="household", property="household", jdbcType=JdbcType.VARCHAR),
        @Result(column="marital_status", property="maritalStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="household_address", property="householdAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="home_address", property="homeAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="school", property="school", jdbcType=JdbcType.VARCHAR),
        @Result(column="graduation_time", property="graduationTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="specialty", property="specialty", jdbcType=JdbcType.VARCHAR),
        @Result(column="education", property="education", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="linkman", property="linkman", jdbcType=JdbcType.VARCHAR),
        @Result(column="relation_ship", property="relationShip", jdbcType=JdbcType.VARCHAR),
        @Result(column="linkman_tel", property="linkmanTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="entry_time", property="entryTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="bank_name", property="bankName", jdbcType=JdbcType.VARCHAR),
        @Result(column="bank_card_no", property="bankCardNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="enabled_time", property="enabledTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="f25", property="f25", jdbcType=JdbcType.VARCHAR)
    })
    List<O2Deleted> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2Deleted);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2Deleted);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    default int insert(O2Deleted record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Deleted)
                .map(jobNumber).toProperty("jobNumber")
                .map(realName).toProperty("realName")
                .map(sex).toProperty("sex")
                .map(position).toProperty("position")
                .map(cardNumber).toProperty("cardNumber")
                .map(birthday).toProperty("birthday")
                .map(household).toProperty("household")
                .map(maritalStatus).toProperty("maritalStatus")
                .map(householdAddress).toProperty("householdAddress")
                .map(homeAddress).toProperty("homeAddress")
                .map(school).toProperty("school")
                .map(graduationTime).toProperty("graduationTime")
                .map(specialty).toProperty("specialty")
                .map(education).toProperty("education")
                .map(mobile).toProperty("mobile")
                .map(linkman).toProperty("linkman")
                .map(relationShip).toProperty("relationShip")
                .map(linkmanTel).toProperty("linkmanTel")
                .map(entryTime).toProperty("entryTime")
                .map(bankName).toProperty("bankName")
                .map(bankCardNo).toProperty("bankCardNo")
                .map(enabledTime).toProperty("enabledTime")
                .map(nickName).toProperty("nickName")
                .map(deletedTime).toProperty("deletedTime")
                .map(f25).toProperty("f25")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    default int insertSelective(O2Deleted record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Deleted)
                .map(jobNumber).toPropertyWhenPresent("jobNumber", record::getJobNumber)
                .map(realName).toPropertyWhenPresent("realName", record::getRealName)
                .map(sex).toPropertyWhenPresent("sex", record::getSex)
                .map(position).toPropertyWhenPresent("position", record::getPosition)
                .map(cardNumber).toPropertyWhenPresent("cardNumber", record::getCardNumber)
                .map(birthday).toPropertyWhenPresent("birthday", record::getBirthday)
                .map(household).toPropertyWhenPresent("household", record::getHousehold)
                .map(maritalStatus).toPropertyWhenPresent("maritalStatus", record::getMaritalStatus)
                .map(householdAddress).toPropertyWhenPresent("householdAddress", record::getHouseholdAddress)
                .map(homeAddress).toPropertyWhenPresent("homeAddress", record::getHomeAddress)
                .map(school).toPropertyWhenPresent("school", record::getSchool)
                .map(graduationTime).toPropertyWhenPresent("graduationTime", record::getGraduationTime)
                .map(specialty).toPropertyWhenPresent("specialty", record::getSpecialty)
                .map(education).toPropertyWhenPresent("education", record::getEducation)
                .map(mobile).toPropertyWhenPresent("mobile", record::getMobile)
                .map(linkman).toPropertyWhenPresent("linkman", record::getLinkman)
                .map(relationShip).toPropertyWhenPresent("relationShip", record::getRelationShip)
                .map(linkmanTel).toPropertyWhenPresent("linkmanTel", record::getLinkmanTel)
                .map(entryTime).toPropertyWhenPresent("entryTime", record::getEntryTime)
                .map(bankName).toPropertyWhenPresent("bankName", record::getBankName)
                .map(bankCardNo).toPropertyWhenPresent("bankCardNo", record::getBankCardNo)
                .map(enabledTime).toPropertyWhenPresent("enabledTime", record::getEnabledTime)
                .map(nickName).toPropertyWhenPresent("nickName", record::getNickName)
                .map(deletedTime).toPropertyWhenPresent("deletedTime", record::getDeletedTime)
                .map(f25).toPropertyWhenPresent("f25", record::getF25)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Deleted>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), jobNumber, realName, sex, position, cardNumber, birthday, household, maritalStatus, householdAddress, homeAddress, school, graduationTime, specialty, education, mobile, linkman, relationShip, linkmanTel, entryTime, bankName, bankCardNo, enabledTime, nickName, deletedTime, f25)
                .from(o2Deleted);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Deleted>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, jobNumber, realName, sex, position, cardNumber, birthday, household, maritalStatus, householdAddress, homeAddress, school, graduationTime, specialty, education, mobile, linkman, relationShip, linkmanTel, entryTime, bankName, bankCardNo, enabledTime, nickName, deletedTime, f25)
                .from(o2Deleted);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Deleted>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), jobNumber, realName, sex, position, cardNumber, birthday, household, maritalStatus, householdAddress, homeAddress, school, graduationTime, specialty, education, mobile, linkman, relationShip, linkmanTel, entryTime, bankName, bankCardNo, enabledTime, nickName, deletedTime, f25)
                .from(o2Deleted);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Deleted>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, jobNumber, realName, sex, position, cardNumber, birthday, household, maritalStatus, householdAddress, homeAddress, school, graduationTime, specialty, education, mobile, linkman, relationShip, linkmanTel, entryTime, bankName, bankCardNo, enabledTime, nickName, deletedTime, f25)
                .from(o2Deleted);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2Deleted record) {
        return UpdateDSL.updateWithMapper(this::update, o2Deleted)
                .set(jobNumber).equalTo(record::getJobNumber)
                .set(realName).equalTo(record::getRealName)
                .set(sex).equalTo(record::getSex)
                .set(position).equalTo(record::getPosition)
                .set(cardNumber).equalTo(record::getCardNumber)
                .set(birthday).equalTo(record::getBirthday)
                .set(household).equalTo(record::getHousehold)
                .set(maritalStatus).equalTo(record::getMaritalStatus)
                .set(householdAddress).equalTo(record::getHouseholdAddress)
                .set(homeAddress).equalTo(record::getHomeAddress)
                .set(school).equalTo(record::getSchool)
                .set(graduationTime).equalTo(record::getGraduationTime)
                .set(specialty).equalTo(record::getSpecialty)
                .set(education).equalTo(record::getEducation)
                .set(mobile).equalTo(record::getMobile)
                .set(linkman).equalTo(record::getLinkman)
                .set(relationShip).equalTo(record::getRelationShip)
                .set(linkmanTel).equalTo(record::getLinkmanTel)
                .set(entryTime).equalTo(record::getEntryTime)
                .set(bankName).equalTo(record::getBankName)
                .set(bankCardNo).equalTo(record::getBankCardNo)
                .set(enabledTime).equalTo(record::getEnabledTime)
                .set(nickName).equalTo(record::getNickName)
                .set(deletedTime).equalTo(record::getDeletedTime)
                .set(f25).equalTo(record::getF25);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_deleted")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2Deleted record) {
        return UpdateDSL.updateWithMapper(this::update, o2Deleted)
                .set(jobNumber).equalToWhenPresent(record::getJobNumber)
                .set(realName).equalToWhenPresent(record::getRealName)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(position).equalToWhenPresent(record::getPosition)
                .set(cardNumber).equalToWhenPresent(record::getCardNumber)
                .set(birthday).equalToWhenPresent(record::getBirthday)
                .set(household).equalToWhenPresent(record::getHousehold)
                .set(maritalStatus).equalToWhenPresent(record::getMaritalStatus)
                .set(householdAddress).equalToWhenPresent(record::getHouseholdAddress)
                .set(homeAddress).equalToWhenPresent(record::getHomeAddress)
                .set(school).equalToWhenPresent(record::getSchool)
                .set(graduationTime).equalToWhenPresent(record::getGraduationTime)
                .set(specialty).equalToWhenPresent(record::getSpecialty)
                .set(education).equalToWhenPresent(record::getEducation)
                .set(mobile).equalToWhenPresent(record::getMobile)
                .set(linkman).equalToWhenPresent(record::getLinkman)
                .set(relationShip).equalToWhenPresent(record::getRelationShip)
                .set(linkmanTel).equalToWhenPresent(record::getLinkmanTel)
                .set(entryTime).equalToWhenPresent(record::getEntryTime)
                .set(bankName).equalToWhenPresent(record::getBankName)
                .set(bankCardNo).equalToWhenPresent(record::getBankCardNo)
                .set(enabledTime).equalToWhenPresent(record::getEnabledTime)
                .set(nickName).equalToWhenPresent(record::getNickName)
                .set(deletedTime).equalToWhenPresent(record::getDeletedTime)
                .set(f25).equalToWhenPresent(record::getF25);
    }
}