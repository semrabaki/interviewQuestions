package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Q1 {
	/*
     * Input olarak verilen listteki isimlerden
     * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */

    // List<String> list1 = new ArrayList<>();
    // list1.add("Ali");
    // list1.add("Veli");
    // list1.add("Ayse");
    // list1.add("Fatma");
    // list1.add("Omer");

	public static void main(String[] args) {
		
     List<String> list1= new ArrayList<>();
   
     list1.add("Semra");
     list1.add("Ali");
     list1.add("Ayse");
     list1.add("Veli");
     list1.add("Fatma");
     list1.add("Semra");
     list1.add("OZlem");
     list1.add("Omer");
     list1.add("ahmet");
//     
//   
     ListIterator listItr1= list1.listIterator();
     
  

    while(listItr1.hasNext()) {
    	  String str=(String)listItr1.next();
    	  if(str.contains("a"))
    	  {
    		  listItr1.remove();
    	  }
    }
	
    System.out.println(list1);
    
   ////  List<String> list2= list1.stream().filter(t->!t.contains("a")).collect(Collectors.toList());
     
    // System.out.println(list2);
     
     
 
}
}
