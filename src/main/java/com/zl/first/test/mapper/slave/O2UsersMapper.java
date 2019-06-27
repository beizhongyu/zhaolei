package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2UsersDynamicSqlSupport.*;

import com.zl.first.test.model.slave.O2Users;
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
public interface O2UsersMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2Users> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2UsersResult")
    List<O2Users> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    default Function<SelectStatementProvider, List<O2Users>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2UsersResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="display_name", property="displayName", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="department_id", property="departmentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="relation_id", property="relationId", jdbcType=JdbcType.VARCHAR),
        @Result(column="extra", property="extra", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<O2Users> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2Users);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2Users);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    default int insert(O2Users record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Users)
                .map(id).toProperty("id")
                .map(name).toProperty("name")
                .map(displayName).toProperty("displayName")
                .map(description).toProperty("description")
                .map(status).toProperty("status")
                .map(category).toProperty("category")
                .map(userId).toProperty("userId")
                .map(departmentId).toProperty("departmentId")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .map(relationId).toProperty("relationId")
                .map(extra).toProperty("extra")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    default int insertSelective(O2Users record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Users)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(displayName).toPropertyWhenPresent("displayName", record::getDisplayName)
                .map(description).toPropertyWhenPresent("description", record::getDescription)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(category).toPropertyWhenPresent("category", record::getCategory)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(departmentId).toPropertyWhenPresent("departmentId", record::getDepartmentId)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .map(relationId).toPropertyWhenPresent("relationId", record::getRelationId)
                .map(extra).toPropertyWhenPresent("extra", record::getExtra)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Users>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, name, displayName, description, status, category, userId, departmentId, createAt, modifyAt, version, relationId, extra)
                .from(o2Users);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Users>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, displayName, description, status, category, userId, departmentId, createAt, modifyAt, version, relationId, extra)
                .from(o2Users);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Users>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, name, displayName, description, status, category, userId, departmentId, createAt, modifyAt, version, relationId, extra)
                .from(o2Users);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Users>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, displayName, description, status, category, userId, departmentId, createAt, modifyAt, version, relationId, extra)
                .from(o2Users);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2Users record) {
        return UpdateDSL.updateWithMapper(this::update, o2Users)
                .set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(displayName).equalTo(record::getDisplayName)
                .set(description).equalTo(record::getDescription)
                .set(status).equalTo(record::getStatus)
                .set(category).equalTo(record::getCategory)
                .set(userId).equalTo(record::getUserId)
                .set(departmentId).equalTo(record::getDepartmentId)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .set(relationId).equalTo(record::getRelationId)
                .set(extra).equalTo(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_users")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2Users record) {
        return UpdateDSL.updateWithMapper(this::update, o2Users)
                .set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(category).equalToWhenPresent(record::getCategory)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(departmentId).equalToWhenPresent(record::getDepartmentId)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(relationId).equalToWhenPresent(record::getRelationId)
                .set(extra).equalToWhenPresent(record::getExtra);
    }
}