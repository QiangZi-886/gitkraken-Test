package oopDemo;

//测试类。      注意：Java中的参数传递都是值传递！

public class TestoopDemo1 {
    public static void main(String[] args) {
        oopDemo1 a1 = new oopDemo1();
        System.out.println("年龄:"+a1.age);
        System.out.println("发色:"+a1.hirecolor);
        System.out.println("名字:"+a1.name);
        a1.like("打篮球");
        System.out.println("********************************");
        oopDemo1 a2 = new oopDemo1();
        a2.age=25;
        a2.hirecolor = "黄色";
        a2.name = "小华";
        System.out.println("年龄"+a2.age);
        System.out.println("发色:"+a2.hirecolor);
        System.out.println("名字:"+a2.name);
        a2.like("打游戏");
    }
}
