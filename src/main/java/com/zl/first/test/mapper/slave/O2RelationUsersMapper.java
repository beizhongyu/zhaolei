package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2RelationUsersDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.slave.O2RelationUsers;
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
public interface O2RelationUsersMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2RelationUsers> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2RelationUsersResult")
    O2RelationUsers selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2RelationUsersResult")
    List<O2RelationUsers> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    default Function<SelectStatementProvider, List<O2RelationUsers>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2RelationUsersResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.VARCHAR),
        @Result(column="child_id", property="childId", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER)
    })
    List<O2RelationUsers> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2RelationUsers);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2RelationUsers);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2RelationUsers)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    default int insert(O2RelationUsers record) {
        return insert(SqlBuilder.insert(record)
                .into(o2RelationUsers)
                .map(id).toProperty("id")
                .map(groupId).toProperty("groupId")
                .map(childId).toProperty("childId")
                .map(category).toProperty("category")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    default int insertSelective(O2RelationUsers record) {
        return insert(SqlBuilder.insert(record)
                .into(o2RelationUsers)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(groupId).toPropertyWhenPresent("groupId", record::getGroupId)
                .map(childId).toPropertyWhenPresent("childId", record::getChildId)
                .map(category).toPropertyWhenPresent("category", record::getCategory)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2RelationUsers>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, groupId, childId, category, createAt, modifyAt, version)
                .from(o2RelationUsers);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2RelationUsers>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, groupId, childId, category, createAt, modifyAt, version)
                .from(o2RelationUsers);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2RelationUsers>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, groupId, childId, category, createAt, modifyAt, version)
                .from(o2RelationUsers);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2RelationUsers>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, groupId, childId, category, createAt, modifyAt, version)
                .from(o2RelationUsers);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    default O2RelationUsers selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, groupId, childId, category, createAt, modifyAt, version)
                .from(o2RelationUsers)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2RelationUsers record) {
        return UpdateDSL.updateWithMapper(this::update, o2RelationUsers)
                .set(id).equalTo(record::getId)
                .set(groupId).equalTo(record::getGroupId)
                .set(childId).equalTo(record::getChildId)
                .set(category).equalTo(record::getCategory)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2RelationUsers record) {
        return UpdateDSL.updateWithMapper(this::update, o2RelationUsers)
                .set(id).equalToWhenPresent(record::getId)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(childId).equalToWhenPresent(record::getChildId)
                .set(category).equalToWhenPresent(record::getCategory)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    default int updateByPrimaryKey(O2RelationUsers record) {
        return UpdateDSL.updateWithMapper(this::update, o2RelationUsers)
                .set(groupId).equalTo(record::getGroupId)
                .set(childId).equalTo(record::getChildId)
                .set(category).equalTo(record::getCategory)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_users")
    default int updateByPrimaryKeySelective(O2RelationUsers record) {
        return UpdateDSL.updateWithMapper(this::update, o2RelationUsers)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(childId).equalToWhenPresent(record::getChildId)
                .set(category).equalToWhenPresent(record::getCategory)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}