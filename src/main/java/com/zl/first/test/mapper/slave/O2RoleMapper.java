package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2RoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.slave.O2Role;
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
public interface O2RoleMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2Role> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2RoleResult")
    O2Role selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2RoleResult")
    List<O2Role> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    default Function<SelectStatementProvider, List<O2Role>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2RoleResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="client_id", property="clientId", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="display_name", property="displayName", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="permission_id", property="permissionId", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="extra", property="extra", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<O2Role> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2Role);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2Role);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2Role)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    default int insert(O2Role record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Role)
                .map(id).toProperty("id")
                .map(clientId).toProperty("clientId")
                .map(name).toProperty("name")
                .map(displayName).toProperty("displayName")
                .map(description).toProperty("description")
                .map(status).toProperty("status")
                .map(category).toProperty("category")
                .map(permissionId).toProperty("permissionId")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .map(extra).toProperty("extra")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    default int insertSelective(O2Role record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Role)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(clientId).toPropertyWhenPresent("clientId", record::getClientId)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(displayName).toPropertyWhenPresent("displayName", record::getDisplayName)
                .map(description).toPropertyWhenPresent("description", record::getDescription)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(category).toPropertyWhenPresent("category", record::getCategory)
                .map(permissionId).toPropertyWhenPresent("permissionId", record::getPermissionId)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .map(extra).toPropertyWhenPresent("extra", record::getExtra)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Role>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, clientId, name, displayName, description, status, category, permissionId, createAt, modifyAt, version, extra)
                .from(o2Role);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Role>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, clientId, name, displayName, description, status, category, permissionId, createAt, modifyAt, version, extra)
                .from(o2Role);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Role>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, clientId, name, displayName, description, status, category, permissionId, createAt, modifyAt, version, extra)
                .from(o2Role);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Role>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, clientId, name, displayName, description, status, category, permissionId, createAt, modifyAt, version, extra)
                .from(o2Role);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    default O2Role selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, clientId, name, displayName, description, status, category, permissionId, createAt, modifyAt, version, extra)
                .from(o2Role)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2Role record) {
        return UpdateDSL.updateWithMapper(this::update, o2Role)
                .set(id).equalTo(record::getId)
                .set(clientId).equalTo(record::getClientId)
                .set(name).equalTo(record::getName)
                .set(displayName).equalTo(record::getDisplayName)
                .set(description).equalTo(record::getDescription)
                .set(status).equalTo(record::getStatus)
                .set(category).equalTo(record::getCategory)
                .set(permissionId).equalTo(record::getPermissionId)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2Role record) {
        return UpdateDSL.updateWithMapper(this::update, o2Role)
                .set(id).equalToWhenPresent(record::getId)
                .set(clientId).equalToWhenPresent(record::getClientId)
                .set(name).equalToWhenPresent(record::getName)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(category).equalToWhenPresent(record::getCategory)
                .set(permissionId).equalToWhenPresent(record::getPermissionId)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    default int updateByPrimaryKey(O2Role record) {
        return UpdateDSL.updateWithMapper(this::update, o2Role)
                .set(clientId).equalTo(record::getClientId)
                .set(name).equalTo(record::getName)
                .set(displayName).equalTo(record::getDisplayName)
                .set(description).equalTo(record::getDescription)
                .set(status).equalTo(record::getStatus)
                .set(category).equalTo(record::getCategory)
                .set(permissionId).equalTo(record::getPermissionId)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_role")
    default int updateByPrimaryKeySelective(O2Role record) {
        return UpdateDSL.updateWithMapper(this::update, o2Role)
                .set(clientId).equalToWhenPresent(record::getClientId)
                .set(name).equalToWhenPresent(record::getName)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(category).equalToWhenPresent(record::getCategory)
                .set(permissionId).equalToWhenPresent(record::getPermissionId)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}