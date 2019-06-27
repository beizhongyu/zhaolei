package com.zl.first.test.mapper.master;

import static com.zl.first.test.mapper.master.AmsAssetCategoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.master.AmsAssetCategory;
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
public interface AmsAssetCategoryMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AmsAssetCategory> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsAssetCategoryResult")
    AmsAssetCategory selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsAssetCategoryResult")
    List<AmsAssetCategory> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    default Function<SelectStatementProvider, List<AmsAssetCategory>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AmsAssetCategoryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="asset_admin", property="assetAdmin", jdbcType=JdbcType.VARCHAR),
        @Result(column="finance_admin", property="financeAdmin", jdbcType=JdbcType.VARCHAR),
        @Result(column="purchase_admin", property="purchaseAdmin", jdbcType=JdbcType.VARCHAR),
        @Result(column="check_admin", property="checkAdmin", jdbcType=JdbcType.VARCHAR),
        @Result(column="maintain_admin", property="maintainAdmin", jdbcType=JdbcType.VARCHAR),
        @Result(column="srap_admin", property="srapAdmin", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_admin", property="receiveAdmin", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_valite", property="isValite", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="extra", property="extra", jdbcType=JdbcType.VARCHAR)
    })
    List<AmsAssetCategory> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(amsAssetCategory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsAssetCategory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsAssetCategory)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    default int insert(AmsAssetCategory record) {
        return insert(SqlBuilder.insert(record)
                .into(amsAssetCategory)
                .map(id).toProperty("id")
                .map(companyId).toProperty("companyId")
                .map(name).toProperty("name")
                .map(assetAdmin).toProperty("assetAdmin")
                .map(financeAdmin).toProperty("financeAdmin")
                .map(purchaseAdmin).toProperty("purchaseAdmin")
                .map(checkAdmin).toProperty("checkAdmin")
                .map(maintainAdmin).toProperty("maintainAdmin")
                .map(srapAdmin).toProperty("srapAdmin")
                .map(receiveAdmin).toProperty("receiveAdmin")
                .map(note).toProperty("note")
                .map(isValite).toProperty("isValite")
                .map(createTime).toProperty("createTime")
                .map(modifyTime).toProperty("modifyTime")
                .map(version).toProperty("version")
                .map(extra).toProperty("extra")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    default int insertSelective(AmsAssetCategory record) {
        return insert(SqlBuilder.insert(record)
                .into(amsAssetCategory)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(companyId).toPropertyWhenPresent("companyId", record::getCompanyId)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(assetAdmin).toPropertyWhenPresent("assetAdmin", record::getAssetAdmin)
                .map(financeAdmin).toPropertyWhenPresent("financeAdmin", record::getFinanceAdmin)
                .map(purchaseAdmin).toPropertyWhenPresent("purchaseAdmin", record::getPurchaseAdmin)
                .map(checkAdmin).toPropertyWhenPresent("checkAdmin", record::getCheckAdmin)
                .map(maintainAdmin).toPropertyWhenPresent("maintainAdmin", record::getMaintainAdmin)
                .map(srapAdmin).toPropertyWhenPresent("srapAdmin", record::getSrapAdmin)
                .map(receiveAdmin).toPropertyWhenPresent("receiveAdmin", record::getReceiveAdmin)
                .map(note).toPropertyWhenPresent("note", record::getNote)
                .map(isValite).toPropertyWhenPresent("isValite", record::getIsValite)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(modifyTime).toPropertyWhenPresent("modifyTime", record::getModifyTime)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .map(extra).toPropertyWhenPresent("extra", record::getExtra)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetCategory>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, companyId, name, assetAdmin, financeAdmin, purchaseAdmin, checkAdmin, maintainAdmin, srapAdmin, receiveAdmin, note, isValite, createTime, modifyTime, version, extra)
                .from(amsAssetCategory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetCategory>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, companyId, name, assetAdmin, financeAdmin, purchaseAdmin, checkAdmin, maintainAdmin, srapAdmin, receiveAdmin, note, isValite, createTime, modifyTime, version, extra)
                .from(amsAssetCategory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetCategory>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, companyId, name, assetAdmin, financeAdmin, purchaseAdmin, checkAdmin, maintainAdmin, srapAdmin, receiveAdmin, note, isValite, createTime, modifyTime, version, extra)
                .from(amsAssetCategory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetCategory>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, companyId, name, assetAdmin, financeAdmin, purchaseAdmin, checkAdmin, maintainAdmin, srapAdmin, receiveAdmin, note, isValite, createTime, modifyTime, version, extra)
                .from(amsAssetCategory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    default AmsAssetCategory selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, companyId, name, assetAdmin, financeAdmin, purchaseAdmin, checkAdmin, maintainAdmin, srapAdmin, receiveAdmin, note, isValite, createTime, modifyTime, version, extra)
                .from(amsAssetCategory)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(AmsAssetCategory record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetCategory)
                .set(id).equalTo(record::getId)
                .set(companyId).equalTo(record::getCompanyId)
                .set(name).equalTo(record::getName)
                .set(assetAdmin).equalTo(record::getAssetAdmin)
                .set(financeAdmin).equalTo(record::getFinanceAdmin)
                .set(purchaseAdmin).equalTo(record::getPurchaseAdmin)
                .set(checkAdmin).equalTo(record::getCheckAdmin)
                .set(maintainAdmin).equalTo(record::getMaintainAdmin)
                .set(srapAdmin).equalTo(record::getSrapAdmin)
                .set(receiveAdmin).equalTo(record::getReceiveAdmin)
                .set(note).equalTo(record::getNote)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(AmsAssetCategory record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetCategory)
                .set(id).equalToWhenPresent(record::getId)
                .set(companyId).equalToWhenPresent(record::getCompanyId)
                .set(name).equalToWhenPresent(record::getName)
                .set(assetAdmin).equalToWhenPresent(record::getAssetAdmin)
                .set(financeAdmin).equalToWhenPresent(record::getFinanceAdmin)
                .set(purchaseAdmin).equalToWhenPresent(record::getPurchaseAdmin)
                .set(checkAdmin).equalToWhenPresent(record::getCheckAdmin)
                .set(maintainAdmin).equalToWhenPresent(record::getMaintainAdmin)
                .set(srapAdmin).equalToWhenPresent(record::getSrapAdmin)
                .set(receiveAdmin).equalToWhenPresent(record::getReceiveAdmin)
                .set(note).equalToWhenPresent(record::getNote)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    default int updateByPrimaryKey(AmsAssetCategory record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetCategory)
                .set(companyId).equalTo(record::getCompanyId)
                .set(name).equalTo(record::getName)
                .set(assetAdmin).equalTo(record::getAssetAdmin)
                .set(financeAdmin).equalTo(record::getFinanceAdmin)
                .set(purchaseAdmin).equalTo(record::getPurchaseAdmin)
                .set(checkAdmin).equalTo(record::getCheckAdmin)
                .set(maintainAdmin).equalTo(record::getMaintainAdmin)
                .set(srapAdmin).equalTo(record::getSrapAdmin)
                .set(receiveAdmin).equalTo(record::getReceiveAdmin)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_category")
    default int updateByPrimaryKeySelective(AmsAssetCategory record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetCategory)
                .set(companyId).equalToWhenPresent(record::getCompanyId)
                .set(name).equalToWhenPresent(record::getName)
                .set(assetAdmin).equalToWhenPresent(record::getAssetAdmin)
                .set(financeAdmin).equalToWhenPresent(record::getFinanceAdmin)
                .set(purchaseAdmin).equalToWhenPresent(record::getPurchaseAdmin)
                .set(checkAdmin).equalToWhenPresent(record::getCheckAdmin)
                .set(maintainAdmin).equalToWhenPresent(record::getMaintainAdmin)
                .set(srapAdmin).equalToWhenPresent(record::getSrapAdmin)
                .set(receiveAdmin).equalToWhenPresent(record::getReceiveAdmin)
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