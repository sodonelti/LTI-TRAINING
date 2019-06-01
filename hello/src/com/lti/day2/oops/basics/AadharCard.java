package com.lti.day2.oops.basics;

public class AadharCard {
	//CREATING OBJ AND STORING DATA
	private long aadharNo;
	private String name;
	private String address;
	
	//DEFAULT CONSTRUCTOR
	public AadharCard() {
		// TODO Auto-generated constructor stub
	}
	
	//CONSTRUCTOR
	public AadharCard(long aadharNo, String name, String address) {
	//	super();  ------------> USED TO ACCESS THE PARENT CLASS
		this.aadharNo = aadharNo; 
		this.name = name;
		this.address = address;
	}
	
    // GETTERS AND SETTERS....
	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
