package main;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ReferServlet")
public class ReferServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            //获取http中的Refer
            String refer = request.getHeader("Refer");
            //判断refer是否符合标准：不允许直接访问、不允许除了前缀为http://localhost:8080其他页面访问
            if (refer == null || !refer.startsWith("http://localhost:8080/JavaWeb_war_exploded/ReferServlet")){

                response.sendRedirect("http://localhost:8080/JavaWeb_war_exploded/wrongPath.jsp");
                return;
            }
            else {
                request.getRequestDispatcher("truePath.jsp").forward(request,response);
            }
        }
    }

