<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/8/31
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>
<%--1.属性test必须属性，接受的时Boolean表达式
一般test配合el表达式一起用--%>
<%--2.没有else部分--%>
<html>
<head>
    <title>if标签</title>
</head>

<body>
<%
    request.setAttribute("number", 1);
%>
<d:choose>
    <d:when test="${number==1}">星期一</d:when>
    <d:when test="${number==2}">星期二</d:when>
    <d:when test="${number==3}">星期三</d:when>
    <d:when test="${number==4}">星期四</d:when>
    <d:when test="${number==5}">星期五</d:when>
    <d:when test="${number==6}">星期六</d:when>
    <d:when test="${number==7}">星期日</d:when>
    <d:otherwise >过年</d:otherwise>
</d:choose>
</body>
</html>
