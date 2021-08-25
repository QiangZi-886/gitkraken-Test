package day1031;



//面相对象的特征之一：封装与隐藏


import day1026.Animal;

public class AnimalTest {
    public static void main(String[] args) {
        animal a=new animal();
        a.age=1;
        a.name="大黄";
        //a.leg=-2;//注意！此时的腿的个数为-2也是正确的.
        a.setlegs(5);
        a.show();
        a.eat();
    }
}


class animal {
    int age;
    //int leg;//一般情况中，leg的数量是正数，而且是双数。但是在实际运用中，你给其赋负数也不会报错，因为只要是属于int类型的范围都是正确的。
            //现在来实现给这个属性封装，并让其只能在出现在正确的范围内.
    private int leg;//对leg属性进行封装，使之成为私有属性。
    String name;

    public void eat(){
        System.out.println("大黄吃东西");
    }

    public void show(){
        System.out.println("name:"+name+"age:"+age+"有："+leg+"条腿");
    }

    public void setlegs(int l) {
        if ((l>=0)&&(l%2==0)){
            leg=l;
        }else{
            leg=0;//表示leg属性赋值有错
        }
    }


    public int getlegs(){
    return leg;
    }
}
