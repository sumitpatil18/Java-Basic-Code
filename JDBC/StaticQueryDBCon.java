import java.sql.*;

public class StaticQueryDBCon {

	void funDBCon() {
		try {

			// Step 1 Register the driver
			Driver d = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
			System.out.println("Driver resigter successfull..");

			// step 2: getConnection
			//getConnection method required  three parameter,URL,Username,Password
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "sumit");
			System.out.println("Connection successfull..");

			// step 3: create object statement
			Statement stmt = con.createStatement();
			System.out.println("Create statement object successfull...");

			// step 4: execute the query

			stmt.executeUpdate("CREATE  DATABASE DemoDatabase");
			System.out.println("Create database successfull...");
			stmt.executeUpdate("USE DemoDatabase");

			stmt.executeUpdate("CREATE TABLE Info(id INT PRIMARY KEY,name VARCHAR(10))");
			System.out.println("Create table successfull...");

			stmt.executeUpdate("INSERT INTO Info VALUES (22,'Kunal')");
			System.out.println("data insert successfull...\n");

			//Retrive the data in database 
			ResultSet rs;
			rs = stmt.executeQuery("SELECT * FROM Info");
			while (rs.next()) {

				System.out.println(rs.getInt(1) + " \t" + rs.getString(2));

			}
			System.out.println("Data retrive sucessfull...");
			// step 5: close connection
			stmt.close();
			System.out.println("Close connection sucessful...");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String args[]) {
		new DBCon().funDBCon();
	}
}