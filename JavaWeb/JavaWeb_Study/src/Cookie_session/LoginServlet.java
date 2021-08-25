package Cookie_session;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (username.equals("yang") && password.equals("12345")){
            //登录成功
            Cookie cookie = new Cookie("username",username);
            resp.addCookie(cookie);
            System.out.println("登录成功!!");
        }else {
            //登录失败
            System.out.println("登录失败!!");
        }
    }
}
