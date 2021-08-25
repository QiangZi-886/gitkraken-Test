package day1112;

public interface Usb {
    public void dataTransfer();     //此时接口内的方法已经默认为是 public static ，所以前面的public 省略掉也没问题
                                    //接口中的方法不能拥有方法体，所以方法定义之后直接跟上;即可
                                     //注意！！实现类必须要实现接口中定义的所有方法
}
