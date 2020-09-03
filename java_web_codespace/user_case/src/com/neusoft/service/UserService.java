package com.neusoft.service;

import com.neusoft.domain.User;

import java.util.List;

/**
 * 用户管理业务接口
 */

public interface UserService {
    //查询所有业务信息
    public List<User> findAll();


    void addUser(User user);

    void update(User user);

    void delete(int id);

    User findUserById(String id);

    User login(User user);
    void deleteSelectedUser(String[] ids);
}


