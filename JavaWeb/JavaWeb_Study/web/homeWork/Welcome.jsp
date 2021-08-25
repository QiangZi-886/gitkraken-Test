<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/5/2
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>第七章第四题</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/homeWork/Welcome.jsp">
    <c:if test="${empty param.username}">
        姓名：<input type="text" name="username">
            <input type="submit" value="提交">
    </c:if>
    <c:if test="${not empty param.username}">
        ${param.username} welcome to click!!!!<br>
    </c:if>

    </form>
</body>
</html>
