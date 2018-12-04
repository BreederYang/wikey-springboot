package com.bgs.wikeyspringboot.dao;

import com.bgs.wikeyspringboot.entity.Demand;

import java.util.List;

public interface DemandDao {
    int saveDemand(Demand demand);
    List<Demand> demandList(Integer uid);
    Demand demandDetails(Integer did);
}
