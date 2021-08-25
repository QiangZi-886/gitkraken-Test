<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/4/30
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>a.jsp中的内容</title>
</head>
<body>
    <%Thread.sleep(5000);%>
    当你的程序以一种奇怪的方式跑起来的时候，就不要去动它了！！！

    <%=request.getParameter("username")%>
</body>
</html>
