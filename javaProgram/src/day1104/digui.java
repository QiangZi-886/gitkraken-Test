package day1104;
/*

使用递归方式实现斐波那契数列的前十项。


    注意 ：工作的时候，一般情况下不会去使用递归算法，因为递归算法会占用更大的空间，而且递归层次过深的话还有可能造成栈溢出。
*/

public class digui {
    public static void main(String[] args) {
        digui d=new digui();
        for (int n=1;n<=10;n++){
            System.out.println(d.getnum(n));
        }
    }

    public int getnum(int n){
        if (n==1 || n==2){
            return 1;
        }else {
            return getnum(n-1)+getnum(n-2);
        }
    }
}
