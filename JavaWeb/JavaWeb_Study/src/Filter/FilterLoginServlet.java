package Filter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class FilterLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (("yang").equals(username)&&("123456").equals(password)){
            HttpSession session = req.getSession();
            session.setAttribute("user",username);
            resp.getWriter().write("登录成功!!");
        }else {
            req.getRequestDispatcher("/FilterLogin.jsp").forward(req,resp);
        }
    }
}
