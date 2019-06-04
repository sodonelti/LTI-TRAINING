package Assignment1;

public abstract class productSir {

	private static int sequence=1000;//WE USE STATIC FOR UNIQUE ID AND INCREMENT IT.
	
	private String name;
	private int id = sequence++; //SINCE WE WANT UNIQUE ID WE INCREMENT IT.
	private int stock;
	private double price;
	private String description;
	
	
	
	public productSir(String name, int stock, double price, String description) {
		super();
		this.name = name;
		this.stock = stock;
		this.price = price;
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getStock() {
		return stock;
	}
	public double getPrice() {
		return price;
	}
	
	//THIS METHOD/FUNC WILL BE OVERRIDDEN BY THE TWO CHILD CLASSES.
	public abstract double calculateDiscount();
	
	public double generateBill(int quantity) {
		double total = ( price - calculateDiscount()) * quantity;
		return total;
	}
	
	public void Display() {
		System.out.println("id"+id);
		System.out.println("Name"+name);
		System.out.println("Description"+description);
	}

	
	
	
}
