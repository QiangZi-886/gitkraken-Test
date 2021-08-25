package CollectionDemo.FX;

import CollectionDemo.CollectionDemo;

public class FXClass<A> {
    private int id;
    private A a;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void show(){
        System.out.println("id :"+id + ", A :"+ a);
    }

//    @Override
//    public String toString() {
//        return "FXClass{" +
//                "id=" + id +
//                ", a=" + a +
//                '}';
//    }
    public A get(){
        return a;
    }
}