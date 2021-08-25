<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/5/9
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Filter过滤器的登录界面</title>
</head>
<body>
    我是FilterLogin界面，您还没有登录！！<br>
    <form action="http://localhost:8080/JavaWeb_Study/filterLoginServlet" method="get">
        用户名：<input type="text" name="username"><br>
        密  码：<input type="text" name="password"><br>
        <input type="submit">
    </form>
</body>
</html>
