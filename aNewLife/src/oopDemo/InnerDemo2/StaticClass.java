package oopDemo.InnerDemo2;

public class StaticClass {
    private int id;

    static class InnerClass{
        private String name;
        public void show(){
            System.out.println("show");
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new StaticClass.InnerClass();//跟先前的内部类的创建方法不一样
        innerClass.show();
    }
}
