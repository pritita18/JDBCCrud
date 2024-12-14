
package Mypackage;
import java.sql.*;

public class DB {
	//make connection
	
	
	private static Connection con=null;
	
	public static Connection bildConnection() {
		
		try {
			  String url="JDBC:mysql://localhost:3306/JDBCProject";
			
			  String userName="root";
			
			 String password="Priti";
			
		 
			con=DriverManager.getConnection(url,userName,password);
			
	        } catch(SQLException e) {
		          e.getMessage();
	        }
		
		return con;
	}
	
	
}
