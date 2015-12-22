package com.banana.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by guodont on 15/12/18.
 */
public class SwingDemo01 {
    public static void main(String args[]) {
        //  创建一个窗体对象
        JFrame frame = new JFrame("我的第一个java窗体");
        //  设置布局
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //  创建一个按钮
        Button btn = new Button("按钮");
        btn.setBounds(100,100,50,40);
        frame.add(btn);
        //  设置窗体的大小和位置
        frame.setBounds(400,300,400,500);
        //  显示窗体
        frame.setVisible(true);
    }
}
