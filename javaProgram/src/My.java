import java.util.Scanner;
public class My {
    public static void main(String args[]) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("请输入开机密码！");
        double p1 = scan.nextDouble();
        if (p1 == 66.6) {
            System.out.print("输入正确");
        } else {
            System.out.println("输入错误66.6");
        }*/
/************************************************************************************/

        //创建一个一维数组，并且使用Scanner语句来初始化一维数组
/*
        int arr1[] = new int[10];
        int arr2[] = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组中的十个元素:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();
        arr2 = arr1;//地址上的复制，修改其中的任何一个，两个都会更改
        for (int i=0;i<arr2.length;i++) {
            System.out.print(arr2[i]+" ");
        }
*/
        //真正意义上的数组的复制 区别于数组变量的赋值（arr4 = arr3），数组的复制需要新建一个跟之前一样大小的空间（new int [arr3.length]）
        int arr3[]= {1,2,9,9,2,6,5,4,7,5};
        for (int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
        int arr4[]=new int[arr3.length];
        for(int i=0;i<arr4.length;i++){
            arr4[i]=arr3[i];
            System.out.print(arr4[i]+" ");
        }
//数组的查找：针对于String类型的数组，使用线性查找来寻找元素不能够像int型一样在判断句中直接使用“==”而是要使用下面的方式
        /*
        * String []str ={"A","B","C","D","C","E"};
        * String dest="C";
        * boolean isFlag=True;
        * for(int i=0;i<str.length;i++){
        *          if(dest.equals(str[i])){
        *           Sout (成功找到，在第“i+1"个位置);
        *           isFlag=False;
        *           break;     成功找到元素，不需要继续往比较
        *  }
        * }
        * if(isFlag){
        *   sout(查找失败);
        * }
        * */
    }
}