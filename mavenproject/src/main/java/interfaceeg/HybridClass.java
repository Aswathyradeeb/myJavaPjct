package interfaceeg;

public class HybridClass implements IntrClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HybridClass obj=new HybridClass();
		obj.all();
		IntrClass2 obj2=new HybridClass();
		obj2.print();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Called by creating the object of Imterface in a class ");
	}

	@Override
	public void all() {
		// TODO Auto-generated method stub
		System.out.println("Interface 1: "+a);
		System.out.println("Interface 2: "+b);
	}

}
