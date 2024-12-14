package Mypackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
	
		System.out.print(" Choose AND Enter your choice number");
		System.out.print("1.Insert 2.Update 3.Delete 4.Read");
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:
			int id=0;
			String name=null;
			int marks=0;
			long mobileNo=0;
			while(true) {
			System.out.println("Enter id");
			 id=sc.nextInt();
			System.out.println("Enter name");
			String Name=sc.next();
			System.out.println("Enter marks");
			 marks=sc.nextInt();
			System.out.println("Enter Mobile number");
			 mobileNo=sc.nextLong();
			 System.out.print("You want to insert more data (Y/N)");
			 String ch=sc.next();
			Student stud=new Student(id,Name,marks,mobileNo);
			DAO.Insert(stud);
			if(ch.toUpperCase().equals("N")) {
			   break;	
			}
			}
			break;
			
		case 2:
			System.out.print("Enter Marks and id for update");
			
			 marks=sc.nextInt();
		       id=sc.nextInt();
			DAO.update(marks, id);
			break;
			
		case 3:
			System.out.print(" Are you want to delete row, Enter id");
			id=sc.nextInt();
			DAO.delete(id);
			break;	
			
		case 4:
			DAO.Read();
			break;
			
		default:
			System.out.println("please! Choose betwwen 1  to 4");
		}
		
	}
}


