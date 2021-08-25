package CommonClass;
/*
* 包装类与基本数据类型
*   包装类是将基本数据类型封装成一个类，包含属性和方法
*   使用：
*       在使用过程中，会涉及到自动装箱和自动拆箱
*       装箱：将基本数据类型转换成包装类
*       拆箱：将包装类转换成基本数据类型
*
*
*
* */
public class IntegerDemo {
    public static void main(String[] args) {
        int a = 10;
        Integer i = new Integer(10);
        System.out.println(a==i);
        //通过方法进行类型转换：
        //基本类型到Integer类型
        Integer i2 = Integer.valueOf(a);
        //从Integer类型到基本类型：
        int i3 = i.intValue();
        //面试题
        Integer a1 = 100;
        Integer a2 = 100;
        Integer a3 = 200;
        Integer a4 = 200;
        //上述式子其实是完成了一个a1.valueOf()的操作，实际在idea中，其值在[-128,127]的范围内是使用一个数组方法来进行换算的
        //但是超过此范围就是new Integer(i)的操作，所以当a3、a4等于两百时，分别是新建的两个，所以值为false
        System.out.println(a1==a2);//true
        System.out.println(a3==a4);//false

        //Double内部的valueOf()操作全部是新建 new，所以都不相等。
        Double b1 = 1.0;
        Double b2 = 1.0;
        Double b3 = 2.0;
        Double b4 = 2.0;
        System.out.println(b1==b2);//false
        System.out.println(b3==b4);//false
    }
}
