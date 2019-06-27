package com.zl.first.test.mapper.slave;

import static com.zl.first.test.mapper.slave.O2DepartmentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zl.first.test.model.slave.O2Department;
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
public interface O2DepartmentMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<O2Department> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2DepartmentResult")
    O2Department selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("O2DepartmentResult")
    List<O2Department> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    default Function<SelectStatementProvider, List<O2Department>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="O2DepartmentResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="ding_id", property="dingId", jdbcType=JdbcType.VARCHAR),
        @Result(column="display_name", property="displayName", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_at", property="modifyAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="belong_company", property="belongCompany", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_ding_group", property="createDingGroup", jdbcType=JdbcType.SMALLINT),
        @Result(column="group_name", property="groupName", jdbcType=JdbcType.VARCHAR),
        @Result(column="admin_id", property="adminId", jdbcType=JdbcType.VARCHAR),
        @Result(column="group_owner", property="groupOwner", jdbcType=JdbcType.VARCHAR),
        @Result(column="parentid", property="parentid", jdbcType=JdbcType.VARCHAR),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.VARCHAR),
        @Result(column="mail_group", property="mailGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="extra", property="extra", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<O2Department> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(o2Department);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2Department);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    default int deleteByPrimaryKey(String id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, o2Department)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    default int insert(O2Department record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Department)
                .map(id).toProperty("id")
                .map(dingId).toProperty("dingId")
                .map(displayName).toProperty("displayName")
                .map(description).toProperty("description")
                .map(status).toProperty("status")
                .map(createAt).toProperty("createAt")
                .map(modifyAt).toProperty("modifyAt")
                .map(version).toProperty("version")
                .map(belongCompany).toProperty("belongCompany")
                .map(companyId).toProperty("companyId")
                .map(createDingGroup).toProperty("createDingGroup")
                .map(groupName).toProperty("groupName")
                .map(adminId).toProperty("adminId")
                .map(groupOwner).toProperty("groupOwner")
                .map(parentid).toProperty("parentid")
                .map(groupId).toProperty("groupId")
                .map(mailGroup).toProperty("mailGroup")
                .map(extra).toProperty("extra")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    default int insertSelective(O2Department record) {
        return insert(SqlBuilder.insert(record)
                .into(o2Department)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(dingId).toPropertyWhenPresent("dingId", record::getDingId)
                .map(displayName).toPropertyWhenPresent("displayName", record::getDisplayName)
                .map(description).toPropertyWhenPresent("description", record::getDescription)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
                .map(modifyAt).toPropertyWhenPresent("modifyAt", record::getModifyAt)
                .map(version).toPropertyWhenPresent("version", record::getVersion)
                .map(belongCompany).toPropertyWhenPresent("belongCompany", record::getBelongCompany)
                .map(companyId).toPropertyWhenPresent("companyId", record::getCompanyId)
                .map(createDingGroup).toPropertyWhenPresent("createDingGroup", record::getCreateDingGroup)
                .map(groupName).toPropertyWhenPresent("groupName", record::getGroupName)
                .map(adminId).toPropertyWhenPresent("adminId", record::getAdminId)
                .map(groupOwner).toPropertyWhenPresent("groupOwner", record::getGroupOwner)
                .map(parentid).toPropertyWhenPresent("parentid", record::getParentid)
                .map(groupId).toPropertyWhenPresent("groupId", record::getGroupId)
                .map(mailGroup).toPropertyWhenPresent("mailGroup", record::getMailGroup)
                .map(extra).toPropertyWhenPresent("extra", record::getExtra)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Department>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, dingId, displayName, description, status, createAt, modifyAt, version, belongCompany, companyId, createDingGroup, groupName, adminId, groupOwner, parentid, groupId, mailGroup, extra)
                .from(o2Department);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Department>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, dingId, displayName, description, status, createAt, modifyAt, version, belongCompany, companyId, createDingGroup, groupName, adminId, groupOwner, parentid, groupId, mailGroup, extra)
                .from(o2Department);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Department>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, dingId, displayName, description, status, createAt, modifyAt, version, belongCompany, companyId, createDingGroup, groupName, adminId, groupOwner, parentid, groupId, mailGroup, extra)
                .from(o2Department);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<O2Department>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, dingId, displayName, description, status, createAt, modifyAt, version, belongCompany, companyId, createDingGroup, groupName, adminId, groupOwner, parentid, groupId, mailGroup, extra)
                .from(o2Department);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    default O2Department selectByPrimaryKey(String id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, dingId, displayName, description, status, createAt, modifyAt, version, belongCompany, companyId, createDingGroup, groupName, adminId, groupOwner, parentid, groupId, mailGroup, extra)
                .from(o2Department)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(O2Department record) {
        return UpdateDSL.updateWithMapper(this::update, o2Department)
                .set(id).equalTo(record::getId)
                .set(dingId).equalTo(record::getDingId)
                .set(displayName).equalTo(record::getDisplayName)
                .set(description).equalTo(record::getDescription)
                .set(status).equalTo(record::getStatus)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .set(belongCompany).equalTo(record::getBelongCompany)
                .set(companyId).equalTo(record::getCompanyId)
                .set(createDingGroup).equalTo(record::getCreateDingGroup)
                .set(groupName).equalTo(record::getGroupName)
                .set(adminId).equalTo(record::getAdminId)
                .set(groupOwner).equalTo(record::getGroupOwner)
                .set(parentid).equalTo(record::getParentid)
                .set(groupId).equalTo(record::getGroupId)
                .set(mailGroup).equalTo(record::getMailGroup)
                .set(extra).equalTo(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(O2Department record) {
        return UpdateDSL.updateWithMapper(this::update, o2Department)
                .set(id).equalToWhenPresent(record::getId)
                .set(dingId).equalToWhenPresent(record::getDingId)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(belongCompany).equalToWhenPresent(record::getBelongCompany)
                .set(companyId).equalToWhenPresent(record::getCompanyId)
                .set(createDingGroup).equalToWhenPresent(record::getCreateDingGroup)
                .set(groupName).equalToWhenPresent(record::getGroupName)
                .set(adminId).equalToWhenPresent(record::getAdminId)
                .set(groupOwner).equalToWhenPresent(record::getGroupOwner)
                .set(parentid).equalToWhenPresent(record::getParentid)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(mailGroup).equalToWhenPresent(record::getMailGroup)
                .set(extra).equalToWhenPresent(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    default int updateByPrimaryKey(O2Department record) {
        return UpdateDSL.updateWithMapper(this::update, o2Department)
                .set(dingId).equalTo(record::getDingId)
                .set(displayName).equalTo(record::getDisplayName)
                .set(description).equalTo(record::getDescription)
                .set(status).equalTo(record::getStatus)
                .set(createAt).equalTo(record::getCreateAt)
                .set(modifyAt).equalTo(record::getModifyAt)
                .set(version).equalTo(record::getVersion)
                .set(belongCompany).equalTo(record::getBelongCompany)
                .set(companyId).equalTo(record::getCompanyId)
                .set(createDingGroup).equalTo(record::getCreateDingGroup)
                .set(groupName).equalTo(record::getGroupName)
                .set(adminId).equalTo(record::getAdminId)
                .set(groupOwner).equalTo(record::getGroupOwner)
                .set(parentid).equalTo(record::getParentid)
                .set(groupId).equalTo(record::getGroupId)
                .set(mailGroup).equalTo(record::getMailGroup)
                .set(extra).equalTo(record::getExtra)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    default int updateByPrimaryKeySelective(O2Department record) {
        return UpdateDSL.updateWithMapper(this::update, o2Department)
                .set(dingId).equalToWhenPresent(record::getDingId)
                .set(displayName).equalToWhenPresent(record::getDisplayName)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(modifyAt).equalToWhenPresent(record::getModifyAt)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(belongCompany).equalToWhenPresent(record::getBelongCompany)
                .set(companyId).equalToWhenPresent(record::getCompanyId)
                .set(createDingGroup).equalToWhenPresent(record::getCreateDingGroup)
                .set(groupName).equalToWhenPresent(record::getGroupName)
                .set(adminId).equalToWhenPresent(record::getAdminId)
                .set(groupOwner).equalToWhenPresent(record::getGroupOwner)
                .set(parentid).equalToWhenPresent(record::getParentid)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(mailGroup).equalToWhenPresent(record::getMailGroup)
                .set(extra).equalToWhenPresent(record::getExtra)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}