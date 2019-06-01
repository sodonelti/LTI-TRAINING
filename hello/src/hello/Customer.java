package hello;

public class Customer {
	
	private String name;
	private String email;
	
	//LINKING CUSTOMER AND ADDRESS CLASS
	private Address addr; //HAS -A RELATIONSHIP

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	public void displaydetails() {
		
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("City: "+addr.getCity());
		System.out.println("State: "+addr.getState());
		System.out.println("Pincode: "+addr.getPincode());
		
	}
	
	
}
