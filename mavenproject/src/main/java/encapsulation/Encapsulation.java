package encapsulation;

public class Encapsulation {
   private String name; //Can be accessed with in class 
   public void get() {
	   System.out.println(name);
   }
   public void set(String name) {
	   this.name=name;
   }  
}
