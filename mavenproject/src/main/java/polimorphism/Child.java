package polimorphism;

public class Child extends Parent {
	 public void display() {
		 super.display();
		  System.out.println("From Child class");
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.display();
		Parent obj1=new Child();//another method
		obj1.display();
	}

}
