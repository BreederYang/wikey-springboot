package com.bgs.wikeyspringboot.controller;

import com.bgs.wikeyspringboot.dao.CitysDao;
import com.bgs.wikeyspringboot.dao.DemandDao;
import com.bgs.wikeyspringboot.entity.Demand;
import com.bgs.wikeyspringboot.entity.TArea;
import com.bgs.wikeyspringboot.entity.TaskClass;
import com.bgs.wikeyspringboot.entity.User;
import com.bgs.wikeyspringboot.utils.DictionaryUtils;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    public String toReleaseDemand(Model model){
        List<TaskClass> t1 = demandDao.taskList(1);
        List<TaskClass> t2 = demandDao.taskList(2);
        model.addAttribute("t1",t1);
        model.addAttribute("t2",t2);
        return "releaseDemand";
    }

    @RequestMapping(path = "/release",method = POST)
    @ResponseBody
    public int saveDemand(Demand demand,HttpServletRequest request){
        HttpSession session = request.getSession();
        User attribute = (User) session.getAttribute(DictionaryUtils.session_user_auth);
        demand.setDemandUid(attribute.getId());
        System.out.println(demand);
        return  demandDao.saveDemand(demand);
    }

    @RequestMapping("/findProvinceById")
    @ResponseBody
    public List<TArea> findProvinceById(Integer id) {
        return citysDao.findProvince(id);
    }

    @RequestMapping("/showMyDemand")
    public String showMyDemand(Integer status,HttpServletRequest request, Model model){
        if (status==null){
            status=999;
        }
        User suser = (User) request.getSession().getAttribute(DictionaryUtils.session_user_auth);
        List<Demand> demands = demandDao.demandList(suser.getId(),status);
        model.addAttribute("demand",demands);
        return "mydemand";
    }
    @RequestMapping(path = "/demandDteils",method = GET)
    public String demandDteils(Integer id, Model model){
        Demand demands = demandDao.demandDetails(id);
        if(demands!=null){
            demandDao.updateCount(demands.getDemandId());
        }
        model.addAttribute("demand",demands);
        return "projectdetails";
    }
    @RequestMapping(path = "/demandList",method = GET)
    public String demandList(Integer taskid,Integer application,Integer cityId,Model model){
//        需求
        List<Demand> demandlist = demandDao.findDemandlist(taskid, application, cityId);
       // System.out.println("-- size :"+demandlist.size());
//        所有省
        List<TArea> provinces = citysDao.findCitys(1);
//        所有市
        List<TArea> citys = citysDao.findCitys(2);
//        任务分类
        List<TaskClass> app1List = demandDao.taskList(1);
//        应用领域
        List<TaskClass> app2List = demandDao.taskList(2);
        model.addAttribute("provinceList",provinces);
        model.addAttribute("citysList",citys);
        model.addAttribute("taskList",app1List);
        model.addAttribute("appList",app2List);
        model.addAttribute("demandlist",demandlist);
        model.addAttribute("taskid",taskid);
        model.addAttribute("appid",application);
        model.addAttribute("cityId",cityId);

        return "demandHall";
    }
}

