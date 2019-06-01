package com.lti.day2.oops.basics;

public class Details {
public static void main(String[] args) {

	Employee emp=new Employee();
    emp.setEmpno(1252);
    emp.setName("shreena");
    emp.setDateOfJoining("21-may-2019");
    emp.setSalary(1200000);
    
    AadharCard a=new AadharCard();
    a.setAadharNo(12547);
    a.setName("shreena");
    a.setAddress("chennai");
    emp.setAadharCard(a);
   
    
    //type of relationship we used here is 
    //----> HAS-A RELATIONSHIP (ALSO CALLED AS ASSOCIATION , ONE TO ONE ASSOCIATION)
    Passport p=new Passport();
    p.setPassportNo("K45896 ");
    p.setName("shreena");
    p.setIssueDate("21-05-2018");
    p.setExpDate("21-05-2020");
    emp.setPassport(p);
    
 	    emp.displayInfo();
		
}
}
