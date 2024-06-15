package multilevelinheritance;

public class ClassC extends ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC obj=new ClassC();
		obj.displayFromA();
		obj.displayFromB();
		System.out.println("Hi From C");
	}

}
