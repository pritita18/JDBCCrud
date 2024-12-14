package Mypackage;
import java.sql.*;
import java.util.ArrayList;

public class DAO {

	public static void Insert(Student s) {
		
	   Connection con=DB.bildConnection();
	   //System.out.println("data inserted successefullly");
	   String query=Query.Insert;
		
	   try {
		   
		   PreparedStatement pre=con.prepareStatement(query);
		   
		   pre.setInt(1, s.getId());
		   pre.setString(2, s.getName());
		   pre.setInt(3,s.getMarks());
		   pre.setLong(4, s.mobileNo());
		   pre.addBatch();
//		  pre.executeUpdate();
		   pre.executeBatch();
		   System.out.println("data inserted successefullly");
	   }catch(SQLException e) {
		e.getMessage();
	}

}
	
	public static void update(int marks,int id) {
		
		Connection con=DB.bildConnection();
		try {
			
			String query=Query.Update;
			
			PreparedStatement pre=con.prepareStatement(query);
			pre.setInt(1,marks);
			pre.setInt(2,id);
			
			pre.execute();
			
			System.out.print("data updated successfully");
		}catch(SQLException e) {
			System.out.print(e.getMessage());
		}
	}
	
		public static void delete(int id) {
			 Connection con=DB.bildConnection();
			   //System.out.println("data inserted successefullly");
			   String query=Query.Delete;
				
			   try {
				   
				   PreparedStatement pre=con.prepareStatement(query);
				   pre.setInt(1, id);
				   pre.execute();
				  
				
				   System.out.println("Data deleted successfully");
			   }catch(SQLException e) {
				e.getMessage();
			}
			
		}
		
		public static ArrayList<Student> Read() {
			 ArrayList <Student> list=new ArrayList<>();
	
			   Connection con=DB.bildConnection();
			   //System.out.println("data inserted successefullly");
			   String query=Query.read;
				
			   try {
				   
				   Statement state=con.createStatement();
				   ResultSet result=state.executeQuery(query);
				   
				   while(result.next()) {
					  Student s=new Student(result.getInt("id"),result.getString("name"),result.getInt("marks"),result.getLong("mobileNo"));
					  list.add(s);
				   }
				   for(int i=0;i<list.size();i++) {
					   System.out.println(list.get(i));
				   }
				    
			   }catch(SQLException e) {
				   System.out.println(e.getMessage());
			}
           return list;
		
		}
		
	
}



























