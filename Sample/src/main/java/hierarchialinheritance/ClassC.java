package hierarchialinheritance;

public class ClassC extends ClassA {
	public void displayFromC() {
		   System.out.println("Hi From ClassC");
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC obj=new ClassC();
		obj.displayFromA();
		obj.displayFromC();
	}

}
