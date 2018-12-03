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
//    所在城市ID
    private Integer demandCity;
//    所属用户ID
    private Integer demandUid;
//    签订用户ID
    private Integer bargainUid;

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

    @Override
    public String toString() {
        return "Demand{" +
                "demandId=" + demandId +
                ", demandName='" + demandName + '\'' +
                ", demandContent='" + demandContent + '\'' +
                ", demandPeriod='" + demandPeriod + '\'' +
                ", demandBudget='" + demandBudget + '\'' +
                ", demandStatus=" + demandStatus +
                ", demandCity=" + demandCity +
                ", demandUid=" + demandUid +
                ", bargainUid=" + bargainUid +
                '}';
    }
}
