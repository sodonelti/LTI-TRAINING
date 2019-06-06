package com.lti.training.day6.ObjClass;

public class TestPerson {
	public static void main(String[] args) {
		Person p1 =new Person("MJ",38);
		// the below statement in c++ can be written like this:
		//cout<< p1; 
		//System.out.println(p1.getName());----> this will print the name ("MJ")
		
		//---> this prints the Name of the parent class of this class.
		//com.lti.training.day6.ObjClass.Person@7852e922
		System.out.println(p1);
        
		Person p2 =new Person("MJ",38);
		System.out.println(p1==p2);//reference comparison (both objects p1 and p2 are different) 
		System.out.println(p1.equals(p2)); //value comparison ..compares ref of obj.(same as above)
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		//CLONE METHOD
		try {
			Person p3 = (Person) p1.clone();
			System.out.println(p3);
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
			
			//these two are null only if no one else is calling them 

			p1 = null;
		p2 =null;
			System.gc(); //do not use this in projects.
		}
		
	}

}
