package com.neusoft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet("/demo5")
public class RequestDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       //根据参数名获得参数值
//        String username = req.getParameter("username");
//        System.out.println(username);
//        //根据参数名获取参数值的数组
//        String[] hobbies =   req.getParameterValues("hobby");
//        for (String hobby:hobbies){
//            System.out.println(hobby);
//        }
        // 1. 设置流的编码方式
        req.setCharacterEncoding("utf-8");

//        // 获取所有请求参数名称
//        Enumeration<String> parameterNames = req.getParameterNames();
//        while (parameterNames.hasMoreElements()){
//            String name = parameterNames.nextElement();
//            System.out.println(name);
//            System.out.println("++++++++++++");
//            String value = req.getParameter(name);
//            System.out.println(value);
//            System.out.println("++++++++++++");
//
//        }
        // 获取所有参数的map集合
        Map<String, String[]> parameterMap = req.getParameterMap();
        Set<String> keySet = parameterMap.keySet();
        for (String name: keySet){
            String[] values = parameterMap.get(name);
            System.out.println(name);
            for (String value: values){
                System.out.println(value);
            }
            System.out.println("+++++++++++++++++++++++++++++");
        }

    }
}
