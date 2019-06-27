package com.zl.first.test.mapper.master;

import static com.zl.first.test.mapper.master.AmsPrinterDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.master.AmsPrinter;
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
public interface AmsPrinterMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AmsPrinter> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsPrinterResult")
    AmsPrinter selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsPrinterResult")
    List<AmsPrinter> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    default Function<SelectStatementProvider, List<AmsPrinter>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AmsPrinterResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand_id", property="brandId", jdbcType=JdbcType.VARCHAR),
        @Result(column="manufacture_id", property="manufactureId", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_valite", property="isValite", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="extra", property="extra", jdbcType=JdbcType.VARCHAR)
    })
    List<AmsPrinter> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(amsPrinter);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsPrinter);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsPrinter)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    default int insert(AmsPrinter record) {
        return insert(SqlBuilder.insert(record)
                .into(amsPrinter)
                .map(id).toProperty("id")
                .map(companyId).toProperty("companyId")
                .map(name).toProperty("name")
                .map(brandId).toProperty("brandId")
                .map(manufactureId).toProperty("manufactureId")
                .map(address).toProperty("address")
                .map(note).toProperty("note")
                .map(isValite).toProperty("isValite")
                .map(createTime).toProperty("createTime")
                .map(modifyTime).toProperty("modifyTime")
                .map(version).toProperty("version")
                .map(extra).toProperty("extra")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    default int insertSelective(AmsPrinter record) {
        return insert(SqlBuilder.insert(record)
                .into(amsPrinter)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(companyId).toPropertyWhenPresent("companyId", record::getCompanyId)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(brandId).toPropertyWhenPresent("brandId", record::getBrandId)
                .map(manufactureId).toPropertyWhenPresent("manufactureId", record::getManufactureId)
                .map(address).toPropertyWhenPresent("address", record::getAddress)
                .map(note).toPropertyWhenPresent("note", record::getNote)
                .map(isValite).toPropertyWhenPresent("isValite", record::getIsValite)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(modifyTime).toPropertyWhenPresent("modifyTime", record::getModifyTime)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .map(extra).toPropertyWhenPresent("extra", record::getExtra)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsPrinter>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, companyId, name, brandId, manufactureId, address, note, isValite, createTime, modifyTime, version, extra)
                .from(amsPrinter);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsPrinter>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, companyId, name, brandId, manufactureId, address, note, isValite, createTime, modifyTime, version, extra)
                .from(amsPrinter);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsPrinter>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, companyId, name, brandId, manufactureId, address, note, isValite, createTime, modifyTime, version, extra)
                .from(amsPrinter);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsPrinter>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, companyId, name, brandId, manufactureId, address, note, isValite, createTime, modifyTime, version, extra)
                .from(amsPrinter);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    default AmsPrinter selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, companyId, name, brandId, manufactureId, address, note, isValite, createTime, modifyTime, version, extra)
                .from(amsPrinter)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(AmsPrinter record) {
        return UpdateDSL.updateWithMapper(this::update, amsPrinter)
                .set(id).equalTo(record::getId)
                .set(companyId).equalTo(record::getCompanyId)
                .set(name).equalTo(record::getName)
                .set(brandId).equalTo(record::getBrandId)
                .set(manufactureId).equalTo(record::getManufactureId)
                .set(address).equalTo(record::getAddress)
                .set(note).equalTo(record::getNote)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(AmsPrinter record) {
        return UpdateDSL.updateWithMapper(this::update, amsPrinter)
                .set(id).equalToWhenPresent(record::getId)
                .set(companyId).equalToWhenPresent(record::getCompanyId)
                .set(name).equalToWhenPresent(record::getName)
                .set(brandId).equalToWhenPresent(record::getBrandId)
                .set(manufactureId).equalToWhenPresent(record::getManufactureId)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(note).equalToWhenPresent(record::getNote)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    default int updateByPrimaryKey(AmsPrinter record) {
        return UpdateDSL.updateWithMapper(this::update, amsPrinter)
                .set(companyId).equalTo(record::getCompanyId)
                .set(name).equalTo(record::getName)
                .set(brandId).equalTo(record::getBrandId)
                .set(manufactureId).equalTo(record::getManufactureId)
                .set(address).equalTo(record::getAddress)
                .set(note).equalTo(record::getNote)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    default int updateByPrimaryKeySelective(AmsPrinter record) {
        return UpdateDSL.updateWithMapper(this::update, amsPrinter)
                .set(companyId).equalToWhenPresent(record::getCompanyId)
                .set(name).equalToWhenPresent(record::getName)
                .set(brandId).equalToWhenPresent(record::getBrandId)
                .set(manufactureId).equalToWhenPresent(record::getManufactureId)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(note).equalToWhenPresent(record::getNote)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}