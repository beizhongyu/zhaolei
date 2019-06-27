package com.zl.first.test.mapper.master;

import static com.zl.first.test.mapper.master.AmsAssetProductsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.master.AmsAssetProducts;
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
public interface AmsAssetProductsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AmsAssetProducts> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsAssetProductsResult")
    AmsAssetProducts selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsAssetProductsResult")
    List<AmsAssetProducts> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    default Function<SelectStatementProvider, List<AmsAssetProducts>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AmsAssetProductsResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type_id", property="typeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="mark_id", property="markId", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_valite", property="isValite", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="extra", property="extra", jdbcType=JdbcType.VARCHAR)
    })
    List<AmsAssetProducts> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(amsAssetProducts);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsAssetProducts);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsAssetProducts)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    default int insert(AmsAssetProducts record) {
        return insert(SqlBuilder.insert(record)
                .into(amsAssetProducts)
                .map(id).toProperty("id")
                .map(name).toProperty("name")
                .map(typeId).toProperty("typeId")
                .map(markId).toProperty("markId")
                .map(note).toProperty("note")
                .map(isValite).toProperty("isValite")
                .map(createTime).toProperty("createTime")
                .map(modifyTime).toProperty("modifyTime")
                .map(version).toProperty("version")
                .map(extra).toProperty("extra")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    default int insertSelective(AmsAssetProducts record) {
        return insert(SqlBuilder.insert(record)
                .into(amsAssetProducts)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(typeId).toPropertyWhenPresent("typeId", record::getTypeId)
                .map(markId).toPropertyWhenPresent("markId", record::getMarkId)
                .map(note).toPropertyWhenPresent("note", record::getNote)
                .map(isValite).toPropertyWhenPresent("isValite", record::getIsValite)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(modifyTime).toPropertyWhenPresent("modifyTime", record::getModifyTime)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .map(extra).toPropertyWhenPresent("extra", record::getExtra)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetProducts>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, name, typeId, markId, note, isValite, createTime, modifyTime, version, extra)
                .from(amsAssetProducts);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetProducts>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, typeId, markId, note, isValite, createTime, modifyTime, version, extra)
                .from(amsAssetProducts);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetProducts>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, name, typeId, markId, note, isValite, createTime, modifyTime, version, extra)
                .from(amsAssetProducts);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetProducts>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, typeId, markId, note, isValite, createTime, modifyTime, version, extra)
                .from(amsAssetProducts);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    default AmsAssetProducts selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, typeId, markId, note, isValite, createTime, modifyTime, version, extra)
                .from(amsAssetProducts)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(AmsAssetProducts record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetProducts)
                .set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(typeId).equalTo(record::getTypeId)
                .set(markId).equalTo(record::getMarkId)
                .set(note).equalTo(record::getNote)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(AmsAssetProducts record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetProducts)
                .set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(typeId).equalToWhenPresent(record::getTypeId)
                .set(markId).equalToWhenPresent(record::getMarkId)
                .set(note).equalToWhenPresent(record::getNote)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    default int updateByPrimaryKey(AmsAssetProducts record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetProducts)
                .set(name).equalTo(record::getName)
                .set(typeId).equalTo(record::getTypeId)
                .set(markId).equalTo(record::getMarkId)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_products")
    default int updateByPrimaryKeySelective(AmsAssetProducts record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetProducts)
                .set(name).equalToWhenPresent(record::getName)
                .set(typeId).equalToWhenPresent(record::getTypeId)
                .set(markId).equalToWhenPresent(record::getMarkId)
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