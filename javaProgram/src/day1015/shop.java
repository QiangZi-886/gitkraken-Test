package day1015;

/*百钱买百鸡的问题！！  一百块钱，公鸡5元/1只、母鸡3元/1只、小鸡1元/3只.
*
* 输出一共有多少种方式，所以System.out.print()语句放在最层的for循环内，打印出每一种的实现方式.
*
*
*/
public class shop {
    public static void main(String[] args){
       for (int i=0;i<=20;i++){
           for (int j=0;j<34;j++){
               for (int k=0;k<+300;k++){

                   //这里是有两个判断条件，一个是个数总和为0、另一个是所花的价钱总和也为0.
                   //注意！ 小鸡在参与判断条件时，价格的总和中，还需要k%3==0！

                   if (((i+j+k)==100) && ((5*i+3*j+k/3)==100) && (k%3==0)){
                       System.out.println("公鸡个数为:"+i+",母鸡个数为:"+j+",小鸡个数为:"+k);
                   }
               }
           }
       }
    }
}
