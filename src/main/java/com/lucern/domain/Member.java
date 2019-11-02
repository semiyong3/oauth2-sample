package com.lucern.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

public class Member implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6996590305656496103L;
	@Id
	@GeneratedValue
	Long id;
	String name;
	String username;
	String remark;
	
	public Member() {
	}
	
	public Member(String name, String username, String remark) {
		this.name = name;
		this.username = username;
		this.remark = remark;
	}
}
