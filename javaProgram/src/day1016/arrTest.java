package day1016;

import java.util.Scanner;

public class arrTest {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[10];
        int x=0;
        System.out.println("请输入十个整数");
        //利用for循环输入数组中的10整数
        for(int i=0;i<10;i++){
            arr[i]=scan.nextInt();
        }

        //利用冒泡排序给数组中的元素排序
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(arr[i]>arr[j]){
                    x=arr[i];
                    arr[i]=arr[j];
                    arr[j]=x;
                }
            }
        }
        //数组的遍历输出
        System.out.println("排序后数组为:");
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+"\t");
        }

    }
}
