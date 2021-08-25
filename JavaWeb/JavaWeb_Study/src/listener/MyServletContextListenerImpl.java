package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/**
 *  ServletContextListener监听器是作为一个接口出现的(具体的使用明细在SpringBoot中了解)：
 *      1、继承了EventListener类
 *      2、其中的第一个方法是在servletContext对象创建的时候立即初始化调用
 *      3、第二个方法是在servletContext对象销毁的时候调用
 *
 *  ServletContext的使用：
 *      1、在写好类之后实现ServletContext接口，写出实现方法
 *      2、在web.xml中配置当前servlet程序的映射地址。
 */
public class MyServletContextListenerImpl implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext对象被创建了！！");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext对象被销毁了！！");
    }
}
