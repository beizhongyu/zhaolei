package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2UserFieldDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.slave.O2UserField;
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
public interface O2UserFieldMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2UserField> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2UserFieldResult")
    O2UserField selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2UserFieldResult")
    List<O2UserField> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    default Function<SelectStatementProvider, List<O2UserField>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2UserFieldResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="field_name", property="fieldName", jdbcType=JdbcType.VARCHAR),
        @Result(column="display_name", property="displayName", jdbcType=JdbcType.VARCHAR),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="type_id", property="typeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="not_null", property="notNull", jdbcType=JdbcType.SMALLINT),
        @Result(column="isonly", property="isonly", jdbcType=JdbcType.VARCHAR),
        @Result(column="isvisible", property="isvisible", jdbcType=JdbcType.SMALLINT),
        @Result(column="ismodify", property="ismodify", jdbcType=JdbcType.SMALLINT),
        @Result(column="iseditable", property="iseditable", jdbcType=JdbcType.SMALLINT),
        @Result(column="searchable", property="searchable", jdbcType=JdbcType.SMALLINT),
        @Result(column="property", property="property", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="extra", property="extra", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<O2UserField> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2UserField);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2UserField);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2UserField)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    default int insert(O2UserField record) {
        return insert(SqlBuilder.insert(record)
                .into(o2UserField)
                .map(id).toProperty("id")
                .map(fieldName).toProperty("fieldName")
                .map(displayName).toProperty("displayName")
                .map(categoryId).toProperty("categoryId")
                .map(sort).toProperty("sort")
                .map(typeId).toProperty("typeId")
                .map(notNull).toProperty("notNull")
                .map(isonly).toProperty("isonly")
                .map(isvisible).toProperty("isvisible")
                .map(ismodify).toProperty("ismodify")
                .map(iseditable).toProperty("iseditable")
                .map(searchable).toProperty("searchable")
                .map(property).toProperty("property")
                .map(status).toProperty("status")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .map(extra).toProperty("extra")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    default int insertSelective(O2UserField record) {
        return insert(SqlBuilder.insert(record)
                .into(o2UserField)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(fieldName).toPropertyWhenPresent("fieldName", record::getFieldName)
                .map(displayName).toPropertyWhenPresent("displayName", record::getDisplayName)
                .map(categoryId).toPropertyWhenPresent("categoryId", record::getCategoryId)
                .map(sort).toPropertyWhenPresent("sort", record::getSort)
                .map(typeId).toPropertyWhenPresent("typeId", record::getTypeId)
                .map(notNull).toPropertyWhenPresent("notNull", record::getNotNull)
                .map(isonly).toPropertyWhenPresent("isonly", record::getIsonly)
                .map(isvisible).toPropertyWhenPresent("isvisible", record::getIsvisible)
                .map(ismodify).toPropertyWhenPresent("ismodify", record::getIsmodify)
                .map(iseditable).toPropertyWhenPresent("iseditable", record::getIseditable)
                .map(searchable).toPropertyWhenPresent("searchable", record::getSearchable)
                .map(property).toPropertyWhenPresent("property", record::getProperty)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .map(extra).toPropertyWhenPresent("extra", record::getExtra)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2UserField>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, fieldName, displayName, categoryId, sort, typeId, notNull, isonly, isvisible, ismodify, iseditable, searchable, property, status, createAt, modifyAt, version, extra)
                .from(o2UserField);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2UserField>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, fieldName, displayName, categoryId, sort, typeId, notNull, isonly, isvisible, ismodify, iseditable, searchable, property, status, createAt, modifyAt, version, extra)
                .from(o2UserField);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2UserField>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, fieldName, displayName, categoryId, sort, typeId, notNull, isonly, isvisible, ismodify, iseditable, searchable, property, status, createAt, modifyAt, version, extra)
                .from(o2UserField);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2UserField>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, fieldName, displayName, categoryId, sort, typeId, notNull, isonly, isvisible, ismodify, iseditable, searchable, property, status, createAt, modifyAt, version, extra)
                .from(o2UserField);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    default O2UserField selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, fieldName, displayName, categoryId, sort, typeId, notNull, isonly, isvisible, ismodify, iseditable, searchable, property, status, createAt, modifyAt, version, extra)
                .from(o2UserField)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2UserField record) {
        return UpdateDSL.updateWithMapper(this::update, o2UserField)
                .set(id).equalTo(record::getId)
                .set(fieldName).equalTo(record::getFieldName)
                .set(displayName).equalTo(record::getDisplayName)
                .set(categoryId).equalTo(record::getCategoryId)
                .set(sort).equalTo(record::getSort)
                .set(typeId).equalTo(record::getTypeId)
                .set(notNull).equalTo(record::getNotNull)
                .set(isonly).equalTo(record::getIsonly)
                .set(isvisible).equalTo(record::getIsvisible)
                .set(ismodify).equalTo(record::getIsmodify)
                .set(iseditable).equalTo(record::getIseditable)
                .set(searchable).equalTo(record::getSearchable)
                .set(property).equalTo(record::getProperty)
                .set(status).equalTo(record::getStatus)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2UserField record) {
        return UpdateDSL.updateWithMapper(this::update, o2UserField)
                .set(id).equalToWhenPresent(record::getId)
                .set(fieldName).equalToWhenPresent(record::getFieldName)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(categoryId).equalToWhenPresent(record::getCategoryId)
                .set(sort).equalToWhenPresent(record::getSort)
                .set(typeId).equalToWhenPresent(record::getTypeId)
                .set(notNull).equalToWhenPresent(record::getNotNull)
                .set(isonly).equalToWhenPresent(record::getIsonly)
                .set(isvisible).equalToWhenPresent(record::getIsvisible)
                .set(ismodify).equalToWhenPresent(record::getIsmodify)
                .set(iseditable).equalToWhenPresent(record::getIseditable)
                .set(searchable).equalToWhenPresent(record::getSearchable)
                .set(property).equalToWhenPresent(record::getProperty)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    default int updateByPrimaryKey(O2UserField record) {
        return UpdateDSL.updateWithMapper(this::update, o2UserField)
                .set(fieldName).equalTo(record::getFieldName)
                .set(displayName).equalTo(record::getDisplayName)
                .set(categoryId).equalTo(record::getCategoryId)
                .set(sort).equalTo(record::getSort)
                .set(typeId).equalTo(record::getTypeId)
                .set(notNull).equalTo(record::getNotNull)
                .set(isonly).equalTo(record::getIsonly)
                .set(isvisible).equalTo(record::getIsvisible)
                .set(ismodify).equalTo(record::getIsmodify)
                .set(iseditable).equalTo(record::getIseditable)
                .set(searchable).equalTo(record::getSearchable)
                .set(property).equalTo(record::getProperty)
                .set(status).equalTo(record::getStatus)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    default int updateByPrimaryKeySelective(O2UserField record) {
        return UpdateDSL.updateWithMapper(this::update, o2UserField)
                .set(fieldName).equalToWhenPresent(record::getFieldName)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(categoryId).equalToWhenPresent(record::getCategoryId)
                .set(sort).equalToWhenPresent(record::getSort)
                .set(typeId).equalToWhenPresent(record::getTypeId)
                .set(notNull).equalToWhenPresent(record::getNotNull)
                .set(isonly).equalToWhenPresent(record::getIsonly)
                .set(isvisible).equalToWhenPresent(record::getIsvisible)
                .set(ismodify).equalToWhenPresent(record::getIsmodify)
                .set(iseditable).equalToWhenPresent(record::getIseditable)
                .set(searchable).equalToWhenPresent(record::getSearchable)
                .set(property).equalToWhenPresent(record::getProperty)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}