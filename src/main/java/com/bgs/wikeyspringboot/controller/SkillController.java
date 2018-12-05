package com.bgs.wikeyspringboot.controller;

import com.bgs.wikeyspringboot.dao.SkillDao;
import com.bgs.wikeyspringboot.entity.Skill;
import com.bgs.wikeyspringboot.entity.SkillPojo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/skill")
public class SkillController {
    @Autowired
    private SkillDao skillDao;

    @RequestMapping(path = "/showSkill",method = RequestMethod.GET)
    public String showSkill(Model model){
//        创建包装类集合
        List<SkillPojo> skillPojoList = new ArrayList<>();
//        查询所有父级技能
        List<Skill> skillParentList = skillDao.findSkillByPid(-1);
//        创建包装对象
        SkillPojo pojo = null;
//          便利父级记录
        for (int i =0;i<skillParentList.size();i++){
            pojo = new SkillPojo();
//            把父级记录放入包装类
            pojo.setSkill(skillParentList.get(i));
//            查询所有父级下记录
            List<Skill> skillList = skillDao.findSkillByPid(skillParentList.get(i).getId());
//            放入包装类对象中
            pojo.setSkillList(skillList);
//            放入包装类集合
            skillPojoList.add(pojo);
        }
//        返回试图
        model.addAttribute("skillPOLsit",skillPojoList);
        return "myskill";
    }
}
