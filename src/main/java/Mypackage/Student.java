package Mypackage;

public class Student {
	
	private int id;
	
	private String name;
	
	private int marks;
	
	private long mobileNo;
	
	public Student(int id,String name,int marks,long mobileNo) {

		this.id=id;
		this.name=name;
		this.marks=marks;
		this.mobileNo=mobileNo;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public long mobileNo() {
		return mobileNo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", mobileNo=" + mobileNo + "]";
	}
	
	
}
