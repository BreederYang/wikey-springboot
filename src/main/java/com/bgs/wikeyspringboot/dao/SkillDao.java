package com.bgs.wikeyspringboot.dao;

import com.bgs.wikeyspringboot.entity.Skill;

import java.util.List;

public interface SkillDao {
    List<Skill> findSkillByPid(Integer pid);
}
