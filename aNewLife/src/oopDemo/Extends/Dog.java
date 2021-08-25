package oopDemo.Extends;

public class Dog extends Pet{
//    private String name;
//    private int age;
//    private String color;
    private String gender;

    public Dog(){}

    public Dog(String name,int age,String color,String gender){
//        this.name = name;
//        this.age = age;
//        this.color = color;
        super(name,age,color);
        this.gender = gender;
    }


    //属性是私有的，所有需要写set get方法来获取属性
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setAge(int age){
//        this.age = age;
//    }
//    public int getAge(){
//        return age;
//    }
//    public void setColor(String color){
//        this.color = color;
//    }
//    public String getColor(){
//        return color;
//    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
