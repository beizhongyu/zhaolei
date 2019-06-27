package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2AuthorityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.slave.O2Authority;
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
public interface O2AuthorityMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2Authority> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2AuthorityResult")
    O2Authority selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2AuthorityResult")
    List<O2Authority> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    default Function<SelectStatementProvider, List<O2Authority>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2AuthorityResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.VARCHAR),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.VARCHAR),
        @Result(column="authorize", property="authorize", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="extra", property="extra", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<O2Authority> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2Authority);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2Authority);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2Authority)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    default int insert(O2Authority record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Authority)
                .map(id).toProperty("id")
                .map(groupId).toProperty("groupId")
                .map(roleId).toProperty("roleId")
                .map(authorize).toProperty("authorize")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .map(extra).toProperty("extra")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    default int insertSelective(O2Authority record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Authority)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(groupId).toPropertyWhenPresent("groupId", record::getGroupId)
                .map(roleId).toPropertyWhenPresent("roleId", record::getRoleId)
                .map(authorize).toPropertyWhenPresent("authorize", record::getAuthorize)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .map(extra).toPropertyWhenPresent("extra", record::getExtra)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Authority>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, groupId, roleId, authorize, createAt, modifyAt, version, extra)
                .from(o2Authority);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Authority>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, groupId, roleId, authorize, createAt, modifyAt, version, extra)
                .from(o2Authority);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Authority>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, groupId, roleId, authorize, createAt, modifyAt, version, extra)
                .from(o2Authority);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Authority>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, groupId, roleId, authorize, createAt, modifyAt, version, extra)
                .from(o2Authority);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    default O2Authority selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, groupId, roleId, authorize, createAt, modifyAt, version, extra)
                .from(o2Authority)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2Authority record) {
        return UpdateDSL.updateWithMapper(this::update, o2Authority)
                .set(id).equalTo(record::getId)
                .set(groupId).equalTo(record::getGroupId)
                .set(roleId).equalTo(record::getRoleId)
                .set(authorize).equalTo(record::getAuthorize)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2Authority record) {
        return UpdateDSL.updateWithMapper(this::update, o2Authority)
                .set(id).equalToWhenPresent(record::getId)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(authorize).equalToWhenPresent(record::getAuthorize)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    default int updateByPrimaryKey(O2Authority record) {
        return UpdateDSL.updateWithMapper(this::update, o2Authority)
                .set(groupId).equalTo(record::getGroupId)
                .set(roleId).equalTo(record::getRoleId)
                .set(authorize).equalTo(record::getAuthorize)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_authority")
    default int updateByPrimaryKeySelective(O2Authority record) {
        return UpdateDSL.updateWithMapper(this::update, o2Authority)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(authorize).equalToWhenPresent(record::getAuthorize)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}