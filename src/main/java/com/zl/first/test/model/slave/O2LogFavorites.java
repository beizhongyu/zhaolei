package com.zl.first.test.model.slave;

import java.io.Serializable;
import javax.annotation.Generated;

public class O2LogFavorites implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.user_id")
    private String userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.app_id")
    private String appId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.kind")
    private Byte kind;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.is_valid")
    private Byte isValid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.create_time")
    private Long createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.op_time")
    private Long opTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.last_ver")
    private Integer lastVer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    public O2LogFavorites withId(String id) {
        this.setId(id);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.id")
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.user_id")
    public String getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    public O2LogFavorites withUserId(String userId) {
        this.setUserId(userId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.user_id")
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.app_id")
    public String getAppId() {
        return appId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    public O2LogFavorites withAppId(String appId) {
        this.setAppId(appId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.app_id")
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.kind")
    public Byte getKind() {
        return kind;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    public O2LogFavorites withKind(Byte kind) {
        this.setKind(kind);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.kind")
    public void setKind(Byte kind) {
        this.kind = kind;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.is_valid")
    public Byte getIsValid() {
        return isValid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    public O2LogFavorites withIsValid(Byte isValid) {
        this.setIsValid(isValid);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.is_valid")
    public void setIsValid(Byte isValid) {
        this.isValid = isValid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.create_time")
    public Long getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    public O2LogFavorites withCreateTime(Long createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.create_time")
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.op_time")
    public Long getOpTime() {
        return opTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    public O2LogFavorites withOpTime(Long opTime) {
        this.setOpTime(opTime);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.op_time")
    public void setOpTime(Long opTime) {
        this.opTime = opTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.last_ver")
    public Integer getLastVer() {
        return lastVer;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    public O2LogFavorites withLastVer(Integer lastVer) {
        this.setLastVer(lastVer);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_log_favorites.last_ver")
    public void setLastVer(Integer lastVer) {
        this.lastVer = lastVer;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
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
        O2LogFavorites other = (O2LogFavorites) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()))
            && (this.getKind() == null ? other.getKind() == null : this.getKind().equals(other.getKind()))
            && (this.getIsValid() == null ? other.getIsValid() == null : this.getIsValid().equals(other.getIsValid()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getOpTime() == null ? other.getOpTime() == null : this.getOpTime().equals(other.getOpTime()))
            && (this.getLastVer() == null ? other.getLastVer() == null : this.getLastVer().equals(other.getLastVer()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getAppId() == null) ? 0 : getAppId().hashCode());
        result = prime * result + ((getKind() == null) ? 0 : getKind().hashCode());
        result = prime * result + ((getIsValid() == null) ? 0 : getIsValid().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getOpTime() == null) ? 0 : getOpTime().hashCode());
        result = prime * result + ((getLastVer() == null) ? 0 : getLastVer().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_log_favorites")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", appId=").append(appId);
        sb.append(", kind=").append(kind);
        sb.append(", isValid=").append(isValid);
        sb.append(", createTime=").append(createTime);
        sb.append(", opTime=").append(opTime);
        sb.append(", lastVer=").append(lastVer);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}