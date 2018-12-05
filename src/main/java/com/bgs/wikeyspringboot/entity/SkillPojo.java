package com.bgs.wikeyspringboot.entity;

import java.util.List;

/**
 * 展示全部技能包装类
 */
public class SkillPojo {
//    父级记录
    private Skill skill;
//    父级下所有记录
    private List<Skill> skillList;

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }


}
