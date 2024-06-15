package superkeyword;

public class ClassB extends ClassA {
    String name="ClassB";
    public void display()
    {
    	System.out.println(name);
    	System.out.println(super.name);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB obj=new ClassB();
		obj.display();
	}

}
