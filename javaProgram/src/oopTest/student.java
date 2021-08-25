package oopTest;

public class student {
    int age;
    /**
     * sex:1 表示的是男性
     * sex:0 表示的是女性
     */
    int sex;
    String name;

    public void study(){
        System.out.println("studying");
    }

    public void sex(){
        System.out.println("sex:"+sex);
    }
    public void showage(){
        System.out.println("age:"+age);
    }
    public int addage(int i){
        age+=i;
        return age;
    }

}
