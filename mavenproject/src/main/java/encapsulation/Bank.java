package encapsulation;

public class Bank {
   private int pin;
   public void set(int pin) {
	   this.pin=pin;
   }
   public void validate() {
	   if(pin ==1001 || pin==1234 || pin ==1212) {
		   System.out.println("Valid pin !");
	   }
	   else {
		   System.out.println("Not a Valid pin ");
	   }
   }
}
