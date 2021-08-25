package oopDemo.Extends;

public class Penguin extends Pet{
//    private String name;
//    private int age;
//    private String color;
    private String sounder;

    public Penguin(){}

    public Penguin(String name,int age,String color,String sounder){
//        this.name = name;
//        this.age = age;
//        this.color = color;
        super(name,age,color);
        this.sounder = sounder;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }

    public String getSounder() {
        return sounder;
    }

    public void setSounder(String sounder) {
        this.sounder = sounder;
    }
}
