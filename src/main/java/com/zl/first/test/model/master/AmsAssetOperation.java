package com.zl.first.test.model.master;

import java.io.Serializable;
import javax.annotation.Generated;

public class AmsAssetOperation implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.asset_id")
    private String assetId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.category")
    private Integer category;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.reason")
    private String reason;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.time")
    private Long time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.start_person")
    private String startPerson;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.handle_person")
    private String handlePerson;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.note")
    private String note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.is_valite")
    private Integer isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.create_time")
    private Long createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.modify_time")
    private Long modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.version")
    private Integer version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.extra")
    private String extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    public AmsAssetOperation withId(String id) {
        this.setId(id);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.id")
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.asset_id")
    public String getAssetId() {
        return assetId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    public AmsAssetOperation withAssetId(String assetId) {
        this.setAssetId(assetId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.asset_id")
    public void setAssetId(String assetId) {
        this.assetId = assetId == null ? null : assetId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.category")
    public Integer getCategory() {
        return category;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    public AmsAssetOperation withCategory(Integer category) {
        this.setCategory(category);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.category")
    public void setCategory(Integer category) {
        this.category = category;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.reason")
    public String getReason() {
        return reason;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    public AmsAssetOperation withReason(String reason) {
        this.setReason(reason);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.reason")
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.time")
    public Long getTime() {
        return time;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    public AmsAssetOperation withTime(Long time) {
        this.setTime(time);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.time")
    public void setTime(Long time) {
        this.time = time;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.start_person")
    public String getStartPerson() {
        return startPerson;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    public AmsAssetOperation withStartPerson(String startPerson) {
        this.setStartPerson(startPerson);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.start_person")
    public void setStartPerson(String startPerson) {
        this.startPerson = startPerson == null ? null : startPerson.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.handle_person")
    public String getHandlePerson() {
        return handlePerson;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    public AmsAssetOperation withHandlePerson(String handlePerson) {
        this.setHandlePerson(handlePerson);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.handle_person")
    public void setHandlePerson(String handlePerson) {
        this.handlePerson = handlePerson == null ? null : handlePerson.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.note")
    public String getNote() {
        return note;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    public AmsAssetOperation withNote(String note) {
        this.setNote(note);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.note")
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.is_valite")
    public Integer getIsValite() {
        return isValite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    public AmsAssetOperation withIsValite(Integer isValite) {
        this.setIsValite(isValite);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.is_valite")
    public void setIsValite(Integer isValite) {
        this.isValite = isValite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.create_time")
    public Long getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    public AmsAssetOperation withCreateTime(Long createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.create_time")
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.modify_time")
    public Long getModifyTime() {
        return modifyTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    public AmsAssetOperation withModifyTime(Long modifyTime) {
        this.setModifyTime(modifyTime);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.modify_time")
    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.version")
    public Integer getVersion() {
        return version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    public AmsAssetOperation withVersion(Integer version) {
        this.setVersion(version);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.extra")
    public String getExtra() {
        return extra;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    public AmsAssetOperation withExtra(String extra) {
        this.setExtra(extra);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset_operation.extra")
    public void setExtra(String extra) {
        this.extra = extra == null ? null : extra.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
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
        AmsAssetOperation other = (AmsAssetOperation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAssetId() == null ? other.getAssetId() == null : this.getAssetId().equals(other.getAssetId()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getStartPerson() == null ? other.getStartPerson() == null : this.getStartPerson().equals(other.getStartPerson()))
            && (this.getHandlePerson() == null ? other.getHandlePerson() == null : this.getHandlePerson().equals(other.getHandlePerson()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getIsValite() == null ? other.getIsValite() == null : this.getIsValite().equals(other.getIsValite()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getExtra() == null ? other.getExtra() == null : this.getExtra().equals(other.getExtra()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getStartPerson() == null) ? 0 : getStartPerson().hashCode());
        result = prime * result + ((getHandlePerson() == null) ? 0 : getHandlePerson().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getIsValite() == null) ? 0 : getIsValite().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getExtra() == null) ? 0 : getExtra().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset_operation")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", assetId=").append(assetId);
        sb.append(", category=").append(category);
        sb.append(", reason=").append(reason);
        sb.append(", time=").append(time);
        sb.append(", startPerson=").append(startPerson);
        sb.append(", handlePerson=").append(handlePerson);
        sb.append(", note=").append(note);
        sb.append(", isValite=").append(isValite);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", version=").append(version);
        sb.append(", extra=").append(extra);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}