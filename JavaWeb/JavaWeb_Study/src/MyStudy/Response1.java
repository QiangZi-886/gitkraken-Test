package MyStudy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
* 请求重定向的特点：
 *   1、浏览器的地址变化
 *   2、两次请求，都有客户端（浏览器发起）
 *   3、不能将请求重定向到WEB-INF目录下（因为这个请求是由客户端发起的，客户端不能直接访问WEB-INF目录）
 *   4、可以访问工程以外的资源（http://www.baidu.com）
* */
public class Response1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*请求重定向有两种方式来实现
        1、使用如下方法，一一设置

        //设置响应码 (302表示已搬迁)
        resp.setStatus(302);
        //设置响应头，并设置好转发路径
        resp.setHeader("Location","http://localhost:8080/JavaWeb_Study/response2");
         */

        //2、使用sendRedirect()方法实现资源重定向(推荐使用)
        resp.sendRedirect("http://localhost:8080/JavaWeb_Study/response2");
//        resp.sendRedirect("http://www.baidu.com");
    }
}
