package com.neusoft.test;
import com.neusoft.Dao.UserDao;
import com.neusoft.Dao.impl.UserDaoImpl;
import com.neusoft.domain.User;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

public class TestUserDaoImpl {
    @Test
    public void userDaoImplTest(){
        UserDaoImpl dao = new UserDaoImpl();
        List<User> users = dao.findAll();
        for (User user:users) {
            System.out.println(user);
        }
    }
    @Test
    public void test2(){
        User user = new User();
        user.setName("dada");
        user.setGender("人妖");
        user.setAddress("泰国");
        user.setQq("23123213");
        user.setAge(323);
        user.setEmail("3242342@qq.com");
        UserDao dao = new UserDaoImpl();
        dao.add(user);
    }
    @Test
    public void test3() throws InvocationTargetException, IllegalAccessException {
        HashMap<String, String> map = new HashMap<>();
    map.put("name","zhangsan");
    map.put("age", "12");
        User user = new User();
        BeanUtils.populate(user, map);
        System.out.println(user);

    }
}
