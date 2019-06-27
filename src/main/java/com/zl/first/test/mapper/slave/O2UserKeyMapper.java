package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2UserKeyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.slave.O2UserKey;
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
public interface O2UserKeyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2UserKey> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2UserKeyResult")
    O2UserKey selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2UserKeyResult")
    List<O2UserKey> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    default Function<SelectStatementProvider, List<O2UserKey>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2UserKeyResult", value = {
        @Result(column="u_key", property="uKey", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER)
    })
    List<O2UserKey> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2UserKey);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2UserKey);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    default int deleteByPrimaryKey(String uKey_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2UserKey)
                .where(uKey, isEqualTo(uKey_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    default int insert(O2UserKey record) {
        return insert(SqlBuilder.insert(record)
                .into(o2UserKey)
                .map(uKey).toProperty("uKey")
                .map(userId).toProperty("userId")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    default int insertSelective(O2UserKey record) {
        return insert(SqlBuilder.insert(record)
                .into(o2UserKey)
                .map(uKey).toPropertyWhenPresent("uKey", record::getuKey)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2UserKey>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), uKey, userId, createAt, modifyAt, version)
                .from(o2UserKey);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2UserKey>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, uKey, userId, createAt, modifyAt, version)
                .from(o2UserKey);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2UserKey>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), uKey, userId, createAt, modifyAt, version)
                .from(o2UserKey);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2UserKey>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, uKey, userId, createAt, modifyAt, version)
                .from(o2UserKey);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    default O2UserKey selectByPrimaryKey(String uKey_) {
        return SelectDSL.selectWithMapper(this::selectOne, uKey, userId, createAt, modifyAt, version)
                .from(o2UserKey)
                .where(uKey, isEqualTo(uKey_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2UserKey record) {
        return UpdateDSL.updateWithMapper(this::update, o2UserKey)
                .set(uKey).equalTo(record::getuKey)
                .set(userId).equalTo(record::getUserId)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2UserKey record) {
        return UpdateDSL.updateWithMapper(this::update, o2UserKey)
                .set(uKey).equalToWhenPresent(record::getuKey)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    default int updateByPrimaryKey(O2UserKey record) {
        return UpdateDSL.updateWithMapper(this::update, o2UserKey)
                .set(userId).equalTo(record::getUserId)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .where(uKey, isEqualTo(record::getuKey))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_key")
    default int updateByPrimaryKeySelective(O2UserKey record) {
        return UpdateDSL.updateWithMapper(this::update, o2UserKey)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .where(uKey, isEqualTo(record::getuKey))
                .build()
                .execute();
    }
}