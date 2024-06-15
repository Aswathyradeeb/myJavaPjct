package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Listeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<String> lst=new ArrayList<String>();
         lst.add("A");
         lst.add("");
         lst.add("B");
         System.out.println(lst);
         for(String str : lst) {
        	 System.out.println(str);
         }
        
	}

}
