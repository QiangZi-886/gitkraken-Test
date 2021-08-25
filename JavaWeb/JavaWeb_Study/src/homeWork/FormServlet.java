package homeWork;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String token = String.valueOf(System.currentTimeMillis()+Math.random()*999);//创建随机令牌

//        System.out.println("在FormServlet中生成的随机令牌是："+token);

        HttpSession session = req.getSession();
        session.setAttribute("token",token);

        req.getRequestDispatcher("SubForm.jsp").forward(req,resp);

    }
}
