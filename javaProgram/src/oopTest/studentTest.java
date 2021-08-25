package oopTest;

public class studentTest {
    public static void main(String[] args) {
        student s1=new student();
        s1.age=18;
        s1.sex=1;
        s1.name="jerry";

        s1.showage();
        s1.sex();
        s1.study();
        s1.showage();
        int newage =s1.addage(2);
        System.out.println(s1.name+"同学的新年龄是："+newage);
        System.out.println(s1.age);
        student s2=new student();
        System.out.println(s2.age);
    }
}
