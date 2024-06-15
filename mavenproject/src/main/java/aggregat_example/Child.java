package aggregat_example;

import java.util.Scanner;

public class Child {
	Parent ref;
	private Scanner obj;
	String address;
    Child(Parent ref){
    	this.ref=ref;
    }
    public void getAddress(Parent ref) {
    	ref.getDetails();
    	obj = new Scanner(System.in);
 	   System.out.println("Enter Address :");
 	   address=obj.nextLine();
    }
    public void display(Parent ref) {
    	ref.displayDetails();
    	 System.out.println("Address :"+address);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent pobj=new Parent();
		Child obj=new Child(pobj);
		obj.getAddress(pobj);
		obj.display(pobj);
	}

}
