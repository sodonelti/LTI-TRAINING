package com.lti.day2.oops.basics;

public class Employee {
	private int empno;
	private String name;
	private String dateOfJoining;
	private double salary;
	
	private Passport passport;
	private AadharCard aadharCard;
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
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public AadharCard getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(AadharCard aadharCard) {
		this.aadharCard = aadharCard;
	}
	
	public void displayInfo() {
		
		    System.out.println("EMP NUMBER IS: "+empno);
			System.out.println("EMP NAME IS: "+name);
			System.out.println("EMP DOJ IS: "+dateOfJoining);
			System.out.println("EMP SALARY IS: "+salary);
		   
			System.out.println("\nEMP PASSPORT NO IS: "+passport.getPassportNo());
			System.out.println("PASSPORT NAME : "+passport.getName());
			System.out.println("ISSUE DATE IS : "+passport.getIssueDate());
			System.out.println("EXPIRE DATE IS : "+passport.getExpDate());
			
		    System.out.println("\n AADHAR CARD NO : "+aadharCard.getAadharNo());
		    System.out.println(" AADHAR NAME : "+aadharCard.getName());
	    	System.out.println(" AADHAR ADDRESS : "+aadharCard.getAddress()); 
	}

}
