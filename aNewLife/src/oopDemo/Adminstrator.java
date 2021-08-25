package oopDemo;

import javax.swing.*;
import java.util.Scanner;

/*
* 设置一个管理员登录的账号、密码程序，如果密码和用户名输入正确那么就可以修改原有的账号密码。
*
* 最后并进行测试
*
* */
public class Adminstrator {
    String LoginName = "admin";
    String password = "123456";

    public static void main(String[] args) {
        Adminstrator ad = new Adminstrator();
        System.out.println(ad.LoginName);
        System.out.println(ad.password);

        while (true) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String LoginName = scan.nextLine();
        System.out.println("请输入密码：");
        String password = scan.nextLine();
            //字符串类型的数据在进行比较时，要是用equals()方法进行比较!!
            if (ad.LoginName.equals(LoginName) && ad.password.equals(password)) {
                System.out.println("请输入新用户名:");
                ad.LoginName = scan.nextLine();
                System.out.println("请输入新密码：");
                ad.password = scan.nextLine();
                System.out.println("用户名和密码修改成功！");
                break;
            }
            else {
                System.out.println("密码输入错误，请重新输入!!");
            }
        }
        System.out.println("新用户名："+ad.LoginName);
        System.out.println("新密码："+ad.password);
    }
}
