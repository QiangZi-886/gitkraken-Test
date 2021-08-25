package Race;

public class 立方变自身Demo {
    public static void main(String[] args) {
        int j = 0;
        for (int i=1;i<=50;i++){
            j = i*i*i;
            //System.out.println(j);
            if ((j/100000+j/10000%10+j/1000%10+j/100%10+j/10%10+j%10)==i){
                System.out.println(i);
            }
        }
    }
}
