<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/4/20
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
    <form action="http://localhost:8080/JavaWeb_Study/loginServlet" method="get">
        用户名: <input type="text" name="username" value="${cookie.username.value}"><br>
        密码:<input type="password" name="password"><br>
        <input type="submit" value="登录">
    </form>
</body>
</html>
