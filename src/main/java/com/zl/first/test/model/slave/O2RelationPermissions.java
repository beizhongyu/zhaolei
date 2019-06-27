package com.zl.first.test.model.slave;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class O2RelationPermissions implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.role_id")
    private String roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.child_id")
    private String childId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.create_at")
    private Date createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.modify_at")
    private Date modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.version")
    private Integer version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    public O2RelationPermissions withId(String id) {
        this.setId(id);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.id")
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.role_id")
    public String getRoleId() {
        return roleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    public O2RelationPermissions withRoleId(String roleId) {
        this.setRoleId(roleId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.role_id")
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.child_id")
    public String getChildId() {
        return childId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    public O2RelationPermissions withChildId(String childId) {
        this.setChildId(childId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.child_id")
    public void setChildId(String childId) {
        this.childId = childId == null ? null : childId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.create_at")
    public Date getCreateAt() {
        return createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    public O2RelationPermissions withCreateAt(Date createAt) {
        this.setCreateAt(createAt);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.create_at")
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.modify_at")
    public Date getModifyAt() {
        return modifyAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    public O2RelationPermissions withModifyAt(Date modifyAt) {
        this.setModifyAt(modifyAt);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.modify_at")
    public void setModifyAt(Date modifyAt) {
        this.modifyAt = modifyAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.version")
    public Integer getVersion() {
        return version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    public O2RelationPermissions withVersion(Integer version) {
        this.setVersion(version);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_relation_permissions.version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
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
        O2RelationPermissions other = (O2RelationPermissions) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getChildId() == null ? other.getChildId() == null : this.getChildId().equals(other.getChildId()))
            && (this.getCreateAt() == null ? other.getCreateAt() == null : this.getCreateAt().equals(other.getCreateAt()))
            && (this.getModifyAt() == null ? other.getModifyAt() == null : this.getModifyAt().equals(other.getModifyAt()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getChildId() == null) ? 0 : getChildId().hashCode());
        result = prime * result + ((getCreateAt() == null) ? 0 : getCreateAt().hashCode());
        result = prime * result + ((getModifyAt() == null) ? 0 : getModifyAt().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_relation_permissions")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", childId=").append(childId);
        sb.append(", createAt=").append(createAt);
        sb.append(", modifyAt=").append(modifyAt);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}