package oopDemo.InnerDemo2;

public class outer {
    private String name = "张三";

    class inner{
        private String name = "李四";
        public void show(){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(outer.this.name);//如果想访问外部相同属性名的属性时，需要使用外部类名.this.属性名
        }
    }

    public static void main(String[] args) {
        outer.inner in = new outer().new inner();
        in.show();//当内部类和外部类的成员属性名相同时，默认打印输出内部类的成员属性
    }
}
