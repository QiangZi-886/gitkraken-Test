package Cookie_session.util;

import javax.servlet.http.Cookie;

public class Cookieutils {
    /**
     * 查找指定名称的cookie对象
     * @param name
     * @param cookie
     * @return
     */
    public static Cookie findCookie(String name,Cookie[] cookies){
        if (name==null || cookies==null || cookies.length ==0){
            return null;
        }

        for (Cookie cookie:cookies){
            if (name.equals(cookie.getName())){
                return cookie;
            }

        }
        //在不为空的cookie对象中没有找到的话，也返回null
        return null;
     }
}
