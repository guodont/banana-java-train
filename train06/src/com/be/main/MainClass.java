package com.be.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.be.model.Phone;
import com.be.service.Service;
import com.be.view.InputView;

/**
 * 程序入口
 * @author guodont
 * @version 1.0
 */
public class MainClass {

	public static void main(String[] args) {
		InputView iv = new InputView();
		iv.setVisible(true);
		Service service = new Service();
		service.read();
	}
	
}
