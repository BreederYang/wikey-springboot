package com.bgs.wikeyspringboot.controller;

import com.bgs.wikeyspringboot.dao.SkillDao;
import com.bgs.wikeyspringboot.entity.Provider;
import com.bgs.wikeyspringboot.entity.Skill;
import com.bgs.wikeyspringboot.entity.SkillPojo;
import com.bgs.wikeyspringboot.entity.User;
import com.bgs.wikeyspringboot.utils.DictionaryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/skill")
public class SkillController {
    @Autowired
    private SkillDao skillDao;

    @RequestMapping(path = "/showSkill",method = RequestMethod.GET)
    public String showSkill(Model model,HttpServletRequest request){
//        创建包装类集合
        List<SkillPojo> skillPojoList = new ArrayList<>();
//        查询所有父级技能
        List<Skill> skillParentList = skillDao.findSkillByPid(-1);
//        创建包装对象
        SkillPojo pojo = null;

//        获取session 中用户信息
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute(DictionaryUtils.session_user_auth);
//        查询本服务商的信息
        Provider proByUid = skillDao.findProByUid(u.getId());
//        取出服务商的技能
        String workSkill = proByUid.getWorkSkill();
        String[] skillArr = workSkill.split(",");


//          便利父级记录
        for (int i =0;i<skillParentList.size();i++){
            pojo = new SkillPojo();
//            把父级记录放入包装类
            pojo.setSkill(skillParentList.get(i));
//            查询所有父级下记录
            List<Skill> skillList = skillDao.findSkillByPid(skillParentList.get(i).getId());
//              遍历父级下记录，并和服务商技能对比
                skillList.forEach(x->{
                    for(int k =0;k<skillArr.length;k++){
                        boolean isCheck = (x.getId()==Integer.valueOf(skillArr[k]));
                        if(isCheck){
                            x.setIsCheck(String.valueOf(isCheck));
                            break;
                        }else {
                            x.setIsCheck(String.valueOf(isCheck));
                        }
                    }
                });
//            放入包装类对象中
            pojo.setSkillList(skillList);
//            放入包装类集合
            skillPojoList.add(pojo);
        }
//        返回试图
        model.addAttribute("skillPOLsit",skillPojoList);
        return "myskill";
    }

    @RequestMapping(path = "/addMySkill",method = RequestMethod.POST)
    @ResponseBody
    public int addMySkill(String skids, HttpServletRequest request){
//        获取当前用户
        User user = (User)request.getSession().getAttribute(DictionaryUtils.session_user_auth);
        return skillDao.addProviderSkill(skids, user.getId());
    }
    @RequestMapping(path = "/personal",method = RequestMethod.GET)
    public String personal(){
//      供应商个人资料
        return "personal";
    }

}
