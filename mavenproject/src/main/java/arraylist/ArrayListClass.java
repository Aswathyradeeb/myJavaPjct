package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
	 ArrayList <String> lst=new ArrayList();
    public void display() {
    	 for(String a : lst){
        	 System.out.println(a);
         }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lstnum=new ArrayList();
		ArrayListClass obj=new ArrayListClass();
		obj.lst.add("aswathy");
		obj.lst.add("arish");
		obj.lst.add("Test");
        obj.display();
        Iterator itobj= obj.lst.iterator();
        System.out.println("using Iterator :");
        while(itobj.hasNext()) {
        	System.out.println(itobj.next());
        }
		obj.lst.remove(0);
		obj.lst.remove("Test");
		System.out.println("After removing from list");
		obj.display();
		System.out.println("Displaying using get:"+obj.lst.get(0));
		System.out.println("Contains 'arish':"+obj.lst.contains("arish"));
		//obj.lst.removeAll(obj.lst);
		//obj.display();
		lstnum.add("1");
		obj.lst.addAll(lstnum);
		obj.display();
		System.out.println(lstnum);
		System.out.println(lstnum.size());
		
	}

}
