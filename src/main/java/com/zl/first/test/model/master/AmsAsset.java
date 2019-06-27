package com.zl.first.test.model.master;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class AmsAsset implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.asset_code")
    private String assetCode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.products_id")
    private String productsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.brand_id")
    private String brandId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.manufacture_id")
    private String manufactureId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.spec_id")
    private String specId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.buy_time")
    private Long buyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.use_time")
    private Long useTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.return_time")
    private Long returnTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.price")
    private BigDecimal price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.now_price")
    private BigDecimal nowPrice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.use_long")
    private String useLong;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.depre_rate")
    private String depreRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.person")
    private String person;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.warehouse_id")
    private String warehouseId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.person_position")
    private String personPosition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.asset_status")
    private Integer assetStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.note")
    private String note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.is_valite")
    private Integer isValite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.create_time")
    private Long createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.modify_time")
    private Long modifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.version")
    private Integer version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.extra")
    private String extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.company")
    private String company;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.num")
    private Integer num;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.supplier")
    private String supplier;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.belone")
    private String belone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withId(String id) {
        this.setId(id);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.id")
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.asset_code")
    public String getAssetCode() {
        return assetCode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withAssetCode(String assetCode) {
        this.setAssetCode(assetCode);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.asset_code")
    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode == null ? null : assetCode.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.products_id")
    public String getProductsId() {
        return productsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withProductsId(String productsId) {
        this.setProductsId(productsId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.products_id")
    public void setProductsId(String productsId) {
        this.productsId = productsId == null ? null : productsId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.brand_id")
    public String getBrandId() {
        return brandId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withBrandId(String brandId) {
        this.setBrandId(brandId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.brand_id")
    public void setBrandId(String brandId) {
        this.brandId = brandId == null ? null : brandId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.manufacture_id")
    public String getManufactureId() {
        return manufactureId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withManufactureId(String manufactureId) {
        this.setManufactureId(manufactureId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.manufacture_id")
    public void setManufactureId(String manufactureId) {
        this.manufactureId = manufactureId == null ? null : manufactureId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.spec_id")
    public String getSpecId() {
        return specId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withSpecId(String specId) {
        this.setSpecId(specId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.spec_id")
    public void setSpecId(String specId) {
        this.specId = specId == null ? null : specId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.buy_time")
    public Long getBuyTime() {
        return buyTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withBuyTime(Long buyTime) {
        this.setBuyTime(buyTime);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.buy_time")
    public void setBuyTime(Long buyTime) {
        this.buyTime = buyTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.use_time")
    public Long getUseTime() {
        return useTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withUseTime(Long useTime) {
        this.setUseTime(useTime);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.use_time")
    public void setUseTime(Long useTime) {
        this.useTime = useTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.return_time")
    public Long getReturnTime() {
        return returnTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withReturnTime(Long returnTime) {
        this.setReturnTime(returnTime);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.return_time")
    public void setReturnTime(Long returnTime) {
        this.returnTime = returnTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.price")
    public BigDecimal getPrice() {
        return price;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withPrice(BigDecimal price) {
        this.setPrice(price);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.price")
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.now_price")
    public BigDecimal getNowPrice() {
        return nowPrice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withNowPrice(BigDecimal nowPrice) {
        this.setNowPrice(nowPrice);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.now_price")
    public void setNowPrice(BigDecimal nowPrice) {
        this.nowPrice = nowPrice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.use_long")
    public String getUseLong() {
        return useLong;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withUseLong(String useLong) {
        this.setUseLong(useLong);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.use_long")
    public void setUseLong(String useLong) {
        this.useLong = useLong == null ? null : useLong.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.depre_rate")
    public String getDepreRate() {
        return depreRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withDepreRate(String depreRate) {
        this.setDepreRate(depreRate);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.depre_rate")
    public void setDepreRate(String depreRate) {
        this.depreRate = depreRate == null ? null : depreRate.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.person")
    public String getPerson() {
        return person;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withPerson(String person) {
        this.setPerson(person);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.person")
    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.warehouse_id")
    public String getWarehouseId() {
        return warehouseId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withWarehouseId(String warehouseId) {
        this.setWarehouseId(warehouseId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.warehouse_id")
    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId == null ? null : warehouseId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.person_position")
    public String getPersonPosition() {
        return personPosition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withPersonPosition(String personPosition) {
        this.setPersonPosition(personPosition);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.person_position")
    public void setPersonPosition(String personPosition) {
        this.personPosition = personPosition == null ? null : personPosition.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.asset_status")
    public Integer getAssetStatus() {
        return assetStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withAssetStatus(Integer assetStatus) {
        this.setAssetStatus(assetStatus);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.asset_status")
    public void setAssetStatus(Integer assetStatus) {
        this.assetStatus = assetStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.note")
    public String getNote() {
        return note;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withNote(String note) {
        this.setNote(note);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.note")
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.is_valite")
    public Integer getIsValite() {
        return isValite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withIsValite(Integer isValite) {
        this.setIsValite(isValite);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.is_valite")
    public void setIsValite(Integer isValite) {
        this.isValite = isValite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.create_time")
    public Long getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withCreateTime(Long createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.create_time")
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.modify_time")
    public Long getModifyTime() {
        return modifyTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withModifyTime(Long modifyTime) {
        this.setModifyTime(modifyTime);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.modify_time")
    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.version")
    public Integer getVersion() {
        return version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withVersion(Integer version) {
        this.setVersion(version);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.extra")
    public String getExtra() {
        return extra;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withExtra(String extra) {
        this.setExtra(extra);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.extra")
    public void setExtra(String extra) {
        this.extra = extra == null ? null : extra.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.company")
    public String getCompany() {
        return company;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withCompany(String company) {
        this.setCompany(company);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.company")
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.num")
    public Integer getNum() {
        return num;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withNum(Integer num) {
        this.setNum(num);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.num")
    public void setNum(Integer num) {
        this.num = num;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.supplier")
    public String getSupplier() {
        return supplier;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withSupplier(String supplier) {
        this.setSupplier(supplier);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.supplier")
    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.belone")
    public String getBelone() {
        return belone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public AmsAsset withBelone(String belone) {
        this.setBelone(belone);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ams_asset.belone")
    public void setBelone(String belone) {
        this.belone = belone == null ? null : belone.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
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
        AmsAsset other = (AmsAsset) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAssetCode() == null ? other.getAssetCode() == null : this.getAssetCode().equals(other.getAssetCode()))
            && (this.getProductsId() == null ? other.getProductsId() == null : this.getProductsId().equals(other.getProductsId()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getManufactureId() == null ? other.getManufactureId() == null : this.getManufactureId().equals(other.getManufactureId()))
            && (this.getSpecId() == null ? other.getSpecId() == null : this.getSpecId().equals(other.getSpecId()))
            && (this.getBuyTime() == null ? other.getBuyTime() == null : this.getBuyTime().equals(other.getBuyTime()))
            && (this.getUseTime() == null ? other.getUseTime() == null : this.getUseTime().equals(other.getUseTime()))
            && (this.getReturnTime() == null ? other.getReturnTime() == null : this.getReturnTime().equals(other.getReturnTime()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getNowPrice() == null ? other.getNowPrice() == null : this.getNowPrice().equals(other.getNowPrice()))
            && (this.getUseLong() == null ? other.getUseLong() == null : this.getUseLong().equals(other.getUseLong()))
            && (this.getDepreRate() == null ? other.getDepreRate() == null : this.getDepreRate().equals(other.getDepreRate()))
            && (this.getPerson() == null ? other.getPerson() == null : this.getPerson().equals(other.getPerson()))
            && (this.getWarehouseId() == null ? other.getWarehouseId() == null : this.getWarehouseId().equals(other.getWarehouseId()))
            && (this.getPersonPosition() == null ? other.getPersonPosition() == null : this.getPersonPosition().equals(other.getPersonPosition()))
            && (this.getAssetStatus() == null ? other.getAssetStatus() == null : this.getAssetStatus().equals(other.getAssetStatus()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getIsValite() == null ? other.getIsValite() == null : this.getIsValite().equals(other.getIsValite()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getExtra() == null ? other.getExtra() == null : this.getExtra().equals(other.getExtra()))
            && (this.getCompany() == null ? other.getCompany() == null : this.getCompany().equals(other.getCompany()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getSupplier() == null ? other.getSupplier() == null : this.getSupplier().equals(other.getSupplier()))
            && (this.getBelone() == null ? other.getBelone() == null : this.getBelone().equals(other.getBelone()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAssetCode() == null) ? 0 : getAssetCode().hashCode());
        result = prime * result + ((getProductsId() == null) ? 0 : getProductsId().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getManufactureId() == null) ? 0 : getManufactureId().hashCode());
        result = prime * result + ((getSpecId() == null) ? 0 : getSpecId().hashCode());
        result = prime * result + ((getBuyTime() == null) ? 0 : getBuyTime().hashCode());
        result = prime * result + ((getUseTime() == null) ? 0 : getUseTime().hashCode());
        result = prime * result + ((getReturnTime() == null) ? 0 : getReturnTime().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getNowPrice() == null) ? 0 : getNowPrice().hashCode());
        result = prime * result + ((getUseLong() == null) ? 0 : getUseLong().hashCode());
        result = prime * result + ((getDepreRate() == null) ? 0 : getDepreRate().hashCode());
        result = prime * result + ((getPerson() == null) ? 0 : getPerson().hashCode());
        result = prime * result + ((getWarehouseId() == null) ? 0 : getWarehouseId().hashCode());
        result = prime * result + ((getPersonPosition() == null) ? 0 : getPersonPosition().hashCode());
        result = prime * result + ((getAssetStatus() == null) ? 0 : getAssetStatus().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getIsValite() == null) ? 0 : getIsValite().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getExtra() == null) ? 0 : getExtra().hashCode());
        result = prime * result + ((getCompany() == null) ? 0 : getCompany().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getSupplier() == null) ? 0 : getSupplier().hashCode());
        result = prime * result + ((getBelone() == null) ? 0 : getBelone().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ams_asset")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", assetCode=").append(assetCode);
        sb.append(", productsId=").append(productsId);
        sb.append(", brandId=").append(brandId);
        sb.append(", manufactureId=").append(manufactureId);
        sb.append(", specId=").append(specId);
        sb.append(", buyTime=").append(buyTime);
        sb.append(", useTime=").append(useTime);
        sb.append(", returnTime=").append(returnTime);
        sb.append(", price=").append(price);
        sb.append(", nowPrice=").append(nowPrice);
        sb.append(", useLong=").append(useLong);
        sb.append(", depreRate=").append(depreRate);
        sb.append(", person=").append(person);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", personPosition=").append(personPosition);
        sb.append(", assetStatus=").append(assetStatus);
        sb.append(", note=").append(note);
        sb.append(", isValite=").append(isValite);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", version=").append(version);
        sb.append(", extra=").append(extra);
        sb.append(", company=").append(company);
        sb.append(", num=").append(num);
        sb.append(", supplier=").append(supplier);
        sb.append(", belone=").append(belone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}