package MyStudy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseIOServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset = UTF-8");
        //响应获取字符串的流，并回传给客户端
        PrintWriter writer = resp.getWriter();//注意，这个方法必须在获取流之前声明
        /*响应获取字节流，回传客户端。但是，这两种获取的方式在一个Servlet中，只能有其一，两个都写是错误的
        resp.getOutputStream();*/

        /*设置解决中文乱码的问题,两种方式
            1、通过设置响应头来解决中文乱码的问题
                resp.setHeader("Content-Type","text/html;charset=UTF-8")
            2、直接通过setContext()方式直接设置浏览器编码格式（更方便）
                resp.setContType("text/html;charset = UTF-8")
        */

        writer.write("response's content!!!!");
        writer.println("成功响应！！！！");

    }
}
