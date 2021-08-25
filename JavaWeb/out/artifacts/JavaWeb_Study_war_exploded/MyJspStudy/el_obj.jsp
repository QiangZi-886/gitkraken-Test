<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/5/2
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试param和paramValues</title>
</head>
<body>
    输出请求参数username的值：${param.username}<br>
    输出请求参数password的值：${param.password}<br>
    输出请求参数hobby的值：${paramValues.hobby[0]}<br>
    输出请求参数hobby的值：${paramValues.hobby[1]}<br>

    输出请求头中的【User-Agent】的值：${header['User-Agent']}

</body>
</html>
