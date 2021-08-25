package day1120;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginDemo implements ActionListener{

    JFrame frame = null;
    JPanel panel1 = null;
    JPanel panel2 = null;
    JPanel panel3 = null;
    JPanel panel4 = null;
    JTextField text1 = null;
    JPasswordField text2 = null;
    JLabel label1 = null;
    JLabel label2 = null;
    JLabel label3 = null;
    JLabel label4 = null;
    JButton button1 = null;
    JButton button2 = null;


    public void Enter(){
        frame = new JFrame("登录窗口");
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        text1 = new JTextField(10);
        text2 = new JPasswordField(10);
        button1 = new JButton("登录");
        button2 = new JButton("取消");
        label1 = new JLabel("用户名");
        label2 = new JLabel("密    码");
        label3 = new JLabel();

        frame.setLayout(new GridLayout(4, 1));
        frame.add(panel1);
        panel1.add(label1);
        panel1.add(text1);
        frame.add(panel2);
        panel2.add(label2);
        panel2.add(text2);
        frame.add(panel3);
        panel3.add(button1);
        panel3.add(button2);

        button1.addActionListener(this);
        button2.addActionListener(this);

        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==button1){
            if(text1.getText().equals("yang") && text2.getPassword().equals("123456")){
                frame.add(panel4);
                label3.setText("登录成功");
                panel4.add(label3);
                frame.setVisible(true);
            }
            else{
                text1.setText(null);
                text2.setText(null);
                System.out.println(448);
                label3.setText("登录失败");
                frame.add(panel4);
                panel4.add(label3);
                frame.setVisible(true);
            }
        }
        else if (e.getSource() == button2) {
            text1.setText(null);
            text2.setText(null);
        }
    }

    public static void main(String[] args){
        new LoginDemo();
    }

}
