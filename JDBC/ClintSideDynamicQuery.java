import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;	
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
class ClintSideDynamicQuery{


	void funDatabaseConnection(){
		try{

			//Step 1: Register the driver 
			Driver d1=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d1);
			System.out.println("Register the driver successfull...");

			//Step 2: Get connection
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","sumit");
			System.out.println("Connection sucessfull...");

			//Step 3: Create object Statement
			Statement stmt=conn.createStatement();
			System.out.println("Create Object Successfull...");			

			//Step 4: Execute the query
			stmt.executeUpdate("CREATE DATABASE CollegeInfo");
			System.out.println("Create database sucessfull...");
	
			stmt.executeUpdate("USE CollegeInfo");
			stmt.executeUpdate("CREATE TABLE StudInfo(id int primary key,name varchar(15))");
			System.out.println("Create table sucessful...");
			
			//This is a static query
			//stmt.executeUpdate("INSERT INTO StudInfo VALUES(101,'sumit')");
			//System.out.println("Insert value sucessful...\n");

			//Dynamic query client side
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id and name");
			int id=sc.nextInt();
			String name=sc.next();
		
			stmt.executeUpdate("INSERT INTO  StudInfo VALUES("+id+",'"+name+"')");
			System.out.println("Insert value sucessful...");

			ResultSet rs;
			rs=stmt.executeQuery("SELECT *FROM StudInfo");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			}
			
			System.out.println("Data retrive sucessful...");
			//Step 5: Close connection
			stmt.close();
			System.out.println("Close connection sucessful...");
		}catch(SQLException e){
			System.out.println(e.getMessage());
			//System.out.println(e.getErrorCode());
			
		}
	}
	public static void main(String args[]){
		//Anonymous Object:Object is created and used immediately.
		new ClintSideDynamicQuery().funDatabaseConnection();
	}
}