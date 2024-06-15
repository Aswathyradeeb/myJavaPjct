package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List <String> obj=new ArrayList<String>(); 
        obj.add("A");
        obj.add("b");
        System.out.println("values");
        Iterator itr=obj.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
        for(String str:obj) {
        	System.out.println(str);
        }
        
	}

}