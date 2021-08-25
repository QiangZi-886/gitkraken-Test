package oopTest;
/*
* 创建一个20个对象的Test类，并且为其中内容随机赋值并打印输出
*
*
*
*
*
*  */
public class Test {
    public static void main(String[] args) {


    schoolmeta [] sho1=new schoolmeta[20];

    for(int i=0;i<sho1.length;i++){
        sho1[i]=new schoolmeta();   //给数组中的每个元素new一个空间
        //给数组中的每个元素赋值
        sho1[i].num=(i+1);
        sho1[i].state= (int)(Math.random()*(6-1+1)+1);//给每个年级的元素随机从1~6中赋值
        sho1[i].score=(int)(Math.random()*(100-0+1));//给每个成绩的元素随机从100~0赋值

    }
    for (int i=0;i<sho1.length;i++){
       // System.out.println("该同学的学号为："+sho1[i].num+",年级为："+sho1[i].state+",成绩为:"+sho1[i].score);  可以实现
        System.out.println(sho1[i].display());
    }
        System.out.println("***********************************************");
    for (int i=0;i<sho1.length;i++){
        if (sho1[i].state==3){
            System.out.println(sho1[i].display());
        }
    }
        System.out.println("***********************************************");
    //使用冒泡排序对成绩排序
        for (int i=0;i<sho1.length-1;i++){
            for (int j=0;j<sho1.length-i-1;j++){
                if (sho1[j].score>sho1[j+1].score){  //注意，在这里面交换的是schoolmate类的对象，而不是sho1。score！！！！！！
                    schoolmeta temp=sho1[j];
                    sho1[j]=sho1[j+1];
                    sho1[j+1]=temp;
                }
            }
        }

        //遍历数组
        for (int i=0;i<sho1.length;i++){
            System.out.println(sho1[i].display());
        }

    }
}


class schoolmeta{
    int num;//学号
    int state;//年级 从【1~6】
    int score;//成绩  【0~100】


    public String display(){
        return "该同学的学号为："+num+",年级为："+state+",成绩为:"+score;
    }
}