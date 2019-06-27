package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2FieldCategoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.slave.O2FieldCategory;
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
public interface O2FieldCategoryMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2FieldCategory> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2FieldCategoryResult")
    O2FieldCategory selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2FieldCategoryResult")
    List<O2FieldCategory> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    default Function<SelectStatementProvider, List<O2FieldCategory>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2FieldCategoryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="category_name", property="categoryName", jdbcType=JdbcType.VARCHAR),
        @Result(column="display_name", property="displayName", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER)
    })
    List<O2FieldCategory> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2FieldCategory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2FieldCategory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2FieldCategory)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    default int insert(O2FieldCategory record) {
        return insert(SqlBuilder.insert(record)
                .into(o2FieldCategory)
                .map(id).toProperty("id")
                .map(categoryName).toProperty("categoryName")
                .map(displayName).toProperty("displayName")
                .map(sort).toProperty("sort")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    default int insertSelective(O2FieldCategory record) {
        return insert(SqlBuilder.insert(record)
                .into(o2FieldCategory)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(categoryName).toPropertyWhenPresent("categoryName", record::getCategoryName)
                .map(displayName).toPropertyWhenPresent("displayName", record::getDisplayName)
                .map(sort).toPropertyWhenPresent("sort", record::getSort)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2FieldCategory>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, categoryName, displayName, sort, createAt, modifyAt, version)
                .from(o2FieldCategory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2FieldCategory>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, categoryName, displayName, sort, createAt, modifyAt, version)
                .from(o2FieldCategory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2FieldCategory>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, categoryName, displayName, sort, createAt, modifyAt, version)
                .from(o2FieldCategory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2FieldCategory>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, categoryName, displayName, sort, createAt, modifyAt, version)
                .from(o2FieldCategory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    default O2FieldCategory selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, categoryName, displayName, sort, createAt, modifyAt, version)
                .from(o2FieldCategory)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2FieldCategory record) {
        return UpdateDSL.updateWithMapper(this::update, o2FieldCategory)
                .set(id).equalTo(record::getId)
                .set(categoryName).equalTo(record::getCategoryName)
                .set(displayName).equalTo(record::getDisplayName)
                .set(sort).equalTo(record::getSort)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2FieldCategory record) {
        return UpdateDSL.updateWithMapper(this::update, o2FieldCategory)
                .set(id).equalToWhenPresent(record::getId)
                .set(categoryName).equalToWhenPresent(record::getCategoryName)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(sort).equalToWhenPresent(record::getSort)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    default int updateByPrimaryKey(O2FieldCategory record) {
        return UpdateDSL.updateWithMapper(this::update, o2FieldCategory)
                .set(categoryName).equalTo(record::getCategoryName)
                .set(displayName).equalTo(record::getDisplayName)
                .set(sort).equalTo(record::getSort)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    default int updateByPrimaryKeySelective(O2FieldCategory record) {
        return UpdateDSL.updateWithMapper(this::update, o2FieldCategory)
                .set(categoryName).equalToWhenPresent(record::getCategoryName)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(sort).equalToWhenPresent(record::getSort)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}