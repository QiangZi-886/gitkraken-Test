<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/5/1
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试一些jsp语句的使用</title>
</head>
<body>
    <%!
        int a = 123;
    %>

<%--    表达式脚本   用来输出到客户端--%>
    <%=a%><br>
    <%=request.getParameter("username")%>

<%--    代码脚本--%>
    <%
        int i = 10;
        if (i == 10){
            System.out.println("ScholarYang");
        }
//        else同理
    %>

    <%
        for (int j = 0;j<10;j++){
            System.out.println(j);
        }
    %>

    <%
        String username = request.getParameter("username");
    %>

    <table border="1" cellspacing="0">
        <%
            for (int z = 0;z<10;z++){
        %>
        <tr>
            <td>第<%=z%>行</td>
        </tr>
            <%
            }
            %>

    </table>
</body>
</html>
