package com.neusoft.servlet;

import javax.jws.WebService;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/demo4")
public class ServletDemo implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet3.0");
        int a=100;
        int b=1000;
        int c =0;
        System.out.println(a+b+c);
        System.out.println(a/c);
    }

    @Override
    public String getServletInfo() {
        return null ;
    }

    @Override
    public void destroy() {

    }
}
