package com.bgs.wikeyspringboot.dao;

import com.bgs.wikeyspringboot.entity.User;
import com.bgs.wikeyspringboot.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {


    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<User> loginUser(String username,String password) {
        String sql = "select * from wk_user where username=? and password=?";
        String md5Encode = MD5Utils.MD5Encode(password, "UTF-8");
        Object[] param={username,md5Encode};
        List<User> list=jdbcTemplate.query(sql, param, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User u= new User();
                u.setId(resultSet.getInt("id"));
                u.setUsername(resultSet.getString("username"));
                u.setPhoneNum(resultSet.getString("phoneNum"));
                u.setQqNum(resultSet.getString("qqNum"));
                u.setPassword(resultSet.getString("password"));
                return u;
            }
        });
        return list;
    }

    @Override
    public int registerUser(User user) {

        return jdbcTemplate.update("INSERT INTO wk_user(username,password,phoneNum,qqNum)"+" VALUE (?,?,?,?)",user.getUsername()
                , MD5Utils.MD5Encode(user.getPassword(),"UTF-8"),user.getPhoneNum(),user.getQqNum());
    }
}
