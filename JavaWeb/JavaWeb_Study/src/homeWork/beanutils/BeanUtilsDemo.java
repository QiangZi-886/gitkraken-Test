package homeWork.beanutils;

import homeWork.javaBeanTest.Person;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class BeanUtilsDemo {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            BeanUtils.setProperty(person,"name","Tom");
            BeanUtils.setProperty(person,"age",31);
            BeanUtils.setProperty(person,"hobby","睡觉");

            String name = BeanUtils.getProperty(person,"name");
            String age = BeanUtils.getProperty(person,"age");
            String hobby = BeanUtils.getProperty(person,"hobby");

            System.out.println("我的姓名是："+name+"，今年："+age+"岁了,我喜欢："+hobby);


            //使用pupolate方法,创建Map集合，并添加person元素
            Map<String,Object> info = new HashMap<String, Object>();
            info.put("name","菜虚困");
            info.put("age",50);
            info.put("hobby","唱、跳、rap");

            BeanUtils.populate(person,info);
            System.out.println("下一位选手");
            System.out.println("姓名"+ person.getName()+",年龄"+ person.getAge()+"，爱好"+ person.getHobby());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
