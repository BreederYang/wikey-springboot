package com.bgs.wikeyspringboot.entity;

public class Provider {
//    id
    private Integer id;
//    用户ID
    private Integer userId;
//    投标简介
    private String intro;
//    投标函
    private String bidLetter;
//    擅长技能
    private String workSkill;
//    邮箱
    private String email;
//    所在城市
    private Integer provderCity;
//    详细地址
    private String provderAddress;
//    经营范围
    private String businessScope;
//    经营执照
    private String businessLicense;
//    案例ID
    private String caseId;
//    联系方式
    private String phone;
//    法人姓名
    private String providerName;
//    公司名称
    private String providerUsername;
//    法人身份证号
    private String idCard;

    @Override
    public String toString() {
        return "Provider{" +
                "id=" + id +
                ", userId=" + userId +
                ", intro='" + intro + '\'' +
                ", bidLetter='" + bidLetter + '\'' +
                ", workSkill='" + workSkill + '\'' +
                ", email='" + email + '\'' +
                ", provderCity=" + provderCity +
                ", provderAddress='" + provderAddress + '\'' +
                ", businessScope='" + businessScope + '\'' +
                ", businessLicense='" + businessLicense + '\'' +
                ", caseId='" + caseId + '\'' +
                ", phone='" + phone + '\'' +
                ", providerName='" + providerName + '\'' +
                ", providerUsername='" + providerUsername + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderUsername() {
        return providerUsername;
    }

    public void setProviderUsername(String providerUsername) {
        this.providerUsername = providerUsername;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getBidLetter() {
        return bidLetter;
    }

    public void setBidLetter(String bidLetter) {
        this.bidLetter = bidLetter;
    }

    public String getWorkSkill() {
        return workSkill;
    }

    public void setWorkSkill(String workSkill) {
        this.workSkill = workSkill;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getProvderCity() {
        return provderCity;
    }

    public void setProvderCity(Integer provderCity) {
        this.provderCity = provderCity;
    }

    public String getProvderAddress() {
        return provderAddress;
    }

    public void setProvderAddress(String provderAddress) {
        this.provderAddress = provderAddress;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

}


