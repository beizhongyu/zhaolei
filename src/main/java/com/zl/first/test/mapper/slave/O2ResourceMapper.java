package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2ResourceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.slave.O2Resource;
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
public interface O2ResourceMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2Resource> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2ResourceResult")
    O2Resource selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2ResourceResult")
    List<O2Resource> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    default Function<SelectStatementProvider, List<O2Resource>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2ResourceResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="client_id", property="clientId", jdbcType=JdbcType.VARCHAR),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="resource_id", property="resourceId", jdbcType=JdbcType.VARCHAR),
        @Result(column="action", property="action", jdbcType=JdbcType.VARCHAR),
        @Result(column="authorize", property="authorize", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER)
    })
    List<O2Resource> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2Resource);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2Resource);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2Resource)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    default int insert(O2Resource record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Resource)
                .map(id).toProperty("id")
                .map(clientId).toProperty("clientId")
                .map(groupId).toProperty("groupId")
                .map(category).toProperty("category")
                .map(resourceId).toProperty("resourceId")
                .map(action).toProperty("action")
                .map(authorize).toProperty("authorize")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    default int insertSelective(O2Resource record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Resource)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(clientId).toPropertyWhenPresent("clientId", record::getClientId)
                .map(groupId).toPropertyWhenPresent("groupId", record::getGroupId)
                .map(category).toPropertyWhenPresent("category", record::getCategory)
                .map(resourceId).toPropertyWhenPresent("resourceId", record::getResourceId)
                .map(action).toPropertyWhenPresent("action", record::getAction)
                .map(authorize).toPropertyWhenPresent("authorize", record::getAuthorize)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Resource>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, clientId, groupId, category, resourceId, action, authorize, createAt, modifyAt, version)
                .from(o2Resource);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Resource>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, clientId, groupId, category, resourceId, action, authorize, createAt, modifyAt, version)
                .from(o2Resource);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Resource>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, clientId, groupId, category, resourceId, action, authorize, createAt, modifyAt, version)
                .from(o2Resource);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Resource>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, clientId, groupId, category, resourceId, action, authorize, createAt, modifyAt, version)
                .from(o2Resource);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    default O2Resource selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, clientId, groupId, category, resourceId, action, authorize, createAt, modifyAt, version)
                .from(o2Resource)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2Resource record) {
        return UpdateDSL.updateWithMapper(this::update, o2Resource)
                .set(id).equalTo(record::getId)
                .set(clientId).equalTo(record::getClientId)
                .set(groupId).equalTo(record::getGroupId)
                .set(category).equalTo(record::getCategory)
                .set(resourceId).equalTo(record::getResourceId)
                .set(action).equalTo(record::getAction)
                .set(authorize).equalTo(record::getAuthorize)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2Resource record) {
        return UpdateDSL.updateWithMapper(this::update, o2Resource)
                .set(id).equalToWhenPresent(record::getId)
                .set(clientId).equalToWhenPresent(record::getClientId)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(category).equalToWhenPresent(record::getCategory)
                .set(resourceId).equalToWhenPresent(record::getResourceId)
                .set(action).equalToWhenPresent(record::getAction)
                .set(authorize).equalToWhenPresent(record::getAuthorize)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    default int updateByPrimaryKey(O2Resource record) {
        return UpdateDSL.updateWithMapper(this::update, o2Resource)
                .set(clientId).equalTo(record::getClientId)
                .set(groupId).equalTo(record::getGroupId)
                .set(category).equalTo(record::getCategory)
                .set(resourceId).equalTo(record::getResourceId)
                .set(action).equalTo(record::getAction)
                .set(authorize).equalTo(record::getAuthorize)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_resource")
    default int updateByPrimaryKeySelective(O2Resource record) {
        return UpdateDSL.updateWithMapper(this::update, o2Resource)
                .set(clientId).equalToWhenPresent(record::getClientId)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(category).equalToWhenPresent(record::getCategory)
                .set(resourceId).equalToWhenPresent(record::getResourceId)
                .set(action).equalToWhenPresent(record::getAction)
                .set(authorize).equalToWhenPresent(record::getAuthorize)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}