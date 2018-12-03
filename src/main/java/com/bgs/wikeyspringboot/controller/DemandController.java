package com.bgs.wikeyspringboot.controller;

import com.bgs.wikeyspringboot.dao.CitysDao;
import com.bgs.wikeyspringboot.dao.DemandDao;
import com.bgs.wikeyspringboot.entity.Demand;
import com.bgs.wikeyspringboot.entity.TArea;
import com.bgs.wikeyspringboot.entity.User;
import com.bgs.wikeyspringboot.utils.DictionaryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/demand")
public class DemandController {
    @Autowired
    private DemandDao demandDao;

    @Autowired
    private CitysDao citysDao;

    @RequestMapping(path = "/release",method = GET)
    public String toReleaseDemand(HttpServletRequest request){
        return "releaseDemand";
    }

    @RequestMapping(path = "/release",method = POST)
    @ResponseBody
    public int saveDemand(Demand demand){
        System.out.println(demand);
        return 1;
    }

    @RequestMapping("/findProvinceById")
    @ResponseBody
    public List<TArea> findProvinceById(Integer id) {
        return citysDao.findProvince(id);
    }

    @RequestMapping("/showMyDemand")
    public String showMyDemand(HttpServletRequest request, Model model){
        User suser = (User) request.getSession().getAttribute(DictionaryUtils.session_user_auth);
        System.out.println(suser);
        List<Demand> demands = demandDao.demandList(suser.getId());
        System.out.println(demands.size());
        model.addAttribute("demand",demands);
        return "mydemand";
    }

}

