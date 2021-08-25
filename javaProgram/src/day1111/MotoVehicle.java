package day1111;

//MotoVehicle：机动车抽象类
//使用abstract解决租赁公司租车问题：轿车按照品牌不同来收费，大巴按照数量来收费（大于16辆是另外的价钱），租金：元/天


public abstract class  MotoVehicle {

    private int no;//no：车牌号
    private String brand;//品牌

    public MotoVehicle(){

    }

    public MotoVehicle(int no,String brand){
        this.brand = brand;
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract int calcRent (int day);  //抽象类中的计算租金的一个方法 子类继承时需要进行实现
}
