package aggregat_example;

import java.util.Scanner;

public class Address {
	   String address;
	   Student ref;
	   Address(Student ref){
		   this.ref=ref;
	   }
	   private Scanner obj=new Scanner(System.in);
	   public void getAddress(Student ref) {
		   ref.getStudent();
		   System.out.println("Enter Address :");
		   address=obj.nextLine();
	   }
	   public void displayStudent(Student ref) {
		   ref.displayStudent();
		   System.out.println("Address:"+address);
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student obj=new Student();
         Address aobj=new Address(obj);
         aobj.getAddress(obj);
         aobj.displayStudent(obj);
         
	}

}
