package day1120;

import java.awt.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FrameDemo extends JFrame implements ActionListener{

    JTextField rValue = new JTextField(8);//这些属性在运行时的状态需要被保存下来，如果定义在函数里就会随着函数的消失而消失
    JTextField lValue = new JTextField(8);//最大可显示8个字符
    JTextField result = new JTextField(8);
    JButton button = new JButton("加");

    FrameDemo (){
        setTitle("加法窗口");
        setLayout(null);
        setBounds(680,300,512,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel myTitle = new JPanel();//第一个模块
        myTitle.add(new JLabel("我是一个加法计算器"));
        JPanel myText = new JPanel();//第二个模块
        myText.add(lValue);
        myText.add(new JLabel("+"));
        myText.add(rValue);
        myText.add(new JLabel("="));
        result.setEditable(false);//定义存放结果的文本框不可编辑
        myText.add(result);

        Box myMain =Box.createVerticalBox();//把自己创建的两个模块放入一个垂直的盒子中(将两个模块:myTitle、myText组合)
//        Component struct1 = Box.createVerticalStrut(0);//规定好两个模块之间的距离
//        Component struct2 = Box.createVerticalStrut(0);
//        myMain.add(struct1);
        myMain.add(myTitle);
//        myMain.add(struct2);
        myMain.add(myText);
        myMain.setBounds(0,0,512,300);
        add(myMain);

        button.setBounds(200,200,100,30);//定义按钮的位置和大小
        add(button);

        //事件监听
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    int rVal = Integer.valueOf(rValue.getText());
                    int lVal = Integer.valueOf(lValue.getText());
                    int res = rVal+lVal;
                    result.setText(String.valueOf(res));
                }catch (Exception e1){
                    System.out.println(e1);
                }
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        FrameDemo frameDemo = new FrameDemo();
    }
}
