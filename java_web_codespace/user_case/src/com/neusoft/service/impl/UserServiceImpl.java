package com.neusoft.service.impl;

import com.neusoft.Dao.UserDao;
import com.neusoft.Dao.impl.UserDaoImpl;
import com.neusoft.domain.User;
import com.neusoft.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDaoImpl dao = new UserDaoImpl();
    @Override
    public List<User> findAll() {
        // 调用dao

        return dao.findAll();
    }

    @Override
    public void addUser(User user) {
        // 添加用户
        dao.add(user);
    }

    @Override
    public void update(User user) {
dao.update(user);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public User findUserById(String id) {
        return dao.findById(Integer.parseInt(id));
    }

    @Override
    public User login(User user) {
        return null;
    }

    @Override
    public void deleteSelectedUser(String[] ids) {
          //批量删除数据
        if (ids!=null&& ids.length>0){
            for (String id:ids) {
                dao.delete(Integer.parseInt(id));
            }
        }
    }





}
