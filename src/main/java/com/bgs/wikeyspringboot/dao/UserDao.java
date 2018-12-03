package com.bgs.wikeyspringboot.dao;

import com.bgs.wikeyspringboot.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserDao {
    List<User> loginUser(String username, String password);
    int registerUser(User user);
}
