package oopTest;
//使上一个Test更加整洁规范
//实质上是把main中的方法封装起来，使用时直接调用，这样显得main中的数据很简洁
public class Testplus {
        public static void main(String[] args) {

            schoolmetap[] sho1 = new schoolmetap[20];

            for (int i = 0; i < sho1.length; i++) {
                sho1[i] = new schoolmetap();   //给数组中的每个元素new一个空间
                //给数组中的每个元素赋值
                sho1[i].num = (i + 1);
                sho1[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);//给每个年级的元素随机从1~6中赋值
                sho1[i].score = (int) (Math.random() * (100 - 0 + 1));//给每个成绩的元素随机从100~0赋值

            }


            Testplus ps=new Testplus();//新声明一个ps对象来引用main函数下面的方法
            //对数组进行遍历
            ps.print(sho1);
            System.out.println("*****************");
            //查找年级为state的学生信息 
            ps.searchstate(sho1,5);
            System.out.println("*****************");
            //冒泡排序数组
            ps.sort(sho1);
            ps.print(sho1);
            System.out.println("*****************");


        }


    /**
     * 查找schoolmatep数组中指定state年级的信息
     * @param sho1 需要查找的数组
     * @param state 需要查找的年级
     */
    public void searchstate(schoolmetap[] sho1,int state){
            for (int i = 0; i < sho1.length; i++) {
                if (sho1[i].state == state) {
                    System.out.println(sho1[i].display());
                }
            }
        }

    /**
     * 给指定数组进行冒泡排序
     * @param sho1 需要排序的数组
     */
    public void sort(schoolmetap[] sho1){
            for (int i = 0; i < sho1.length - 1; i++) {
                for (int j = 0; j < sho1.length - i - 1; j++) {
                    if (sho1[j].score > sho1[j + 1].score) {  //注意，在这里面交换的是schoolmate类的对象，而不是sho1。score！！！！！！
                        oopTest.schoolmetap temp = sho1[j];
                        sho1[j] = sho1[j + 1];
                        sho1[j + 1] = temp;
                    }
                }
            }
        }

    /**
     * 遍历sho1这个数组
     * @param sho1
     */
        public void print(schoolmetap[] sho1){
            for (int i = 0; i < sho1.length; i++) {
                System.out.println(sho1[i].display());
            }
        }




    }



    class schoolmetap{
        int num;//学号
        int state;//年级 从【1~6】
        int score;//成绩  【0~100】


        public String display(){    //有返回值方法，所以下面不用写sout，直接用return来带出返回值和结束语句
            return "该同学的学号为："+num+",年级为："+state+",成绩为:"+score;
        }
    }

