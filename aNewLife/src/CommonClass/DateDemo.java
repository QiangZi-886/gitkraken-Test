package CommonClass;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        //System.out.println(date.getYear());//121 得到的年份是从1900年开始算，加上121就是今年的年份
        //System.out.println(date.getTime());//返回当前date对应时间的毫秒值
        //其中可以写成y-M-d H-m-s,只不过写成下面这种格式会更加规范
        //将Date类按照规范转换(format 格式化)为字符串格式
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str =dateFormat.format(date);
        System.out.println(str);
        //将字符串转换为日期类、
        Date d1 = dateFormat.parse("2000-02-27 07:28:45");
        System.out.println(d1);

        //获取当前系统时间
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        //获取指定指定时间的日历类
        calendar.setTime(d1);//参数为指定创建的Date类对象。
        System.out.println(calendar);//返回指定日历类对象的值
    }
}
