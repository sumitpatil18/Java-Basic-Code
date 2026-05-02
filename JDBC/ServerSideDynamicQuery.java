import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.PreparedStatement;
class ServerSideDynamicQuery{
	void funCon(){
		try{

			//Step 1: Register the driver 
			Driver d1=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d1);
			System.out.println("Register the driver successfull...");

			//Step 2: Get connection
			//Note:
			//DemoDatabase database i am define in URL is menualy create in MSQL database then used this 
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodatabase","root","sumit");
			System.out.println("Connection sucessfull...");
			System.out.println("Create database sucessfull...");
			

			//Step 3: Create object PreperedStatement
			//Note:
			//studdetail table is  i am define in method is menualy create in MSQL database in table then used this 
			PreparedStatement pstmt=conn.prepareStatement("insert into studdetail values(?,?)");
			System.out.println("Create Object PreparedSuccessful to dynamic query...");

			//Dynamic query server side
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id and name");
			int id=sc.nextInt();	
			String name=sc.next();
			
			pstmt.setInt(1,id);
			pstmt.setString(2,name);
			pstmt.executeUpdate();
			System.out.println("Insert value sucessful...");

			//Step 5: Close connection
			conn.close();
			System.out.println("Close connection sucessful...");
		}catch(SQLException e){
			System.out.println(e.getMessage());
			//System.out.println(e.getErrorCode());
			
		}	
	}
	public static void main(String args[]){
		new ServerSideDynamicQuery().funCon();
	}
}