package com.neusoft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//@WebServlet({"/d123","/d231","/d321"})//同时配置多个servlet路径
@WebServlet({"/qweqwe/rqwrwqr"})//同时配置多级路径
//@WebServlet("/start/*")
//@WebServlet("*.do")//拓展名匹配 以.do结尾就行
public class ServletDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo4被调用");
    }
}
