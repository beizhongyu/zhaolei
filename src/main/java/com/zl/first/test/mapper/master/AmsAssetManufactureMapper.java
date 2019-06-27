package com.zl.first.test.mapper.master;

import static com.zl.first.test.mapper.master.AmsAssetManufactureDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.master.AmsAssetManufacture;
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
public interface AmsAssetManufactureMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AmsAssetManufacture> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsAssetManufactureResult")
    AmsAssetManufacture selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsAssetManufactureResult")
    List<AmsAssetManufacture> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    default Function<SelectStatementProvider, List<AmsAssetManufacture>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AmsAssetManufactureResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="brand_id", property="brandId", jdbcType=JdbcType.VARCHAR),
        @Result(column="manufacture", property="manufacture", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_valite", property="isValite", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER)
    })
    List<AmsAssetManufacture> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(amsAssetManufacture);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsAssetManufacture);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsAssetManufacture)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    default int insert(AmsAssetManufacture record) {
        return insert(SqlBuilder.insert(record)
                .into(amsAssetManufacture)
                .map(id).toProperty("id")
                .map(brandId).toProperty("brandId")
                .map(manufacture).toProperty("manufacture")
                .map(isValite).toProperty("isValite")
                .map(createTime).toProperty("createTime")
                .map(modifyTime).toProperty("modifyTime")
                .map(version).toProperty("version")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    default int insertSelective(AmsAssetManufacture record) {
        return insert(SqlBuilder.insert(record)
                .into(amsAssetManufacture)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(brandId).toPropertyWhenPresent("brandId", record::getBrandId)
                .map(manufacture).toPropertyWhenPresent("manufacture", record::getManufacture)
                .map(isValite).toPropertyWhenPresent("isValite", record::getIsValite)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(modifyTime).toPropertyWhenPresent("modifyTime", record::getModifyTime)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetManufacture>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, brandId, manufacture, isValite, createTime, modifyTime, version)
                .from(amsAssetManufacture);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetManufacture>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, brandId, manufacture, isValite, createTime, modifyTime, version)
                .from(amsAssetManufacture);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetManufacture>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, brandId, manufacture, isValite, createTime, modifyTime, version)
                .from(amsAssetManufacture);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetManufacture>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, brandId, manufacture, isValite, createTime, modifyTime, version)
                .from(amsAssetManufacture);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    default AmsAssetManufacture selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, brandId, manufacture, isValite, createTime, modifyTime, version)
                .from(amsAssetManufacture)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(AmsAssetManufacture record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetManufacture)
                .set(id).equalTo(record::getId)
                .set(brandId).equalTo(record::getBrandId)
                .set(manufacture).equalTo(record::getManufacture)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(AmsAssetManufacture record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetManufacture)
                .set(id).equalToWhenPresent(record::getId)
                .set(brandId).equalToWhenPresent(record::getBrandId)
                .set(manufacture).equalToWhenPresent(record::getManufacture)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    default int updateByPrimaryKey(AmsAssetManufacture record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetManufacture)
                .set(brandId).equalTo(record::getBrandId)
                .set(manufacture).equalTo(record::getManufacture)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_manufacture")
    default int updateByPrimaryKeySelective(AmsAssetManufacture record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetManufacture)
                .set(brandId).equalToWhenPresent(record::getBrandId)
                .set(manufacture).equalToWhenPresent(record::getManufacture)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}