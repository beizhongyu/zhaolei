package com.zl.first.test.mapper.master;

import static com.zl.first.test.mapper.master.AmsAssetCheckDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.master.AmsAssetCheck;
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
public interface AmsAssetCheckMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AmsAssetCheck> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsAssetCheckResult")
    AmsAssetCheck selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsAssetCheckResult")
    List<AmsAssetCheck> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    default Function<SelectStatementProvider, List<AmsAssetCheck>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AmsAssetCheckResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.VARCHAR),
        @Result(column="dept", property="dept", jdbcType=JdbcType.VARCHAR),
        @Result(column="startTime", property="starttime", jdbcType=JdbcType.BIGINT),
        @Result(column="endTime", property="endtime", jdbcType=JdbcType.BIGINT),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="product", property="product", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_valite", property="isValite", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER)
    })
    List<AmsAssetCheck> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(amsAssetCheck);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsAssetCheck);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsAssetCheck)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    default int insert(AmsAssetCheck record) {
        return insert(SqlBuilder.insert(record)
                .into(amsAssetCheck)
                .map(id).toProperty("id")
                .map(name).toProperty("name")
                .map(companyId).toProperty("companyId")
                .map(dept).toProperty("dept")
                .map(starttime).toProperty("starttime")
                .map(endtime).toProperty("endtime")
                .map(category).toProperty("category")
                .map(product).toProperty("product")
                .map(userId).toProperty("userId")
                .map(note).toProperty("note")
                .map(isValite).toProperty("isValite")
                .map(createTime).toProperty("createTime")
                .map(modifyTime).toProperty("modifyTime")
                .map(version).toProperty("version")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    default int insertSelective(AmsAssetCheck record) {
        return insert(SqlBuilder.insert(record)
                .into(amsAssetCheck)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(companyId).toPropertyWhenPresent("companyId", record::getCompanyId)
                .map(dept).toPropertyWhenPresent("dept", record::getDept)
                .map(starttime).toPropertyWhenPresent("starttime", record::getStarttime)
                .map(endtime).toPropertyWhenPresent("endtime", record::getEndtime)
                .map(category).toPropertyWhenPresent("category", record::getCategory)
                .map(product).toPropertyWhenPresent("product", record::getProduct)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(note).toPropertyWhenPresent("note", record::getNote)
                .map(isValite).toPropertyWhenPresent("isValite", record::getIsValite)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(modifyTime).toPropertyWhenPresent("modifyTime", record::getModifyTime)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetCheck>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, name, companyId, dept, starttime, endtime, category, product, userId, note, isValite, createTime, modifyTime, version)
                .from(amsAssetCheck);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetCheck>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, companyId, dept, starttime, endtime, category, product, userId, note, isValite, createTime, modifyTime, version)
                .from(amsAssetCheck);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetCheck>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, name, companyId, dept, starttime, endtime, category, product, userId, note, isValite, createTime, modifyTime, version)
                .from(amsAssetCheck);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetCheck>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, companyId, dept, starttime, endtime, category, product, userId, note, isValite, createTime, modifyTime, version)
                .from(amsAssetCheck);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    default AmsAssetCheck selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, companyId, dept, starttime, endtime, category, product, userId, note, isValite, createTime, modifyTime, version)
                .from(amsAssetCheck)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(AmsAssetCheck record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetCheck)
                .set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(companyId).equalTo(record::getCompanyId)
                .set(dept).equalTo(record::getDept)
                .set(starttime).equalTo(record::getStarttime)
                .set(endtime).equalTo(record::getEndtime)
                .set(category).equalTo(record::getCategory)
                .set(product).equalTo(record::getProduct)
                .set(userId).equalTo(record::getUserId)
                .set(note).equalTo(record::getNote)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(AmsAssetCheck record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetCheck)
                .set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(companyId).equalToWhenPresent(record::getCompanyId)
                .set(dept).equalToWhenPresent(record::getDept)
                .set(starttime).equalToWhenPresent(record::getStarttime)
                .set(endtime).equalToWhenPresent(record::getEndtime)
                .set(category).equalToWhenPresent(record::getCategory)
                .set(product).equalToWhenPresent(record::getProduct)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(note).equalToWhenPresent(record::getNote)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    default int updateByPrimaryKey(AmsAssetCheck record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetCheck)
                .set(name).equalTo(record::getName)
                .set(companyId).equalTo(record::getCompanyId)
                .set(dept).equalTo(record::getDept)
                .set(starttime).equalTo(record::getStarttime)
                .set(endtime).equalTo(record::getEndtime)
                .set(category).equalTo(record::getCategory)
                .set(product).equalTo(record::getProduct)
                .set(userId).equalTo(record::getUserId)
                .set(note).equalTo(record::getNote)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_check")
    default int updateByPrimaryKeySelective(AmsAssetCheck record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetCheck)
                .set(name).equalToWhenPresent(record::getName)
                .set(companyId).equalToWhenPresent(record::getCompanyId)
                .set(dept).equalToWhenPresent(record::getDept)
                .set(starttime).equalToWhenPresent(record::getStarttime)
                .set(endtime).equalToWhenPresent(record::getEndtime)
                .set(category).equalToWhenPresent(record::getCategory)
                .set(product).equalToWhenPresent(record::getProduct)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(note).equalToWhenPresent(record::getNote)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}