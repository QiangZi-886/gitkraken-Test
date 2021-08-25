<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/5/1
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>输出语句的测试</title>
</head>
<body>
    <%
        out.write("out输出1 <br/>");
        out.write("out输出2 <br/>");

        response.getWriter().write("哇咔咔  response输出1 <br/>");
        response.getWriter().write("response输出2 <br/>");

    %>
</body>
</html>
