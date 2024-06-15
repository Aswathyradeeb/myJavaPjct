package finalkeyword;

public class MainClass extends FinalClass {
	//void print() { //As it is final method in the parent class cannot be Override
   // 	System.out.println(x);
   // }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass obj=new FinalClass();
		obj.display();
		obj.print();
	}

}
