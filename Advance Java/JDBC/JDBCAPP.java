/* javap java.sql.Driver
   javap java.sql.Connection
   javap java.sql.Statement
   javap java.sql.ResultSet

   Set classpath for jdbc driver from cmd
	set classpath=.;E:\Jar File\mysql-connector-j-9.1.0.jar
   Check
	echo %classpath%
*/

import java.sql.*;
import java.util.*;
import java.io.*;

class JDBCAPP{
	public static void main(String[] args)throws Exception{
		//1. Load and register the driver
		//public static void registerDriver(Driver throws SQLException;
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded succesfully..");

		//2. Establish the connection
		/*public static Connection getConnection
			(String, String, String) throws SQLException;

		  public static Connection getConnection
			(String, Properties) throws SQLException;
		*/
		
		/* First way to establish connection (Preferred)
		String dbProtocol = "jdbc:mysql://localhost:3306/pwskills_octbatch";
		String username = "root";
		String password = "aman@123";
		Connection con = DriverManager.getConnection(dbProtocol, username, password);
		*/
		
		//Second Way
		//String dbProtocol = "jdbc:mysql://localhost:3306/pwskills_octbatch?user=root&password=aman@123;
		
		//Third way through file
		String dbProtocol = "jdbc:mysql://localhost:3306/pwskills_octbatch";
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("database.properties");
		props.load(fis);

		Connection con = DriverManager.getConnection(dbProtocol, props);
		System.out.println("Coonection is extablished to :: "+dbProtocol);
		System.out.println("Connection :: "+con.getClass().getName());

		//3. Creating a Statement Object
		//public abstract Statement createStatement() throws SQLException;
		Statement stmt = con.createStatement();

		System.out.println("Statement Object got created..");
		System.out.println("Statement :: "+stmt.getClass().getName());

		//4.Execute the Query
		//public abstract ResultSet executeQuery(String) throws SQLException; 
		String selectQuery = "select sid,sname,sage,saddress from student";
		ResultSet result = stmt.executeQuery(selectQuery);
		System.out.println("ResultSet Object got created..");
		System.out.println("ResultSet :: "+result.getClass().getName());

		//5. Processing the result
		System.out.println("SID\tSNAME\tSAGE\tSADDRESS");
		while(result.next()){
			int sid = result.getInt("sid");
			int sage = result.getInt("sage");
			String sname = result.getString("sname");
			String saddress = result.getString("saddress");
			
			System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+saddress);
		}

		//6. Close the resources
		result.close();
		stmt.close();
		con.close();

		System.out.println("Closing the resources...");
	}
}