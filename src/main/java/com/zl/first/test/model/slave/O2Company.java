package com.zl.first.test.model.slave;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import javax.annotation.Generated;

public class O2Company implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.display_name")
    private String displayName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.city")
    private String city;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.address")
    private String address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.mail_suffix")
    private String mailSuffix;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.user_ding")
    private Short userDing;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.sync_ding")
    private Short syncDing;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.corp_id")
    private String corpId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.corps_ecret")
    private String corpsEcret;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.notice_ding")
    private Short noticeDing;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.agent_id")
    private String agentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.status")
    private String status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.create_at")
    private Date createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.modify_at")
    private Date modifyAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.version")
    private Integer version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.access_code")
    private String accessCode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.access_password")
    private String accessPassword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.group_id")
    private String groupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.app_key")
    private String appKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.app_secret")
    private String appSecret;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.use_mail")
    private Short useMail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.mail_group")
    private String mailGroup;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.logo")
    private byte[] logo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withId(String id) {
        this.setId(id);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.id")
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.display_name")
    public String getDisplayName() {
        return displayName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withDisplayName(String displayName) {
        this.setDisplayName(displayName);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.city")
    public String getCity() {
        return city;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withCity(String city) {
        this.setCity(city);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.city")
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.address")
    public String getAddress() {
        return address;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withAddress(String address) {
        this.setAddress(address);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.address")
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.mail_suffix")
    public String getMailSuffix() {
        return mailSuffix;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withMailSuffix(String mailSuffix) {
        this.setMailSuffix(mailSuffix);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.mail_suffix")
    public void setMailSuffix(String mailSuffix) {
        this.mailSuffix = mailSuffix == null ? null : mailSuffix.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.user_ding")
    public Short getUserDing() {
        return userDing;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withUserDing(Short userDing) {
        this.setUserDing(userDing);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.user_ding")
    public void setUserDing(Short userDing) {
        this.userDing = userDing;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.sync_ding")
    public Short getSyncDing() {
        return syncDing;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withSyncDing(Short syncDing) {
        this.setSyncDing(syncDing);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.sync_ding")
    public void setSyncDing(Short syncDing) {
        this.syncDing = syncDing;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.corp_id")
    public String getCorpId() {
        return corpId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withCorpId(String corpId) {
        this.setCorpId(corpId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.corp_id")
    public void setCorpId(String corpId) {
        this.corpId = corpId == null ? null : corpId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.corps_ecret")
    public String getCorpsEcret() {
        return corpsEcret;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withCorpsEcret(String corpsEcret) {
        this.setCorpsEcret(corpsEcret);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.corps_ecret")
    public void setCorpsEcret(String corpsEcret) {
        this.corpsEcret = corpsEcret == null ? null : corpsEcret.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.notice_ding")
    public Short getNoticeDing() {
        return noticeDing;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withNoticeDing(Short noticeDing) {
        this.setNoticeDing(noticeDing);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.notice_ding")
    public void setNoticeDing(Short noticeDing) {
        this.noticeDing = noticeDing;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.agent_id")
    public String getAgentId() {
        return agentId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withAgentId(String agentId) {
        this.setAgentId(agentId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.agent_id")
    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.status")
    public String getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.status")
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.create_at")
    public Date getCreateAt() {
        return createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withCreateAt(Date createAt) {
        this.setCreateAt(createAt);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.create_at")
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.modify_at")
    public Date getModifyAt() {
        return modifyAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withModifyAt(Date modifyAt) {
        this.setModifyAt(modifyAt);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.modify_at")
    public void setModifyAt(Date modifyAt) {
        this.modifyAt = modifyAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.version")
    public Integer getVersion() {
        return version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withVersion(Integer version) {
        this.setVersion(version);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.access_code")
    public String getAccessCode() {
        return accessCode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withAccessCode(String accessCode) {
        this.setAccessCode(accessCode);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.access_code")
    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode == null ? null : accessCode.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.access_password")
    public String getAccessPassword() {
        return accessPassword;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withAccessPassword(String accessPassword) {
        this.setAccessPassword(accessPassword);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.access_password")
    public void setAccessPassword(String accessPassword) {
        this.accessPassword = accessPassword == null ? null : accessPassword.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.group_id")
    public String getGroupId() {
        return groupId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withGroupId(String groupId) {
        this.setGroupId(groupId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.group_id")
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.app_key")
    public String getAppKey() {
        return appKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withAppKey(String appKey) {
        this.setAppKey(appKey);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.app_key")
    public void setAppKey(String appKey) {
        this.appKey = appKey == null ? null : appKey.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.app_secret")
    public String getAppSecret() {
        return appSecret;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withAppSecret(String appSecret) {
        this.setAppSecret(appSecret);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.app_secret")
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret == null ? null : appSecret.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.use_mail")
    public Short getUseMail() {
        return useMail;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withUseMail(Short useMail) {
        this.setUseMail(useMail);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.use_mail")
    public void setUseMail(Short useMail) {
        this.useMail = useMail;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.mail_group")
    public String getMailGroup() {
        return mailGroup;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withMailGroup(String mailGroup) {
        this.setMailGroup(mailGroup);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.mail_group")
    public void setMailGroup(String mailGroup) {
        this.mailGroup = mailGroup == null ? null : mailGroup.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.logo")
    public byte[] getLogo() {
        return logo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public O2Company withLogo(byte[] logo) {
        this.setLogo(logo);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: o2_company.logo")
    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
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
        O2Company other = (O2Company) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDisplayName() == null ? other.getDisplayName() == null : this.getDisplayName().equals(other.getDisplayName()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getMailSuffix() == null ? other.getMailSuffix() == null : this.getMailSuffix().equals(other.getMailSuffix()))
            && (this.getUserDing() == null ? other.getUserDing() == null : this.getUserDing().equals(other.getUserDing()))
            && (this.getSyncDing() == null ? other.getSyncDing() == null : this.getSyncDing().equals(other.getSyncDing()))
            && (this.getCorpId() == null ? other.getCorpId() == null : this.getCorpId().equals(other.getCorpId()))
            && (this.getCorpsEcret() == null ? other.getCorpsEcret() == null : this.getCorpsEcret().equals(other.getCorpsEcret()))
            && (this.getNoticeDing() == null ? other.getNoticeDing() == null : this.getNoticeDing().equals(other.getNoticeDing()))
            && (this.getAgentId() == null ? other.getAgentId() == null : this.getAgentId().equals(other.getAgentId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateAt() == null ? other.getCreateAt() == null : this.getCreateAt().equals(other.getCreateAt()))
            && (this.getModifyAt() == null ? other.getModifyAt() == null : this.getModifyAt().equals(other.getModifyAt()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getAccessCode() == null ? other.getAccessCode() == null : this.getAccessCode().equals(other.getAccessCode()))
            && (this.getAccessPassword() == null ? other.getAccessPassword() == null : this.getAccessPassword().equals(other.getAccessPassword()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getAppKey() == null ? other.getAppKey() == null : this.getAppKey().equals(other.getAppKey()))
            && (this.getAppSecret() == null ? other.getAppSecret() == null : this.getAppSecret().equals(other.getAppSecret()))
            && (this.getUseMail() == null ? other.getUseMail() == null : this.getUseMail().equals(other.getUseMail()))
            && (this.getMailGroup() == null ? other.getMailGroup() == null : this.getMailGroup().equals(other.getMailGroup()))
            && (Arrays.equals(this.getLogo(), other.getLogo()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getMailSuffix() == null) ? 0 : getMailSuffix().hashCode());
        result = prime * result + ((getUserDing() == null) ? 0 : getUserDing().hashCode());
        result = prime * result + ((getSyncDing() == null) ? 0 : getSyncDing().hashCode());
        result = prime * result + ((getCorpId() == null) ? 0 : getCorpId().hashCode());
        result = prime * result + ((getCorpsEcret() == null) ? 0 : getCorpsEcret().hashCode());
        result = prime * result + ((getNoticeDing() == null) ? 0 : getNoticeDing().hashCode());
        result = prime * result + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateAt() == null) ? 0 : getCreateAt().hashCode());
        result = prime * result + ((getModifyAt() == null) ? 0 : getModifyAt().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getAccessCode() == null) ? 0 : getAccessCode().hashCode());
        result = prime * result + ((getAccessPassword() == null) ? 0 : getAccessPassword().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getAppKey() == null) ? 0 : getAppKey().hashCode());
        result = prime * result + ((getAppSecret() == null) ? 0 : getAppSecret().hashCode());
        result = prime * result + ((getUseMail() == null) ? 0 : getUseMail().hashCode());
        result = prime * result + ((getMailGroup() == null) ? 0 : getMailGroup().hashCode());
        result = prime * result + (Arrays.hashCode(getLogo()));
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: o2_company")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", displayName=").append(displayName);
        sb.append(", city=").append(city);
        sb.append(", address=").append(address);
        sb.append(", mailSuffix=").append(mailSuffix);
        sb.append(", userDing=").append(userDing);
        sb.append(", syncDing=").append(syncDing);
        sb.append(", corpId=").append(corpId);
        sb.append(", corpsEcret=").append(corpsEcret);
        sb.append(", noticeDing=").append(noticeDing);
        sb.append(", agentId=").append(agentId);
        sb.append(", status=").append(status);
        sb.append(", createAt=").append(createAt);
        sb.append(", modifyAt=").append(modifyAt);
        sb.append(", version=").append(version);
        sb.append(", accessCode=").append(accessCode);
        sb.append(", accessPassword=").append(accessPassword);
        sb.append(", groupId=").append(groupId);
        sb.append(", appKey=").append(appKey);
        sb.append(", appSecret=").append(appSecret);
        sb.append(", useMail=").append(useMail);
        sb.append(", mailGroup=").append(mailGroup);
        sb.append(", logo=").append(logo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}