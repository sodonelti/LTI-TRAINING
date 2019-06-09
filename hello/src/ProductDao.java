

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Data Access Objects
/*
 * TODO:
 * Create table TBL_PRODUCT(
 * id number(5) primary key,
 * name varchar2(50),
 * price number(12,2),
 * quantity number(5));
 */
public class ProductDao {
	
	//INSERTING
	//public void add(int id,String name,Double price,int quantity) {
	public void add(Product product) { // taking data from another class's object (product) 
		Connection conn=null; // manages the conn between the app and the db.
		PreparedStatement stmt= null; //helps us to execute SQL statement
		try {
				//loading the JDBC Driver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Establishing Connection with the database
				//address of the database ... :xe
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");

				String sql= "insert into TBL_PRODUCT values(?,?,?,?)";//? is equal  &&
				stmt=conn.prepareStatement(sql);
				
				stmt.setInt(1, product.getId());
				stmt.setString(2, product.getName());
				stmt.setDouble(3, product.getPrice());
				stmt.setInt(4, product.getQuantity());
				stmt.executeUpdate();//any DML statement0
			}
			catch(ClassNotFoundException e) {
				System.out.println("JDBC driver not found");
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			finally {
				try {
					conn.close();
				}
				catch (Exception e) {
					
				}
		}
		
	}

	
	@SuppressWarnings("finally")
	public List<Product> fetchAll(){ // taking data from another class's object (product) 
		Connection conn=null; // manages the conn between the app and the db.
		PreparedStatement stmt= null; //helps us to execute SQL statement
		ResultSet rs= null; // helps us to fetch the result of the selected query
		try {
				//loading the JDBC Driver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Establishing Connection with the database
				//address of the database ... :xe
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");

				String sql= "select * from TBL_PRODUCT where quantity>=?";//? is equal  &&
				stmt=conn.prepareStatement(sql);
		        stmt.setInt(1, 10); // ( no. of question mark , what to pass as value)
		        rs=stmt.executeQuery();
		        
		        
		        List<Product> products=new ArrayList<Product>();
		        while(rs.next()){ // for each row
		        	Product p = new Product();
		        	p.setId(rs.getInt(1));
		        	p.setName(rs.getString(2));
		        	p.setPrice(rs.getDouble(3));
		        	p.setQuantity(rs.getInt(4));
		        	products.add(p);
		        	
		        }return products;

			
			}
			catch(ClassNotFoundException e) {
				System.out.println("JDBC driver not found");
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			finally {
				try {
					conn.close();
				}
				catch (Exception e) {
					
				}
				return null; //BADDD
		}
		
	}

}






















