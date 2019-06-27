package com.zl.first.test.model.slave;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class O2CompanyAlias implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.alias")
    private String alias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.company_id")
    private String companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.create_at")
    private Date createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.modify_at")
    private Date modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.version")
    private Integer version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    public O2CompanyAlias withId(String id) {
        this.setId(id);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.id")
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.alias")
    public String getAlias() {
        return alias;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    public O2CompanyAlias withAlias(String alias) {
        this.setAlias(alias);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.alias")
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.company_id")
    public String getCompanyId() {
        return companyId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    public O2CompanyAlias withCompanyId(String companyId) {
        this.setCompanyId(companyId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.company_id")
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.create_at")
    public Date getCreateAt() {
        return createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    public O2CompanyAlias withCreateAt(Date createAt) {
        this.setCreateAt(createAt);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.create_at")
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.modify_at")
    public Date getModifyAt() {
        return modifyAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    public O2CompanyAlias withModifyAt(Date modifyAt) {
        this.setModifyAt(modifyAt);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.modify_at")
    public void setModifyAt(Date modifyAt) {
        this.modifyAt = modifyAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.version")
    public Integer getVersion() {
        return version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    public O2CompanyAlias withVersion(Integer version) {
        this.setVersion(version);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company_alias.version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        O2CompanyAlias other = (O2CompanyAlias) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAlias() == null ? other.getAlias() == null : this.getAlias().equals(other.getAlias()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getCreateAt() == null ? other.getCreateAt() == null : this.getCreateAt().equals(other.getCreateAt()))
            && (this.getModifyAt() == null ? other.getModifyAt() == null : this.getModifyAt().equals(other.getModifyAt()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAlias() == null) ? 0 : getAlias().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getCreateAt() == null) ? 0 : getCreateAt().hashCode());
        result = prime * result + ((getModifyAt() == null) ? 0 : getModifyAt().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company_alias")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", alias=").append(alias);
        sb.append(", companyId=").append(companyId);
        sb.append(", createAt=").append(createAt);
        sb.append(", modifyAt=").append(modifyAt);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}