package com.be.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.be.service.Service;

/**
 * 输入界面
 * @author guodont
 * @version 1.0
 */
public class InputView extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JButton btn;
	private JTextField tf1, tf2;

	public InputView() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds((int) (dim.getWidth() - 400) / 2, (int) (dim.getHeight() - 300) / 2,
				400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jp1 = new JPanel();
		JLabel jl1 = new JLabel("姓名：");
		JLabel jl2 = new JLabel("手机号：");
		tf1 = new JTextField();
		tf2 = new JTextField();
		jp1.setLayout(new GridLayout(4, 1));
		jp1.add(jl1);
		jp1.add(tf1);
		jp1.add(jl2);
		jp1.add(tf2);
		
		JPanel jp2 = new JPanel();
		btn = new JButton("添加");
		btn.addActionListener(this);
		jp2.add(btn);
		
		this.add(jp1, BorderLayout.NORTH);
		this.add(jp2, BorderLayout.SOUTH);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Service service = new Service();
		if (e.getSource() == btn) {
			String name = tf1.getText().toString();
			String phone = tf2.getText().toString();
			service.write(name, phone);
		}
	}
	
}
