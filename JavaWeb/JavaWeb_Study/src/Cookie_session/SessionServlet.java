package Cookie_session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/*
* 测试Session
*
* */

public class SessionServlet extends BaseServlet {

    protected void createOrGetSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建和获取Session
        HttpSession session = req.getSession();
        //判断Session是否为新创建的
        boolean isNew = session.isNew();
        //获取Session的唯一ID
        String id = session.getId();

        resp.getWriter().write("该Session的ID值为："+id+"<br>");
        resp.getWriter().write("该Session是否是新创建的："+isNew+"<br>");
    }

    /**
     * 在session中存储数据
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void setAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.getSession().setAttribute("key1","value1");
            resp.getWriter().write("数据存储完毕！！");
    }

    /**
     * 获取session中的数据
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void getAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object attribute = req.getSession().getAttribute("key1");
        resp.getWriter().write("从session中获取的值是:"+attribute);
    }
    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int maxInactiveInterval = req.getSession().getMaxInactiveInterval();
        resp.getWriter().write("默认的session存货周期是："+maxInactiveInterval+"秒");
    }

    /**
     * 设置session存活3秒之后销毁
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void life3(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //首先获取session对象
        HttpSession session = req.getSession();
        //设置session存活时长
        session.setMaxInactiveInterval(3);

        resp.getWriter().write("当前session存活时间设置为三秒之后销毁!!");
    }

    /**
     * 设置session立即删除
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //首先获取session
        HttpSession session = req.getSession();
        session.invalidate();
        resp.getWriter().write("设置session立即删除完毕！！！");
    }
}
