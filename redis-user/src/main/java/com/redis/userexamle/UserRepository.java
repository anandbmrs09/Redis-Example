package com.redis.userexamle;


import java.util.Map;

import org.springframework.stereotype.Service;

import com.redis.model.User;
public interface UserRepository {

    void save(User user);
    Map<String, User> findAll();
    User findById(String id);
    void update(User user);
    void delete(String id);
}
