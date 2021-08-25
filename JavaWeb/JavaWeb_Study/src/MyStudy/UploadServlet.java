package MyStudy;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.util.List;

public class UploadServlet extends HttpServlet {

    /**
     * 用来处理上传的数据
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html;charset=UTF-8");
//        resp.getWriter().write("文件上传过来了!!!");

        //注意，文件的上传协议中是以文件流的形式上传的，所以在服务器上也要以流的形式读取。直接使用表单的name属性是读不到的
//        System.out.println(req.getParameter("username"));
//        System.out.println(req.getParameter("photo"));
//
//        ServletInputStream inputStream = req.getInputStream();
//
//        byte[] car = new byte[1024*1024];
//
//        int read = inputStream.read(car);
//        System.out.println(new String(car,0,read));

        //1、先判断上传的数据是否是多段数据（只有是多段数据，才是文件上传的）
        if (ServletFileUpload.isMultipartContent(req)){
            //创建FileItemFactory工厂实现类
            FileItemFactory fileItemFactory = new DiskFileItemFactory();
            //创建用于上传的数据工具类ServletFileUpload类
            ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
            //解析上传的数据，得到一个表单项FileItem
            try {
                List<FileItem> list = servletFileUpload.parseRequest(req);
                // 循环判断，每一个表单项，是普通类型，还是上传的文件
                for (FileItem fileItem : list) {
                    if (fileItem.isFormField()) {

                        // 普通表单项
                        System.out.println("普通表单项的name属性值：" + fileItem.getFieldName());
                        //参数UTF-8解决乱码问题
                        System.out.println("普通表单的value属性值："+ fileItem.getString("UTF-8"));
                    } else {
                        // 上传的文件
                        System.out.println("表单项的name属性值：" + fileItem.getFieldName());
                        System.out.println("上传的文件名：" + fileItem.getName());


                        fileItem.write(new File("E:\\"+fileItem.getName()));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
