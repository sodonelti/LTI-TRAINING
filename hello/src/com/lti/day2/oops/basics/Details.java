package com.lti.day2.oops.basics;

public class Details {
public static void main(String[] args) {

	Employee emp=new Employee();
    emp.setEmpno(1252);
    emp.setName("shreena");
    emp.setDateOfJoining("21-may-2019");
    emp.setSalary(1200000);
    
    System.out.printf("EMP NUMBER IS: %d \n ",emp.getEmpno());
	System.out.printf("EMP NAME IS: %s \n" ,emp.getName());
	System.out.printf("EMP DOJ IS: %s \n",emp.getDateOfJoining());
	System.out.printf("EMP SALARY IS: %.2f \n",emp.getSalary());
    
    
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
    
    System.out.printf("EMP PASSPORT NO IS: %s \n",p.getPassportNo());
	System.out.printf("PASSPORT NAME : %s \n",p.getName());
	System.out.printf("ISSUE DATE IS %s \n",p.getIssueDate());
	System.out.printf("EXPIRE DATE IS %s \n",p.getExpDate());
	
	   System.out.printf("AADHAR CARD NO : %d \n",a.getAadharNo());
	   System.out.printf("AADHAR NAME : %s \n",a.getName());
	   System.out.printf("AADHAR ADDRESS %s \n",a.getAddress()); 
    
    System.out.printf(p.getPassportNo());
 	System.out.printf(p.getName());
 	System.out.printf(p.getIssueDate());
 	System.out.printf(p.getExpDate());
 	
 	   System.out.println(a.getAadharNo());
 	   System.out.printf(a.getName());
 	   System.out.printf(a.getAddress());
		
}
}
