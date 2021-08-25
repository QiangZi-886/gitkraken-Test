package oopTest;

public class oop001 {
    public static void main(String[] args) {
        oop001 o1=new oop001();
        //o1.method();
        //int area=o1.method();
        //System.out.println("面积为:"+area);
        System.out.println(o1.method()); //也可以不用定义变量来接收方法中的返回值，直接引用方法即可（只是没有汉字注释）

        oop001 o2=new oop001();
       // o2.method1(10,38);
        int area=o2.method1(10,38);
        System.out.println("新的面积为:"+area);


    }


    //测试一：输出一个10*8的矩形,并返回一个矩形的面积
    public int method(){
        for (int i=0;i<10;i++){
            for (int j=0;j<8;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return 10*8;

    }


    public int method1(int m,int n){
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return m*n;
    }
}



