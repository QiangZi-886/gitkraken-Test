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
    <h1>scope.jsp页面</h1>

    <%--
        四大域对象
     包括pageContext  (PageContextimpl类)：当前jsp页面范围内有效
        request     (HttpServeltRequest类)：一次请求内有效
        session     (HttpSession类)：一次会话有效（打开浏览器访问服务器，直到关闭浏览器）
        application (ServletContext类（服务器上下文）)：整个web工程下有效（只要web工程不停止，数据都在）
    --%>
    <%
//        往四个域中分别保存数据
        pageContext.setAttribute("key","pageContext");
        request.setAttribute("key","request");
        session.setAttribute("key","session");
        application.setAttribute("key","application");
    %>

    pageContext域中是否有数据：<%=pageContext.getAttribute("key")%><br>
    request域中是否有数据：<%=request.getAttribute("key")%><br>
    session域中是否有数据：<%=session.getAttribute("key")%><br>
    application域中是否有数据：<%=application.getAttribute("key")%><br>

    <%
//         request.getRequestDispatcher("/homeWork/scope2.jsp").forward(request,response);
    %>
    <%--jsp当中的请求转发，就是使用下面的语句做转发，和Dispacher的效果是一样的--%>
    <jsp:forward page="scope2.jsp"></jsp:forward>
</body>
</html>
