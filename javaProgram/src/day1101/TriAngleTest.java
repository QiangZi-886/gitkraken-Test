package day1101;

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t=new TriAngle();
        t.setBase(2.5);
        t.setHeight(3.5);


        System.out.println("三角形底边长："+t.getBase()+"，高为："+t.getHeight());//通过方法的调用赋值

        TriAngle t2=new TriAngle(5.3,4.9);

        double area=t2.area();

        System.out.println("三角形底边长："+t2.getBase()+"，高为："+t2.getHeight());//通过构造器对属性赋默认值
        t2.area();
        System.out.println("三角形面积为:"+area);
    }
}
