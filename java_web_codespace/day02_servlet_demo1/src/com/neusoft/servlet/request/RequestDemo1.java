package com.neusoft.servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/requestDemo1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        //1获取里面的请求方式：get方法
//        String method = req.getMethod();
//        System.out.println("method"+method);
//        //2获取虚拟目录
//        String contextPath = req.getContextPath();
//        System.out.println("contextPath"+contextPath);
//        //3获取servlet路径
//        String servletPath = req.getServletPath();
//        System.out.println("servletPath"+servletPath);
//        //4获取get的请求方式
//        String queryString = req.getQueryString();
//        // http://localhost/requestDemo1?name=lihuizhang
//        // name=lihuizhang
//        // queryStringname=lihuizhang&age=female
//        System.out.println("queryString"+queryString);
//        //5获取URI
//        String requestURI = req.getRequestURI();
//        StringBuffer requestURL = req.getRequestURL();
//        System.out.println("requestURI"+requestURI);
//        //requestDemo1 像共和国
//        System.out.println("requestURL"+requestURL);
//        //http://localhost:8888/requestDemo1 像中华人民共和国
//        //6获取协议版本
//        String protocol = req.getProtocol();//HTTP/1.1
//        System.out.println("protocol"+protocol);
//        //7获取客户机ip地址 //0:0:0:0:0:0:1
//        String remoteAddr = req.getRemoteAddr();
//        System.out.println("remoteAddr"+remoteAddr);
        String method = req.getMethod();
        System.out.println(method);
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        String servletPath = req.getServletPath();
        System.out.println(servletPath);
        String queryString = req.getQueryString();
        System.out.println(queryString);
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);
        String protocol = req.getProtocol();
        System.out.println(protocol);
        String remoteAddr = req.getRemoteAddr();
        System.out.println(remoteAddr);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
