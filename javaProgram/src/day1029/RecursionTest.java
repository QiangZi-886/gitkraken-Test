package day1029;

//递归防范的使用

//递归方法，实现1-100之间的和




public class RecursionTest {
    public static void main(String[] args) {
        //方式一，使用for循环实现和
//        int sum=0;
//        for (int i=1;i<=100;i++){
//            sum+=i;
//
//        }
//        System.out.println(sum);

        //方式二：使用递归方法，创建递归方法来调用。
        RecursionTest test=new RecursionTest();
        int sum1=test.getsum(100);
        System.out.println(sum1);

        System.out.println("***************************");

        //计算f（10）
        test.f(10);
        int value=test.f(10);
        System.out.println(value);

    }

    //递归方法
    public int getsum(int n){
        if(n==1){
            return 1;
        }else{
            return n+getsum(n-1);
        }
    }
    //使用递归方法来计算：如果f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n);
    public int f(int n){
        if(n==0){
            return 1;
        }else if(n==1){
            return 4;
        }else{
            return 2*f(n-1)+f(n-2);//注意！！在这里不能把公式上的“f(n+2)=2*f(n+1)+f(n)”转换成“f(n)=f(n+2)-2*f(n+1)”
        }                                //这样使用会使结构溢出栈！ps：计算f(10)，首先需要计算f(12)和f(11)。即永远也无法结束循环。
    }                                    //所以倒过来逆向思维，把n+2看做n，后面的依次做减法即可

}
