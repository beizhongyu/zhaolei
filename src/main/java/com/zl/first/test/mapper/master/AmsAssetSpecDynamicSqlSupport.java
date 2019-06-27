package com.zl.first.test.mapper.master;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AmsAssetSpecDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_spec")
    public static final AmsAssetSpec amsAssetSpec = new AmsAssetSpec();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_spec.id")
    public static final SqlColumn<String> id = amsAssetSpec.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_spec.manufacture_id")
    public static final SqlColumn<String> manufactureId = amsAssetSpec.manufactureId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_spec.spec")
    public static final SqlColumn<String> spec = amsAssetSpec.spec;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_spec.is_valite")
    public static final SqlColumn<Integer> isValite = amsAssetSpec.isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_spec.create_time")
    public static final SqlColumn<Long> createTime = amsAssetSpec.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_spec.modify_time")
    public static final SqlColumn<Long> modifyTime = amsAssetSpec.modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_spec.version")
    public static final SqlColumn<Integer> version = amsAssetSpec.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_spec")
    public static final class AmsAssetSpec extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> manufactureId = column("manufacture_id", JDBCType.VARCHAR);

        public final SqlColumn<String> spec = column("spec", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isValite = column("is_valite", JDBCType.INTEGER);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> modifyTime = column("modify_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);

        public AmsAssetSpec() {
            super("ams_asset_spec");
        }
    }
}