<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/8/31
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--1.属性test必须属性，接受的时Boolean表达式
一般test配合el表达式一起用--%>
<%--2.没有else部分--%>
<html>
<head>
    <title>if标签</title>
</head>

<body>
<c:if test="true">
    <h1>还有一个月就过节了</h1>
</c:if>
<%
    List<Object> list = new ArrayList<>();
    list.add("aaa");
    request.setAttribute("list", list);
    request.setAttribute("number", 6);
%>
<c:if test="${not empty requestScope.list}">
    <h2>遍历集合</h2>
</c:if>
<br>

<c:if test="${number % 2 != 0}">
    <h2>${number}为奇数</h2>
</c:if>
<c:if test="${number % 2 == 0}">
    <h2>${number}为偶数</h2>
</c:if>
</body>
</html>
