package encapsulation;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj=new Encapsulation();
		obj.set("Test");//Private variable cannot be accessed from Main, wrapped inside the class
		obj.get();//hence an eg of Encapsulation.
	}
}
