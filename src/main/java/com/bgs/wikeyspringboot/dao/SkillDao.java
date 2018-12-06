package com.bgs.wikeyspringboot.dao;

import com.bgs.wikeyspringboot.entity.Provider;
import com.bgs.wikeyspringboot.entity.Skill;

import java.util.List;

public interface SkillDao {
    List<Skill> findSkillByPid(Integer pid);
    int addProviderSkill(String skillID,Integer uid);
    Provider findProByUid(Integer uid);
}
