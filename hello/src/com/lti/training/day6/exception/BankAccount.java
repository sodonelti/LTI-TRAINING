package com.lti.training.day6.exception;
// ERROR HANDLING

//runtime exception -> does not force us to use try-catch
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
	
	//try using --> throws RuntimeException
	public double withdraw(double amount) throws Error { 
		if(amount>balance) {
			//RuntimeException e=new RuntimeException("Insufficent balance");
			Error e=new Error("Insufficent balance");
			throw e;
		}
		else {
			balance = amount;
			return balance;
		}
	}
	
	public static void main(String[] args) {
		BankAccount bankAcc=new BankAccount(1234, "SHREENA", 5000);
		//try {
			double balance = bankAcc.withdraw(7000);
			System.out.println("balance left: "+balance);
		}
		//catch (Error e) {
			//System.out.println(e.getMessage());
		//}
	}
	

