package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2CompanyAliasDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.slave.O2CompanyAlias;
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
public interface O2CompanyAliasMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2CompanyAlias> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2CompanyAliasResult")
    O2CompanyAlias selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2CompanyAliasResult")
    List<O2CompanyAlias> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    default Function<SelectStatementProvider, List<O2CompanyAlias>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2CompanyAliasResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="alias", property="alias", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER)
    })
    List<O2CompanyAlias> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2CompanyAlias);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2CompanyAlias);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2CompanyAlias)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    default int insert(O2CompanyAlias record) {
        return insert(SqlBuilder.insert(record)
                .into(o2CompanyAlias)
                .map(id).toProperty("id")
                .map(alias).toProperty("alias")
                .map(companyId).toProperty("companyId")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    default int insertSelective(O2CompanyAlias record) {
        return insert(SqlBuilder.insert(record)
                .into(o2CompanyAlias)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(alias).toPropertyWhenPresent("alias", record::getAlias)
                .map(companyId).toPropertyWhenPresent("companyId", record::getCompanyId)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2CompanyAlias>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, alias, companyId, createAt, modifyAt, version)
                .from(o2CompanyAlias);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2CompanyAlias>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, alias, companyId, createAt, modifyAt, version)
                .from(o2CompanyAlias);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2CompanyAlias>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, alias, companyId, createAt, modifyAt, version)
                .from(o2CompanyAlias);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2CompanyAlias>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, alias, companyId, createAt, modifyAt, version)
                .from(o2CompanyAlias);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    default O2CompanyAlias selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, alias, companyId, createAt, modifyAt, version)
                .from(o2CompanyAlias)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2CompanyAlias record) {
        return UpdateDSL.updateWithMapper(this::update, o2CompanyAlias)
                .set(id).equalTo(record::getId)
                .set(alias).equalTo(record::getAlias)
                .set(companyId).equalTo(record::getCompanyId)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2CompanyAlias record) {
        return UpdateDSL.updateWithMapper(this::update, o2CompanyAlias)
                .set(id).equalToWhenPresent(record::getId)
                .set(alias).equalToWhenPresent(record::getAlias)
                .set(companyId).equalToWhenPresent(record::getCompanyId)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    default int updateByPrimaryKey(O2CompanyAlias record) {
        return UpdateDSL.updateWithMapper(this::update, o2CompanyAlias)
                .set(alias).equalTo(record::getAlias)
                .set(companyId).equalTo(record::getCompanyId)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    default int updateByPrimaryKeySelective(O2CompanyAlias record) {
        return UpdateDSL.updateWithMapper(this::update, o2CompanyAlias)
                .set(alias).equalToWhenPresent(record::getAlias)
                .set(companyId).equalToWhenPresent(record::getCompanyId)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}