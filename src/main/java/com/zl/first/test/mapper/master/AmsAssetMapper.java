package com.zl.first.test.mapper.master;

import static com.zl.first.test.mapper.master.AmsAssetDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.master.AmsAsset;
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
public interface AmsAssetMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AmsAsset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsAssetResult")
    AmsAsset selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsAssetResult")
    List<AmsAsset> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    default Function<SelectStatementProvider, List<AmsAsset>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AmsAssetResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="asset_code", property="assetCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="products_id", property="productsId", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand_id", property="brandId", jdbcType=JdbcType.VARCHAR),
        @Result(column="manufacture_id", property="manufactureId", jdbcType=JdbcType.VARCHAR),
        @Result(column="spec_id", property="specId", jdbcType=JdbcType.VARCHAR),
        @Result(column="buy_time", property="buyTime", jdbcType=JdbcType.BIGINT),
        @Result(column="use_time", property="useTime", jdbcType=JdbcType.BIGINT),
        @Result(column="return_time", property="returnTime", jdbcType=JdbcType.BIGINT),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="now_price", property="nowPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="use_long", property="useLong", jdbcType=JdbcType.VARCHAR),
        @Result(column="depre_rate", property="depreRate", jdbcType=JdbcType.VARCHAR),
        @Result(column="person", property="person", jdbcType=JdbcType.VARCHAR),
        @Result(column="warehouse_id", property="warehouseId", jdbcType=JdbcType.VARCHAR),
        @Result(column="person_position", property="personPosition", jdbcType=JdbcType.VARCHAR),
        @Result(column="asset_status", property="assetStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_valite", property="isValite", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="extra", property="extra", jdbcType=JdbcType.VARCHAR),
        @Result(column="company", property="company", jdbcType=JdbcType.VARCHAR),
        @Result(column="num", property="num", jdbcType=JdbcType.INTEGER),
        @Result(column="supplier", property="supplier", jdbcType=JdbcType.VARCHAR),
        @Result(column="belone", property="belone", jdbcType=JdbcType.VARCHAR)
    })
    List<AmsAsset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(amsAsset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsAsset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsAsset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    default int insert(AmsAsset record) {
        return insert(SqlBuilder.insert(record)
                .into(amsAsset)
                .map(id).toProperty("id")
                .map(assetCode).toProperty("assetCode")
                .map(productsId).toProperty("productsId")
                .map(brandId).toProperty("brandId")
                .map(manufactureId).toProperty("manufactureId")
                .map(specId).toProperty("specId")
                .map(buyTime).toProperty("buyTime")
                .map(useTime).toProperty("useTime")
                .map(returnTime).toProperty("returnTime")
                .map(price).toProperty("price")
                .map(nowPrice).toProperty("nowPrice")
                .map(useLong).toProperty("useLong")
                .map(depreRate).toProperty("depreRate")
                .map(person).toProperty("person")
                .map(warehouseId).toProperty("warehouseId")
                .map(personPosition).toProperty("personPosition")
                .map(assetStatus).toProperty("assetStatus")
                .map(note).toProperty("note")
                .map(isValite).toProperty("isValite")
                .map(createTime).toProperty("createTime")
                .map(modifyTime).toProperty("modifyTime")
                .map(version).toProperty("version")
                .map(extra).toProperty("extra")
                .map(company).toProperty("company")
                .map(num).toProperty("num")
                .map(supplier).toProperty("supplier")
                .map(belone).toProperty("belone")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    default int insertSelective(AmsAsset record) {
        return insert(SqlBuilder.insert(record)
                .into(amsAsset)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(assetCode).toPropertyWhenPresent("assetCode", record::getAssetCode)
                .map(productsId).toPropertyWhenPresent("productsId", record::getProductsId)
                .map(brandId).toPropertyWhenPresent("brandId", record::getBrandId)
                .map(manufactureId).toPropertyWhenPresent("manufactureId", record::getManufactureId)
                .map(specId).toPropertyWhenPresent("specId", record::getSpecId)
                .map(buyTime).toPropertyWhenPresent("buyTime", record::getBuyTime)
                .map(useTime).toPropertyWhenPresent("useTime", record::getUseTime)
                .map(returnTime).toPropertyWhenPresent("returnTime", record::getReturnTime)
                .map(price).toPropertyWhenPresent("price", record::getPrice)
                .map(nowPrice).toPropertyWhenPresent("nowPrice", record::getNowPrice)
                .map(useLong).toPropertyWhenPresent("useLong", record::getUseLong)
                .map(depreRate).toPropertyWhenPresent("depreRate", record::getDepreRate)
                .map(person).toPropertyWhenPresent("person", record::getPerson)
                .map(warehouseId).toPropertyWhenPresent("warehouseId", record::getWarehouseId)
                .map(personPosition).toPropertyWhenPresent("personPosition", record::getPersonPosition)
                .map(assetStatus).toPropertyWhenPresent("assetStatus", record::getAssetStatus)
                .map(note).toPropertyWhenPresent("note", record::getNote)
                .map(isValite).toPropertyWhenPresent("isValite", record::getIsValite)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(modifyTime).toPropertyWhenPresent("modifyTime", record::getModifyTime)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .map(extra).toPropertyWhenPresent("extra", record::getExtra)
                .map(company).toPropertyWhenPresent("company", record::getCompany)
                .map(num).toPropertyWhenPresent("num", record::getNum)
                .map(supplier).toPropertyWhenPresent("supplier", record::getSupplier)
                .map(belone).toPropertyWhenPresent("belone", record::getBelone)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAsset>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, assetCode, productsId, brandId, manufactureId, specId, buyTime, useTime, returnTime, price, nowPrice, useLong, depreRate, person, warehouseId, personPosition, assetStatus, note, isValite, createTime, modifyTime, version, extra, company, num, supplier, belone)
                .from(amsAsset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAsset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, assetCode, productsId, brandId, manufactureId, specId, buyTime, useTime, returnTime, price, nowPrice, useLong, depreRate, person, warehouseId, personPosition, assetStatus, note, isValite, createTime, modifyTime, version, extra, company, num, supplier, belone)
                .from(amsAsset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAsset>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, assetCode, productsId, brandId, manufactureId, specId, buyTime, useTime, returnTime, price, nowPrice, useLong, depreRate, person, warehouseId, personPosition, assetStatus, note, isValite, createTime, modifyTime, version, extra, company, num, supplier, belone)
                .from(amsAsset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAsset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, assetCode, productsId, brandId, manufactureId, specId, buyTime, useTime, returnTime, price, nowPrice, useLong, depreRate, person, warehouseId, personPosition, assetStatus, note, isValite, createTime, modifyTime, version, extra, company, num, supplier, belone)
                .from(amsAsset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    default AmsAsset selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, assetCode, productsId, brandId, manufactureId, specId, buyTime, useTime, returnTime, price, nowPrice, useLong, depreRate, person, warehouseId, personPosition, assetStatus, note, isValite, createTime, modifyTime, version, extra, company, num, supplier, belone)
                .from(amsAsset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(AmsAsset record) {
        return UpdateDSL.updateWithMapper(this::update, amsAsset)
                .set(id).equalTo(record::getId)
                .set(assetCode).equalTo(record::getAssetCode)
                .set(productsId).equalTo(record::getProductsId)
                .set(brandId).equalTo(record::getBrandId)
                .set(manufactureId).equalTo(record::getManufactureId)
                .set(specId).equalTo(record::getSpecId)
                .set(buyTime).equalTo(record::getBuyTime)
                .set(useTime).equalTo(record::getUseTime)
                .set(returnTime).equalTo(record::getReturnTime)
                .set(price).equalTo(record::getPrice)
                .set(nowPrice).equalTo(record::getNowPrice)
                .set(useLong).equalTo(record::getUseLong)
                .set(depreRate).equalTo(record::getDepreRate)
                .set(person).equalTo(record::getPerson)
                .set(warehouseId).equalTo(record::getWarehouseId)
                .set(personPosition).equalTo(record::getPersonPosition)
                .set(assetStatus).equalTo(record::getAssetStatus)
                .set(note).equalTo(record::getNote)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra)
                .set(company).equalTo(record::getCompany)
                .set(num).equalTo(record::getNum)
                .set(supplier).equalTo(record::getSupplier)
                .set(belone).equalTo(record::getBelone);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(AmsAsset record) {
        return UpdateDSL.updateWithMapper(this::update, amsAsset)
                .set(id).equalToWhenPresent(record::getId)
                .set(assetCode).equalToWhenPresent(record::getAssetCode)
                .set(productsId).equalToWhenPresent(record::getProductsId)
                .set(brandId).equalToWhenPresent(record::getBrandId)
                .set(manufactureId).equalToWhenPresent(record::getManufactureId)
                .set(specId).equalToWhenPresent(record::getSpecId)
                .set(buyTime).equalToWhenPresent(record::getBuyTime)
                .set(useTime).equalToWhenPresent(record::getUseTime)
                .set(returnTime).equalToWhenPresent(record::getReturnTime)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(nowPrice).equalToWhenPresent(record::getNowPrice)
                .set(useLong).equalToWhenPresent(record::getUseLong)
                .set(depreRate).equalToWhenPresent(record::getDepreRate)
                .set(person).equalToWhenPresent(record::getPerson)
                .set(warehouseId).equalToWhenPresent(record::getWarehouseId)
                .set(personPosition).equalToWhenPresent(record::getPersonPosition)
                .set(assetStatus).equalToWhenPresent(record::getAssetStatus)
                .set(note).equalToWhenPresent(record::getNote)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra)
                .set(company).equalToWhenPresent(record::getCompany)
                .set(num).equalToWhenPresent(record::getNum)
                .set(supplier).equalToWhenPresent(record::getSupplier)
                .set(belone).equalToWhenPresent(record::getBelone);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    default int updateByPrimaryKey(AmsAsset record) {
        return UpdateDSL.updateWithMapper(this::update, amsAsset)
                .set(assetCode).equalTo(record::getAssetCode)
                .set(productsId).equalTo(record::getProductsId)
                .set(brandId).equalTo(record::getBrandId)
                .set(manufactureId).equalTo(record::getManufactureId)
                .set(specId).equalTo(record::getSpecId)
                .set(buyTime).equalTo(record::getBuyTime)
                .set(useTime).equalTo(record::getUseTime)
                .set(returnTime).equalTo(record::getReturnTime)
                .set(price).equalTo(record::getPrice)
                .set(nowPrice).equalTo(record::getNowPrice)
                .set(useLong).equalTo(record::getUseLong)
                .set(depreRate).equalTo(record::getDepreRate)
                .set(person).equalTo(record::getPerson)
                .set(warehouseId).equalTo(record::getWarehouseId)
                .set(personPosition).equalTo(record::getPersonPosition)
                .set(assetStatus).equalTo(record::getAssetStatus)
                .set(note).equalTo(record::getNote)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra)
                .set(company).equalTo(record::getCompany)
                .set(num).equalTo(record::getNum)
                .set(supplier).equalTo(record::getSupplier)
                .set(belone).equalTo(record::getBelone)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    default int updateByPrimaryKeySelective(AmsAsset record) {
        return UpdateDSL.updateWithMapper(this::update, amsAsset)
                .set(assetCode).equalToWhenPresent(record::getAssetCode)
                .set(productsId).equalToWhenPresent(record::getProductsId)
                .set(brandId).equalToWhenPresent(record::getBrandId)
                .set(manufactureId).equalToWhenPresent(record::getManufactureId)
                .set(specId).equalToWhenPresent(record::getSpecId)
                .set(buyTime).equalToWhenPresent(record::getBuyTime)
                .set(useTime).equalToWhenPresent(record::getUseTime)
                .set(returnTime).equalToWhenPresent(record::getReturnTime)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(nowPrice).equalToWhenPresent(record::getNowPrice)
                .set(useLong).equalToWhenPresent(record::getUseLong)
                .set(depreRate).equalToWhenPresent(record::getDepreRate)
                .set(person).equalToWhenPresent(record::getPerson)
                .set(warehouseId).equalToWhenPresent(record::getWarehouseId)
                .set(personPosition).equalToWhenPresent(record::getPersonPosition)
                .set(assetStatus).equalToWhenPresent(record::getAssetStatus)
                .set(note).equalToWhenPresent(record::getNote)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra)
                .set(company).equalToWhenPresent(record::getCompany)
                .set(num).equalToWhenPresent(record::getNum)
                .set(supplier).equalToWhenPresent(record::getSupplier)
                .set(belone).equalToWhenPresent(record::getBelone)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}