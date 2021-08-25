package homeWork;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FormServletTest extends HttpServlet {

    /**
     * isRepeat方法来判断表单是否重复提交
     * @param req
     * @return
     */
    public boolean isRepeat(HttpServletRequest req){
        //获取servlet中设置的token
        String token = (String) req.getSession().getAttribute("token");
        //获取客户端的token令牌
        String forToken = req.getParameter("token");

        if ((token == null)||(forToken == null)){
            return true;
        }
        else if (token.equals(forToken)){
          return false;
        }
        else {
            return false;
        }

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean b = isRepeat(req);
//        System.out.println("从表单中获取的token"+req.getParameter("token"));
//        System.out.println(b);
        if (b){
            System.out.println("请不要重复提交表单！！");
        }
        else {
            req.getSession().removeAttribute("token");
            System.out.println("正常登陆成功！！");
        }
    }
}
