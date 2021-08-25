package day1026;

/*

多态：
    对于用一个指令（调用同一个名称的方法），不同的对象给予不同的反应（不同的方法的实现）
    规范（多态实现的前提）
           1、必须要有继承。
           2、子类需要重写父类的方法。
           3、父类引用指向子类的对象


*/

public class person {
    public static void main(String[] args) {
        person p=new person();
        Animal d=new Dog();  //父类引用指向子类对象
        Animal c=new Cat();
        //只需要在mian中添加新得penguin即可
        Animal penguin = new Penguin();
        p.feed(penguin);//使操作更加简洁跟方便.
        p.feed(d);
        p.feed(c);
        fruit a=new Apple();
        fruit t=new Peach();
        p.isEat(a);
        p.isEat(t);

    }

    public void feed(Animal i){
        i.isFeeded();
    }
    public void isEat(fruit f){
        f.eat();
    }


}


//  多态的好处，程序的可扩展性好，可维护性好，不需要频繁修改程序


//ep：如果再添加一个企鹅penguin类，则person里面的方法就不需要再重新添加方法跟修改方法。