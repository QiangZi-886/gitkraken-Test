package day1015;

import java.util.Scanner;

public class displayDouble2 {
    public static void main(String[] args){
        int arr1[][]={{1,2,3},{7,8},{9,9,9}};
        int sum=0;//记录总和
        /*System.out.println("请输入三行三列的元素:");
        Scanner scan=new Scanner(System.in);
        int s1=scan.nextInt();
        System.out.println("输入元素成功，遍历二维数组为:");*/
        //试验for循环遍历二维数组需要内嵌一个for循环，同理：多维数组的遍历都需要嵌套相应数量的for循环。


        // 多维数组： 其实是一维数组的元素依旧是一个数组。（引用型变量的默认值是null。）
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+" ");
                sum+=arr1[i][j];

            }

            System.out.println();
        }
        System.out.println("数组的和为：");
        System.out.println(sum);
    }
}
