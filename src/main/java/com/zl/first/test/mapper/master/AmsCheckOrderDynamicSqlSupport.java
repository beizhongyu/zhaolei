package com.zl.first.test.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AmsCheckOrderDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    public static final AmsCheckOrder amsCheckOrder = new AmsCheckOrder();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_order.id")
    public static final SqlColumn<String> id = amsCheckOrder.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_order.check_id")
    public static final SqlColumn<String> checkId = amsCheckOrder.checkId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_order.category")
    public static final SqlColumn<String> category = amsCheckOrder.category;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_order.dept_id")
    public static final SqlColumn<String> deptId = amsCheckOrder.deptId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_order.user_id")
    public static final SqlColumn<String> userId = amsCheckOrder.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_order.startTime")
    public static final SqlColumn<Long> starttime = amsCheckOrder.starttime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_order.finishTime")
    public static final SqlColumn<Long> finishtime = amsCheckOrder.finishtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_order.status")
    public static final SqlColumn<Integer> status = amsCheckOrder.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_order.reason")
    public static final SqlColumn<String> reason = amsCheckOrder.reason;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_order.is_valite")
    public static final SqlColumn<Integer> isValite = amsCheckOrder.isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_order.create_time")
    public static final SqlColumn<Long> createTime = amsCheckOrder.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_order.modify_time")
    public static final SqlColumn<Long> modifyTime = amsCheckOrder.modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_check_order.version")
    public static final SqlColumn<Integer> version = amsCheckOrder.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_check_order")
    public static final class AmsCheckOrder extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> checkId = column("check_id", JDBCType.VARCHAR);

        public final SqlColumn<String> category = column("category", JDBCType.VARCHAR);

        public final SqlColumn<String> deptId = column("dept_id", JDBCType.VARCHAR);

        public final SqlColumn<String> userId = column("user_id", JDBCType.VARCHAR);

        public final SqlColumn<Long> starttime = column("startTime", JDBCType.BIGINT);

        public final SqlColumn<Long> finishtime = column("finishTime", JDBCType.BIGINT);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<String> reason = column("reason", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isValite = column("is_valite", JDBCType.INTEGER);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyTime = column("modify_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public AmsCheckOrder() {
            super("ams_check_order");
        }
    }
}