package com.bgs.wikeyspringboot.entity;

public class Demand {
//    id
    private Integer demandId;
//    需求名
    private String demandName;
//    内容
    private String demandContent;
//    周期
    private String demandPeriod;
//    预算
    private String demandBudget;
//    状态
    private Integer demandStatus;
//    省份
    private Integer demandProvince;
    //    所在城市ID
    private Integer demandCity;
//    县区
    private Integer demandCounties;
//    所属用户ID
    private Integer demandUid;
//    签订用户ID
    private Integer bargainUid;
//    申请数
    private Integer applyCount;
//    点击数
    private Integer viewCount;
//    需求类型
    private Integer demandType;
//    创建时间
    private String createTime;
//    截止时间
    private String cutTime;
//    应用领域
    private Integer application;

    @Override
    public String toString() {
        return "Demand{" +
                "demandId=" + demandId +
                ", demandName='" + demandName + '\'' +
                ", demandContent='" + demandContent + '\'' +
                ", demandPeriod='" + demandPeriod + '\'' +
                ", demandBudget='" + demandBudget + '\'' +
                ", demandStatus=" + demandStatus +
                ", demandProvince=" + demandProvince +
                ", demandCity=" + demandCity +
                ", demandCounties=" + demandCounties +
                ", demandUid=" + demandUid +
                ", bargainUid=" + bargainUid +
                ", applyCount=" + applyCount +
                ", viewCount=" + viewCount +
                ", demandType=" + demandType +
                ", createTime='" + createTime + '\'' +
                ", cutTime='" + cutTime + '\'' +
                ", application=" + application +
                '}';
    }

    public Integer getDemandProvince() {
        return demandProvince;
    }

    public void setDemandProvince(Integer demandProvince) {
        this.demandProvince = demandProvince;
    }

    public Integer getDemandCounties() {
        return demandCounties;
    }

    public void setDemandCounties(Integer demandCounties) {
        this.demandCounties = demandCounties;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCutTime() {
        return cutTime;
    }

    public void setCutTime(String cutTime) {
        this.cutTime = cutTime;
    }

    public Integer getApplication() {
        return application;
    }

    public void setApplication(Integer application) {
        this.application = application;
    }

    public Integer getDemandType() {
        return demandType;
    }

    public void setDemandType(Integer demandType) {
        this.demandType = demandType;
    }

    public Integer getApplyCount() {
        return applyCount;
    }

    public void setApplyCount(Integer applyCount) {
        this.applyCount = applyCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getDemandId() {
        return demandId;
    }

    public void setDemandId(Integer demandId) {
        this.demandId = demandId;
    }

    public String getDemandName() {
        return demandName;
    }

    public void setDemandName(String demandName) {
        this.demandName = demandName;
    }

    public String getDemandContent() {
        return demandContent;
    }

    public void setDemandContent(String demandContent) {
        this.demandContent = demandContent;
    }

    public String getDemandPeriod() {
        return demandPeriod;
    }

    public void setDemandPeriod(String demandPeriod) {
        this.demandPeriod = demandPeriod;
    }

    public String getDemandBudget() {
        return demandBudget;
    }

    public void setDemandBudget(String demandBudget) {
        this.demandBudget = demandBudget;
    }

    public Integer getDemandStatus() {
        return demandStatus;
    }

    public void setDemandStatus(Integer demandStatus) {
        this.demandStatus = demandStatus;
    }

    public Integer getDemandCity() {
        return demandCity;
    }

    public void setDemandCity(Integer demandCity) {
        this.demandCity = demandCity;
    }

    public Integer getDemandUid() {
        return demandUid;
    }

    public void setDemandUid(Integer demandUid) {
        this.demandUid = demandUid;
    }

    public Integer getBargainUid() {
        return bargainUid;
    }

    public void setBargainUid(Integer bargainUid) {
        this.bargainUid = bargainUid;
    }

}
