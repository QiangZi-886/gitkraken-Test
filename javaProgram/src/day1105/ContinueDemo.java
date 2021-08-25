package day1105;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i=0;i<=100;i++){
            if (i % 3 ==0){
                continue;  //continue语句是跳出本次循环
            }
            System.out.println(i);
        }
    }
}
