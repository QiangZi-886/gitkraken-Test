package day1109;

//打印机类 注意：这里的Printer类跟前面的接口没有关联，但是要实现的功能里需要接口内的东西，且，接口不能实例化，所以把接口直接当做Printer类的属性即可

public class Printer {
    InkBox inkBox;
    Paper paper;


    //无参构造器
    public Printer(){

    }

    //有参构造器
    public Printer(Paper paper,InkBox inkBox){
        this.inkBox=inkBox;
        this.paper=paper;
    }


//    // 安装打印机的墨盒
//    public void setInkBox(InkBox inkBox){
//        this.inkBox=inkBox;
//    }
//
//    //往打印机里加纸张
//    public void setPaper(Paper paper){
//        this.paper=paper;
//    }


    //打印功能
    public void print(){
        System.out.println(inkBox.getcolor()+"打印"+paper.getsize());
    }

}
