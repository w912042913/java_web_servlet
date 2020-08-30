package com.neusoft.test;

import com.neusoft.dao.Impl.UserDaoImpl;
import com.neusoft.domain.User;
import org.junit.Test;

public class UserDaoTest {
 @Test
 public void test(){
  User loginUser = new User();
  loginUser.setUsername("bigbaby");
  loginUser.setPassword("12345");
  UserDaoImpl dao = new UserDaoImpl();
  User login = dao.login(loginUser);
  System.out.println(login);
 }
}
