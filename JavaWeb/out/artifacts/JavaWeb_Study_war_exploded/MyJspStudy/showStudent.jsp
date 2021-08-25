<%@ page import="java.util.List" %>
<%@ page import="homeWork.Student" %><%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/5/1
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数据库查询输出student信息测试</title>
</head>
<body>
    <%
        List<Student> studentList = (List<Student>) request.getAttribute("stuList");
    %>

    <table>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>手机号</td>
            <td>操作</td>
        </tr>
        <%for (Student student:studentList){%>
        <tr>
            <td><%=student.getId()%></td>
            <td><%=student.getName()%></td>
            <td><%=student.getAge()%></td>
            <td><%=student.getPhone()%></td>
            <td>删除、修改</td>
        </tr>
        <%}%>
    </table>

</body>
</html>
