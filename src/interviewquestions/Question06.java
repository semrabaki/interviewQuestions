package interviewquestions;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Question06 {
	/*
	 /*
     Create method that finds repeated characters in a String
     Bir String'de tekrarlanan karakterleri bulan method create ediniz
 */

	public static void main(String[] args) {
	
		System.out.println("Enter a string..");
		Scanner scan=new Scanner(System.in);
		
		String str=scan.nextLine();
		String []s= str.split("");
		
		HashMap<String, Integer>resultMap= new HashMap<>();
		
		for(String w: s)
		{
			Integer numOfOccurences= resultMap.get(w);
			
			if(numOfOccurences==null)
			{
				resultMap.put(w,1);
			}
			else
			{
				resultMap.put(w, numOfOccurences+1);
			}
		}
		
		//System.out.println(resultMap);
		

				Set<Entry<String, Integer>> setFromMap= resultMap.entrySet();////If you want to convert Map to a Collection use entrySEt();
				
				for(Entry<String, Integer> w:setFromMap)
				{
				 System.out.print(w+ ", ");
				}
	}

}
