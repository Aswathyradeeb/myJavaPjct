package abstraction;

public abstract class AbstractClass {
	AbstractClass(){
		System.out.println("Constructors can be implemented inside the Abstact class");
	}
   public abstract void display();
   public void displayFromAbstractClass() {
       System.out.println("Non Abstract methods can be defined inside the Abstact class");
   }
   
}
