package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2PropertyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.slave.O2Property;
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
public interface O2PropertyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2Property> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2PropertyResult")
    O2Property selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2PropertyResult")
    List<O2Property> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    default Function<SelectStatementProvider, List<O2Property>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2PropertyResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="field_id", property="fieldId", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_value", property="propertyValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER)
    })
    List<O2Property> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2Property);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2Property);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2Property)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    default int insert(O2Property record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Property)
                .map(id).toProperty("id")
                .map(userId).toProperty("userId")
                .map(fieldId).toProperty("fieldId")
                .map(propertyValue).toProperty("propertyValue")
                .map(companyId).toProperty("companyId")
                .map(status).toProperty("status")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    default int insertSelective(O2Property record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Property)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(fieldId).toPropertyWhenPresent("fieldId", record::getFieldId)
                .map(propertyValue).toPropertyWhenPresent("propertyValue", record::getPropertyValue)
                .map(companyId).toPropertyWhenPresent("companyId", record::getCompanyId)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Property>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, userId, fieldId, propertyValue, companyId, status, createAt, modifyAt, version)
                .from(o2Property);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Property>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, userId, fieldId, propertyValue, companyId, status, createAt, modifyAt, version)
                .from(o2Property);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Property>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, userId, fieldId, propertyValue, companyId, status, createAt, modifyAt, version)
                .from(o2Property);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Property>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, userId, fieldId, propertyValue, companyId, status, createAt, modifyAt, version)
                .from(o2Property);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    default O2Property selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, userId, fieldId, propertyValue, companyId, status, createAt, modifyAt, version)
                .from(o2Property)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2Property record) {
        return UpdateDSL.updateWithMapper(this::update, o2Property)
                .set(id).equalTo(record::getId)
                .set(userId).equalTo(record::getUserId)
                .set(fieldId).equalTo(record::getFieldId)
                .set(propertyValue).equalTo(record::getPropertyValue)
                .set(companyId).equalTo(record::getCompanyId)
                .set(status).equalTo(record::getStatus)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2Property record) {
        return UpdateDSL.updateWithMapper(this::update, o2Property)
                .set(id).equalToWhenPresent(record::getId)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(fieldId).equalToWhenPresent(record::getFieldId)
                .set(propertyValue).equalToWhenPresent(record::getPropertyValue)
                .set(companyId).equalToWhenPresent(record::getCompanyId)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    default int updateByPrimaryKey(O2Property record) {
        return UpdateDSL.updateWithMapper(this::update, o2Property)
                .set(userId).equalTo(record::getUserId)
                .set(fieldId).equalTo(record::getFieldId)
                .set(propertyValue).equalTo(record::getPropertyValue)
                .set(companyId).equalTo(record::getCompanyId)
                .set(status).equalTo(record::getStatus)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    default int updateByPrimaryKeySelective(O2Property record) {
        return UpdateDSL.updateWithMapper(this::update, o2Property)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(fieldId).equalToWhenPresent(record::getFieldId)
                .set(propertyValue).equalToWhenPresent(record::getPropertyValue)
                .set(companyId).equalToWhenPresent(record::getCompanyId)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}