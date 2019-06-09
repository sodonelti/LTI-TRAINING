

import java.util.List;

public class Appmain {
	public static void main(String[] args) {
		ProductDao dao=new ProductDao();
		
/*		Product p =new Product();
		p.setId(10);
		p.setName("nokia 6000");
		p.setPrice(5000);
		p.setQuantity(99);

		dao.add(p);
				*/
		
		//there is a function fectAll which is returning type product
		List<Product> products = dao.fetchAll();
		for(Product p : products) {
			System.out.println("ID = "+p.getId());
			System.out.println("NAME = "+p.getName());
			System.out.println("PRICE = "+p.getPrice());
			System.out.println("QUANTITY  = "+p.getQuantity());
		}
		
	}

}
