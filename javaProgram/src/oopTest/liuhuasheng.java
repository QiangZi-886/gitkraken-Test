package oopTest;
import java.util.Scanner;
public class liuhuasheng {

        public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            int [][]a=new int[5][2];
            int l=0;
            int websum=0,javasum=0;
            int webarragr=0,javaarrage=0;
            System.out.println("请分别输入五位同学的web成绩和java成绩：");

            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    a[i][j]=input.nextInt();
                }
            }
            for (int j = 0; j < a[0].length; j++)
            {
                if( l==0)
                {
                    System.out.print("web: ");
                }

                if( l==1) {
                    System.out.print("java: ");
                }

                for (int i=0;i<a.length;i++)
                {
                    System.out.print(a[i][j] + " ");
                    if (j==0){
                        websum+=a[i][0];
                    }
                    if (j==1){
                        javasum+=a[i][1];
                    }
                }

                System.out.println();


                l++;
            }
            System.out.println("web成绩和："+websum);
            System.out.println("web成绩和："+javasum);




            //System.out.println("web总成绩为："+ websum);
            //System.out.println("java总成绩为："+ javasum);



        }




}
