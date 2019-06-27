package com.zl.first.test.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AmsSupplierDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_supplier")
    public static final AmsSupplier amsSupplier = new AmsSupplier();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_supplier.id")
    public static final SqlColumn<String> id = amsSupplier.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_supplier.supplier")
    public static final SqlColumn<String> supplier = amsSupplier.supplier;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_supplier.is_valite")
    public static final SqlColumn<Integer> isValite = amsSupplier.isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_supplier.create_time")
    public static final SqlColumn<Long> createTime = amsSupplier.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_supplier.modify_time")
    public static final SqlColumn<Long> modifyTime = amsSupplier.modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_supplier.version")
    public static final SqlColumn<Integer> version = amsSupplier.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_supplier.extra")
    public static final SqlColumn<String> extra = amsSupplier.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_supplier")
    public static final class AmsSupplier extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> supplier = column("supplier", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isValite = column("is_valite", JDBCType.INTEGER);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyTime = column("modify_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> extra = column("extra", JDBCType.VARCHAR);

        public AmsSupplier() {
            super("ams_supplier");
        }
    }
}