package com.zl.first.test.mapper;

import static com.zl.first.test.mapper.ZlAcademicDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.ZlAcademic;
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
public interface ZlAcademicMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ZlAcademic> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ZlAcademicResult")
    ZlAcademic selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ZlAcademicResult")
    List<ZlAcademic> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    default Function<SelectStatementProvider, List<ZlAcademic>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZlAcademicResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="descript", property="descript", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER)
    })
    List<ZlAcademic> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(zlAcademic);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, zlAcademic);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, zlAcademic)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    default int insert(ZlAcademic record) {
        return insert(SqlBuilder.insert(record)
                .into(zlAcademic)
                .map(id).toProperty("id")
                .map(name).toProperty("name")
                .map(descript).toProperty("descript")
                .map(status).toProperty("status")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    default int insertSelective(ZlAcademic record) {
        return insert(SqlBuilder.insert(record)
                .into(zlAcademic)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(descript).toPropertyWhenPresent("descript", record::getDescript)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlAcademic>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, name, descript, status, createAt, modifyAt, version)
                .from(zlAcademic);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlAcademic>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, descript, status, createAt, modifyAt, version)
                .from(zlAcademic);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlAcademic>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, name, descript, status, createAt, modifyAt, version)
                .from(zlAcademic);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlAcademic>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, descript, status, createAt, modifyAt, version)
                .from(zlAcademic);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    default ZlAcademic selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, descript, status, createAt, modifyAt, version)
                .from(zlAcademic)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ZlAcademic record) {
        return UpdateDSL.updateWithMapper(this::update, zlAcademic)
                .set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(descript).equalTo(record::getDescript)
                .set(status).equalTo(record::getStatus)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ZlAcademic record) {
        return UpdateDSL.updateWithMapper(this::update, zlAcademic)
                .set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(descript).equalToWhenPresent(record::getDescript)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    default int updateByPrimaryKey(ZlAcademic record) {
        return UpdateDSL.updateWithMapper(this::update, zlAcademic)
                .set(name).equalTo(record::getName)
                .set(descript).equalTo(record::getDescript)
                .set(status).equalTo(record::getStatus)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_academic")
    default int updateByPrimaryKeySelective(ZlAcademic record) {
        return UpdateDSL.updateWithMapper(this::update, zlAcademic)
                .set(name).equalToWhenPresent(record::getName)
                .set(descript).equalToWhenPresent(record::getDescript)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}