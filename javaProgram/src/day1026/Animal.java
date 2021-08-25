package day1026;



public class Animal {
    String kinds;//品种
    String color;//颜色

    public void  isFeeded(){
        System.out.println("我要吃饭");
    }

    public void out(){
        System.out.println("我要出门玩");
    }


}

class Dog extends Animal{
    public void isFeeded(){
        System.out.println("喂狗一块肉");
    }
}

class Cat extends Animal{
    public void isFeeded(){
        System.out.println("喂猫一条鱼");
    }
}




