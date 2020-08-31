<%@ page import="neusoft.el.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/8/31
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user=new User();
    user.setName("小桌子");
    user.setAge(23);
    user.setBirthday(new Date());
    request.setAttribute("u", user);
    List<Object> list = new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    list.add(user);
    request.setAttribute("list",list);
    HashMap<String, Object> map = new HashMap<>();
    map.put("sname","赵四");
    map.put("gender", "男");
    map.put("user", user);
    request.setAttribute("map",map);
%>
<h1>获取对象中的值</h1>
${requestScope.u}
${requestScope.u.name}
${u.age}
${u.birthday}
<h3>获取list值</h3>
${requestScope.list}
${list}
${list[0]}
${list[1]}
${list[2]}

<h3>获取map值</h3>
${requestScope.map}
${map}
${map.gender}

</body>
</html>
