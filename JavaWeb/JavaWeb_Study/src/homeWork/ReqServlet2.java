package homeWork;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ReqServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset = UTF-8");

        Object name = req.getAttribute("name");
        Object id = req.getAttribute("id");

        resp.getWriter().write("从ReqServlet1中获得的name值为："+name+"<br>");//在客户端上的换行操作
        resp.getWriter().write("从ReqServlet1中获得的id值为："+id);
    }
}
