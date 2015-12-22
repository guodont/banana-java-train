package com.be.model;

import java.io.Serializable;

/**
 * 实体类
 * @author guodont
 * @version 1.0
 */
public class Phone implements Serializable {

	private String name;
	private String phone;
	
	public Phone() {}
	
	public Phone(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
