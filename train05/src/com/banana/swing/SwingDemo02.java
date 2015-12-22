package com.banana.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by guodont on 15/12/18.
 */
public class SwingDemo02 {
    public static void main(String [] args) {
        JFrame jFrame = new JFrame("搜索框");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel();
        //  将面板放在窗体上半部分
        jFrame.getContentPane().add(topPanel, BorderLayout.NORTH);
        //  创建搜索输入框、可编辑，左侧输入，25列
        JTextField input = new JTextField();
        input.setEditable(true);
        input.setHorizontalAlignment(SwingConstants.LEFT);
        input.setColumns(25);
        //  创建搜索按钮
        JButton btn = new JButton("搜索一下");
        //  添加搜索输入框和按钮
        topPanel.add(input);
        topPanel.add(btn);
        //  创建面板并放在窗体的下半部分
        JPanel bottomPanel = new JPanel();
        jFrame.getContentPane().add(bottomPanel,BorderLayout.CENTER);
        //  创建结果输出框
        JTextArea output = new JTextArea();
        output.setColumns(32);
        output.setRows(6);
        output.setEditable(false);
        //  添加结果输出框
        bottomPanel.add(output);
        bottomPanel.setVisible(true);

        jFrame.setBounds(400,200,400,200);
        jFrame.setVisible(true);
    }
}
