package day1101;

public class TriAngle {
    private double base;//三角形的底长
    private double height;//高




    public TriAngle(){

    }

    public  TriAngle(double b,double h){
        base=b;
        height=h;
    }

    public void  setBase(double b){
        base=b;
    }

    public double getBase(){
        return base;
    }

    public void setHeight(double h){
        height=h;
    }

    public double getHeight(){
        return height;
    }

    public double area(){

        return base*height*0.5;
    }
}
