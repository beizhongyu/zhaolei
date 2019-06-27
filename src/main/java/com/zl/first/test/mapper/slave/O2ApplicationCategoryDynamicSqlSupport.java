package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2ApplicationCategoryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application_category")
    public static final O2ApplicationCategory o2ApplicationCategory = new O2ApplicationCategory();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application_category.id")
    public static final SqlColumn<String> id = o2ApplicationCategory.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application_category.display_name")
    public static final SqlColumn<String> displayName = o2ApplicationCategory.displayName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application_category.create_at")
    public static final SqlColumn<Date> createAt = o2ApplicationCategory.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application_category.modify_at")
    public static final SqlColumn<Date> modifyAt = o2ApplicationCategory.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application_category.version")
    public static final SqlColumn<Integer> version = o2ApplicationCategory.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application_category")
    public static final class O2ApplicationCategory extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> displayName = column("display_name", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public O2ApplicationCategory() {
            super("o2_application_category");
        }
    }
}