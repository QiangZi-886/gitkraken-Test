<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>
<%@ page import="homeWork.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/5/2
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>使用forEach遍历1到10</title>
</head>
<body>
    <%--
        begin   属性设置开始的索引
        end 属性设置结束的索引

        var 属性表示循环的变量(也是当前正在遍历到的数据)
        for(int i = 1;i<=10;i++)
    --%>
    <c:forEach begin="1" end="10" var="i">
        ${i}
    </c:forEach>


    <table border="1" cellspacing="0">
        <c:forEach begin="1" end="9" var="j">
            <tr>
                <td>
                    第${ j }行
                </td>
            </tr>
        </c:forEach>
    </table>

        <%--遍历Object数组
            for(Object items:arr)

            在forEach()循环中的数据分别表示：
                items  表示遍历的数据源
                var  表示当前遍历到的数据
        --%>
    <%
        request.setAttribute("arr",new String[]{"我是1","我是2","我是3","我是4"});
    %>
    <c:forEach items="${requestScope.arr}" var="item">
        ${ item }<br>
    </c:forEach>


<%--    遍历Map--%>
    <%
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
        //之前使用过的遍历方法
//        for (Map.Entry<String,Object> entry:map.entrySet()){
//    }
        request.setAttribute("map",map);
    %>

    <c:forEach items="${requestScope.map}" var="entry">
        ${ entry }
    </c:forEach>

<%--    遍历一个学生类型的List集合
        属性有：编号、用户名、年龄、电话信息
--%>
    <%
        List<Student> studentList = new ArrayList<Student>();
        for (int i = 1;i<=10;i++){
            studentList.add(new Student(i,"name"+i,18+i,"phone"+i));
        }

        request.setAttribute("stus",studentList);
    %>

    <table border="1" cellspacing="0">
        <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>手机号</th>
        </tr>
        <c:forEach items="${requestScope.stus}" var="stu">
        <tr>
            <td>${stu.id}</td>
            <td>${stu.name}</td>
            <td>${stu.age}</td>
            <td>${stu.phone}</td>
        </tr>
        </c:forEach>

    </table>

</body>
</html>
