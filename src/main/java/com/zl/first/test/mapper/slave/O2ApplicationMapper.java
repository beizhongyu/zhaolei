package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2ApplicationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.slave.O2Application;
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
public interface O2ApplicationMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2Application> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2ApplicationResult")
    O2Application selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2ApplicationResult")
    List<O2Application> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    default Function<SelectStatementProvider, List<O2Application>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2ApplicationResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="client_id", property="clientId", jdbcType=JdbcType.VARCHAR),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.VARCHAR),
        @Result(column="display_name", property="displayName", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="logo", property="logo", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<O2Application> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2Application);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2Application);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2Application)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    default int insert(O2Application record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Application)
                .map(id).toProperty("id")
                .map(clientId).toProperty("clientId")
                .map(categoryId).toProperty("categoryId")
                .map(displayName).toProperty("displayName")
                .map(description).toProperty("description")
                .map(url).toProperty("url")
                .map(status).toProperty("status")
                .map(note).toProperty("note")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .map(logo).toProperty("logo")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    default int insertSelective(O2Application record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Application)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(clientId).toPropertyWhenPresent("clientId", record::getClientId)
                .map(categoryId).toPropertyWhenPresent("categoryId", record::getCategoryId)
                .map(displayName).toPropertyWhenPresent("displayName", record::getDisplayName)
                .map(description).toPropertyWhenPresent("description", record::getDescription)
                .map(url).toPropertyWhenPresent("url", record::getUrl)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(note).toPropertyWhenPresent("note", record::getNote)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .map(logo).toPropertyWhenPresent("logo", record::getLogo)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Application>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, clientId, categoryId, displayName, description, url, status, note, createAt, modifyAt, version, logo)
                .from(o2Application);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Application>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, clientId, categoryId, displayName, description, url, status, note, createAt, modifyAt, version, logo)
                .from(o2Application);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Application>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, clientId, categoryId, displayName, description, url, status, note, createAt, modifyAt, version, logo)
                .from(o2Application);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Application>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, clientId, categoryId, displayName, description, url, status, note, createAt, modifyAt, version, logo)
                .from(o2Application);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    default O2Application selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, clientId, categoryId, displayName, description, url, status, note, createAt, modifyAt, version, logo)
                .from(o2Application)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2Application record) {
        return UpdateDSL.updateWithMapper(this::update, o2Application)
                .set(id).equalTo(record::getId)
                .set(clientId).equalTo(record::getClientId)
                .set(categoryId).equalTo(record::getCategoryId)
                .set(displayName).equalTo(record::getDisplayName)
                .set(description).equalTo(record::getDescription)
                .set(url).equalTo(record::getUrl)
                .set(status).equalTo(record::getStatus)
                .set(note).equalTo(record::getNote)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .set(logo).equalTo(record::getLogo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2Application record) {
        return UpdateDSL.updateWithMapper(this::update, o2Application)
                .set(id).equalToWhenPresent(record::getId)
                .set(clientId).equalToWhenPresent(record::getClientId)
                .set(categoryId).equalToWhenPresent(record::getCategoryId)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(note).equalToWhenPresent(record::getNote)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(logo).equalToWhenPresent(record::getLogo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    default int updateByPrimaryKey(O2Application record) {
        return UpdateDSL.updateWithMapper(this::update, o2Application)
                .set(clientId).equalTo(record::getClientId)
                .set(categoryId).equalTo(record::getCategoryId)
                .set(displayName).equalTo(record::getDisplayName)
                .set(description).equalTo(record::getDescription)
                .set(url).equalTo(record::getUrl)
                .set(status).equalTo(record::getStatus)
                .set(note).equalTo(record::getNote)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .set(logo).equalTo(record::getLogo)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    default int updateByPrimaryKeySelective(O2Application record) {
        return UpdateDSL.updateWithMapper(this::update, o2Application)
                .set(clientId).equalToWhenPresent(record::getClientId)
                .set(categoryId).equalToWhenPresent(record::getCategoryId)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(note).equalToWhenPresent(record::getNote)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(logo).equalToWhenPresent(record::getLogo)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}