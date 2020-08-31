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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>forEach标签</title>
</head>
<body>
<c:forEach begin="1" end="10" var="i" step="2" varStatus="s">
    ${i}
</c:forEach>
<%--bigin 开始
    end 结束
    var 临时变量
    step 步长
    varStatus：循环状态对象
    index：容器中的索引
    count：循环次数（从开始）--%>
<hr>
<%
    List<String> list = new ArrayList<>();
    list.add("小鹿般");
    list.add("打击");
    list.add("后裔");
    request.setAttribute("list", list);
%>
<c:forEach items="${list}" var="str" varStatus="s">
    ${s.index}-------${s.count} ${str}
</c:forEach>


</body>
</html>
