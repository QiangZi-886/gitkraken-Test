package day1111;

public class Car extends MotoVehicle {


    private String type;//Car独有的一个特别的属性

    public Car(){

    }

    public Car(String type) {
        this.type = type;
    }

    public Car(int no,String brand,String type){
        super(no, brand);//一定放在前面
        this.type = type;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int calcRent(int day) {
        if (type.equals("奔驰")){
            return 600*day;
        }else if (type.equals("宝马")){
            return 500*day;
        }else if (type.equals("大众")){
            return 300*day;
        }else {
            System.out.println("类型错误!");
            return 0;
        }
    }
}
