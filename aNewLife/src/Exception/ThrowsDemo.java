package Exception;
/*
*！throws声明异常:
*   1、在异常情况出现的时候，可以使用try...catch...finally的方式对异常进行处理，除此之外，可以将异常向外抛出，由外部进行处理
*       再方法调用过程中，可以存在N多个方法之间的调用，此时假如每个方法中都包含了异常情况，那么就需要在每个方法中都进行try catch，另外一种
*       比较简单的方式，就是在方法的最外层处理一次即可，因此使用throws的方法，对所有执行过程中的所有方法出现的异常进行统一集中处理。
*   2、如何判断是使用throws还是使用try...catch
*       最稳妥的方式就是在每个方法中都进行异常的处理
*       偷懒的方式是判断在整个调用的过程中，外层的调用方法是否有队异常的处理，如果有，直接使用throws，如果没有，那么就要使用try..catch
*
*
*throw抛出异常:
*   抛出一个新建的异常父类Exception，同样也可以用户自定义设置一个异常，比如这里的GenderException
*
* */
public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            show();
        }catch (GenderException e){
            e.printStackTrace();
        }
        System.out.println("hehe");

    }

    private static void test() throws Exception{
        System.out.println(1/0);
    }

    public static void show() throws GenderException{
        String gender = "1234";
        if (gender.equals("man")){
            System.out.println("man");
        }
        else if (gender.equals("woman")){
            System.out.println("woman");
        }
        else {
            throw new GenderException("Gender is wrong");
        }
    }
}
