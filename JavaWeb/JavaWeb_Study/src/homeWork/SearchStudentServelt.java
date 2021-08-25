package homeWork;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchStudentServelt extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求的参数
        //发sql语句查询学生的信息

        //利用for循环生成查询到的数据做模拟查询
        List<Student> studentList = new ArrayList<Student>();

        for (int i = 1;i<=10;i++){
            int t = i+1;
            studentList.add(new Student(t,"name"+t,18+t,"8888"+t));
        }

        //保存查询到的结果（学生信息）到request域中

        req.setAttribute("stuList",studentList);
        //请求转发到showStudent.jsp中显示到客户端

        req.getRequestDispatcher("/homeWork/studentDemo.jsp").forward(req,resp);
    }
}
