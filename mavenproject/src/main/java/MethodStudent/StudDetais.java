package MethodStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudDetais {
    public int rollno;
    public String name;
    ArrayList<Student> std=new ArrayList<Student>();
    Scanner s = new Scanner(System.in);
    Void getDetais() {
    	for(int i=0;i<3;i++)
    	{
    		System.out.println("Enter name:");
    		name=s.nextLine();
    		s.nextLine();
    		System.out.println("Enter rollno:");
    		rollno=s.nextInt();
    		
    	}
    	return null;
    }
    Void getstudDetais() {
    	for(int i=0;i<3;i++)
    	{
    		
    		System.out.println("Enter name:");
    		s.nextLine();
    		System.out.println("Enter rollno:");
    		rollno=s.nextInt();
    		
    	}
    	return null;
    }
    void display(int );
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudDetais obj=new StudDetais();
		obj.getDetais();
	}

}
