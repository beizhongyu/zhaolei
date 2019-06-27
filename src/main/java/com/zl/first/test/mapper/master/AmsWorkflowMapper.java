package com.zl.first.test.mapper.master;

import static com.zl.first.test.mapper.master.AmsWorkflowDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.master.AmsWorkflow;
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
public interface AmsWorkflowMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AmsWorkflow> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsWorkflowResult")
    AmsWorkflow selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsWorkflowResult")
    List<AmsWorkflow> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    default Function<SelectStatementProvider, List<AmsWorkflow>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AmsWorkflowResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="data_info", property="dataInfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_person", property="startPerson", jdbcType=JdbcType.VARCHAR),
        @Result(column="end_person", property="endPerson", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="extra", property="extra", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_valite", property="isValite", jdbcType=JdbcType.INTEGER)
    })
    List<AmsWorkflow> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(amsWorkflow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsWorkflow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsWorkflow)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    default int insert(AmsWorkflow record) {
        return insert(SqlBuilder.insert(record)
                .into(amsWorkflow)
                .map(id).toProperty("id")
                .map(name).toProperty("name")
                .map(dataInfo).toProperty("dataInfo")
                .map(startPerson).toProperty("startPerson")
                .map(endPerson).toProperty("endPerson")
                .map(createTime).toProperty("createTime")
                .map(modifyTime).toProperty("modifyTime")
                .map(version).toProperty("version")
                .map(extra).toProperty("extra")
                .map(isValite).toProperty("isValite")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    default int insertSelective(AmsWorkflow record) {
        return insert(SqlBuilder.insert(record)
                .into(amsWorkflow)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(dataInfo).toPropertyWhenPresent("dataInfo", record::getDataInfo)
                .map(startPerson).toPropertyWhenPresent("startPerson", record::getStartPerson)
                .map(endPerson).toPropertyWhenPresent("endPerson", record::getEndPerson)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(modifyTime).toPropertyWhenPresent("modifyTime", record::getModifyTime)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .map(extra).toPropertyWhenPresent("extra", record::getExtra)
                .map(isValite).toPropertyWhenPresent("isValite", record::getIsValite)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsWorkflow>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, name, dataInfo, startPerson, endPerson, createTime, modifyTime, version, extra, isValite)
                .from(amsWorkflow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsWorkflow>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, dataInfo, startPerson, endPerson, createTime, modifyTime, version, extra, isValite)
                .from(amsWorkflow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsWorkflow>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, name, dataInfo, startPerson, endPerson, createTime, modifyTime, version, extra, isValite)
                .from(amsWorkflow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsWorkflow>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, dataInfo, startPerson, endPerson, createTime, modifyTime, version, extra, isValite)
                .from(amsWorkflow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    default AmsWorkflow selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, dataInfo, startPerson, endPerson, createTime, modifyTime, version, extra, isValite)
                .from(amsWorkflow)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(AmsWorkflow record) {
        return UpdateDSL.updateWithMapper(this::update, amsWorkflow)
                .set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(dataInfo).equalTo(record::getDataInfo)
                .set(startPerson).equalTo(record::getStartPerson)
                .set(endPerson).equalTo(record::getEndPerson)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra)
                .set(isValite).equalTo(record::getIsValite);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(AmsWorkflow record) {
        return UpdateDSL.updateWithMapper(this::update, amsWorkflow)
                .set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(dataInfo).equalToWhenPresent(record::getDataInfo)
                .set(startPerson).equalToWhenPresent(record::getStartPerson)
                .set(endPerson).equalToWhenPresent(record::getEndPerson)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra)
                .set(isValite).equalToWhenPresent(record::getIsValite);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    default int updateByPrimaryKey(AmsWorkflow record) {
        return UpdateDSL.updateWithMapper(this::update, amsWorkflow)
                .set(name).equalTo(record::getName)
                .set(dataInfo).equalTo(record::getDataInfo)
                .set(startPerson).equalTo(record::getStartPerson)
                .set(endPerson).equalTo(record::getEndPerson)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra)
                .set(isValite).equalTo(record::getIsValite)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    default int updateByPrimaryKeySelective(AmsWorkflow record) {
        return UpdateDSL.updateWithMapper(this::update, amsWorkflow)
                .set(name).equalToWhenPresent(record::getName)
                .set(dataInfo).equalToWhenPresent(record::getDataInfo)
                .set(startPerson).equalToWhenPresent(record::getStartPerson)
                .set(endPerson).equalToWhenPresent(record::getEndPerson)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}