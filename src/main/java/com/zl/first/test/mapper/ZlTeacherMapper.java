package com.zl.first.test.mapper;

import static com.zl.first.test.mapper.ZlTeacherDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.ZlTeacher;
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
public interface ZlTeacherMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ZlTeacher> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ZlTeacherResult")
    ZlTeacher selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ZlTeacherResult")
    List<ZlTeacher> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    default Function<SelectStatementProvider, List<ZlTeacher>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZlTeacherResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="academic_id", property="academicId", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    List<ZlTeacher> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(zlTeacher);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, zlTeacher);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, zlTeacher)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    default int insert(ZlTeacher record) {
        return insert(SqlBuilder.insert(record)
                .into(zlTeacher)
                .map(id).toProperty("id")
                .map(name).toProperty("name")
                .map(academicId).toProperty("academicId")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .map(status).toProperty("status")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    default int insertSelective(ZlTeacher record) {
        return insert(SqlBuilder.insert(record)
                .into(zlTeacher)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(academicId).toPropertyWhenPresent("academicId", record::getAcademicId)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlTeacher>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, name, academicId, createAt, modifyAt, version, status)
                .from(zlTeacher);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlTeacher>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, academicId, createAt, modifyAt, version, status)
                .from(zlTeacher);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlTeacher>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, name, academicId, createAt, modifyAt, version, status)
                .from(zlTeacher);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlTeacher>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, academicId, createAt, modifyAt, version, status)
                .from(zlTeacher);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    default ZlTeacher selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, academicId, createAt, modifyAt, version, status)
                .from(zlTeacher)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ZlTeacher record) {
        return UpdateDSL.updateWithMapper(this::update, zlTeacher)
                .set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(academicId).equalTo(record::getAcademicId)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .set(status).equalTo(record::getStatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ZlTeacher record) {
        return UpdateDSL.updateWithMapper(this::update, zlTeacher)
                .set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(academicId).equalToWhenPresent(record::getAcademicId)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(status).equalToWhenPresent(record::getStatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    default int updateByPrimaryKey(ZlTeacher record) {
        return UpdateDSL.updateWithMapper(this::update, zlTeacher)
                .set(name).equalTo(record::getName)
                .set(academicId).equalTo(record::getAcademicId)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .set(status).equalTo(record::getStatus)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_teacher")
    default int updateByPrimaryKeySelective(ZlTeacher record) {
        return UpdateDSL.updateWithMapper(this::update, zlTeacher)
                .set(name).equalToWhenPresent(record::getName)
                .set(academicId).equalToWhenPresent(record::getAcademicId)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(status).equalToWhenPresent(record::getStatus)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}