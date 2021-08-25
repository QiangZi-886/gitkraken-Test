package day1105;

//输出换行操作


public class BrDemo {
    public static void main(String[] args) {
        int count=0;
        for (int i=0;i<10;i++){
            System.out.print("第"+i+"次输出"+" ");
            count++;

            if (count>=3){
                System.out.println();
                count =0;
            }
        }
    }
}
