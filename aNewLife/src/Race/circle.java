package Race;
/*
* 中心圆包括的完整小方块
* */
public class circle {
    public static void main(String[] args) {
        int n=0;
        for (int i=1;i<1000;i++){
            for (int j =1;j<1000;j++){
                if ((i*i+j*j)<=1000*1000){
                    n+=1;
                }
            }
        }
        System.out.println(n*4);
    }
}
