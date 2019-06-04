package com.lti.training.day5;

public class Employeee {
	
	//instance variable
	private int empno;
	private String name;
	
	//class variable
	private static double salary;
	//public static String companyName;
	
	//constant variable , no one can change the value of a final variable
	public static final String companyName="LTI";
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static double getSalary() {
		return salary;
	}
	public static void setSalary(double salary) {
		Employeee.salary = salary;
	}
	

}
