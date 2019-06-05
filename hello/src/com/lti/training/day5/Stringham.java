package com.lti.training.day5;

public class Stringham {
	public static void main(String[]args) {
		String s1 = "JAVA";
	    String s2= "Java";
	    String s3 =new String("Java");
	    String s4 =new String("Java");
	
	    System.out.println(s1==s2);
	    System.out.println(s3==s4);
	    String s5 = "JAVA";
	    String s6 =s1.toUpperCase();
	    System.out.println(s5==s6);
/*	
	String s7 ="Hello";
	String s8 ="World";
	String s9 ="HelloWorld";
	String s10 =s7+s8;// new obj got created and stored in different address as a string operation is formed
	System.out.println(s9==s10);
*/	
	String s7 ="Hello";
	String s8 ="World";
	String s9 ="HelloWorld";
	String s10 =(s7+s8).intern(); 
	System.out.println(s9==s10);
	
	String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String newstr="";
	
	System.out.println("------------------USING STRING CONCATENATION-------------------");
	long ns1 = System.nanoTime();
	for(int i=0;i<str.length();i++)
		for(int j=0;j<=i;j++)
			newstr += str.charAt(j);
	long ns2 = System.nanoTime();
	System.out.println("Result : :"+newstr);
	System.out.println("Approx time taken :" +(ns2-ns1)+ " nanosecond"+System.nanoTime());
	
	
	System.out.println("------------------USING STRING STRING BUFFER-------------------");
	StringBuffer strbuffer=new StringBuffer();
	ns1 = System.nanoTime();
	for(int i=0;i<str.length();i++)
		for(int j=0;j<=i;j++)
			strbuffer.append(str.charAt(j));
	ns2 = System.nanoTime();
	System.out.println("Result : :"+strbuffer);
	System.out.println("Approx time taken :" +(ns2-ns1)+ " nanosecond"+System.nanoTime());

//	-----------
	System.out.println("------------------USING STRING STRING BUILDER-------------------");
	StringBuilder strbuilder=new StringBuilder();
	ns1 = System.nanoTime();
	for(int i=0;i<str.length();i++)
		for(int j=0;j<=i;j++)
			strbuilder.append(str.charAt(j));
	ns2 = System.nanoTime();
	System.out.println("Result : :"+strbuilder);
	System.out.println("Approx time taken :" +(ns2-ns1)+ " nanosecond"+System.nanoTime());


	
	
	
	
	
	
	
	
	
	
}
}
