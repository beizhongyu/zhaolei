package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2FieldTypeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.slave.O2FieldType;
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
public interface O2FieldTypeMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2FieldType> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2FieldTypeResult")
    O2FieldType selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2FieldTypeResult")
    List<O2FieldType> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    default Function<SelectStatementProvider, List<O2FieldType>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2FieldTypeResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="type_name", property="typeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="display_name", property="displayName", jdbcType=JdbcType.VARCHAR),
        @Result(column="isvisible", property="isvisible", jdbcType=JdbcType.SMALLINT),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER)
    })
    List<O2FieldType> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2FieldType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2FieldType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2FieldType)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    default int insert(O2FieldType record) {
        return insert(SqlBuilder.insert(record)
                .into(o2FieldType)
                .map(id).toProperty("id")
                .map(typeName).toProperty("typeName")
                .map(displayName).toProperty("displayName")
                .map(isvisible).toProperty("isvisible")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    default int insertSelective(O2FieldType record) {
        return insert(SqlBuilder.insert(record)
                .into(o2FieldType)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(typeName).toPropertyWhenPresent("typeName", record::getTypeName)
                .map(displayName).toPropertyWhenPresent("displayName", record::getDisplayName)
                .map(isvisible).toPropertyWhenPresent("isvisible", record::getIsvisible)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2FieldType>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, typeName, displayName, isvisible, createAt, modifyAt, version)
                .from(o2FieldType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2FieldType>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, typeName, displayName, isvisible, createAt, modifyAt, version)
                .from(o2FieldType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2FieldType>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, typeName, displayName, isvisible, createAt, modifyAt, version)
                .from(o2FieldType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2FieldType>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, typeName, displayName, isvisible, createAt, modifyAt, version)
                .from(o2FieldType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    default O2FieldType selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, typeName, displayName, isvisible, createAt, modifyAt, version)
                .from(o2FieldType)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2FieldType record) {
        return UpdateDSL.updateWithMapper(this::update, o2FieldType)
                .set(id).equalTo(record::getId)
                .set(typeName).equalTo(record::getTypeName)
                .set(displayName).equalTo(record::getDisplayName)
                .set(isvisible).equalTo(record::getIsvisible)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2FieldType record) {
        return UpdateDSL.updateWithMapper(this::update, o2FieldType)
                .set(id).equalToWhenPresent(record::getId)
                .set(typeName).equalToWhenPresent(record::getTypeName)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(isvisible).equalToWhenPresent(record::getIsvisible)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    default int updateByPrimaryKey(O2FieldType record) {
        return UpdateDSL.updateWithMapper(this::update, o2FieldType)
                .set(typeName).equalTo(record::getTypeName)
                .set(displayName).equalTo(record::getDisplayName)
                .set(isvisible).equalTo(record::getIsvisible)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    default int updateByPrimaryKeySelective(O2FieldType record) {
        return UpdateDSL.updateWithMapper(this::update, o2FieldType)
                .set(typeName).equalToWhenPresent(record::getTypeName)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(isvisible).equalToWhenPresent(record::getIsvisible)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}