package Cookie_session;

import Cookie_session.util.Cookieutils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
* Cookie会话技术实际上就是创建一个键值对，由服务器发送给客户端，客户端对这个键值对进行保存
* */
public class CookieServlet extends BaseServlet{

    protected void createCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1、创建Cookie对象
        Cookie cookie = new Cookie("key1","value1");//实际上Cookie就是一个键值对

        Cookie cookie1 = new Cookie("key2","value2");
        //2、通知客户端保存Cookie
        resp.addCookie(cookie);
        resp.addCookie(cookie1);

        resp.getWriter().println("Cookie创建成功！！");
    }

    protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //服务器获取Cookie只需要一行代码
        Cookie[] cookies = req.getCookies();
        //getName()返回cookie的Key（名）
        //getValue()返回cookie的Value（值）
        for (Cookie cookie:cookies){
            resp.getWriter().println("Cookie["+ cookie.getName() +"="+ cookie.getValue() + "] <br/>");
        }

        Cookie iWantCookie = Cookieutils.findCookie("key2",cookies);

//        for (Cookie cookie:cookies){
//            if (("key2").equals(cookie.getName())){
//                iWantCookie = cookie;
//            }
//        }

        if (iWantCookie!=null){
            resp.getWriter().write("找到了对应的Cookie"+iWantCookie.getName());
        }
    }


    protected void updateCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        * 修改Cookie中的值：
        *   1、使用Cookie中重新赋值会覆盖掉之前cookie的方法
        *   2、先查找到需要修改的cookie对象，然后调用setValue()方法赋予新的Value值，最后通知客户端保存修改
        * */
        //**********方案一***********：
        //首先创建一个跟之前创建的cookie的同名（key）的cookie
//        Cookie cookie = new Cookie("key1","newValue1");
//        //传递给客户端保存修改
//        resp.addCookie(cookie);
//
//        resp.getWriter().println("cookie值已经修改完成");

        //**********方案二************：
        Cookie cookie = Cookieutils.findCookie("key2",req.getCookies());
        if (cookie!=null){
            cookie.setValue("newValue2");
            //通知客户端保存修改
            resp.addCookie(cookie);

            resp.getWriter().println("名称为key2的cookie对象已经修改完！！");
        }
    }


    protected void defaultCookieLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**设置cookie的声明周期。使用setMaxAge()方法
         *  1、正数表示cookie在指定的时间之后消除(正数的单位是秒)
         *  2、负数表示关闭浏览器值后cookie消除（一般默认都是-1）
         *  3、零表示立即删除
         */
        //指定一个cookie
        Cookie cookie = new Cookie("default","default");
        //设置次cookie的生命周期
        cookie.setMaxAge(-1);
        //发送给客户端，保存修改
        resp.addCookie(cookie);
    }


    protected void deleteCookieNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //先找到要删除的cookie对象,并对其进行赋值
        Cookie cookie = Cookieutils.findCookie("key1",req.getCookies());
        cookie.setMaxAge(0);
        //调用resp.addCookie()方法，让客户端保存修改
        resp.addCookie(cookie);

    }


    //设置cookie的存活时间为3600秒（一个小时）
    protected void cookieLife3600(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            Cookie cookie = new Cookie("lifeTime","valueTime");
            //为cookie存活时间赋值为3600秒
            cookie.setMaxAge(60 * 60);
            //通知客户端保存修改
            resp.addCookie(cookie);

            resp.getWriter().write("存活时长为3600s的cookie创建完毕");
    }


    protected void testPath(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建指定path路径的cookie
        Cookie cookie = new Cookie("cookiePathTest","pathTest");
        cookie.setPath( req.getContextPath()+"/abc" );

        resp.addCookie(cookie);

        resp.getWriter().write("指定路径的cookie创建完毕!!!!");
    }
}
