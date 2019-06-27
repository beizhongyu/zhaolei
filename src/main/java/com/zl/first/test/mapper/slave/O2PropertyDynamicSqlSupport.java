package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2PropertyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    public static final O2Property o2Property = new O2Property();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_property.id")
    public static final SqlColumn<String> id = o2Property.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_property.user_id")
    public static final SqlColumn<String> userId = o2Property.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_property.field_id")
    public static final SqlColumn<String> fieldId = o2Property.fieldId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_property.property_value")
    public static final SqlColumn<String> propertyValue = o2Property.propertyValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_property.company_id")
    public static final SqlColumn<String> companyId = o2Property.companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_property.status")
    public static final SqlColumn<String> status = o2Property.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_property.create_at")
    public static final SqlColumn<Date> createAt = o2Property.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_property.modify_at")
    public static final SqlColumn<Date> modifyAt = o2Property.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_property.version")
    public static final SqlColumn<Integer> version = o2Property.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_property")
    public static final class O2Property extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> userId = column("user_id", JDBCType.VARCHAR);

        public final SqlColumn<String> fieldId = column("field_id", JDBCType.VARCHAR);

        public final SqlColumn<String> propertyValue = column("property_value", JDBCType.VARCHAR);

        public final SqlColumn<String> companyId = column("company_id", JDBCType.VARCHAR);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public O2Property() {
            super("o2_property");
        }
    }
}