package com.zl.first.test.model.slave;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import javax.annotation.Generated;

public class O2Application implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.client_id")
    private String clientId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.category_id")
    private String categoryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.display_name")
    private String displayName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.description")
    private String description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.url")
    private String url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.status")
    private String status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.note")
    private String note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.create_at")
    private Date createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.modify_at")
    private Date modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.version")
    private Integer version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.logo")
    private byte[] logo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    public O2Application withId(String id) {
        this.setId(id);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.id")
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.client_id")
    public String getClientId() {
        return clientId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    public O2Application withClientId(String clientId) {
        this.setClientId(clientId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.client_id")
    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.category_id")
    public String getCategoryId() {
        return categoryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    public O2Application withCategoryId(String categoryId) {
        this.setCategoryId(categoryId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.category_id")
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.display_name")
    public String getDisplayName() {
        return displayName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    public O2Application withDisplayName(String displayName) {
        this.setDisplayName(displayName);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.description")
    public String getDescription() {
        return description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    public O2Application withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.description")
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.url")
    public String getUrl() {
        return url;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    public O2Application withUrl(String url) {
        this.setUrl(url);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.url")
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.status")
    public String getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    public O2Application withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.status")
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.note")
    public String getNote() {
        return note;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    public O2Application withNote(String note) {
        this.setNote(note);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.note")
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.create_at")
    public Date getCreateAt() {
        return createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    public O2Application withCreateAt(Date createAt) {
        this.setCreateAt(createAt);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.create_at")
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.modify_at")
    public Date getModifyAt() {
        return modifyAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    public O2Application withModifyAt(Date modifyAt) {
        this.setModifyAt(modifyAt);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.modify_at")
    public void setModifyAt(Date modifyAt) {
        this.modifyAt = modifyAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.version")
    public Integer getVersion() {
        return version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    public O2Application withVersion(Integer version) {
        this.setVersion(version);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.logo")
    public byte[] getLogo() {
        return logo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    public O2Application withLogo(byte[] logo) {
        this.setLogo(logo);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_application.logo")
    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
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
        O2Application other = (O2Application) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getDisplayName() == null ? other.getDisplayName() == null : this.getDisplayName().equals(other.getDisplayName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getCreateAt() == null ? other.getCreateAt() == null : this.getCreateAt().equals(other.getCreateAt()))
            && (this.getModifyAt() == null ? other.getModifyAt() == null : this.getModifyAt().equals(other.getModifyAt()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (Arrays.equals(this.getLogo(), other.getLogo()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getClientId() == null) ? 0 : getClientId().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getCreateAt() == null) ? 0 : getCreateAt().hashCode());
        result = prime * result + ((getModifyAt() == null) ? 0 : getModifyAt().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + (Arrays.hashCode(getLogo()));
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_application")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", clientId=").append(clientId);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", displayName=").append(displayName);
        sb.append(", description=").append(description);
        sb.append(", url=").append(url);
        sb.append(", status=").append(status);
        sb.append(", note=").append(note);
        sb.append(", createAt=").append(createAt);
        sb.append(", modifyAt=").append(modifyAt);
        sb.append(", version=").append(version);
        sb.append(", logo=").append(logo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}