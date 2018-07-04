package com.zl.first.test.mapper;

import static com.zl.first.test.mapper.ZlStudentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.ZlStudent;
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
public interface ZlStudentMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ZlStudent> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ZlStudentResult")
    ZlStudent selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ZlStudentResult")
    List<ZlStudent> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    default Function<SelectStatementProvider, List<ZlStudent>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZlStudentResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="display_name", property="displayName", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="class_id", property="classId", jdbcType=JdbcType.BIGINT),
        @Result(column="position", property="position", jdbcType=JdbcType.VARCHAR),
        @Result(column="tel_phone", property="telPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="log", property="log", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER)
    })
    List<ZlStudent> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(zlStudent);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, zlStudent);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, zlStudent)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    default int insert(ZlStudent record) {
        return insert(SqlBuilder.insert(record)
                .into(zlStudent)
                .map(id).toProperty("id")
                .map(name).toProperty("name")
                .map(displayName).toProperty("displayName")
                .map(password).toProperty("password")
                .map(classId).toProperty("classId")
                .map(position).toProperty("position")
                .map(telPhone).toProperty("telPhone")
                .map(age).toProperty("age")
                .map(log).toProperty("log")
                .map(status).toProperty("status")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    default int insertSelective(ZlStudent record) {
        return insert(SqlBuilder.insert(record)
                .into(zlStudent)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(displayName).toPropertyWhenPresent("displayName", record::getDisplayName)
                .map(password).toPropertyWhenPresent("password", record::getPassword)
                .map(classId).toPropertyWhenPresent("classId", record::getClassId)
                .map(position).toPropertyWhenPresent("position", record::getPosition)
                .map(telPhone).toPropertyWhenPresent("telPhone", record::getTelPhone)
                .map(age).toPropertyWhenPresent("age", record::getAge)
                .map(log).toPropertyWhenPresent("log", record::getLog)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlStudent>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, name, displayName, password, classId, position, telPhone, age, log, status, createAt, modifyAt, version)
                .from(zlStudent);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlStudent>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, displayName, password, classId, position, telPhone, age, log, status, createAt, modifyAt, version)
                .from(zlStudent);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlStudent>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, name, displayName, password, classId, position, telPhone, age, log, status, createAt, modifyAt, version)
                .from(zlStudent);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlStudent>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, displayName, password, classId, position, telPhone, age, log, status, createAt, modifyAt, version)
                .from(zlStudent);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    default ZlStudent selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, displayName, password, classId, position, telPhone, age, log, status, createAt, modifyAt, version)
                .from(zlStudent)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ZlStudent record) {
        return UpdateDSL.updateWithMapper(this::update, zlStudent)
                .set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(displayName).equalTo(record::getDisplayName)
                .set(password).equalTo(record::getPassword)
                .set(classId).equalTo(record::getClassId)
                .set(position).equalTo(record::getPosition)
                .set(telPhone).equalTo(record::getTelPhone)
                .set(age).equalTo(record::getAge)
                .set(log).equalTo(record::getLog)
                .set(status).equalTo(record::getStatus)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ZlStudent record) {
        return UpdateDSL.updateWithMapper(this::update, zlStudent)
                .set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(classId).equalToWhenPresent(record::getClassId)
                .set(position).equalToWhenPresent(record::getPosition)
                .set(telPhone).equalToWhenPresent(record::getTelPhone)
                .set(age).equalToWhenPresent(record::getAge)
                .set(log).equalToWhenPresent(record::getLog)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    default int updateByPrimaryKey(ZlStudent record) {
        return UpdateDSL.updateWithMapper(this::update, zlStudent)
                .set(name).equalTo(record::getName)
                .set(displayName).equalTo(record::getDisplayName)
                .set(password).equalTo(record::getPassword)
                .set(classId).equalTo(record::getClassId)
                .set(position).equalTo(record::getPosition)
                .set(telPhone).equalTo(record::getTelPhone)
                .set(age).equalTo(record::getAge)
                .set(log).equalTo(record::getLog)
                .set(status).equalTo(record::getStatus)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_student")
    default int updateByPrimaryKeySelective(ZlStudent record) {
        return UpdateDSL.updateWithMapper(this::update, zlStudent)
                .set(name).equalToWhenPresent(record::getName)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(classId).equalToWhenPresent(record::getClassId)
                .set(position).equalToWhenPresent(record::getPosition)
                .set(telPhone).equalToWhenPresent(record::getTelPhone)
                .set(age).equalToWhenPresent(record::getAge)
                .set(log).equalToWhenPresent(record::getLog)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}