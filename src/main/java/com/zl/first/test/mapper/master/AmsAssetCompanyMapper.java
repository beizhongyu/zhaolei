package com.zl.first.test.mapper.master;

import static com.zl.first.test.mapper.master.AmsAssetCompanyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.master.AmsAssetCompany;
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
public interface AmsAssetCompanyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AmsAssetCompany> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsAssetCompanyResult")
    AmsAssetCompany selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AmsAssetCompanyResult")
    List<AmsAssetCompany> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    default Function<SelectStatementProvider, List<AmsAssetCompany>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AmsAssetCompanyResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.VARCHAR),
        @Result(column="admin", property="admin", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_valite", property="isValite", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="extra", property="extra", jdbcType=JdbcType.VARCHAR),
        @Result(column="userId", property="userid", jdbcType=JdbcType.VARCHAR)
    })
    List<AmsAssetCompany> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(amsAssetCompany);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsAssetCompany);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, amsAssetCompany)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    default int insert(AmsAssetCompany record) {
        return insert(SqlBuilder.insert(record)
                .into(amsAssetCompany)
                .map(id).toProperty("id")
                .map(groupId).toProperty("groupId")
                .map(admin).toProperty("admin")
                .map(note).toProperty("note")
                .map(isValite).toProperty("isValite")
                .map(createTime).toProperty("createTime")
                .map(modifyTime).toProperty("modifyTime")
                .map(version).toProperty("version")
                .map(extra).toProperty("extra")
                .map(userid).toProperty("userid")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    default int insertSelective(AmsAssetCompany record) {
        return insert(SqlBuilder.insert(record)
                .into(amsAssetCompany)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(groupId).toPropertyWhenPresent("groupId", record::getGroupId)
                .map(admin).toPropertyWhenPresent("admin", record::getAdmin)
                .map(note).toPropertyWhenPresent("note", record::getNote)
                .map(isValite).toPropertyWhenPresent("isValite", record::getIsValite)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(modifyTime).toPropertyWhenPresent("modifyTime", record::getModifyTime)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .map(extra).toPropertyWhenPresent("extra", record::getExtra)
                .map(userid).toPropertyWhenPresent("userid", record::getUserid)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetCompany>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, groupId, admin, note, isValite, createTime, modifyTime, version, extra, userid)
                .from(amsAssetCompany);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetCompany>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, groupId, admin, note, isValite, createTime, modifyTime, version, extra, userid)
                .from(amsAssetCompany);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetCompany>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, groupId, admin, note, isValite, createTime, modifyTime, version, extra, userid)
                .from(amsAssetCompany);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AmsAssetCompany>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, groupId, admin, note, isValite, createTime, modifyTime, version, extra, userid)
                .from(amsAssetCompany);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    default AmsAssetCompany selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, groupId, admin, note, isValite, createTime, modifyTime, version, extra, userid)
                .from(amsAssetCompany)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(AmsAssetCompany record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetCompany)
                .set(id).equalTo(record::getId)
                .set(groupId).equalTo(record::getGroupId)
                .set(admin).equalTo(record::getAdmin)
                .set(note).equalTo(record::getNote)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra)
                .set(userid).equalTo(record::getUserid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(AmsAssetCompany record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetCompany)
                .set(id).equalToWhenPresent(record::getId)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(admin).equalToWhenPresent(record::getAdmin)
                .set(note).equalToWhenPresent(record::getNote)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra)
                .set(userid).equalToWhenPresent(record::getUserid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    default int updateByPrimaryKey(AmsAssetCompany record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetCompany)
                .set(groupId).equalTo(record::getGroupId)
                .set(admin).equalTo(record::getAdmin)
                .set(note).equalTo(record::getNote)
                .set(isValite).equalTo(record::getIsValite)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(version).equalTo(record::getVersion)
                .set(extra).equalTo(record::getExtra)
                .set(userid).equalTo(record::getUserid)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_company")
    default int updateByPrimaryKeySelective(AmsAssetCompany record) {
        return UpdateDSL.updateWithMapper(this::update, amsAssetCompany)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(admin).equalToWhenPresent(record::getAdmin)
                .set(note).equalToWhenPresent(record::getNote)
                .set(isValite).equalToWhenPresent(record::getIsValite)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(extra).equalToWhenPresent(record::getExtra)
                .set(userid).equalToWhenPresent(record::getUserid)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}