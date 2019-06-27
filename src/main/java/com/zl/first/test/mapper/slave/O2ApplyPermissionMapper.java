package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2ApplyPermissionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.slave.O2ApplyPermission;
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
public interface O2ApplyPermissionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2ApplyPermission> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2ApplyPermissionResult")
    O2ApplyPermission selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2ApplyPermissionResult")
    List<O2ApplyPermission> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    default Function<SelectStatementProvider, List<O2ApplyPermission>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2ApplyPermissionResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="client_id", property="clientId", jdbcType=JdbcType.VARCHAR),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.VARCHAR),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.VARCHAR),
        @Result(column="approve_id", property="approveId", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER)
    })
    List<O2ApplyPermission> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2ApplyPermission);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2ApplyPermission);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2ApplyPermission)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    default int insert(O2ApplyPermission record) {
        return insert(SqlBuilder.insert(record)
                .into(o2ApplyPermission)
                .map(id).toProperty("id")
                .map(clientId).toProperty("clientId")
                .map(groupId).toProperty("groupId")
                .map(roleId).toProperty("roleId")
                .map(approveId).toProperty("approveId")
                .map(status).toProperty("status")
                .map(description).toProperty("description")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    default int insertSelective(O2ApplyPermission record) {
        return insert(SqlBuilder.insert(record)
                .into(o2ApplyPermission)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(clientId).toPropertyWhenPresent("clientId", record::getClientId)
                .map(groupId).toPropertyWhenPresent("groupId", record::getGroupId)
                .map(roleId).toPropertyWhenPresent("roleId", record::getRoleId)
                .map(approveId).toPropertyWhenPresent("approveId", record::getApproveId)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(description).toPropertyWhenPresent("description", record::getDescription)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2ApplyPermission>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, clientId, groupId, roleId, approveId, status, description, createAt, modifyAt, version)
                .from(o2ApplyPermission);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2ApplyPermission>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, clientId, groupId, roleId, approveId, status, description, createAt, modifyAt, version)
                .from(o2ApplyPermission);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2ApplyPermission>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, clientId, groupId, roleId, approveId, status, description, createAt, modifyAt, version)
                .from(o2ApplyPermission);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2ApplyPermission>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, clientId, groupId, roleId, approveId, status, description, createAt, modifyAt, version)
                .from(o2ApplyPermission);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    default O2ApplyPermission selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, clientId, groupId, roleId, approveId, status, description, createAt, modifyAt, version)
                .from(o2ApplyPermission)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2ApplyPermission record) {
        return UpdateDSL.updateWithMapper(this::update, o2ApplyPermission)
                .set(id).equalTo(record::getId)
                .set(clientId).equalTo(record::getClientId)
                .set(groupId).equalTo(record::getGroupId)
                .set(roleId).equalTo(record::getRoleId)
                .set(approveId).equalTo(record::getApproveId)
                .set(status).equalTo(record::getStatus)
                .set(description).equalTo(record::getDescription)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2ApplyPermission record) {
        return UpdateDSL.updateWithMapper(this::update, o2ApplyPermission)
                .set(id).equalToWhenPresent(record::getId)
                .set(clientId).equalToWhenPresent(record::getClientId)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(approveId).equalToWhenPresent(record::getApproveId)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    default int updateByPrimaryKey(O2ApplyPermission record) {
        return UpdateDSL.updateWithMapper(this::update, o2ApplyPermission)
                .set(clientId).equalTo(record::getClientId)
                .set(groupId).equalTo(record::getGroupId)
                .set(roleId).equalTo(record::getRoleId)
                .set(approveId).equalTo(record::getApproveId)
                .set(status).equalTo(record::getStatus)
                .set(description).equalTo(record::getDescription)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_apply_permission")
    default int updateByPrimaryKeySelective(O2ApplyPermission record) {
        return UpdateDSL.updateWithMapper(this::update, o2ApplyPermission)
                .set(clientId).equalToWhenPresent(record::getClientId)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(approveId).equalToWhenPresent(record::getApproveId)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}