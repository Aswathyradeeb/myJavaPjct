package hierarchialinheritance;

public class ClassB extends ClassA {
	public void displayFromB() {
		   System.out.println("Hi From ClassB");
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB obj=new ClassB();
		obj.displayFromA();
		obj.displayFromB();
	}

}
