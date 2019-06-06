package com.lti.training.day6.exception;

//AccountException---USER DEFINED
public class BankAccExceptionUserDefined {
	private int accno;
	private String name;
	private double balance;
	
public BankAccExceptionUserDefined(int accno, String name, double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	
	public double withdraw(double amount) throws AccountException {
		if(amount>balance) {
			AccountException e=new AccountException ("Insufficent balance");
			throw e;
		}
		else {
			balance = amount;
			return balance;
		}
	}
	
	public static void main(String[] args) {
		//BankAccExceptionUserDefined bankAcc=new BankAccExceptionUserDefined(1234, "SHREENA", 5000);
		BankAccExceptionUserDefined bankAcc =null;
		try {
			double balance = bankAcc.withdraw(7000);
			System.out.println("balance left: "+balance);
		}
		catch (AccountException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("some message in finally");
		}
	}

}
