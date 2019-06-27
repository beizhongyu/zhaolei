package com.zl.first.test.mapper.master;

import static com.zl.first.test.mapper.master.AmsCheckDetailDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.master.AmsCheckDetail;
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
public interface AmsCheckDetailMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AmsCheckDetail> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsCheckDetailResult")
    AmsCheckDetail selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsCheckDetailResult")
    List<AmsCheckDetail> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    default Function<SelectStatementProvider, List<AmsCheckDetail>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AmsCheckDetailResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="asset_id", property="assetId", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_valite", property="isValite", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER)
    })
    List<AmsCheckDetail> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(amsCheckDetail);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsCheckDetail);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsCheckDetail)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    default int insert(AmsCheckDetail record) {
        return insert(SqlBuilder.insert(record)
                .into(amsCheckDetail)
                .map(id).toProperty("id")
                .map(orderId).toProperty("orderId")
                .map(assetId).toProperty("assetId")
                .map(isValite).toProperty("isValite")
                .map(createTime).toProperty("createTime")
                .map(modifyTime).toProperty("modifyTime")
                .map(version).toProperty("version")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    default int insertSelective(AmsCheckDetail record) {
        return insert(SqlBuilder.insert(record)
                .into(amsCheckDetail)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(orderId).toPropertyWhenPresent("orderId", record::getOrderId)
                .map(assetId).toPropertyWhenPresent("assetId", record::getAssetId)
                .map(isValite).toPropertyWhenPresent("isValite", record::getIsValite)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(modifyTime).toPropertyWhenPresent("modifyTime", record::getModifyTime)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsCheckDetail>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, orderId, assetId, isValite, createTime, modifyTime, version)
                .from(amsCheckDetail);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsCheckDetail>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, orderId, assetId, isValite, createTime, modifyTime, version)
                .from(amsCheckDetail);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsCheckDetail>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, orderId, assetId, isValite, createTime, modifyTime, version)
                .from(amsCheckDetail);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsCheckDetail>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, orderId, assetId, isValite, createTime, modifyTime, version)
                .from(amsCheckDetail);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    default AmsCheckDetail selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, orderId, assetId, isValite, createTime, modifyTime, version)
                .from(amsCheckDetail)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(AmsCheckDetail record) {
        return UpdateDSL.updateWithMapper(this::update, amsCheckDetail)
                .set(id).equalTo(record::getId)
                .set(orderId).equalTo(record::getOrderId)
                .set(assetId).equalTo(record::getAssetId)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(AmsCheckDetail record) {
        return UpdateDSL.updateWithMapper(this::update, amsCheckDetail)
                .set(id).equalToWhenPresent(record::getId)
                .set(orderId).equalToWhenPresent(record::getOrderId)
                .set(assetId).equalToWhenPresent(record::getAssetId)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    default int updateByPrimaryKey(AmsCheckDetail record) {
        return UpdateDSL.updateWithMapper(this::update, amsCheckDetail)
                .set(orderId).equalTo(record::getOrderId)
                .set(assetId).equalTo(record::getAssetId)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_detail")
    default int updateByPrimaryKeySelective(AmsCheckDetail record) {
        return UpdateDSL.updateWithMapper(this::update, amsCheckDetail)
                .set(orderId).equalToWhenPresent(record::getOrderId)
                .set(assetId).equalToWhenPresent(record::getAssetId)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}