package com.bgs.wikeyspringboot.dao;

import com.bgs.wikeyspringboot.entity.Demand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class DemandDaoImpl implements DemandDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int saveDemand(Demand demand) {
        String sql = "INSERT INTO wk_demand " +
                "(demand_name,demand_content,demand_period,demand_budget,demand_status,demand_city,demand_uid) " +
                "VALUES(?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, demand.getDemandName(), demand.getDemandContent(), demand.getDemandPeriod(),
                demand.getDemandBudget(), demand.getDemandStatus(), demand.getDemandCity(),demand.getDemandUid());
    }

    @Override
    public List<Demand> demandList(Integer uid) {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT * FROM wk_demand");
        if(uid>0){
            sql.append(" where demand_uid ="+uid);
        }
        List<Demand> deList = jdbcTemplate.query(sql.toString(), new RowMapper<Demand>() {
            @Override
            public Demand mapRow(ResultSet resultSet, int i) throws SQLException {
                Demand d = new Demand();
                d.setDemandId(resultSet.getInt("demand_id"));
                d.setDemandName(resultSet.getString("demand_name"));
                d.setDemandContent(resultSet.getString("demand_content"));
                d.setDemandPeriod(resultSet.getString("demand_period"));
                d.setDemandBudget(resultSet.getString("demand_budget"));
                d.setDemandStatus(resultSet.getInt("demand_status"));
                d.setDemandCity(resultSet.getInt("demand_city"));
                d.setDemandUid(resultSet.getInt("demand_uid"));
                d.setBargainUid(resultSet.getInt("bargain_uid"));
                return d;
            }
        });
        return deList;
    }
}
