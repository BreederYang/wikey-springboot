package com.bgs.wikeyspringboot.dao;

import com.bgs.wikeyspringboot.entity.TArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class CitysDaoImpl implements CitysDao{

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public TArea findCityById(Integer areaId) {
        String sql = "SELECT * FROM T_Area WHERE areaId = ?";
        Object [] preams = new Object[]{areaId};
        TArea area = jdbcTemplate.queryForObject(sql, preams, TArea.class);
        return area;
    }

    @Override
    public List<TArea> findProvince(Integer parentId) {
        String sql = "SELECT * FROM T_Area WHERE parentId = ?";
        Object [] preams = new Object[]{parentId};
        List<TArea> tAreas = jdbcTemplate.query(sql, preams, new RowMapper<TArea>() {
            @Override
            public TArea mapRow(ResultSet resultSet, int i) throws SQLException {
                TArea areas = new TArea();
                areas.setAreaId(resultSet.getString("areaId"));
                areas.setAreacode(resultSet.getString("areaCode"));
                areas.setAreaname(resultSet.getString("areaName"));
                areas.setLevel(resultSet.getByte("level"));
                areas.setCitycode(resultSet.getString("cityCode"));
                areas.setCenter(resultSet.getString("center"));
                areas.setParentid(resultSet.getInt("parentId"));
                return areas;
            }
        });
        return tAreas;
    }

    @Override
    public List<TArea> findCitys(Integer lv) {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT * FROM t_area WHERE 1=1");
        if(lv != null){
            sql.append(" and level = "+lv);
        }
        RowMapper<TArea> tAreaRowMapper = new BeanPropertyRowMapper<>(TArea.class);
        List<TArea> query = jdbcTemplate.query(sql.toString(), tAreaRowMapper);
        return query;
    }
}
