package Assignment1;

public class AppSir {
	
	public static void main(String[] args) {
		
		productSir b1=new  BookSir("Java Handbook",99,500,"A classic book on Java");
		
		BookSir b2=new  BookSir("Java Unleashed",99,400,"A classic book on Java");
		
		ToySir t1=new ToySir("RC CAR",99,2500,"RC CAR","4-5");
		ToySir t2=new ToySir("MARVEL",99,500,"ACTION","5+");
		
		double bill1=b1.generateBill(40);
		double bill2=t1.generateBill(4);		
		System.out.println("TOTAL AMT FOR 40 JH IS: "+bill1);
		System.out.println("toy price"+bill2);
		
		t1.Display();
	
	}
}
