<%@ page import="java.util.List" %>
<%@ page import="homeWork.Student" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/5/1
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>输出一个学生信息表</title>
    <style>
        table{
            border: 1px solid;
            width: 600px;
            border-collapse: collapse;
            color: brown;
        }
        tr,td{
            border: 1px solid;
            color: brown;
        }
    </style>
</head>
<body>
    <%
        List<Student> studentList = new ArrayList<Student>();
        for (int i = 1;i<=10;i++){
            int t = i+1;
            studentList.add(new Student(t,"name"+t,18+t,"0000"+t));
        }
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
