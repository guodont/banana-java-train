package com.be.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.be.model.Phone;

/**
 * 数据处理
 * @author guodont
 * @version 1.0
 */
public class Service {
	
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private Phone phoneObj;
	private List<Phone> phones;
	
	public void init() {
		phoneObj = new Phone("zhang", "1234456");
		phones = new ArrayList<Phone>();
		phones.add(phoneObj);
		try {
			oos = new ObjectOutputStream(new FileOutputStream(new File("phone2.txt")));
			oos.writeObject(phones);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 写入文件
	 * @author guodont
	 * @param name 姓名
	 * @param phone 电话
	 * @return void
	 */
	public void write(String name, String phone) {
		phoneObj = new Phone(name, phone);
		try {
			ois = new ObjectInputStream(new FileInputStream(new File("phone2.txt")));
			phones = (List<Phone>) ois.readObject();
			phones.add(phoneObj);
			oos = new ObjectOutputStream(new FileOutputStream(new File("phone2.txt")));
			oos.writeObject(phones);
			oos.flush();
			ois.close();
			oos.close();
		} catch(Exception e) {
			e.printStackTrace();
			init();
		}
	}
	
	/**
	 * 读出方法
	 * @author guodont
	 * @return void
	 */
	public void read() {
		try {
			ois = new ObjectInputStream(new FileInputStream(new File("phone2.txt")));
			phones = (List<Phone>) ois.readObject();
			for (int i = 0; i < phones.size(); i++) {
				phoneObj = phones.get(i);
				System.out.println(phoneObj.getName() + " : " + phoneObj.getPhone());
			}
		} catch (Exception e) {
			init();
		}
			
	}
	
}
