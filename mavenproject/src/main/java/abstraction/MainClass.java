package abstraction;

public class MainClass extends AbstractClass{
        public void display() {
	       System.out.println("Implemented Abstact method in Main class by Overriding");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass obj=new MainClass();
		obj.display();
		obj.displayFromAbstractClass();
		AbstractClass obj1=new MainClass();//Abstract class constructor can be invoked like this
	}

}
