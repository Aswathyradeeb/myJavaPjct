package aggregat_example;

import java.util.Scanner;

public class Student {
   int rollno;
   String name;
   private Scanner obj=new Scanner(System.in);
   public void getStudent() {
	   System.out.println("Enter Roll number :");
	   rollno=obj.nextInt();
	   obj.nextLine();
	   System.out.println("Enter Name :");
	   name=obj.nextLine();
   }
   public void displayStudent() {
	   System.out.println("Roll number :"+rollno);
	   System.out.println("Name :"+name);
   }
}
