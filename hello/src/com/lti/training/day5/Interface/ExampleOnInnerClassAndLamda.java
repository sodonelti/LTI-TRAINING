package com.lti.training.day5.Interface;

interface Printer{
	void print(String document);
}

//we are allowed to have more than one class in the same file 
//But we can have only ONE PUBLIC CLASS 
//THIS CLASS IS VISIBLE TO OTHERS WITHIN THE SAME PACKAGE
/*class DotMatrixPrinter implements Printer{
	
	@Override
	public void print(String document) {
		System.out.println("Currently Printing"+document);
	}
	
}
*/


//the public class name should be same as the file name 
public class ExampleOnInnerClassAndLamda {
	
	public static void main(String[] args) {
		class DeskjetPrinter implements Printer{
			public void print(String document) {
				System.out.println("now printing: "+document);
			}
		}

		Printer p=new DeskjetPrinter();
		p.print("abc.txt");
		

		
		//ANONYMOUS INNER CLASS
		//IN THIS CASE WE ARE NOT CREATING OBJECT OF AN INTERFACE
		//WE ARE ACTUALLY CREATING AN OBJECT FOR A CLASS WHICH IS EXTENDING THE INTERFACE CLASS 
		//AND WHERE WE DONT KNW THE NAME OF THE CLASS(ANONMYOUS CLASS)
		Printer sp=new Printer() {
			
			@Override
			public void print(String document) {
				System.out.println("now printing: " +document);
				
			}
		};
		//WE HAVE TO TERMINATE ANONMYOUS CLASSES WITH ';' ALWAYS
		// A PARENT CLASS IS REQUIRED, FOR CREATING A ANONMYOUS CLASS.
		
		sp.print("xyz.txt");
		
		
		
		
		//ANONMYOUS FUNCTION - a.k.a LAMDA FUNC
		//Lamda expression are nothing but anonmyous inner classes in other
		//AN ' ->' SYMBOL IS USED TO INDICATE LAMDA IS BEING USED
		//ONLY APPLICABLE FOR INTERFACES HAVING ONLY ONE ABSTRACT METHOD
		
		//THIS IS THE CODE FOR PRINT METHOD FOR PRINTER INTERFACE
		Printer pr=(document)->{
		//Printer pr=(String document)->{
			System.out.println("now printing"+document);
			
		};
		pr.print("hello.txt");
		
		Printer pt=doc`	 ->System.out.println("now printing" +doc);
		pt.print("hello");
		
	//INNER CLASSES CAN BE PRIVATE , PROTECTED, PUBLIC
	//WE CAN DECLARE AN INNER CLASS AS PRIVATE IN THE MAIN CLASS
	//GENERALLY CLASSES ARE ONLY PUBLIC ,WHEREAS INNER CLASS CAN BE PRIVATE etc.
	//THE PRIVATE INNER CLASS CANNOT BE ACCESSED OUTSIDE THE MAIN CLASS. 
/*	private class ABC{

		}
	*/

	//when we use a class inside another class then its called INNER CLASS / NESTED CLASS
	//inner classes can also be used inside a function
	//INNER CLASS ---> DotMatrixPrinter
	/*class DotMatrixPrinter implements Printer{
		
		@Override
		public void print(String document) {
			System.out.println("Currently Printing"+document);
		}
		
	}
	*/
	
	
	//WE CAN USE INNER CLASS INSIDE THE FUNCTION AND IT IS LIMITED INSIDE THAT BLOCK 
	//BY DOING THIS WE REDUCE THE VISIBILITY OF THAT INNER CLASS.
	/*public static void main(String[] args) {
		class A
	}
	*/
	
	
	
	
	}
	
}
