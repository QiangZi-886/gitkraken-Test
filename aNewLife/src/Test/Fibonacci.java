package Test;

import java.util.Scanner;

/*
* 打印输出斐波那契数列，数列的个数由输入台控制
* */
public class Fibonacci {
    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.print("请输入要输出的斐波那契数列的个数：");
//        int count = scan.nextInt();
//        int x=1;
//        int y = 1;
//        int z =0;
//        for (int i = 0;i<count;i++){
//            if ((i == 0)||(i ==1)){
//                System.out.print(1+"\t");
//            }
//            else {
//                z=x+y;
//                x=y;
//                y=z;
//                System.out.print(z+"\t");
//            }
//        }
        Scanner scan = new Scanner(System.in);
          System.out.print("请输入要输出的斐波那契数列的个数：");
          int count = scan.nextInt();
          for (int i=1;i<=count;i++){
              System.out.print(getNumber(i)+"\t");          //使用递归函数解决斐波那契数列的输出
          }
    }
    //注意！在程序的使用中能不适用递归就不适用递归，递归算法会加大资源的消耗，如果递归层次较深还可能会造成栈溢出
    public static int getNumber(int number){
        if (number == 1||number == 2){
            return 1;
        }
        else {
            return getNumber(number - 1)+getNumber(number -2);
        }
    }
}
