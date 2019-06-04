package Assignment1;

public class ToySir extends productSir {

	public ToySir(String name, int stock, double price, String description, String ageGroup) {
		super(name, stock, price, description);
		this.ageGroup=ageGroup;
		// TODO Auto-generated constructor stub
	}

	private String ageGroup;
	
	//RUNTIME POLY
	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
		if(ageGroup.equals("2-4"))
		return 0.15*getPrice();      //15%
		else if(ageGroup.equals("4-5"))
			return 0.05*getPrice();  //5%
		else 
			return 0;
	}
}
