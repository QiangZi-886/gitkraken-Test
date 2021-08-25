package Exception;

import java.util.Scanner;

public class StringToIntDemo {
    public static void main(String[] args) {
        try {
            int a = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入一个字符串");
            String str = scan.nextLine();
            a = Integer.valueOf(str);

            System.out.println("'"+str+"'"+"转换成整型的数值为："+a);
        }catch (NumberFormatException e){
            System.out.println("数字格式转换异常！");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("出现异常！");
            e.printStackTrace();
        }

        System.out.println("感谢使用本程序！");
    }
}
