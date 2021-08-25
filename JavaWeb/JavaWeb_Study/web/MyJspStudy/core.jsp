<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/5/2
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>set语句保存的使用</title>
</head>
<body>


        保存之前：${ requestScope.adc }<br><%-- 内容为空--%>
        <c:set scope="request" var="abc" value="abc的值"></c:set>
        保存之后：${requestScope.abc}<br>

        <c:if test="${12 == 12}">
            <h1>杨哥好帅</h1>

        </c:if>
</body>
</html>
