package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* 异常：
*       在程序运行过程当中出现的不正常情况就叫做异常；
*           注意！:
*               1、相同的代码在运行的过程中，根据输入参数或者操作不同，有可能会发生异常，有可能不会发生异常
*               应该在写代码的过程中尽可能的保证代码的正确性
*               2、如果要解决代码中出现的异常，需要添加非常复杂的逻辑判断语句(if else....)，会使代码变得非常臃肿，不利于维护，可读性比较差。
*                  因此，推荐使用异常机制来处理程序运行过程中出现的问题
*               3、程序在运行过程中，如果出现问题，会导致后面的代码无法正常执行，而使用异常机制之后，可以对异常进行处理，
*                  同时后续的代码会继续执行，不会中断整个程序
*               4、在一异常的处理过程中，不要只是简单的输出错误，要尽可能的讲详细的异常信息进行输出
*                   e.printStackTrace();打印异常的堆栈信息，可以从异常信息的最后一行开始追踪，寻找自己编写的java类
*                   System.out.println(e.getMessage());返回异常信息描述字符串。（使用较少，一般都使用上面的那个）
*       异常处理的方式：
*           1、捕获异常      注意！try catch当中的语句如果有很多行，其中一行出现问题，那么try catch当中那一行语句下面的语句就不会执行了
*               try{代码逻辑}catch(Exception e){异常处理逻辑}
*               try{代码逻辑}catch(具体的异常Exception e){异常处理逻辑}catch{具体的异常}；
*               可以针对每一种具体的异常做相应更丰富的处理
*                   注意！当使用多重的catch的时候一定要注意相关异常的顺序，将子类放在最前面的catch，父类(Exception e)放在最后面执行。
*           执行过程中可能存在的情况：
*                   1、正常执行，会处理try中的代码
*                   2、遇到异常，会处理try中异常处理代码之前的逻辑，后面的逻辑不会执行，最后会执行catch中的代码
*                   3、使用多重catch的时候，会遇到异常子类不匹配的情况，因此建议在catch的最后将所有异常的父类(Exception e)写上
* */
public class TestException {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("请输入被除数：");
            int num1 = scan.nextInt();
            System.out.print("请输入除数：");
            int num2 = scan.nextInt();
            System.out.println("除法运算结果为：" + num1 / num2);
//        }catch (Exception e){
//            System.out.println("出现异常");
//        }
        }catch (InputMismatchException e){
            System.out.println("输入类型不匹配");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("数学参数输入有误！");
            e.printStackTrace();
        }
        System.out.println("感谢使用本程序");
    }
}
