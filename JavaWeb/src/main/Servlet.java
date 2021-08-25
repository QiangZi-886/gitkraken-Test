package main;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();//封装web信息
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter printWriter = response.getWriter(); //设置输出函数
        Integer count = (Integer)context.getAttribute("count");   //

        if (count == null){
            count = new Integer(1);
        }
        else {
            count = new Integer(count.intValue() + 1);
        }
        printWriter.print("当前页面被访问过了"+count+"次");
        context.setAttribute("count",count);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
