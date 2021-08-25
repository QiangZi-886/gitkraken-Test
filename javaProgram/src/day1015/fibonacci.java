package day1015;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//斐波那契数列的算法，并且可以打印出想要的值得数量。
public class fibonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入需要打印的斐波那契数列的个数");
        int count=scan.nextInt();
        int x=1;
        int y=1;
        int z=0;
        for (int i=1;i<=count;i++){
            if ((i==1) || (i==2)){
                System.out.print(1+"\t");
            }else{
                z=x+y;
                y=x;
                x=z;
                System.out.print(z+"\t");
            }
        }
    }
}
