package com.bgs.wikeyspringboot.dao;

import com.bgs.wikeyspringboot.entity.TArea;

import java.util.List;

public interface CitysDao {

    TArea findCityById(Integer areaId);
    List<TArea> findProvince(Integer parentId);
    List<TArea> findCitys(Integer lv);
}
