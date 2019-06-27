package com.zl.first.test.mapper.master;

import static com.zl.first.test.mapper.master.AmsAssetWarehouseDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.master.AmsAssetWarehouse;
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
public interface AmsAssetWarehouseMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AmsAssetWarehouse> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsAssetWarehouseResult")
    AmsAssetWarehouse selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsAssetWarehouseResult")
    List<AmsAssetWarehouse> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    default Function<SelectStatementProvider, List<AmsAssetWarehouse>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AmsAssetWarehouseResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="warehouse", property="warehouse", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.VARCHAR),
        @Result(column="admin", property="admin", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_valite", property="isValite", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="extra", property="extra", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR)
    })
    List<AmsAssetWarehouse> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(amsAssetWarehouse);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsAssetWarehouse);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsAssetWarehouse)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    default int insert(AmsAssetWarehouse record) {
        return insert(SqlBuilder.insert(record)
                .into(amsAssetWarehouse)
                .map(id).toProperty("id")
                .map(warehouse).toProperty("warehouse")
                .map(companyId).toProperty("companyId")
                .map(admin).toProperty("admin")
                .map(note).toProperty("note")
                .map(isValite).toProperty("isValite")
                .map(createTime).toProperty("createTime")
                .map(modifyTime).toProperty("modifyTime")
                .map(version).toProperty("version")
                .map(extra).toProperty("extra")
                .map(address).toProperty("address")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    default int insertSelective(AmsAssetWarehouse record) {
        return insert(SqlBuilder.insert(record)
                .into(amsAssetWarehouse)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(warehouse).toPropertyWhenPresent("warehouse", record::getWarehouse)
                .map(companyId).toPropertyWhenPresent("companyId", record::getCompanyId)
                .map(admin).toPropertyWhenPresent("admin", record::getAdmin)
                .map(note).toPropertyWhenPresent("note", record::getNote)
                .map(isValite).toPropertyWhenPresent("isValite", record::getIsValite)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(modifyTime).toPropertyWhenPresent("modifyTime", record::getModifyTime)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .map(extra).toPropertyWhenPresent("extra", record::getExtra)
                .map(address).toPropertyWhenPresent("address", record::getAddress)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetWarehouse>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, warehouse, companyId, admin, note, isValite, createTime, modifyTime, version, extra, address)
                .from(amsAssetWarehouse);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetWarehouse>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, warehouse, companyId, admin, note, isValite, createTime, modifyTime, version, extra, address)
                .from(amsAssetWarehouse);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetWarehouse>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, warehouse, companyId, admin, note, isValite, createTime, modifyTime, version, extra, address)
                .from(amsAssetWarehouse);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetWarehouse>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, warehouse, companyId, admin, note, isValite, createTime, modifyTime, version, extra, address)
                .from(amsAssetWarehouse);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    default AmsAssetWarehouse selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, warehouse, companyId, admin, note, isValite, createTime, modifyTime, version, extra, address)
                .from(amsAssetWarehouse)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(AmsAssetWarehouse record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetWarehouse)
                .set(id).equalTo(record::getId)
                .set(warehouse).equalTo(record::getWarehouse)
                .set(companyId).equalTo(record::getCompanyId)
                .set(admin).equalTo(record::getAdmin)
                .set(note).equalTo(record::getNote)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra)
                .set(address).equalTo(record::getAddress);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(AmsAssetWarehouse record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetWarehouse)
                .set(id).equalToWhenPresent(record::getId)
                .set(warehouse).equalToWhenPresent(record::getWarehouse)
                .set(companyId).equalToWhenPresent(record::getCompanyId)
                .set(admin).equalToWhenPresent(record::getAdmin)
                .set(note).equalToWhenPresent(record::getNote)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra)
                .set(address).equalToWhenPresent(record::getAddress);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    default int updateByPrimaryKey(AmsAssetWarehouse record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetWarehouse)
                .set(warehouse).equalTo(record::getWarehouse)
                .set(companyId).equalTo(record::getCompanyId)
                .set(admin).equalTo(record::getAdmin)
                .set(note).equalTo(record::getNote)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra)
                .set(address).equalTo(record::getAddress)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_warehouse")
    default int updateByPrimaryKeySelective(AmsAssetWarehouse record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetWarehouse)
                .set(warehouse).equalToWhenPresent(record::getWarehouse)
                .set(companyId).equalToWhenPresent(record::getCompanyId)
                .set(admin).equalToWhenPresent(record::getAdmin)
                .set(note).equalToWhenPresent(record::getNote)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra)
                .set(address).equalToWhenPresent(record::getAddress)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}