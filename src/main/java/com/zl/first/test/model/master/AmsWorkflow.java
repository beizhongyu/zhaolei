package com.zl.first.test.model.master;

import java.io.Serializable;
import javax.annotation.Generated;

public class AmsWorkflow implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.data_info")
    private String dataInfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.start_person")
    private String startPerson;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.end_person")
    private String endPerson;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.create_time")
    private Long createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.modify_time")
    private Long modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.version")
    private Integer version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.extra")
    private String extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.is_valite")
    private Integer isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    public AmsWorkflow withId(String id) {
        this.setId(id);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.id")
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    public AmsWorkflow withName(String name) {
        this.setName(name);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.data_info")
    public String getDataInfo() {
        return dataInfo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    public AmsWorkflow withDataInfo(String dataInfo) {
        this.setDataInfo(dataInfo);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.data_info")
    public void setDataInfo(String dataInfo) {
        this.dataInfo = dataInfo == null ? null : dataInfo.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.start_person")
    public String getStartPerson() {
        return startPerson;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    public AmsWorkflow withStartPerson(String startPerson) {
        this.setStartPerson(startPerson);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.start_person")
    public void setStartPerson(String startPerson) {
        this.startPerson = startPerson == null ? null : startPerson.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.end_person")
    public String getEndPerson() {
        return endPerson;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    public AmsWorkflow withEndPerson(String endPerson) {
        this.setEndPerson(endPerson);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.end_person")
    public void setEndPerson(String endPerson) {
        this.endPerson = endPerson == null ? null : endPerson.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.create_time")
    public Long getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    public AmsWorkflow withCreateTime(Long createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.create_time")
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.modify_time")
    public Long getModifyTime() {
        return modifyTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    public AmsWorkflow withModifyTime(Long modifyTime) {
        this.setModifyTime(modifyTime);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.modify_time")
    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.version")
    public Integer getVersion() {
        return version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    public AmsWorkflow withVersion(Integer version) {
        this.setVersion(version);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.extra")
    public String getExtra() {
        return extra;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    public AmsWorkflow withExtra(String extra) {
        this.setExtra(extra);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.extra")
    public void setExtra(String extra) {
        this.extra = extra == null ? null : extra.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.is_valite")
    public Integer getIsValite() {
        return isValite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    public AmsWorkflow withIsValite(Integer isValite) {
        this.setIsValite(isValite);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_workflow.is_valite")
    public void setIsValite(Integer isValite) {
        this.isValite = isValite;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
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
        AmsWorkflow other = (AmsWorkflow) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDataInfo() == null ? other.getDataInfo() == null : this.getDataInfo().equals(other.getDataInfo()))
            && (this.getStartPerson() == null ? other.getStartPerson() == null : this.getStartPerson().equals(other.getStartPerson()))
            && (this.getEndPerson() == null ? other.getEndPerson() == null : this.getEndPerson().equals(other.getEndPerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getExtra() == null ? other.getExtra() == null : this.getExtra().equals(other.getExtra()))
            && (this.getIsValite() == null ? other.getIsValite() == null : this.getIsValite().equals(other.getIsValite()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDataInfo() == null) ? 0 : getDataInfo().hashCode());
        result = prime * result + ((getStartPerson() == null) ? 0 : getStartPerson().hashCode());
        result = prime * result + ((getEndPerson() == null) ? 0 : getEndPerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getExtra() == null) ? 0 : getExtra().hashCode());
        result = prime * result + ((getIsValite() == null) ? 0 : getIsValite().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_workflow")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", dataInfo=").append(dataInfo);
        sb.append(", startPerson=").append(startPerson);
        sb.append(", endPerson=").append(endPerson);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", version=").append(version);
        sb.append(", extra=").append(extra);
        sb.append(", isValite=").append(isValite);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}