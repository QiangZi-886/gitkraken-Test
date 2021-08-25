package day1026;

import java.util.SplittableRandom;

public class fruit {
    public String kinds;//水果种类
    public String taste;//水果的味道


    public void eat(){
        System.out.println("我可以被吃，给人们补充维生素");
    }

    public void function(){
        System.out.println("成熟的水果可以拿来当别的生果子的催熟剂");
    }
}


class Apple extends fruit{
    public void eat(){
        System.out.println("苹果只需要洗干净就可以连皮吃");
    }
}


class Peach extends fruit{
    public void eat(){
        System.out.println("桃子需要把皮削掉才可以吃");
    }
}