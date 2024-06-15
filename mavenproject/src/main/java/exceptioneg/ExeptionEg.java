package exceptioneg;

import java.util.Scanner;

public class ExeptionEg {
	public void check(int age) {
		if(age>18)
			System.out.println("Eligible");
		else
			throw new ArithmeticException("Not Eligible");
			//System.out.println("Not Eligible");
		
	}

	public static void main(String[] args) {
		int age;
		ExeptionEg obj=new ExeptionEg();
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter Age :");
		age=obj1.nextInt();
		
		obj.check(age);
	}

}
