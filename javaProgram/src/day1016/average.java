package day1016;

//班级有五名同学，分别java，web两门课程，统计每门课程平均分和总分，统计每名同学平均分和总分。


public class average {
    public static <arr> void main(String[] args){
        int [][] arr={{30,60},{90,15},{89,100},{100,0},{3,4}};
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        double average=0.0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
                average=sum/5.0;
            }
        }
        System.out.println("班级课程的总分："+sum+" "+"平均分："+average);


        for(int i=0;i<arr.length;i++){
            int s=0;
            int n = 0;
            double avg=0;
            for(int j=0;j<arr[i].length;j++){
                s+=arr[i][j];
                //n++;
                //sum+=sum;
                avg=s/2.0;
            }
            System.out.println("第"+(i+1)+"个同学的总成绩为："+s+" "+"平均成绩为："+avg);
        }
    }
}
