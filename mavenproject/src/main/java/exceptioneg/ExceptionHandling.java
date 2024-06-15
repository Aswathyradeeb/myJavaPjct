package exceptioneg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		int a,b,result;
		// TODO Auto-generated method stub		
		
		try {
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter number :");
			a=obj.nextInt();
			System.out.println("Enter number :");
			b=obj.nextInt();
			result=a/b;
			System.out.println("Result :"+result);
		}
		catch(ArithmeticException ex) {
			System.out.println("Result :"+ex);
		}
		catch(InputMismatchException ex) {
			System.out.println("Result :"+ex);
		}
		finally{
			System.out.println("Executing in finally ");
		}
	}

}
