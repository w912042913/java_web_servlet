package com.nuesoft.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/CookieTest")
public class CookieTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       有cookie不是第一次访问 ，没有cookie就是第一次访问
        resp.setContentType("text/html;charset=utf-8");
        //1.获取所有cookie
        Cookie[] cookies = req.getCookies();
        boolean flag=false;// 表示有没有cookie为LastTime
        //2.遍历cookie数组
        if (cookies!=null&&cookies.length>0){
            for (Cookie cookie:cookies){
                //获取cookie的名称
                String name = cookie.getName();
                String value = cookie.getValue();
                //判断遍历的cookie里面是否为LastTime
                if ("lastTime".equals(name)){
                    //有 不是第一次
                    //获取当前时间
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String format = sdf.format(date);
                    System.out.println("编码前"+format);
                    //URL编码
                    format = URLEncoder.encode(format, "utf-8");
                    System.out.println("编码后" +  format);
                    cookie.setValue(format);
                    cookie.setMaxAge(60*60*24*30);//一个月
                    resp.addCookie(cookie);
                    // 响应数据
                    System.out.println("value解码前" +value);
                    // URL 解码
                    value= URLDecoder.decode(value, "utf-8");
                    System.out.println("value解码后" +value);
                    resp.getWriter().write("<h1>欢迎回来， 您上次访问的时间是：" + value + "</h1>");
                    break;
                }
            }
        }
      else  if (cookies==null||cookies.length==0 ||flag==false) {
        //第一次访问
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String format = sdf.format(date);
            System.out.println("编码前" +  format);
            format = URLEncoder.encode(format, "utf-8");
            System.out.println("编码后" +  format);
            Cookie cookie = new Cookie("lastTime", "format");
            cookie.setMaxAge(60*60*24*30);
            resp.addCookie(cookie);
            resp.getWriter().write("<h1>您第一次访问</h1>");
        }
        }
    }

