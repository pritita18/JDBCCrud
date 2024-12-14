package Mypackage;

public class Query {
	public static String read="Select * from student";
	public static String Insert=String.format("Insert into student (id, Name, marks,MobileNo) values(?,?,?,?)");
	public static  String Update=String.format("update student set marks=?  where id=? ");
	public  static String Delete=String.format("delete from student where id=?");
}
