package com.zl.first.test.mapper.master;

import static com.zl.first.test.mapper.master.AmsCheckOrderDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.master.AmsCheckOrder;
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
public interface AmsCheckOrderMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AmsCheckOrder> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsCheckOrderResult")
    AmsCheckOrder selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsCheckOrderResult")
    List<AmsCheckOrder> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    default Function<SelectStatementProvider, List<AmsCheckOrder>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AmsCheckOrderResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="check_id", property="checkId", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="dept_id", property="deptId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="startTime", property="starttime", jdbcType=JdbcType.BIGINT),
        @Result(column="finishTime", property="finishtime", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="reason", property="reason", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_valite", property="isValite", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER)
    })
    List<AmsCheckOrder> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(amsCheckOrder);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsCheckOrder);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsCheckOrder)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    default int insert(AmsCheckOrder record) {
        return insert(SqlBuilder.insert(record)
                .into(amsCheckOrder)
                .map(id).toProperty("id")
                .map(checkId).toProperty("checkId")
                .map(category).toProperty("category")
                .map(deptId).toProperty("deptId")
                .map(userId).toProperty("userId")
                .map(starttime).toProperty("starttime")
                .map(finishtime).toProperty("finishtime")
                .map(status).toProperty("status")
                .map(reason).toProperty("reason")
                .map(isValite).toProperty("isValite")
                .map(createTime).toProperty("createTime")
                .map(modifyTime).toProperty("modifyTime")
                .map(version).toProperty("version")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    default int insertSelective(AmsCheckOrder record) {
        return insert(SqlBuilder.insert(record)
                .into(amsCheckOrder)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(checkId).toPropertyWhenPresent("checkId", record::getCheckId)
                .map(category).toPropertyWhenPresent("category", record::getCategory)
                .map(deptId).toPropertyWhenPresent("deptId", record::getDeptId)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(starttime).toPropertyWhenPresent("starttime", record::getStarttime)
                .map(finishtime).toPropertyWhenPresent("finishtime", record::getFinishtime)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(reason).toPropertyWhenPresent("reason", record::getReason)
                .map(isValite).toPropertyWhenPresent("isValite", record::getIsValite)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(modifyTime).toPropertyWhenPresent("modifyTime", record::getModifyTime)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsCheckOrder>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, checkId, category, deptId, userId, starttime, finishtime, status, reason, isValite, createTime, modifyTime, version)
                .from(amsCheckOrder);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsCheckOrder>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, checkId, category, deptId, userId, starttime, finishtime, status, reason, isValite, createTime, modifyTime, version)
                .from(amsCheckOrder);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsCheckOrder>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, checkId, category, deptId, userId, starttime, finishtime, status, reason, isValite, createTime, modifyTime, version)
                .from(amsCheckOrder);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsCheckOrder>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, checkId, category, deptId, userId, starttime, finishtime, status, reason, isValite, createTime, modifyTime, version)
                .from(amsCheckOrder);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    default AmsCheckOrder selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, checkId, category, deptId, userId, starttime, finishtime, status, reason, isValite, createTime, modifyTime, version)
                .from(amsCheckOrder)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(AmsCheckOrder record) {
        return UpdateDSL.updateWithMapper(this::update, amsCheckOrder)
                .set(id).equalTo(record::getId)
                .set(checkId).equalTo(record::getCheckId)
                .set(category).equalTo(record::getCategory)
                .set(deptId).equalTo(record::getDeptId)
                .set(userId).equalTo(record::getUserId)
                .set(starttime).equalTo(record::getStarttime)
                .set(finishtime).equalTo(record::getFinishtime)
                .set(status).equalTo(record::getStatus)
                .set(reason).equalTo(record::getReason)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(AmsCheckOrder record) {
        return UpdateDSL.updateWithMapper(this::update, amsCheckOrder)
                .set(id).equalToWhenPresent(record::getId)
                .set(checkId).equalToWhenPresent(record::getCheckId)
                .set(category).equalToWhenPresent(record::getCategory)
                .set(deptId).equalToWhenPresent(record::getDeptId)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(starttime).equalToWhenPresent(record::getStarttime)
                .set(finishtime).equalToWhenPresent(record::getFinishtime)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(reason).equalToWhenPresent(record::getReason)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    default int updateByPrimaryKey(AmsCheckOrder record) {
        return UpdateDSL.updateWithMapper(this::update, amsCheckOrder)
                .set(checkId).equalTo(record::getCheckId)
                .set(category).equalTo(record::getCategory)
                .set(deptId).equalTo(record::getDeptId)
                .set(userId).equalTo(record::getUserId)
                .set(starttime).equalTo(record::getStarttime)
                .set(finishtime).equalTo(record::getFinishtime)
                .set(status).equalTo(record::getStatus)
                .set(reason).equalTo(record::getReason)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    default int updateByPrimaryKeySelective(AmsCheckOrder record) {
        return UpdateDSL.updateWithMapper(this::update, amsCheckOrder)
                .set(checkId).equalToWhenPresent(record::getCheckId)
                .set(category).equalToWhenPresent(record::getCategory)
                .set(deptId).equalToWhenPresent(record::getDeptId)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(starttime).equalToWhenPresent(record::getStarttime)
                .set(finishtime).equalToWhenPresent(record::getFinishtime)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(reason).equalToWhenPresent(record::getReason)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}