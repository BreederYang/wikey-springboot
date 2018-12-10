package com.bgs.wikeyspringboot.dao;

import com.bgs.wikeyspringboot.entity.Demand;
import com.bgs.wikeyspringboot.entity.TaskClass;

import java.util.List;

public interface DemandDao {
    int saveDemand(Demand demand);
    List<Demand> demandList(Integer uid,Integer status);
    Demand demandDetails(Integer did);
    int updateCount(Integer uid);
    List<TaskClass> taskList(Integer aid);
//    根据选择查询(任务分类,应用领域,城市ID)
    List<Demand> findDemandlist(Integer task, Integer application, Integer city);
}
