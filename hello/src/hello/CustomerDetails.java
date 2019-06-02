package hello;

public class CustomerDetails {
public static void main(String[] args) {
	
	Customer c=new Customer();
	c.setName("keerti");
	c.setEmail("abcsd");

	Address addr=new Address();
	addr.setCity("chennai");
	addr.setState("tamilnadu");
	addr.setPincode(600125);
    c.setAddr(addr);//or c.seta(addr)
	
    c.displaydetails();
	}
}
