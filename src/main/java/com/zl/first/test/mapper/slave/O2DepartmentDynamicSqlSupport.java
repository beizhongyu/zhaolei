package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2DepartmentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    public static final O2Department o2Department = new O2Department();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_department.id")
    public static final SqlColumn<String> id = o2Department.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_department.ding_id")
    public static final SqlColumn<String> dingId = o2Department.dingId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_department.display_name")
    public static final SqlColumn<String> displayName = o2Department.displayName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_department.description")
    public static final SqlColumn<String> description = o2Department.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_department.status")
    public static final SqlColumn<String> status = o2Department.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_department.create_at")
    public static final SqlColumn<Date> createAt = o2Department.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_department.modify_at")
    public static final SqlColumn<Date> modifyAt = o2Department.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_department.version")
    public static final SqlColumn<Integer> version = o2Department.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_department.belong_company")
    public static final SqlColumn<String> belongCompany = o2Department.belongCompany;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_department.company_id")
    public static final SqlColumn<String> companyId = o2Department.companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_department.create_ding_group")
    public static final SqlColumn<Short> createDingGroup = o2Department.createDingGroup;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_department.group_name")
    public static final SqlColumn<String> groupName = o2Department.groupName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_department.admin_id")
    public static final SqlColumn<String> adminId = o2Department.adminId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_department.group_owner")
    public static final SqlColumn<String> groupOwner = o2Department.groupOwner;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_department.parentid")
    public static final SqlColumn<String> parentid = o2Department.parentid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_department.group_id")
    public static final SqlColumn<String> groupId = o2Department.groupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_department.mail_group")
    public static final SqlColumn<String> mailGroup = o2Department.mailGroup;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_department.extra")
    public static final SqlColumn<String> extra = o2Department.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_department")
    public static final class O2Department extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> dingId = column("ding_id", JDBCType.VARCHAR);

        public final SqlColumn<String> displayName = column("display_name", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> belongCompany = column("belong_company", JDBCType.VARCHAR);

        public final SqlColumn<String> companyId = column("company_id", JDBCType.VARCHAR);

        public final SqlColumn<Short> createDingGroup = column("create_ding_group", JDBCType.SMALLINT);

        public final SqlColumn<String> groupName = column("group_name", JDBCType.VARCHAR);

        public final SqlColumn<String> adminId = column("admin_id", JDBCType.VARCHAR);

        public final SqlColumn<String> groupOwner = column("group_owner", JDBCType.VARCHAR);

        public final SqlColumn<String> parentid = column("parentid", JDBCType.VARCHAR);

        public final SqlColumn<String> groupId = column("group_id", JDBCType.VARCHAR);

        public final SqlColumn<String> mailGroup = column("mail_group", JDBCType.VARCHAR);

        public final SqlColumn<String> extra = column("extra", JDBCType.LONGVARCHAR);

        public O2Department() {
            super("o2_department");
        }
    }
}