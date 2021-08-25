package Race;


import java.util.Scanner;

/*
* 定义一个Point类实现表示二维空间中的点（有两个坐标），
* 可以生成具有特定坐标的点对象
* 提供两个坐标的方法
* 提供可以计算两个坐标距离的方法
*
* */
public class PointDemo {
    public static void main(String[] args) {

        PointDemo p = new PointDemo();
        p.first();
        p.second();
        System.out.println(p.x1+" "+p.x2+" "+p.y1+" "+p.y2);
        p.distance();
        System.out.println(p.r);
    }

    double x1,y1,x2,y2,r;


//    double[][] arr= new double[][]{{0},{0}};

    public void first(){
        System.out.println("请输入第一个坐标的x值，y值:");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        double x = scanner1.nextDouble();
        double y = scanner2.nextDouble();
        x1 =x;
        y1 =y;
    }

    public void second(){
        System.out.println("请输入第二个坐标的x值，y值:");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        double x = scanner1.nextDouble();
        double y = scanner2.nextDouble();

        x2 = x;
        y2 = y;
    }

    public void distance(){
        r = Math.pow((x1-x2),2) + Math.pow((y1-y2),2);
        System.out.println("两点的距离为:"+Math.sqrt(r));
    }
}
