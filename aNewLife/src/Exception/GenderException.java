package src.Exception;
/*
* 自定义异常：
*   在java的api中提供了丰富的异常类，但是在某种情况下不太满足我们的需求，此时就需要自定义异常
*   步骤：
*       1、继承Exception类
*       2、自定义实现构造方法
*       3、需要使用的时候，使用throw new 自定义异常名称；
*   什么时候需要自定义异常？
*       一般情况下不需要
*       但是在公司要求明确，或者要求异常格式规范统一的时候是必须要自己实现的
*
*
* */
public class GenderException extends Exception{
    public GenderException(){
        System.out.println("性别出现异常");
    }

    public GenderException(String message){
        System.out.println(message);
    }
}
