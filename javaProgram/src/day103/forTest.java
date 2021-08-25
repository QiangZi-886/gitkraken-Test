package day103;
import java.util.Scanner;
public class forTest {
    public static void main(String[] args){
    Scanner scan=new Scanner (System.in);
    System.out.println("请输入第一个数");
    int num1=scan.nextInt();
    System.out.println("请输入第二个数");
    int num2=scan.nextInt();
    //利用三元函数获取最小数
        //获取最大公约数
        int min=(num1<=num2)?num1:num2;
        for (int i=min;i>=1;i-- ){
            if(num1%i==0&&num2%i==0){
                System.out.println(i);
                break;
            }

        }
        //获取最小公倍数
        int max=(num1>=num2)?num1:num2;
        for (int j=max;j<=num1*num2;j++){
            if(j%num1==0&&j%num2==0){
                System.out.println(j);
                break;

            }
        }



    }
}
