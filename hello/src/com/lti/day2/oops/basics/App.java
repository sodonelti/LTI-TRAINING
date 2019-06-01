package com.lti.day2.oops.basics;

public class App {
public static void main(String[] args) {
	
	//CREATING OBJECTS AND STORE DATA IN THE OBJ
	Student student1 = new Student();
	student1.name = "Keerti";
	student1.college="Srm";
	student1.doj="21st-may-2019";
	System.out.println(student1.name);
	System.out.println(student1.college);
	System.out.println(student1.doj);
	
	Student student2 = new Student();
	student2 .name = "Shreena";
	student2 .college="Srm KTR";
	student2 .doj="22/05/2019";
	System.out.println(student2 .name);
	System.out.println(student2 .college);
	System.out.println(student2 .doj);
	
	//creating object for passport class
	Passport passport1=new Passport();
	passport1.setPassportNo("K121DFG");
	passport1.setName ("Shreena");
	passport1.setExpDate("10/10/2030");
	passport1.setIssueDate("10/10/2010");
	System.out.println(passport1.getPassportNo());
	System.out.println(passport1.getName());
	System.out.println(passport1.getExpDate());
	
	// CREATING AN OBJECT FOR AADHAR CARD
	AadharCard ac=new AadharCard(12065, "shreena", "chennai");
   System.out.println(ac.getAadharNo());
   System.out.println(ac.getName());
   System.out.println(ac.getAddress());
	
	
	
}
}
