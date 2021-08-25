import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestAPIServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //一下内容都会展示在idea的Output控制台
        //1、getRequestURI() 获取请求的资源路径
        System.out.println("URI==>"+req.getRequestURI());
        //2、getRequestURL() 获取请求的统一资源定位符（绝对路径）
        System.out.println("URL==>"+req.getRequestURL());
        //3、getRemoteHost() 获取客户端ip地址
        //在使用真实的ip地址进行访问的时候，得到的也是真实的ip地址
        System.out.println("客户端的ip地址为："+req.getRemoteHost());
        //4、getHeader()  获取请求头,其中请求头有很多种
        System.out.println("请求头==>"+req.getHeader("Refer"));
        System.out.println("请求头==>"+ req.getHeader("User-Agent"));
        //getMethod() 获取请求的方式
        System.out.println("请求的方式==>"+ req.getMethod());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
