<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/5/1
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试四大域对象</title>
</head>
<body>
    <h1>scope2.jsp页面</h1>
    pageContext域中是否有数据：<%=pageContext.getAttribute("key")%><br>
    request域中是否有数据：<%=request.getAttribute("key")%><br>
    session域中是否有数据：<%=session.getAttribute("key")%><br>
    application域中是否有数据：<%=application.getAttribute("key")%><br>
</body>
</html>
