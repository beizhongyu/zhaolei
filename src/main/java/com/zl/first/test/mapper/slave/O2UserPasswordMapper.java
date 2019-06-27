package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2UserPasswordDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.slave.O2UserPassword;
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
public interface O2UserPasswordMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2UserPassword> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2UserPasswordResult")
    O2UserPassword selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2UserPasswordResult")
    List<O2UserPassword> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    default Function<SelectStatementProvider, List<O2UserPassword>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2UserPasswordResult", value = {
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER)
    })
    List<O2UserPassword> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2UserPassword);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2UserPassword);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    default int deleteByPrimaryKey(String userId_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2UserPassword)
                .where(userId, isEqualTo(userId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    default int insert(O2UserPassword record) {
        return insert(SqlBuilder.insert(record)
                .into(o2UserPassword)
                .map(userId).toProperty("userId")
                .map(password).toProperty("password")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    default int insertSelective(O2UserPassword record) {
        return insert(SqlBuilder.insert(record)
                .into(o2UserPassword)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(password).toPropertyWhenPresent("password", record::getPassword)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2UserPassword>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), userId, password, createAt, modifyAt, version)
                .from(o2UserPassword);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2UserPassword>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, userId, password, createAt, modifyAt, version)
                .from(o2UserPassword);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2UserPassword>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), userId, password, createAt, modifyAt, version)
                .from(o2UserPassword);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2UserPassword>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, userId, password, createAt, modifyAt, version)
                .from(o2UserPassword);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    default O2UserPassword selectByPrimaryKey(String userId_) {
        return SelectDSL.selectWithMapper(this::selectOne, userId, password, createAt, modifyAt, version)
                .from(o2UserPassword)
                .where(userId, isEqualTo(userId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2UserPassword record) {
        return UpdateDSL.updateWithMapper(this::update, o2UserPassword)
                .set(userId).equalTo(record::getUserId)
                .set(password).equalTo(record::getPassword)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2UserPassword record) {
        return UpdateDSL.updateWithMapper(this::update, o2UserPassword)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    default int updateByPrimaryKey(O2UserPassword record) {
        return UpdateDSL.updateWithMapper(this::update, o2UserPassword)
                .set(password).equalTo(record::getPassword)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .where(userId, isEqualTo(record::getUserId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_password")
    default int updateByPrimaryKeySelective(O2UserPassword record) {
        return UpdateDSL.updateWithMapper(this::update, o2UserPassword)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .where(userId, isEqualTo(record::getUserId))
                .build()
                .execute();
    }
}