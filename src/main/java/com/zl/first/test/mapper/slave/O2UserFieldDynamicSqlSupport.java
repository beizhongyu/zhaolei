package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2UserFieldDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public static final O2UserField o2UserField = new O2UserField();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.id")
    public static final SqlColumn<String> id = o2UserField.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.field_name")
    public static final SqlColumn<String> fieldName = o2UserField.fieldName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.display_name")
    public static final SqlColumn<String> displayName = o2UserField.displayName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.category_id")
    public static final SqlColumn<String> categoryId = o2UserField.categoryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.sort")
    public static final SqlColumn<Integer> sort = o2UserField.sort;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.type_id")
    public static final SqlColumn<String> typeId = o2UserField.typeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.not_null")
    public static final SqlColumn<Short> notNull = o2UserField.notNull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.isonly")
    public static final SqlColumn<String> isonly = o2UserField.isonly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.isvisible")
    public static final SqlColumn<Short> isvisible = o2UserField.isvisible;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.ismodify")
    public static final SqlColumn<Short> ismodify = o2UserField.ismodify;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.iseditable")
    public static final SqlColumn<Short> iseditable = o2UserField.iseditable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.searchable")
    public static final SqlColumn<Short> searchable = o2UserField.searchable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.property")
    public static final SqlColumn<String> property = o2UserField.property;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.status")
    public static final SqlColumn<String> status = o2UserField.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.create_at")
    public static final SqlColumn<Date> createAt = o2UserField.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.modify_at")
    public static final SqlColumn<Date> modifyAt = o2UserField.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.version")
    public static final SqlColumn<Integer> version = o2UserField.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.extra")
    public static final SqlColumn<String> extra = o2UserField.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public static final class O2UserField extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> fieldName = column("field_name", JDBCType.VARCHAR);

        public final SqlColumn<String> displayName = column("display_name", JDBCType.VARCHAR);

        public final SqlColumn<String> categoryId = column("category_id", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public final SqlColumn<String> typeId = column("type_id", JDBCType.VARCHAR);

        public final SqlColumn<Short> notNull = column("not_null", JDBCType.SMALLINT);

        public final SqlColumn<String> isonly = column("isonly", JDBCType.VARCHAR);

        public final SqlColumn<Short> isvisible = column("isvisible", JDBCType.SMALLINT);

        public final SqlColumn<Short> ismodify = column("ismodify", JDBCType.SMALLINT);

        public final SqlColumn<Short> iseditable = column("iseditable", JDBCType.SMALLINT);

        public final SqlColumn<Short> searchable = column("searchable", JDBCType.SMALLINT);

        public final SqlColumn<String> property = column("property", JDBCType.VARCHAR);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> extra = column("extra", JDBCType.LONGVARCHAR);

        public O2UserField() {
            super("o2_user_field");
        }
    }
}