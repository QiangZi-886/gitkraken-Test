package Test;
/*
* 百钱买百鸡，公鸡：5块、母鸡：3块、小鸡3只1块
* */
public class BuyChicken {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        for (x = 0;x<=20;x++){
            for (y= 0;y<=34;y++){
                for (z = 0;z<=300;z++){
                    if((x+y+z==100)&&(x*5+y*3+z/3==100)&&(z%3==0)){
//                        System.out.println("百钱买百鸡的方案有：");
                        System.out.println("公鸡买："+x+"只"+"\t"+"母鸡买："+y+"只"+"小鸡买："+z+"只");
                    }
                }
            }
        }
    }
}
