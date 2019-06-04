package Assignment1;

public class BookSir extends productSir{

	public BookSir(String name, int stock, double price, String description) {
		super(name, stock, price, description);
		// TODO Auto-generated constructor stub
	}

	//RUNTIME POLY
	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
		return 0.1*getPrice();
	}
}
