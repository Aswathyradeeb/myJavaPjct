package finalkeyword;

 public class FinalClass { //If the class is final it can't be extended
    final int x=10;
    public void display() {
    	//x=20; //As it is final it acts as a constant;
    	System.out.println(x);
    }
    final void print() {
    	System.out.println(x);//As it is final cannot be Override
    }
    
}
