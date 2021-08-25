package day1111;

import java.util.concurrent.CancellationException;

public class Test {
    public static void main(String[] args) {
//        MotoVehicle moto = new MotoVehicle();  虽然抽象的父类中有构造方法，但是依然不能被创建对象。因为父类被abstract修饰着。
//        Car car = new Car(4,"奔驰","奔驰");
//
//        System.out.println("租金是:"+car.calcRent(2));
//
//        Bus bus = new Bus(666,"金龙",20);
//
//        System.out.println("租金是:"+bus.calcRent(2));

        System.out.println("******************************");


        MotoVehicle[] moto = new MotoVehicle[4];
        moto[0]=new Car(333,"宝马","宝马");
        moto[1]=new Car(222,"宝马","宝马");
        moto[2]=new Car(444,"奔驰","奔驰");
        moto[3]=new Bus(555,"金龙",20);

        int totalMoney = 0;
        for (int i=0;i<moto.length;i++){
            totalMoney+=moto[i].calcRent(5);
        }
        System.out.println("总租金为："+totalMoney);
    }
}
