package com.lti.training.day5;

public class EmpMain {
	public static void main(String[] args) {
	//Employeee.companyName="LTI";
		
		Employeee emp =new Employeee();
		emp.setEmpno(1001);
		emp.setName("keerti");
		//this is how the static variables should be called className.staticVariable();
		Employeee.setSalary(10000);
		
		
		Employeee emp2=new Employeee();
		emp2.setEmpno(1002);
		emp2.setName("shreena");
		emp2.setSalary(20000);
		
		System.out.println(emp.getEmpno());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp2.getEmpno());
		System.out.println(emp2.getName());
		System.out.println(emp2.getSalary());		
		System.out.println(Employeee.companyName);
	}

}
