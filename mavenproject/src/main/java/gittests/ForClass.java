package gittests;

import java.util.Scanner;

public class ForClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the limit :");
		int l=obj.nextInt();
		for(int i=1;i<=l;i++) {
			System.out.println(i);
		}
	}

}
