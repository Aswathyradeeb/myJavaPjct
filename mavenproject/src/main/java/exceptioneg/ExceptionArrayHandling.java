package exceptioneg;

import java.util.Scanner;

public class ExceptionArrayHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[];
        int limit;
        try {
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter limit :");
			limit=obj.nextInt();
			a=new int[limit];
			int r=a[0]/a[1];
			System.out.println(a[limit+1]);
			
		}
        catch(ArithmeticException ex) {
        	System.out.println("Exception :"+ex);
        }
        catch(ArrayIndexOutOfBoundsException ex) {
        	System.out.println("Exception :"+ex);
        }
        catch(Exception ex) {
        	System.out.println("Exception :"+ex);
        }
        
	}

}
