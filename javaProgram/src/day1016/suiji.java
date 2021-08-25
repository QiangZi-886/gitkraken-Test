package day1016;

public class suiji {
    //在【a~b】范围内随机赋一个两位数的值
    //公式为： (int)(Math.random()*(b-a+1)+a);
    public static void main(String[] args) {
        //先创建并初始化一个一维数组 长度为10
        int arr[]=new int[10];
        for (int i=0;i<arr.length;i++){
            //数组区间为【0~9】，所以公式内的闭区间范围应为【10~99】。如果使用的是开区间，则后面的+1就可以省略.
            //为数组中的每一个元素赋值
            arr[i]=(int)(Math.random()*(99-10+1)+10);
            System.out.println(arr[i]);
        }


        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("随机数和为:"+sum);


        //在求最大值中，int max=0;这种定义变量的方法有的时候在其他地方不适用，所以并不建议这种赋值方法
        int max=arr[0];//最好的方法就是直接把数组中的某一个元素赋值给变量。
        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("最大值为:"+max);
        //求平均数
        double average=0.0;
        average=sum/10.0;
        System.out.println("均值为:"+average);
    }
}
