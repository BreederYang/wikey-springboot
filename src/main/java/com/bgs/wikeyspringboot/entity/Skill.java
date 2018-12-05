package com.bgs.wikeyspringboot.entity;

public class Skill {
    private Integer id;
    private String skillName;
    private Integer skillPid;

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
                '}';
    }
}
