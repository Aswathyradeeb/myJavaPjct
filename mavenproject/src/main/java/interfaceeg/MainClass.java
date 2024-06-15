package interfaceeg;

public class MainClass implements IntrClass,IntrClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass obj=new MainClass();
		obj.display();
		obj.print();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		int b=a+10;
		System.out.println(b);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

}
