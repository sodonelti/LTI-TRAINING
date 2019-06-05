package com.lti.training.day5.ExceptionHandling;

public class BankAccount {
	
	private int accno;
	private String name;
	private double balance;
	
	public BankAccount(int accno, String name, double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	
	public double withdraw(double amount) throws Exception {
		if(amount>balance) {
			Exception e=new Exception("Insufficent balance");
			throw e;
		}
		else {
			balance = amount;
			return balance;
		}
	}
	
	public static void main(String[] args) {
		BankAccount bankAcc=new BankAccount(1234, "SHREENA", 8000);
		try {
			double balance = bankAcc.withdraw(7000);
			System.out.println("balance left: "+balance);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	

}
