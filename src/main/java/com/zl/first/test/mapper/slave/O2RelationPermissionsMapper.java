package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2RelationPermissionsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.slave.O2RelationPermissions;
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
public interface O2RelationPermissionsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2RelationPermissions> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2RelationPermissionsResult")
    O2RelationPermissions selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2RelationPermissionsResult")
    List<O2RelationPermissions> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    default Function<SelectStatementProvider, List<O2RelationPermissions>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2RelationPermissionsResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.VARCHAR),
        @Result(column="child_id", property="childId", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER)
    })
    List<O2RelationPermissions> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2RelationPermissions);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2RelationPermissions);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2RelationPermissions)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    default int insert(O2RelationPermissions record) {
        return insert(SqlBuilder.insert(record)
                .into(o2RelationPermissions)
                .map(id).toProperty("id")
                .map(roleId).toProperty("roleId")
                .map(childId).toProperty("childId")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    default int insertSelective(O2RelationPermissions record) {
        return insert(SqlBuilder.insert(record)
                .into(o2RelationPermissions)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(roleId).toPropertyWhenPresent("roleId", record::getRoleId)
                .map(childId).toPropertyWhenPresent("childId", record::getChildId)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2RelationPermissions>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, roleId, childId, createAt, modifyAt, version)
                .from(o2RelationPermissions);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2RelationPermissions>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, roleId, childId, createAt, modifyAt, version)
                .from(o2RelationPermissions);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2RelationPermissions>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, roleId, childId, createAt, modifyAt, version)
                .from(o2RelationPermissions);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2RelationPermissions>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, roleId, childId, createAt, modifyAt, version)
                .from(o2RelationPermissions);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    default O2RelationPermissions selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, roleId, childId, createAt, modifyAt, version)
                .from(o2RelationPermissions)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2RelationPermissions record) {
        return UpdateDSL.updateWithMapper(this::update, o2RelationPermissions)
                .set(id).equalTo(record::getId)
                .set(roleId).equalTo(record::getRoleId)
                .set(childId).equalTo(record::getChildId)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2RelationPermissions record) {
        return UpdateDSL.updateWithMapper(this::update, o2RelationPermissions)
                .set(id).equalToWhenPresent(record::getId)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(childId).equalToWhenPresent(record::getChildId)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    default int updateByPrimaryKey(O2RelationPermissions record) {
        return UpdateDSL.updateWithMapper(this::update, o2RelationPermissions)
                .set(roleId).equalTo(record::getRoleId)
                .set(childId).equalTo(record::getChildId)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    default int updateByPrimaryKeySelective(O2RelationPermissions record) {
        return UpdateDSL.updateWithMapper(this::update, o2RelationPermissions)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(childId).equalToWhenPresent(record::getChildId)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}