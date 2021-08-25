<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/4/30
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>第一个页面</title>
</head>
<%--
    <jsp:include page = ""></jsp:include>   这是动态包含
    page属性是指定你要包含的jsp页面的路径
    动态包含也可以像静态包含一样。把被包含的内容执行输出到包含位置


    动态包含的特点：
        1、动态包含会把包含的jsp页面也翻译成java代码
        2、动态包含底层代码使用如下代码去调用被包含的jsp页面执行输出。
          JspRuntimeLibrary.include(request,response,"目标jsp路径",out,false)
        3、动态包含还可以传递参数
--%>
<body>
    这是第一个页面<br>
    等待五秒访问a.jsp页面的内容:
    <jsp:include page="a.jsp" flush="true">
    <jsp:param name="username" value="yang"/>
    </jsp:include>


</body>
</html>
