<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/4/30
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>第七章第三题</title>
</head>
<body>
    <c:choose>
        <c:when test="${empty param.username}">
            unKnown user. <br>
        </c:when>
        <c:when test="${param.username=='itcast'}">
            ${param.username} is manager!! <br>
        </c:when>
        <c:otherwise>
<%--            you are a employee! <br>--%>
            <c:choose>
                <c:when test="${param.username=='yhq'}">
                    琪哥好帅！
                </c:when>
                <c:when test="${param.username=='yhq227'}">
                    小傻瓜我从不骗人
                </c:when>
            </c:choose>
        </c:otherwise>
    </c:choose>
</body>
</html>
