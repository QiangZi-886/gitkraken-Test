package day1101;

public class PersonTest {
    public static void main(String[] args) {
        Person p= new Person();  //Person()这就是一个构造器，是系统默认给的一个空参的构造器。
        p.name="小王";
        p.setAge(28);  //通过后来的方法对age属性重新修改，从默认值18改成28岁。
        p.getAge();
        System.out.println("我叫"+p.name+"今年"+p.getAge()+"岁了");
        p.eat();
        Person p1= new Person();

    }
}



 class Person{
    private int age;//私有的age属性
    public String name;

     public Person(){       //利用构造器对age这个属性赋值，使其默认值为18岁(注意！！！构造器长得像方法，但不是方法，跟方法的关系是并列的)
        age =18;            //
     }

    public void setAge(int i){
        if ((i>=0)&&(i<=30)){
            age=i;
        }else{

            throw new RuntimeException("传入数据非法!!");//抛出一个显示异常的提示语句


        }
    }

    public int getAge(){
        return age;
    }


    public void eat(){
        System.out.println("我想吃东西");
    }
 }