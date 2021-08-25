package day1116;

import day1029.Circle;

public class CricleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        double r1 = 2.5;
        Circle circle2 = new Circle();
        double r2 = 2.6;
        System.out.println("半径是否相等？："+circle1.equals(circle2));  //equals（）比较的是引用对象的数值大小，==比较的是引用数据的地址值

    }
}
