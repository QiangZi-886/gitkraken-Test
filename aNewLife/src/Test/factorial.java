package Test;

import java.math.BigInteger;
import java.util.Scanner;

/*
* 使用递归算法求阶乘
*
* */
//public class factorial {
//    public static void main(String[] args) {
//        System.out.println("请输入需要求的阶乘的数字：");
//        Scanner scan = new Scanner(System.in);
//        int count = scan.nextInt();
//        System.out.println("阶乘为："+getNumber(count));
//        String s = Integer.toString(getNumber(count));
//        System.out.println("输出的长度为："+s.length());
//    }
//    public static int getNumber(int number){
//        if ((number ==0) ||(number==1)){
//            return 1;
//        }
//        else {
//            return number*getNumber(number-1);
//        }
//    }
//}
//***************************************************************************
//使用Java中的BigInteger封装包计算n的阶乘：

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要求值的阶乘：");
        int count = sc.nextInt();
        BigInteger bigInteger = new BigInteger("1");
        for (int i=1;i<=count;i++){
            bigInteger = bigInteger.multiply(new BigInteger(i+""));
        }
        System.out.println("阶乘为："+bigInteger);

    }
}