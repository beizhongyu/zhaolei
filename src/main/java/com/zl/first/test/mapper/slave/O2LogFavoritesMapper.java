package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2LogFavoritesDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.slave.O2LogFavorites;
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
public interface O2LogFavoritesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2LogFavorites> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2LogFavoritesResult")
    O2LogFavorites selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2LogFavoritesResult")
    List<O2LogFavorites> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    default Function<SelectStatementProvider, List<O2LogFavorites>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2LogFavoritesResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_id", property="appId", jdbcType=JdbcType.VARCHAR),
        @Result(column="kind", property="kind", jdbcType=JdbcType.TINYINT),
        @Result(column="is_valid", property="isValid", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.BIGINT),
        @Result(column="op_time", property="opTime", jdbcType=JdbcType.BIGINT),
        @Result(column="last_ver", property="lastVer", jdbcType=JdbcType.INTEGER)
    })
    List<O2LogFavorites> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2LogFavorites);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2LogFavorites);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2LogFavorites)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    default int insert(O2LogFavorites record) {
        return insert(SqlBuilder.insert(record)
                .into(o2LogFavorites)
                .map(id).toProperty("id")
                .map(userId).toProperty("userId")
                .map(appId).toProperty("appId")
                .map(kind).toProperty("kind")
                .map(isValid).toProperty("isValid")
                .map(createTime).toProperty("createTime")
                .map(opTime).toProperty("opTime")
                .map(lastVer).toProperty("lastVer")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    default int insertSelective(O2LogFavorites record) {
        return insert(SqlBuilder.insert(record)
                .into(o2LogFavorites)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(appId).toPropertyWhenPresent("appId", record::getAppId)
                .map(kind).toPropertyWhenPresent("kind", record::getKind)
                .map(isValid).toPropertyWhenPresent("isValid", record::getIsValid)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(opTime).toPropertyWhenPresent("opTime", record::getOpTime)
                .map(lastVer).toPropertyWhenPresent("lastVer", record::getLastVer)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2LogFavorites>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, userId, appId, kind, isValid, createTime, opTime, lastVer)
                .from(o2LogFavorites);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2LogFavorites>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, userId, appId, kind, isValid, createTime, opTime, lastVer)
                .from(o2LogFavorites);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2LogFavorites>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, userId, appId, kind, isValid, createTime, opTime, lastVer)
                .from(o2LogFavorites);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2LogFavorites>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, userId, appId, kind, isValid, createTime, opTime, lastVer)
                .from(o2LogFavorites);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    default O2LogFavorites selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, userId, appId, kind, isValid, createTime, opTime, lastVer)
                .from(o2LogFavorites)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2LogFavorites record) {
        return UpdateDSL.updateWithMapper(this::update, o2LogFavorites)
                .set(id).equalTo(record::getId)
                .set(userId).equalTo(record::getUserId)
                .set(appId).equalTo(record::getAppId)
                .set(kind).equalTo(record::getKind)
                .set(isValid).equalTo(record::getIsValid)
                .set(createTime).equalTo(record::getCreateTime)
                .set(opTime).equalTo(record::getOpTime)
                .set(lastVer).equalTo(record::getLastVer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2LogFavorites record) {
        return UpdateDSL.updateWithMapper(this::update, o2LogFavorites)
                .set(id).equalToWhenPresent(record::getId)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(appId).equalToWhenPresent(record::getAppId)
                .set(kind).equalToWhenPresent(record::getKind)
                .set(isValid).equalToWhenPresent(record::getIsValid)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(opTime).equalToWhenPresent(record::getOpTime)
                .set(lastVer).equalToWhenPresent(record::getLastVer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    default int updateByPrimaryKey(O2LogFavorites record) {
        return UpdateDSL.updateWithMapper(this::update, o2LogFavorites)
                .set(userId).equalTo(record::getUserId)
                .set(appId).equalTo(record::getAppId)
                .set(kind).equalTo(record::getKind)
                .set(isValid).equalTo(record::getIsValid)
                .set(createTime).equalTo(record::getCreateTime)
                .set(opTime).equalTo(record::getOpTime)
                .set(lastVer).equalTo(record::getLastVer)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    default int updateByPrimaryKeySelective(O2LogFavorites record) {
        return UpdateDSL.updateWithMapper(this::update, o2LogFavorites)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(appId).equalToWhenPresent(record::getAppId)
                .set(kind).equalToWhenPresent(record::getKind)
                .set(isValid).equalToWhenPresent(record::getIsValid)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(opTime).equalToWhenPresent(record::getOpTime)
                .set(lastVer).equalToWhenPresent(record::getLastVer)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}