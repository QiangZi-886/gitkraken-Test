<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/5/9
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <form action="http://localhost:8080/JavaWeb_Study/uploadServlet" enctype="multipart/form-data" method="post">
        用户名：<input type="text" name="username"><br>
        头像:<input type="file" name="photo"><br>
        <input type="submit" value="上传">
    </form>
</body>
</html>
