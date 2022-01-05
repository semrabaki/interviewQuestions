package interviewquestions;

import java.util.HashMap;
import java.util.Scanner;

public class Question8Review {
	
	/*
	 *check if two string  are anagram or not :has equal characters:examp: pide  and  edip
	 *                                                                     marry    ramry
	 */

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter two strings...");
		
		String str1= scan.next();
		String str2=scan.next();
		
		String[] s1= str1.split("");
		String[] s2= str2.split("");
		
		HashMap<String, Integer> h1= new HashMap<>();
		HashMap<String, Integer> h2= new HashMap<>();
		
		if(str1.length()==str2.length())
		{
			
			for(String w:s1)
			{
				if(h1.get(w)==null)
				{
					h1.put(w, 1);
				}
				else
				{
					h1.put(w,h1.get(w)+1);
				}
			}
			
			for(String x:s2)
			{
				if(h2.get(x)==null)
				{
					h2.put(x, 1);
				}
				else
				{
					h2.put(x,h2.get(x)+1);
				}
			}
			
			if(h1.equals(h2))
			{
				System.out.println("It is an anagram");
			}else
			{
				System.out.println("It is not an anagram");
			}
			
			
		}else
		{
			System.out.println("It is not an anagram..");
		}
		
		

	}

}
