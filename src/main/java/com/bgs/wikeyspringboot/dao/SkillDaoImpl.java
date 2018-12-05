package com.bgs.wikeyspringboot.dao;

import com.bgs.wikeyspringboot.entity.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class SkillDaoImpl implements SkillDao{
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public List<Skill> findSkillByPid(Integer pid) {
        String sql = "SELECT * FROM wk_skill WHERE skill_pid=?";
        Object [] pream = {pid};
        List<Skill> query = jdbcTemplate.query(sql, pream, new RowMapper<Skill>() {
            @Override
            public Skill mapRow(ResultSet resultSet, int i) throws SQLException {
                Skill skill = new Skill();
                skill.setId(resultSet.getInt("id"));
                skill.setSkillName(resultSet.getString("skill_name"));
                skill.setSkillPid(resultSet.getInt("skill_pid"));
                return skill;
            }
        });
        return query;
    }
}
