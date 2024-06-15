package inheritance;

public class ChildClass extends ParentClass {

	public void get() {
		System.out.println("Child Class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
		ChildClass obj=new ChildClass();
		obj.get();
		obj.display();
	}

}
