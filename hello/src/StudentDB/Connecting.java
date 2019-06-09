package StudentDB;

import  java.sql.*;
import java.util.Scanner;

/*
 * -----------created table Student------------
 Create table Student(
 rollno number(5) primary key,
 fname varchar2(20),
 lname varchar2(20),
 course varchar2(20),
 result varchar2(20));
 */

public class Connecting {
	
	Connection con;
	PreparedStatement ps;
	Statement st;
	ResultSet rs;
	
	public Connecting() {
		con=null;
	}
	
	
	
	//===========================CONNECTION PART===================
	
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		//	System.out.println("done");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	
	
	
	//====================INSERTING  VALUES INTO STUDENTS =========================
	
	
	public void insertStud(String fname,String lname,String course,String result) {
		try {
			con = getConnection();
			ps=con.prepareStatement("insert into Student values"+"(seq.NEXTVAL,?,?,?,?)");
			
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, course);
			ps.setString(4, result);
			int i=ps.executeUpdate();
			if( i !=0 ) {
				System.out.println("..............VALUES INSERTED SUCCESSFULLY.............");
			}
			else {
				System.out.println(".........VALUES NOT INSERTED..........");
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
//====================DELETING STUDENTS DATA==================
	
	public void deleteStud(int rollno) {
		try {
			con = getConnection();
			ps=con.prepareStatement("delete from Student where rollno=?");
			ps.setInt(1,rollno);
			int i=ps.executeUpdate();
			if( i !=0 ) {
				System.out.println("..............STUDENT  DELETED.............");
			}
			else {
				System.out.println(".........STUDENT DOES NOT EXIST..........");
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	

	//========================FAILED STUDENTS =====================
	
	public void failStud() {
		try {
			con = getConnection();
			st=con.createStatement();
			rs=st.executeQuery("select * from Student where result = 'fail'");
			System.out.println("Roll_No\t First_name\t Last_name\t Course\t Result");
			System.out.println("----------------------------------------------------------------------------------------");
		     
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t ");
				System.out.println(rs.getString(2)+"\t ");
    			System.out.println(rs.getString(3)+"\t ");
				System.out.println(rs.getString(4)+"\t ");
				System.out.println(rs.getString(5));
			}
			
			System.out.println("-----------------------------------------------------------------------------------");
			rs.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
//======================READ AND DISPLAY(GET STUDENT)=====================
	public void getStudent(int rollno) {
		try {
			con=getConnection();
		    ps=con.prepareStatement("select * from Student where rollno=?");
		    ps.setInt(1, rollno);
			rs =ps.executeQuery();
		//	st=con.createStatement();
		//	rs =st.executeQuery("select * from Student order by rollno");
			System.out.println("Roll_No\t First_name\t Last_name\t Course\t Result");
			System.out.println("----------------------------------------------------------------------------------------");
			while (rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getString(5));
				System.out.println("");
			}
			System.out.println("=================================================");
			rs.close(); 
			con.close();
		}
		catch(Exception e) {
			System.out.println("ERROR IN FETCHING DATA");
			//e.printStackTrace();
		}
	}
	
	
	
	
	//=============================MAIN================================
	
	
	public static void main(String[] args) {
		Connecting c=new Connecting();
		
		System.out.println("****************** DOVETON GROUPS OF SCHOOL ********************");

		System.out.println("---------------------STUDENT MANAGEMENT SYSTEM ------------------");
		
		while(true)
		{
		System.out.println("Press 1 to Add A New Student \t Press 2 to Search For Students");
		System.out.println("Press 3 to see The list of Failed Students \t Press 4 to Delete Student Details");
		System.out.println("Press 5 for Exit"); 

	    Scanner sc = new Scanner(System.in);
		int choice =sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Students FirstName , LastName , Course & Result : ");
				String fname=sc.next();
				String lname=sc.next();
				String course=sc.next();
				String result=sc.next();
				c.insertStud(fname, lname, course, result);
				break;
			case 2:
				System.out.println("Enter the Roll number of the Student whose details you want to see : ");
				int rollno = sc.nextInt();
				c.getStudent(rollno);
				break;
			case 3:
				System.out.println("The List of those Students who Failed are : ");
				c.failStud();
				break;
			case 4:
				System.out.println("Enter the Roll number of the Student you want to Delete :");
				rollno=sc.nextInt();
				c.deleteStud(rollno);
				break;
			case 5:
				System.out.println("The Application has Terminated");
				System.exit(0);
				
				default:
					System.out.println("The selection is Invalid");
				break;
				
			}
		}	
			
	}

}
	
	