package com.zl.first.test.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AmsPrinterDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    public static final AmsPrinter amsPrinter = new AmsPrinter();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.id")
    public static final SqlColumn<String> id = amsPrinter.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.company_id")
    public static final SqlColumn<String> companyId = amsPrinter.companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.name")
    public static final SqlColumn<String> name = amsPrinter.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.brand_id")
    public static final SqlColumn<String> brandId = amsPrinter.brandId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.manufacture_id")
    public static final SqlColumn<String> manufactureId = amsPrinter.manufactureId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.address")
    public static final SqlColumn<String> address = amsPrinter.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.note")
    public static final SqlColumn<String> note = amsPrinter.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.is_valite")
    public static final SqlColumn<Integer> isValite = amsPrinter.isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.create_time")
    public static final SqlColumn<Long> createTime = amsPrinter.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.modify_time")
    public static final SqlColumn<Long> modifyTime = amsPrinter.modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.version")
    public static final SqlColumn<Integer> version = amsPrinter.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.extra")
    public static final SqlColumn<String> extra = amsPrinter.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    public static final class AmsPrinter extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> companyId = column("company_id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> brandId = column("brand_id", JDBCType.VARCHAR);

        public final SqlColumn<String> manufactureId = column("manufacture_id", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isValite = column("is_valite", JDBCType.INTEGER);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyTime = column("modify_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public final SqlColumn<String> extra = column("extra", JDBCType.VARCHAR);

        public AmsPrinter() {
            super("ams_printer");
        }
    }
}