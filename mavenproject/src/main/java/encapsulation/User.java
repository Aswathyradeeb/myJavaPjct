package encapsulation;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobj=new Scanner(System.in);
		Bank obj=new Bank();
		System.out.println("Enter Pin :");
		int pin=sobj.nextInt();
		obj.set(pin);
		obj.validate();
	}

}
