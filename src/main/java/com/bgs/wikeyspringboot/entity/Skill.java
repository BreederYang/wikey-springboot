package com.bgs.wikeyspringboot.entity;

public class Skill {
    private Integer id;
    private String skillName;
    private Integer skillPid;

//  判断是否选中 不存库
    private String isCheck;

    public String getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(String isCheck) {
        this.isCheck = isCheck;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public Integer getSkillPid() {
        return skillPid;
    }

    public void setSkillPid(Integer skillPid) {
        this.skillPid = skillPid;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", skillName='" + skillName + '\'' +
                ", skillPid=" + skillPid +
                ", isCheck='" + isCheck + '\'' +
                '}';
    }
}
