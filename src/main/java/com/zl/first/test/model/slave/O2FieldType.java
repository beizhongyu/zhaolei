package com.zl.first.test.model.slave;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class O2FieldType implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.type_name")
    private String typeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.display_name")
    private String displayName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.isvisible")
    private Short isvisible;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.create_at")
    private Date createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.modify_at")
    private Date modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.version")
    private Integer version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    public O2FieldType withId(String id) {
        this.setId(id);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.id")
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.type_name")
    public String getTypeName() {
        return typeName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    public O2FieldType withTypeName(String typeName) {
        this.setTypeName(typeName);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.type_name")
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.display_name")
    public String getDisplayName() {
        return displayName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    public O2FieldType withDisplayName(String displayName) {
        this.setDisplayName(displayName);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.isvisible")
    public Short getIsvisible() {
        return isvisible;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    public O2FieldType withIsvisible(Short isvisible) {
        this.setIsvisible(isvisible);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.isvisible")
    public void setIsvisible(Short isvisible) {
        this.isvisible = isvisible;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.create_at")
    public Date getCreateAt() {
        return createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    public O2FieldType withCreateAt(Date createAt) {
        this.setCreateAt(createAt);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.create_at")
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.modify_at")
    public Date getModifyAt() {
        return modifyAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    public O2FieldType withModifyAt(Date modifyAt) {
        this.setModifyAt(modifyAt);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.modify_at")
    public void setModifyAt(Date modifyAt) {
        this.modifyAt = modifyAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.version")
    public Integer getVersion() {
        return version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    public O2FieldType withVersion(Integer version) {
        this.setVersion(version);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_field_type.version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
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
        O2FieldType other = (O2FieldType) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTypeName() == null ? other.getTypeName() == null : this.getTypeName().equals(other.getTypeName()))
            && (this.getDisplayName() == null ? other.getDisplayName() == null : this.getDisplayName().equals(other.getDisplayName()))
            && (this.getIsvisible() == null ? other.getIsvisible() == null : this.getIsvisible().equals(other.getIsvisible()))
            && (this.getCreateAt() == null ? other.getCreateAt() == null : this.getCreateAt().equals(other.getCreateAt()))
            && (this.getModifyAt() == null ? other.getModifyAt() == null : this.getModifyAt().equals(other.getModifyAt()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        result = prime * result + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        result = prime * result + ((getIsvisible() == null) ? 0 : getIsvisible().hashCode());
        result = prime * result + ((getCreateAt() == null) ? 0 : getCreateAt().hashCode());
        result = prime * result + ((getModifyAt() == null) ? 0 : getModifyAt().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_field_type")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typeName=").append(typeName);
        sb.append(", displayName=").append(displayName);
        sb.append(", isvisible=").append(isvisible);
        sb.append(", createAt=").append(createAt);
        sb.append(", modifyAt=").append(modifyAt);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}