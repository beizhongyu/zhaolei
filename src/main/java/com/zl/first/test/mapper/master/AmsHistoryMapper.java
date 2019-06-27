package com.zl.first.test.mapper.master;

import static com.zl.first.test.mapper.master.AmsHistoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.master.AmsHistory;
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
public interface AmsHistoryMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AmsHistory> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsHistoryResult")
    AmsHistory selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsHistoryResult")
    List<AmsHistory> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    default Function<SelectStatementProvider, List<AmsHistory>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AmsHistoryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="asset_code", property="assetCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="handler_time", property="handlerTime", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="is_valite", property="isValite", jdbcType=JdbcType.INTEGER),
        @Result(column="start_person", property="startPerson", jdbcType=JdbcType.VARCHAR),
        @Result(column="end_person", property="endPerson", jdbcType=JdbcType.VARCHAR),
        @Result(column="operate_type", property="operateType", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="extra", property="extra", jdbcType=JdbcType.VARCHAR)
    })
    List<AmsHistory> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(amsHistory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsHistory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsHistory)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    default int insert(AmsHistory record) {
        return insert(SqlBuilder.insert(record)
                .into(amsHistory)
                .map(id).toProperty("id")
                .map(assetCode).toProperty("assetCode")
                .map(handlerTime).toProperty("handlerTime")
                .map(createTime).toProperty("createTime")
                .map(modifyTime).toProperty("modifyTime")
                .map(version).toProperty("version")
                .map(isValite).toProperty("isValite")
                .map(startPerson).toProperty("startPerson")
                .map(endPerson).toProperty("endPerson")
                .map(operateType).toProperty("operateType")
                .map(note).toProperty("note")
                .map(extra).toProperty("extra")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    default int insertSelective(AmsHistory record) {
        return insert(SqlBuilder.insert(record)
                .into(amsHistory)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(assetCode).toPropertyWhenPresent("assetCode", record::getAssetCode)
                .map(handlerTime).toPropertyWhenPresent("handlerTime", record::getHandlerTime)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(modifyTime).toPropertyWhenPresent("modifyTime", record::getModifyTime)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .map(isValite).toPropertyWhenPresent("isValite", record::getIsValite)
                .map(startPerson).toPropertyWhenPresent("startPerson", record::getStartPerson)
                .map(endPerson).toPropertyWhenPresent("endPerson", record::getEndPerson)
                .map(operateType).toPropertyWhenPresent("operateType", record::getOperateType)
                .map(note).toPropertyWhenPresent("note", record::getNote)
                .map(extra).toPropertyWhenPresent("extra", record::getExtra)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsHistory>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, assetCode, handlerTime, createTime, modifyTime, version, isValite, startPerson, endPerson, operateType, note, extra)
                .from(amsHistory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsHistory>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, assetCode, handlerTime, createTime, modifyTime, version, isValite, startPerson, endPerson, operateType, note, extra)
                .from(amsHistory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsHistory>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, assetCode, handlerTime, createTime, modifyTime, version, isValite, startPerson, endPerson, operateType, note, extra)
                .from(amsHistory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsHistory>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, assetCode, handlerTime, createTime, modifyTime, version, isValite, startPerson, endPerson, operateType, note, extra)
                .from(amsHistory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    default AmsHistory selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, assetCode, handlerTime, createTime, modifyTime, version, isValite, startPerson, endPerson, operateType, note, extra)
                .from(amsHistory)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(AmsHistory record) {
        return UpdateDSL.updateWithMapper(this::update, amsHistory)
                .set(id).equalTo(record::getId)
                .set(assetCode).equalTo(record::getAssetCode)
                .set(handlerTime).equalTo(record::getHandlerTime)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .set(isValite).equalTo(record::getIsValite)
                .set(startPerson).equalTo(record::getStartPerson)
                .set(endPerson).equalTo(record::getEndPerson)
                .set(operateType).equalTo(record::getOperateType)
                .set(note).equalTo(record::getNote)
                .set(extra).equalTo(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(AmsHistory record) {
        return UpdateDSL.updateWithMapper(this::update, amsHistory)
                .set(id).equalToWhenPresent(record::getId)
                .set(assetCode).equalToWhenPresent(record::getAssetCode)
                .set(handlerTime).equalToWhenPresent(record::getHandlerTime)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(startPerson).equalToWhenPresent(record::getStartPerson)
                .set(endPerson).equalToWhenPresent(record::getEndPerson)
                .set(operateType).equalToWhenPresent(record::getOperateType)
                .set(note).equalToWhenPresent(record::getNote)
                .set(extra).equalToWhenPresent(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    default int updateByPrimaryKey(AmsHistory record) {
        return UpdateDSL.updateWithMapper(this::update, amsHistory)
                .set(assetCode).equalTo(record::getAssetCode)
                .set(handlerTime).equalTo(record::getHandlerTime)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .set(isValite).equalTo(record::getIsValite)
                .set(startPerson).equalTo(record::getStartPerson)
                .set(endPerson).equalTo(record::getEndPerson)
                .set(operateType).equalTo(record::getOperateType)
                .set(note).equalTo(record::getNote)
                .set(extra).equalTo(record::getExtra)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_history")
    default int updateByPrimaryKeySelective(AmsHistory record) {
        return UpdateDSL.updateWithMapper(this::update, amsHistory)
                .set(assetCode).equalToWhenPresent(record::getAssetCode)
                .set(handlerTime).equalToWhenPresent(record::getHandlerTime)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(startPerson).equalToWhenPresent(record::getStartPerson)
                .set(endPerson).equalToWhenPresent(record::getEndPerson)
                .set(operateType).equalToWhenPresent(record::getOperateType)
                .set(note).equalToWhenPresent(record::getNote)
                .set(extra).equalToWhenPresent(record::getExtra)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}