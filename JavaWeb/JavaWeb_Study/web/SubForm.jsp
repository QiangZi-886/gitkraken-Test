<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>Session控制表单重复提交</title>
</head>
<body>
<form action="http://localhost:8080/JavaWeb_Study/formServletTest">
<!--     使用隐藏域来保存token令牌 -->
    <input type="hidden" name="token" value=" <%=session.getAttribute("token")%>">
    <input type="hidden" name="token" value="${token}"/>

    用户名：<input type="text" name="username"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>