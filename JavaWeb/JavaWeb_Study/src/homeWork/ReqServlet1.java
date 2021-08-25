package homeWork;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ReqServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name","yang");
        req.setAttribute("id","123456");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/reqServlet2");
        requestDispatcher.forward(req,resp);
    }
}
