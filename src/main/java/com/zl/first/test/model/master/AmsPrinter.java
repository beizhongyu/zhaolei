package com.zl.first.test.model.master;

import java.io.Serializable;
import javax.annotation.Generated;

public class AmsPrinter implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.company_id")
    private String companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.brand_id")
    private String brandId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.manufacture_id")
    private String manufactureId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.address")
    private String address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.note")
    private String note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.is_valite")
    private Integer isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.create_time")
    private Long createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.modify_time")
    private Long modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.version")
    private Integer version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.extra")
    private String extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    public AmsPrinter withId(String id) {
        this.setId(id);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.id")
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.company_id")
    public String getCompanyId() {
        return companyId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    public AmsPrinter withCompanyId(String companyId) {
        this.setCompanyId(companyId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.company_id")
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    public AmsPrinter withName(String name) {
        this.setName(name);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.brand_id")
    public String getBrandId() {
        return brandId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    public AmsPrinter withBrandId(String brandId) {
        this.setBrandId(brandId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.brand_id")
    public void setBrandId(String brandId) {
        this.brandId = brandId == null ? null : brandId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.manufacture_id")
    public String getManufactureId() {
        return manufactureId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    public AmsPrinter withManufactureId(String manufactureId) {
        this.setManufactureId(manufactureId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.manufacture_id")
    public void setManufactureId(String manufactureId) {
        this.manufactureId = manufactureId == null ? null : manufactureId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.address")
    public String getAddress() {
        return address;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    public AmsPrinter withAddress(String address) {
        this.setAddress(address);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.address")
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.note")
    public String getNote() {
        return note;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    public AmsPrinter withNote(String note) {
        this.setNote(note);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.note")
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.is_valite")
    public Integer getIsValite() {
        return isValite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    public AmsPrinter withIsValite(Integer isValite) {
        this.setIsValite(isValite);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.is_valite")
    public void setIsValite(Integer isValite) {
        this.isValite = isValite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.create_time")
    public Long getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    public AmsPrinter withCreateTime(Long createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.create_time")
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.modify_time")
    public Long getModifyTime() {
        return modifyTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    public AmsPrinter withModifyTime(Long modifyTime) {
        this.setModifyTime(modifyTime);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.modify_time")
    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.version")
    public Integer getVersion() {
        return version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    public AmsPrinter withVersion(Integer version) {
        this.setVersion(version);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.extra")
    public String getExtra() {
        return extra;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    public AmsPrinter withExtra(String extra) {
        this.setExtra(extra);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_printer.extra")
    public void setExtra(String extra) {
        this.extra = extra == null ? null : extra.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
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
        AmsPrinter other = (AmsPrinter) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getManufactureId() == null ? other.getManufactureId() == null : this.getManufactureId().equals(other.getManufactureId()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getIsValite() == null ? other.getIsValite() == null : this.getIsValite().equals(other.getIsValite()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getExtra() == null ? other.getExtra() == null : this.getExtra().equals(other.getExtra()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getManufactureId() == null) ? 0 : getManufactureId().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getIsValite() == null) ? 0 : getIsValite().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getExtra() == null) ? 0 : getExtra().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_printer")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyId=").append(companyId);
        sb.append(", name=").append(name);
        sb.append(", brandId=").append(brandId);
        sb.append(", manufactureId=").append(manufactureId);
        sb.append(", address=").append(address);
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