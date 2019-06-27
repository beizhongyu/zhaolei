package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2FieldCategoryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    public static final O2FieldCategory o2FieldCategory = new O2FieldCategory();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_category.id")
    public static final SqlColumn<String> id = o2FieldCategory.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_category.category_name")
    public static final SqlColumn<String> categoryName = o2FieldCategory.categoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_category.display_name")
    public static final SqlColumn<String> displayName = o2FieldCategory.displayName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_category.sort")
    public static final SqlColumn<Integer> sort = o2FieldCategory.sort;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_category.create_at")
    public static final SqlColumn<Date> createAt = o2FieldCategory.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_category.modify_at")
    public static final SqlColumn<Date> modifyAt = o2FieldCategory.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_category.version")
    public static final SqlColumn<Integer> version = o2FieldCategory.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_category")
    public static final class O2FieldCategory extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> categoryName = column("category_name", JDBCType.VARCHAR);

        public final SqlColumn<String> displayName = column("display_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public O2FieldCategory() {
            super("o2_field_category");
        }
    }
}