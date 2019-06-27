package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2FieldTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    public static final O2FieldType o2FieldType = new O2FieldType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.id")
    public static final SqlColumn<String> id = o2FieldType.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.type_name")
    public static final SqlColumn<String> typeName = o2FieldType.typeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.display_name")
    public static final SqlColumn<String> displayName = o2FieldType.displayName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.isvisible")
    public static final SqlColumn<Short> isvisible = o2FieldType.isvisible;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.create_at")
    public static final SqlColumn<Date> createAt = o2FieldType.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.modify_at")
    public static final SqlColumn<Date> modifyAt = o2FieldType.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.version")
    public static final SqlColumn<Integer> version = o2FieldType.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    public static final class O2FieldType extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> typeName = column("type_name", JDBCType.VARCHAR);

        public final SqlColumn<String> displayName = column("display_name", JDBCType.VARCHAR);

        public final SqlColumn<Short> isvisible = column("isvisible", JDBCType.SMALLINT);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public O2FieldType() {
            super("o2_field_type");
        }
    }
}