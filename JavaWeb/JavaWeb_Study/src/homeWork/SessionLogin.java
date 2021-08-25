package homeWork;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建和获取session
        HttpSession session = req.getSession();
        //获取表单中的输入内容
        session.setAttribute("username",req.getParameter("username"));

        session.setMaxInactiveInterval(5);

        boolean flag = session.isNew();//设置boolean类型用以判断当前设置的session是否过期，当flag标志为true时，证明当前session被新创建了，即为当前session超时过期

        while (flag == true){//利用while循环来判断session是否过期。注意这里不能使用if()循环，if()循环只能判断一次。
            System.out.println("登录失效，请重新登录！！");
            req.getRequestDispatcher("LoginTest.html").forward(req,resp);
        }
        System.out.println("登录成功！！");

    }
}
