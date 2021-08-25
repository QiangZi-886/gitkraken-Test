package Race.DiGui;
/*
* 使用递归求n的阶乘
*
*
*
* */

import java.util.Scanner;

public class factorialDiGui {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入要求阶乘的数字:");
        int num = scan.nextInt();
        factorialDiGui fac = new factorialDiGui();
        int a = fac.diGui(num);
        System.out.println(num+"的阶乘为："+a);
    }
    public int diGui(int i){
        if (i<=0){
            return 1;
        }
        else {
            return i*diGui(i-1);
        }
    }
}
