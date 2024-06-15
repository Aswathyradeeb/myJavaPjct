package aggregate;

public class Child {
    String t;
    Parent ref;
	Child(String t,Parent ref){
		this.t=t;
		this.ref=ref;
	}
	public void display() {
		System.out.println("Child Class :"+t);
		System.out.println("Parent class :"+ref.b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj=new Parent(10);
		System.out.println("Parent class :"+obj.b);
		Child obj2=new Child("test",obj);
		obj2.display();
	}

}
