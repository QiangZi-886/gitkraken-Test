package day1105;

//输出（1,1）（1,2）....诸如此类，直到（6,6）

public class
BreakDemo {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++){
            for (int j=0;j<=10;j++){
                System.out.println("(" + i + "," + j + ")");
                if (i==6&&j==6) {

                    //break;   //break只能跳出内层的循环。在这个例子里只能跳出内层的for循环
                    //return;  //return语句是直接终止程序。return既可以返回值也可以终止语句.
                    System.exit(-1);
                }
            }
        }
    }
}
