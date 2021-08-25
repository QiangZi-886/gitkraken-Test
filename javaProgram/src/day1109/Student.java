package day1109;

public class Student {
    private String name;
    private int age;


    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student s1=new Student("张三",14);
        Student s2=s1;
        System.out.println(s1==s2);    // "=="一、相比较的是两个对象的地址是否相等，即比较的是是否指向同一个对象。二、比较的是两个基本数据类型的值是否相等

        System.out.println(s2.equals(s1));  //"equals()"相比较的是两个对象的内容是否一致。
    }
}

