package com.example.demo;

public class College 
{
	private int c_id;
	private String c_name;
	private String c_phoneNumber;
	private String c_Address;
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_phoneNumber() {
		return c_phoneNumber;
	}
	public void setC_phoneNumber(String c_phoneNumber) {
		this.c_phoneNumber = c_phoneNumber;
	}
	public String getC_Address() {
		return c_Address;
	}
	public void setC_Address(String c_Address) {
		this.c_Address = c_Address;
	}
	public College(int c_id, String c_name, String c_phoneNumber, String c_Address) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_phoneNumber = c_phoneNumber;
		this.c_Address = c_Address;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
