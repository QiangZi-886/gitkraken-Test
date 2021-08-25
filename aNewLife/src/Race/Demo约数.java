package Race;
/*
* 计算1200000的约数有多少个
* */
public class Demo约数 {
    public static void main(String[] args) {
        int n=0;
        for (int i=1;i<=1200000;i++){
            if (1200000%i == 0){
                n++;
            }
        }
        String s1 = "China";

        String s2 = new String("China");

        System.out.println(s1 == s2);

        System.out.println(n);
    }
}
