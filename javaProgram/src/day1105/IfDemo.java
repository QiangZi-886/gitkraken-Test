package day1105;


//嵌套分支结构
public class IfDemo {
    public static void main(String[] args) {
        //输出的结果全为随机情况
        int time=((int)(Math.random()*40));
        if (time<20){
            System.out.println("恭喜进入决赛!!");
            String sex=((int)(Math.random()*2))==0?"girl":"boy";//随机给sex赋0或1的值，如果值为0则结果为girl如果为1则结果为boy
            if (sex=="girl"){   // sex是String类型，所以可以拿来直接跟字符串进行比比较
                System.out.println("恭喜进入女子决赛组");
            }else{
                System.out.println("恭喜进入男子决赛组");
            }

        }else{
            System.out.println("不好意思你已被淘汰了");
        }

        System.out.println("*******************************");

        //switch多分支结构    等值条件判断 

        //利用多分支结构来实现二十六个字母的随机输出

        int random=((int)(Math.random()*26));
        char ch=(char)('a'+random); //  其中的‘a'和random是默认转换为int类型来进行加法运算，所以需要强制转换为char类型。
        switch (ch){
            case 'a':
//                System.out.println("元音"+ch);     一个简化的操作
//                break;
            case 'e':
//                System.out.println("元音"+ch);
//                break;
            case 'i':
//                System.out.println("元音"+ch);
//                break;
            case 'o':
//                System.out.println("元音"+ch);
//                break;
            case 'u':
                System.out.println("元音"+ch);
                break;
            case 'y':
//                System.out.println("半元音"+ch);
//                break;
            case 'w':
                System.out.println("半元音"+ch);
                break;
            default:
                System.out.println("辅音"+ch);
        }
    }
}
