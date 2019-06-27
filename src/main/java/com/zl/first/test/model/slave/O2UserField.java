package com.zl.first.test.model.slave;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class O2UserField implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.field_name")
    private String fieldName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.display_name")
    private String displayName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.category_id")
    private String categoryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.sort")
    private Integer sort;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.type_id")
    private String typeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.not_null")
    private Short notNull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.isonly")
    private String isonly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.isvisible")
    private Short isvisible;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.ismodify")
    private Short ismodify;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.iseditable")
    private Short iseditable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.searchable")
    private Short searchable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.property")
    private String property;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.status")
    private String status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.create_at")
    private Date createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.modify_at")
    private Date modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.version")
    private Integer version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.extra")
    private String extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public O2UserField withId(String id) {
        this.setId(id);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.id")
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.field_name")
    public String getFieldName() {
        return fieldName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public O2UserField withFieldName(String fieldName) {
        this.setFieldName(fieldName);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.field_name")
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.display_name")
    public String getDisplayName() {
        return displayName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public O2UserField withDisplayName(String displayName) {
        this.setDisplayName(displayName);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.category_id")
    public String getCategoryId() {
        return categoryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public O2UserField withCategoryId(String categoryId) {
        this.setCategoryId(categoryId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.category_id")
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.sort")
    public Integer getSort() {
        return sort;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public O2UserField withSort(Integer sort) {
        this.setSort(sort);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.sort")
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.type_id")
    public String getTypeId() {
        return typeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public O2UserField withTypeId(String typeId) {
        this.setTypeId(typeId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.type_id")
    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.not_null")
    public Short getNotNull() {
        return notNull;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public O2UserField withNotNull(Short notNull) {
        this.setNotNull(notNull);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.not_null")
    public void setNotNull(Short notNull) {
        this.notNull = notNull;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.isonly")
    public String getIsonly() {
        return isonly;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public O2UserField withIsonly(String isonly) {
        this.setIsonly(isonly);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.isonly")
    public void setIsonly(String isonly) {
        this.isonly = isonly == null ? null : isonly.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.isvisible")
    public Short getIsvisible() {
        return isvisible;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public O2UserField withIsvisible(Short isvisible) {
        this.setIsvisible(isvisible);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.isvisible")
    public void setIsvisible(Short isvisible) {
        this.isvisible = isvisible;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.ismodify")
    public Short getIsmodify() {
        return ismodify;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public O2UserField withIsmodify(Short ismodify) {
        this.setIsmodify(ismodify);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.ismodify")
    public void setIsmodify(Short ismodify) {
        this.ismodify = ismodify;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.iseditable")
    public Short getIseditable() {
        return iseditable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public O2UserField withIseditable(Short iseditable) {
        this.setIseditable(iseditable);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.iseditable")
    public void setIseditable(Short iseditable) {
        this.iseditable = iseditable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.searchable")
    public Short getSearchable() {
        return searchable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public O2UserField withSearchable(Short searchable) {
        this.setSearchable(searchable);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.searchable")
    public void setSearchable(Short searchable) {
        this.searchable = searchable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.property")
    public String getProperty() {
        return property;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public O2UserField withProperty(String property) {
        this.setProperty(property);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.property")
    public void setProperty(String property) {
        this.property = property == null ? null : property.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.status")
    public String getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public O2UserField withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.status")
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.create_at")
    public Date getCreateAt() {
        return createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public O2UserField withCreateAt(Date createAt) {
        this.setCreateAt(createAt);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.create_at")
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.modify_at")
    public Date getModifyAt() {
        return modifyAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public O2UserField withModifyAt(Date modifyAt) {
        this.setModifyAt(modifyAt);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.modify_at")
    public void setModifyAt(Date modifyAt) {
        this.modifyAt = modifyAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.version")
    public Integer getVersion() {
        return version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public O2UserField withVersion(Integer version) {
        this.setVersion(version);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.extra")
    public String getExtra() {
        return extra;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public O2UserField withExtra(String extra) {
        this.setExtra(extra);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_user_field.extra")
    public void setExtra(String extra) {
        this.extra = extra == null ? null : extra.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
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
        O2UserField other = (O2UserField) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFieldName() == null ? other.getFieldName() == null : this.getFieldName().equals(other.getFieldName()))
            && (this.getDisplayName() == null ? other.getDisplayName() == null : this.getDisplayName().equals(other.getDisplayName()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getNotNull() == null ? other.getNotNull() == null : this.getNotNull().equals(other.getNotNull()))
            && (this.getIsonly() == null ? other.getIsonly() == null : this.getIsonly().equals(other.getIsonly()))
            && (this.getIsvisible() == null ? other.getIsvisible() == null : this.getIsvisible().equals(other.getIsvisible()))
            && (this.getIsmodify() == null ? other.getIsmodify() == null : this.getIsmodify().equals(other.getIsmodify()))
            && (this.getIseditable() == null ? other.getIseditable() == null : this.getIseditable().equals(other.getIseditable()))
            && (this.getSearchable() == null ? other.getSearchable() == null : this.getSearchable().equals(other.getSearchable()))
            && (this.getProperty() == null ? other.getProperty() == null : this.getProperty().equals(other.getProperty()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateAt() == null ? other.getCreateAt() == null : this.getCreateAt().equals(other.getCreateAt()))
            && (this.getModifyAt() == null ? other.getModifyAt() == null : this.getModifyAt().equals(other.getModifyAt()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getExtra() == null ? other.getExtra() == null : this.getExtra().equals(other.getExtra()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFieldName() == null) ? 0 : getFieldName().hashCode());
        result = prime * result + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getNotNull() == null) ? 0 : getNotNull().hashCode());
        result = prime * result + ((getIsonly() == null) ? 0 : getIsonly().hashCode());
        result = prime * result + ((getIsvisible() == null) ? 0 : getIsvisible().hashCode());
        result = prime * result + ((getIsmodify() == null) ? 0 : getIsmodify().hashCode());
        result = prime * result + ((getIseditable() == null) ? 0 : getIseditable().hashCode());
        result = prime * result + ((getSearchable() == null) ? 0 : getSearchable().hashCode());
        result = prime * result + ((getProperty() == null) ? 0 : getProperty().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateAt() == null) ? 0 : getCreateAt().hashCode());
        result = prime * result + ((getModifyAt() == null) ? 0 : getModifyAt().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getExtra() == null) ? 0 : getExtra().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_user_field")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fieldName=").append(fieldName);
        sb.append(", displayName=").append(displayName);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", sort=").append(sort);
        sb.append(", typeId=").append(typeId);
        sb.append(", notNull=").append(notNull);
        sb.append(", isonly=").append(isonly);
        sb.append(", isvisible=").append(isvisible);
        sb.append(", ismodify=").append(ismodify);
        sb.append(", iseditable=").append(iseditable);
        sb.append(", searchable=").append(searchable);
        sb.append(", property=").append(property);
        sb.append(", status=").append(status);
        sb.append(", createAt=").append(createAt);
        sb.append(", modifyAt=").append(modifyAt);
        sb.append(", version=").append(version);
        sb.append(", extra=").append(extra);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}