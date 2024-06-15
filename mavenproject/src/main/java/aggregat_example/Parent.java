package aggregat_example;

import java.util.Scanner;

public class Parent {
	
   int rollno;
   String name;
   private Scanner obj;
   public void getDetails() {
	   obj = new Scanner(System.in);
	   System.out.print("Enter roll number :");
	   rollno=obj.nextInt();
	   obj.nextLine();
	   System.out.println("Enter name :");
	   name=obj.nextLine();
	   }
   public void displayDetails() {
	   System.out.println("Details");
	   System.out.println("Roll number :"+rollno);
	   System.out.println("Name :"+name);
	   }
}
