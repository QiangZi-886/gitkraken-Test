package MyStudy;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
* 请求转发的特点：
*   1、浏览器地址栏没有变化
*   2、他们是一次请求
*   3、他们共享request域中的数据
*   4、！！！可以转发到WEB-INF目录下(一般的Servlet项目都无法直接去访问WEB-INF中的内容，但是通过请求转发可以访问到WEB-INF下的资源)
*   5、不可以访问工程以外的资源
* */
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求的参数(办事的材料)查看
        String username = req.getParameter("username");
        System.out.println("在Servlet1中查看参数："+username);
        //给材料加一个章,并传递到Servlet2中
        req.setAttribute("key","Servlet1已经成功盖章");

        //转向Servlet2的路径
        /*
        * 请求转发必须要以/打头，/ 表示http://ip:port/工程名/
        * */
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/servlet2");

        //路径获取到之后，转向Servlet2操作
        requestDispatcher.forward(req,resp);
    }
}
