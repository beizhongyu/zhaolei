package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2CompanyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.slave.O2Company;
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
public interface O2CompanyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2Company> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2CompanyResult")
    O2Company selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2CompanyResult")
    List<O2Company> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    default Function<SelectStatementProvider, List<O2Company>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2CompanyResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="display_name", property="displayName", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="mail_suffix", property="mailSuffix", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_ding", property="userDing", jdbcType=JdbcType.SMALLINT),
        @Result(column="sync_ding", property="syncDing", jdbcType=JdbcType.SMALLINT),
        @Result(column="corp_id", property="corpId", jdbcType=JdbcType.VARCHAR),
        @Result(column="corps_ecret", property="corpsEcret", jdbcType=JdbcType.VARCHAR),
        @Result(column="notice_ding", property="noticeDing", jdbcType=JdbcType.SMALLINT),
        @Result(column="agent_id", property="agentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="access_code", property="accessCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="access_password", property="accessPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_key", property="appKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_secret", property="appSecret", jdbcType=JdbcType.VARCHAR),
        @Result(column="use_mail", property="useMail", jdbcType=JdbcType.SMALLINT),
        @Result(column="mail_group", property="mailGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="logo", property="logo", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<O2Company> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2Company);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2Company);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2Company)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    default int insert(O2Company record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Company)
                .map(id).toProperty("id")
                .map(displayName).toProperty("displayName")
                .map(city).toProperty("city")
                .map(address).toProperty("address")
                .map(mailSuffix).toProperty("mailSuffix")
                .map(userDing).toProperty("userDing")
                .map(syncDing).toProperty("syncDing")
                .map(corpId).toProperty("corpId")
                .map(corpsEcret).toProperty("corpsEcret")
                .map(noticeDing).toProperty("noticeDing")
                .map(agentId).toProperty("agentId")
                .map(status).toProperty("status")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .map(accessCode).toProperty("accessCode")
                .map(accessPassword).toProperty("accessPassword")
                .map(groupId).toProperty("groupId")
                .map(appKey).toProperty("appKey")
                .map(appSecret).toProperty("appSecret")
                .map(useMail).toProperty("useMail")
                .map(mailGroup).toProperty("mailGroup")
                .map(logo).toProperty("logo")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    default int insertSelective(O2Company record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Company)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(displayName).toPropertyWhenPresent("displayName", record::getDisplayName)
                .map(city).toPropertyWhenPresent("city", record::getCity)
                .map(address).toPropertyWhenPresent("address", record::getAddress)
                .map(mailSuffix).toPropertyWhenPresent("mailSuffix", record::getMailSuffix)
                .map(userDing).toPropertyWhenPresent("userDing", record::getUserDing)
                .map(syncDing).toPropertyWhenPresent("syncDing", record::getSyncDing)
                .map(corpId).toPropertyWhenPresent("corpId", record::getCorpId)
                .map(corpsEcret).toPropertyWhenPresent("corpsEcret", record::getCorpsEcret)
                .map(noticeDing).toPropertyWhenPresent("noticeDing", record::getNoticeDing)
                .map(agentId).toPropertyWhenPresent("agentId", record::getAgentId)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .map(accessCode).toPropertyWhenPresent("accessCode", record::getAccessCode)
                .map(accessPassword).toPropertyWhenPresent("accessPassword", record::getAccessPassword)
                .map(groupId).toPropertyWhenPresent("groupId", record::getGroupId)
                .map(appKey).toPropertyWhenPresent("appKey", record::getAppKey)
                .map(appSecret).toPropertyWhenPresent("appSecret", record::getAppSecret)
                .map(useMail).toPropertyWhenPresent("useMail", record::getUseMail)
                .map(mailGroup).toPropertyWhenPresent("mailGroup", record::getMailGroup)
                .map(logo).toPropertyWhenPresent("logo", record::getLogo)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Company>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, displayName, city, address, mailSuffix, userDing, syncDing, corpId, corpsEcret, noticeDing, agentId, status, createAt, modifyAt, version, accessCode, accessPassword, groupId, appKey, appSecret, useMail, mailGroup, logo)
                .from(o2Company);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Company>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, displayName, city, address, mailSuffix, userDing, syncDing, corpId, corpsEcret, noticeDing, agentId, status, createAt, modifyAt, version, accessCode, accessPassword, groupId, appKey, appSecret, useMail, mailGroup, logo)
                .from(o2Company);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Company>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, displayName, city, address, mailSuffix, userDing, syncDing, corpId, corpsEcret, noticeDing, agentId, status, createAt, modifyAt, version, accessCode, accessPassword, groupId, appKey, appSecret, useMail, mailGroup, logo)
                .from(o2Company);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Company>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, displayName, city, address, mailSuffix, userDing, syncDing, corpId, corpsEcret, noticeDing, agentId, status, createAt, modifyAt, version, accessCode, accessPassword, groupId, appKey, appSecret, useMail, mailGroup, logo)
                .from(o2Company);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    default O2Company selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, displayName, city, address, mailSuffix, userDing, syncDing, corpId, corpsEcret, noticeDing, agentId, status, createAt, modifyAt, version, accessCode, accessPassword, groupId, appKey, appSecret, useMail, mailGroup, logo)
                .from(o2Company)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2Company record) {
        return UpdateDSL.updateWithMapper(this::update, o2Company)
                .set(id).equalTo(record::getId)
                .set(displayName).equalTo(record::getDisplayName)
                .set(city).equalTo(record::getCity)
                .set(address).equalTo(record::getAddress)
                .set(mailSuffix).equalTo(record::getMailSuffix)
                .set(userDing).equalTo(record::getUserDing)
                .set(syncDing).equalTo(record::getSyncDing)
                .set(corpId).equalTo(record::getCorpId)
                .set(corpsEcret).equalTo(record::getCorpsEcret)
                .set(noticeDing).equalTo(record::getNoticeDing)
                .set(agentId).equalTo(record::getAgentId)
                .set(status).equalTo(record::getStatus)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .set(accessCode).equalTo(record::getAccessCode)
                .set(accessPassword).equalTo(record::getAccessPassword)
                .set(groupId).equalTo(record::getGroupId)
                .set(appKey).equalTo(record::getAppKey)
                .set(appSecret).equalTo(record::getAppSecret)
                .set(useMail).equalTo(record::getUseMail)
                .set(mailGroup).equalTo(record::getMailGroup)
                .set(logo).equalTo(record::getLogo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2Company record) {
        return UpdateDSL.updateWithMapper(this::update, o2Company)
                .set(id).equalToWhenPresent(record::getId)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(city).equalToWhenPresent(record::getCity)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(mailSuffix).equalToWhenPresent(record::getMailSuffix)
                .set(userDing).equalToWhenPresent(record::getUserDing)
                .set(syncDing).equalToWhenPresent(record::getSyncDing)
                .set(corpId).equalToWhenPresent(record::getCorpId)
                .set(corpsEcret).equalToWhenPresent(record::getCorpsEcret)
                .set(noticeDing).equalToWhenPresent(record::getNoticeDing)
                .set(agentId).equalToWhenPresent(record::getAgentId)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(accessCode).equalToWhenPresent(record::getAccessCode)
                .set(accessPassword).equalToWhenPresent(record::getAccessPassword)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(appKey).equalToWhenPresent(record::getAppKey)
                .set(appSecret).equalToWhenPresent(record::getAppSecret)
                .set(useMail).equalToWhenPresent(record::getUseMail)
                .set(mailGroup).equalToWhenPresent(record::getMailGroup)
                .set(logo).equalToWhenPresent(record::getLogo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    default int updateByPrimaryKey(O2Company record) {
        return UpdateDSL.updateWithMapper(this::update, o2Company)
                .set(displayName).equalTo(record::getDisplayName)
                .set(city).equalTo(record::getCity)
                .set(address).equalTo(record::getAddress)
                .set(mailSuffix).equalTo(record::getMailSuffix)
                .set(userDing).equalTo(record::getUserDing)
                .set(syncDing).equalTo(record::getSyncDing)
                .set(corpId).equalTo(record::getCorpId)
                .set(corpsEcret).equalTo(record::getCorpsEcret)
                .set(noticeDing).equalTo(record::getNoticeDing)
                .set(agentId).equalTo(record::getAgentId)
                .set(status).equalTo(record::getStatus)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .set(accessCode).equalTo(record::getAccessCode)
                .set(accessPassword).equalTo(record::getAccessPassword)
                .set(groupId).equalTo(record::getGroupId)
                .set(appKey).equalTo(record::getAppKey)
                .set(appSecret).equalTo(record::getAppSecret)
                .set(useMail).equalTo(record::getUseMail)
                .set(mailGroup).equalTo(record::getMailGroup)
                .set(logo).equalTo(record::getLogo)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    default int updateByPrimaryKeySelective(O2Company record) {
        return UpdateDSL.updateWithMapper(this::update, o2Company)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(city).equalToWhenPresent(record::getCity)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(mailSuffix).equalToWhenPresent(record::getMailSuffix)
                .set(userDing).equalToWhenPresent(record::getUserDing)
                .set(syncDing).equalToWhenPresent(record::getSyncDing)
                .set(corpId).equalToWhenPresent(record::getCorpId)
                .set(corpsEcret).equalToWhenPresent(record::getCorpsEcret)
                .set(noticeDing).equalToWhenPresent(record::getNoticeDing)
                .set(agentId).equalToWhenPresent(record::getAgentId)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(accessCode).equalToWhenPresent(record::getAccessCode)
                .set(accessPassword).equalToWhenPresent(record::getAccessPassword)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(appKey).equalToWhenPresent(record::getAppKey)
                .set(appSecret).equalToWhenPresent(record::getAppSecret)
                .set(useMail).equalToWhenPresent(record::getUseMail)
                .set(mailGroup).equalToWhenPresent(record::getMailGroup)
                .set(logo).equalToWhenPresent(record::getLogo)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}