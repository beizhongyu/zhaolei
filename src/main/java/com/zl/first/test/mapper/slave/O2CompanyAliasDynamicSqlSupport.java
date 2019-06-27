package com.zl.first.test.mapper.slave;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class O2CompanyAliasDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    public static final O2CompanyAlias o2CompanyAlias = new O2CompanyAlias();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.id")
    public static final SqlColumn<String> id = o2CompanyAlias.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.alias")
    public static final SqlColumn<String> alias = o2CompanyAlias.alias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.company_id")
    public static final SqlColumn<String> companyId = o2CompanyAlias.companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.create_at")
    public static final SqlColumn<Date> createAt = o2CompanyAlias.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.modify_at")
    public static final SqlColumn<Date> modifyAt = o2CompanyAlias.modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.version")
    public static final SqlColumn<Integer> version = o2CompanyAlias.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    public static final class O2CompanyAlias extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> alias = column("alias", JDBCType.VARCHAR);

        public final SqlColumn<String> companyId = column("company_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyAt = column("modify_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public O2CompanyAlias() {
            super("o2_company_alias");
        }
    }
}