package com.neusoft.web.servlet;

import com.neusoft.domain.User;
import com.neusoft.service.UserService;
import com.neusoft.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      /// 1. 设置编码
        req.setCharacterEncoding("utf-8");
        String verifycode = req.getParameter("verifycode");
        // 验证码校验
        HttpSession session = req.getSession();
        String checkcode_server = (String) session.getAttribute("CHECKCODE_SERVER");
        session.removeAttribute("CHECKCODE_SERVER");
        if (!checkcode_server.equals(verifycode)){
            req.setAttribute("login_img", "验证码错误");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
            return;
        }
        Map<String, String[]> map = req.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user, map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        // service查询
        UserServiceImpl userService = new UserServiceImpl();
        User login = userService.login("username", "password");
        if (login!=null){
            session.setAttribute("user", "login");
            resp.sendRedirect(req.getContextPath()+"index.jsp");
        }
        else {
            req.setAttribute("login_img", "用户名和密码错误");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
        //3.转发到list.jsp中
        req.getRequestDispatcher("/list.jsp").forward(req, resp);
    }
}
