package oopDemo.innerDemo;

public class InnerClassDemo {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void show(){
        System.out.println("show");
        //外部类访问内部类的方法：
        InnerClass inner = new InnerClass();
        System.out.println(inner.age);
        inner.test();
        System.out.println("**********************");
        new InnerClass().test();
    }


    class InnerClass{
        private int age;
        public void test(){
            System.out.println("test");
        }
    }
}
