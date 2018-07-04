package com.zl.first.test.mapper;

import static com.zl.first.test.mapper.ZlCourseDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.ZlCourse;
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
public interface ZlCourseMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ZlCourse> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ZlCourseResult")
    ZlCourse selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ZlCourseResult")
    List<ZlCourse> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    default Function<SelectStatementProvider, List<ZlCourse>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZlCourseResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="descript", property="descript", jdbcType=JdbcType.VARCHAR),
        @Result(column="teacher_id", property="teacherId", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER)
    })
    List<ZlCourse> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(zlCourse);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, zlCourse);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, zlCourse)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    default int insert(ZlCourse record) {
        return insert(SqlBuilder.insert(record)
                .into(zlCourse)
                .map(id).toProperty("id")
                .map(name).toProperty("name")
                .map(descript).toProperty("descript")
                .map(teacherId).toProperty("teacherId")
                .map(status).toProperty("status")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    default int insertSelective(ZlCourse record) {
        return insert(SqlBuilder.insert(record)
                .into(zlCourse)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(descript).toPropertyWhenPresent("descript", record::getDescript)
                .map(teacherId).toPropertyWhenPresent("teacherId", record::getTeacherId)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlCourse>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, name, descript, teacherId, status, createAt, modifyAt, version)
                .from(zlCourse);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlCourse>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, descript, teacherId, status, createAt, modifyAt, version)
                .from(zlCourse);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlCourse>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, name, descript, teacherId, status, createAt, modifyAt, version)
                .from(zlCourse);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlCourse>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, descript, teacherId, status, createAt, modifyAt, version)
                .from(zlCourse);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    default ZlCourse selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, descript, teacherId, status, createAt, modifyAt, version)
                .from(zlCourse)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ZlCourse record) {
        return UpdateDSL.updateWithMapper(this::update, zlCourse)
                .set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(descript).equalTo(record::getDescript)
                .set(teacherId).equalTo(record::getTeacherId)
                .set(status).equalTo(record::getStatus)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ZlCourse record) {
        return UpdateDSL.updateWithMapper(this::update, zlCourse)
                .set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(descript).equalToWhenPresent(record::getDescript)
                .set(teacherId).equalToWhenPresent(record::getTeacherId)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    default int updateByPrimaryKey(ZlCourse record) {
        return UpdateDSL.updateWithMapper(this::update, zlCourse)
                .set(name).equalTo(record::getName)
                .set(descript).equalTo(record::getDescript)
                .set(teacherId).equalTo(record::getTeacherId)
                .set(status).equalTo(record::getStatus)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_course")
    default int updateByPrimaryKeySelective(ZlCourse record) {
        return UpdateDSL.updateWithMapper(this::update, zlCourse)
                .set(name).equalToWhenPresent(record::getName)
                .set(descript).equalToWhenPresent(record::getDescript)
                .set(teacherId).equalToWhenPresent(record::getTeacherId)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}