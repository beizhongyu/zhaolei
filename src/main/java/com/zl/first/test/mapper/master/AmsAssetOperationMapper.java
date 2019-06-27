package com.zl.first.test.mapper.master;

import static com.zl.first.test.mapper.master.AmsAssetOperationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.master.AmsAssetOperation;
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
public interface AmsAssetOperationMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AmsAssetOperation> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsAssetOperationResult")
    AmsAssetOperation selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsAssetOperationResult")
    List<AmsAssetOperation> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    default Function<SelectStatementProvider, List<AmsAssetOperation>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AmsAssetOperationResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="asset_id", property="assetId", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.INTEGER),
        @Result(column="reason", property="reason", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.BIGINT),
        @Result(column="start_person", property="startPerson", jdbcType=JdbcType.VARCHAR),
        @Result(column="handle_person", property="handlePerson", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_valite", property="isValite", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="extra", property="extra", jdbcType=JdbcType.VARCHAR)
    })
    List<AmsAssetOperation> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(amsAssetOperation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsAssetOperation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsAssetOperation)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    default int insert(AmsAssetOperation record) {
        return insert(SqlBuilder.insert(record)
                .into(amsAssetOperation)
                .map(id).toProperty("id")
                .map(assetId).toProperty("assetId")
                .map(category).toProperty("category")
                .map(reason).toProperty("reason")
                .map(time).toProperty("time")
                .map(startPerson).toProperty("startPerson")
                .map(handlePerson).toProperty("handlePerson")
                .map(note).toProperty("note")
                .map(isValite).toProperty("isValite")
                .map(createTime).toProperty("createTime")
                .map(modifyTime).toProperty("modifyTime")
                .map(version).toProperty("version")
                .map(extra).toProperty("extra")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    default int insertSelective(AmsAssetOperation record) {
        return insert(SqlBuilder.insert(record)
                .into(amsAssetOperation)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(assetId).toPropertyWhenPresent("assetId", record::getAssetId)
                .map(category).toPropertyWhenPresent("category", record::getCategory)
                .map(reason).toPropertyWhenPresent("reason", record::getReason)
                .map(time).toPropertyWhenPresent("time", record::getTime)
                .map(startPerson).toPropertyWhenPresent("startPerson", record::getStartPerson)
                .map(handlePerson).toPropertyWhenPresent("handlePerson", record::getHandlePerson)
                .map(note).toPropertyWhenPresent("note", record::getNote)
                .map(isValite).toPropertyWhenPresent("isValite", record::getIsValite)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(modifyTime).toPropertyWhenPresent("modifyTime", record::getModifyTime)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .map(extra).toPropertyWhenPresent("extra", record::getExtra)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetOperation>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, assetId, category, reason, time, startPerson, handlePerson, note, isValite, createTime, modifyTime, version, extra)
                .from(amsAssetOperation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetOperation>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, assetId, category, reason, time, startPerson, handlePerson, note, isValite, createTime, modifyTime, version, extra)
                .from(amsAssetOperation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetOperation>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, assetId, category, reason, time, startPerson, handlePerson, note, isValite, createTime, modifyTime, version, extra)
                .from(amsAssetOperation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetOperation>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, assetId, category, reason, time, startPerson, handlePerson, note, isValite, createTime, modifyTime, version, extra)
                .from(amsAssetOperation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    default AmsAssetOperation selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, assetId, category, reason, time, startPerson, handlePerson, note, isValite, createTime, modifyTime, version, extra)
                .from(amsAssetOperation)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(AmsAssetOperation record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetOperation)
                .set(id).equalTo(record::getId)
                .set(assetId).equalTo(record::getAssetId)
                .set(category).equalTo(record::getCategory)
                .set(reason).equalTo(record::getReason)
                .set(time).equalTo(record::getTime)
                .set(startPerson).equalTo(record::getStartPerson)
                .set(handlePerson).equalTo(record::getHandlePerson)
                .set(note).equalTo(record::getNote)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(AmsAssetOperation record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetOperation)
                .set(id).equalToWhenPresent(record::getId)
                .set(assetId).equalToWhenPresent(record::getAssetId)
                .set(category).equalToWhenPresent(record::getCategory)
                .set(reason).equalToWhenPresent(record::getReason)
                .set(time).equalToWhenPresent(record::getTime)
                .set(startPerson).equalToWhenPresent(record::getStartPerson)
                .set(handlePerson).equalToWhenPresent(record::getHandlePerson)
                .set(note).equalToWhenPresent(record::getNote)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    default int updateByPrimaryKey(AmsAssetOperation record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetOperation)
                .set(assetId).equalTo(record::getAssetId)
                .set(category).equalTo(record::getCategory)
                .set(reason).equalTo(record::getReason)
                .set(time).equalTo(record::getTime)
                .set(startPerson).equalTo(record::getStartPerson)
                .set(handlePerson).equalTo(record::getHandlePerson)
                .set(note).equalTo(record::getNote)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    default int updateByPrimaryKeySelective(AmsAssetOperation record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetOperation)
                .set(assetId).equalToWhenPresent(record::getAssetId)
                .set(category).equalToWhenPresent(record::getCategory)
                .set(reason).equalToWhenPresent(record::getReason)
                .set(time).equalToWhenPresent(record::getTime)
                .set(startPerson).equalToWhenPresent(record::getStartPerson)
                .set(handlePerson).equalToWhenPresent(record::getHandlePerson)
                .set(note).equalToWhenPresent(record::getNote)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}