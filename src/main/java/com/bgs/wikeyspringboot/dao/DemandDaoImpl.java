package com.bgs.wikeyspringboot.dao;

import com.bgs.wikeyspringboot.entity.Demand;
import com.bgs.wikeyspringboot.entity.TaskClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Repository
public class DemandDaoImpl implements DemandDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int saveDemand(Demand demand) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String sql = "INSERT INTO wk_demand " +
                "(demand_name,demand_content,demand_period,demand_budget,demand_status,demand_city,demand_uid," +
                "view_count,apply_count,demand_type,application,create_time,demand_province,demand_counties) " +
                "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, demand.getDemandName(), demand.getDemandContent(), demand.getDemandPeriod(),
                demand.getDemandBudget(), demand.getDemandStatus(), demand.getDemandCity(),demand.getDemandUid(),0,0,
                demand.getDemandType(),demand.getApplication(),simpleDateFormat.format(new Date()),
                demand.getDemandProvince(),demand.getDemandCounties());
    }

    @Override
    public List<Demand> demandList(Integer uid,Integer status) {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT * FROM wk_demand");
        if(uid>0){
            sql.append(" where demand_uid ="+uid);
            if (status!=999){
                sql.append(" and demand_status ="+status);
            }
        }
        RowMapper<Demand> s = new BeanPropertyRowMapper<Demand>(Demand.class);
        List<Demand> deList = jdbcTemplate.query(sql.toString(),s);
        return deList;
    }

    @Override
    public Demand demandDetails(Integer did) {
        String sql = "SELECT * FROM wk_demand WHERE demand_id = ?";
        Object [] preams ={did};
        RowMapper<Demand> s = new BeanPropertyRowMapper<Demand>(Demand.class);
        Demand demand = jdbcTemplate.queryForObject(sql,preams,s);
        return demand;
    }

    @Override
    public int updateCount(Integer uid) {
        int update = jdbcTemplate.update("UPDATE wk_demand SET view_count= view_count + 1 WHERE demand_id =?",uid);
        return update;
    }

    @Override
    public List<TaskClass> taskList(Integer aid) {
        String sql = "SELECT * FROM taskclass WHERE application =?";
        RowMapper<TaskClass> task = new BeanPropertyRowMapper<>(TaskClass.class);
        List<TaskClass> query = jdbcTemplate.query(sql,task,aid);
        return query;
    }

    @Override
    public List<Demand> findDemandlist(Integer task, Integer application, Integer city) {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT * FROM wk_demand WHERE 1=1");
        if(task!=null && task != 1){
            sql.append(" and demand_type = "+task);
        }
        if(application!=null && application!= 6){
            sql.append(" and application = "+application);
        }
        if(city!=null){
            sql.append(" and demand_city = "+city +" or demand_province ="+city+" or demand_counties = "+city);
        }
        RowMapper<Demand> s = new BeanPropertyRowMapper<Demand>(Demand.class);
        List<Demand> query = jdbcTemplate.query(sql.toString(), s);
        return query;
    }


}
