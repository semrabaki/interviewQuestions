package Lists;

import java.util.ArrayList;
import java.util.List;

public class Q1D {

	public static void main(String[] args) {
		 List<String> list1= new ArrayList<>();
	     
	     list1.add("Ali");
	     list1.add("Ayse");
	     list1.add("Veli");
	     list1.add("Fatma");
	     list1.add("Semra");
	   
	   
	     
	     for( String w: list1)
	     {
	    	 if(w.contains("a"))
	    	 {
	    		 list1.remove(w);
	    	 }
	     }
	     
	     for(String w: list1)
	     {
	    	 System.out.println(w);
	     }
		}

	}


