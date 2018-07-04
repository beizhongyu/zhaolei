package com.zl.first.test.mapper;

import static com.zl.first.test.mapper.ZlClassDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.ZlClass;
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
public interface ZlClassMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ZlClass> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ZlClassResult")
    ZlClass selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ZlClassResult")
    List<ZlClass> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    default Function<SelectStatementProvider, List<ZlClass>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZlClassResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="max_ount", property="maxOunt", jdbcType=JdbcType.INTEGER),
        @Result(column="teacher_id", property="teacherId", jdbcType=JdbcType.VARCHAR),
        @Result(column="academic_id", property="academicId", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER)
    })
    List<ZlClass> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(zlClass);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, zlClass);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, zlClass)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    default int insert(ZlClass record) {
        return insert(SqlBuilder.insert(record)
                .into(zlClass)
                .map(id).toProperty("id")
                .map(name).toProperty("name")
                .map(maxOunt).toProperty("maxOunt")
                .map(teacherId).toProperty("teacherId")
                .map(academicId).toProperty("academicId")
                .map(status).toProperty("status")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    default int insertSelective(ZlClass record) {
        return insert(SqlBuilder.insert(record)
                .into(zlClass)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(maxOunt).toPropertyWhenPresent("maxOunt", record::getMaxOunt)
                .map(teacherId).toPropertyWhenPresent("teacherId", record::getTeacherId)
                .map(academicId).toPropertyWhenPresent("academicId", record::getAcademicId)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlClass>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, name, maxOunt, teacherId, academicId, status, createAt, modifyAt, version)
                .from(zlClass);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlClass>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, maxOunt, teacherId, academicId, status, createAt, modifyAt, version)
                .from(zlClass);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlClass>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, name, maxOunt, teacherId, academicId, status, createAt, modifyAt, version)
                .from(zlClass);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZlClass>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, maxOunt, teacherId, academicId, status, createAt, modifyAt, version)
                .from(zlClass);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    default ZlClass selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, maxOunt, teacherId, academicId, status, createAt, modifyAt, version)
                .from(zlClass)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ZlClass record) {
        return UpdateDSL.updateWithMapper(this::update, zlClass)
                .set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(maxOunt).equalTo(record::getMaxOunt)
                .set(teacherId).equalTo(record::getTeacherId)
                .set(academicId).equalTo(record::getAcademicId)
                .set(status).equalTo(record::getStatus)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ZlClass record) {
        return UpdateDSL.updateWithMapper(this::update, zlClass)
                .set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(maxOunt).equalToWhenPresent(record::getMaxOunt)
                .set(teacherId).equalToWhenPresent(record::getTeacherId)
                .set(academicId).equalToWhenPresent(record::getAcademicId)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    default int updateByPrimaryKey(ZlClass record) {
        return UpdateDSL.updateWithMapper(this::update, zlClass)
                .set(name).equalTo(record::getName)
                .set(maxOunt).equalTo(record::getMaxOunt)
                .set(teacherId).equalTo(record::getTeacherId)
                .set(academicId).equalTo(record::getAcademicId)
                .set(status).equalTo(record::getStatus)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: zl_class")
    default int updateByPrimaryKeySelective(ZlClass record) {
        return UpdateDSL.updateWithMapper(this::update, zlClass)
                .set(name).equalToWhenPresent(record::getName)
                .set(maxOunt).equalToWhenPresent(record::getMaxOunt)
                .set(teacherId).equalToWhenPresent(record::getTeacherId)
                .set(academicId).equalToWhenPresent(record::getAcademicId)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}