package interviewquestions;
/*
 *check if two string  are anagram or not :has equal characters:examp: pide  and  edip
 */

import java.util.HashMap;
import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two String..");
		String str1=scan.next().toLowerCase();
		String str2=scan.next().toLowerCase();
      
		String []s1= str1.split("");
		String []s2= str2.split("");
		
		HashMap<String, Integer>resultStr1= new HashMap<>();
		HashMap<String, Integer>resultStr2= new HashMap<>();
		
		
		if(str1.length()==str2.length())
		{
			for(String w:s1)
			{
				if(resultStr1.get(w)==null)
				{
					resultStr1.put(w, 1);
				}
				else
				{
					resultStr1.put(w, resultStr1.get(w)+1);
				}
		}	
				for(String x:s2)
				{
					if(resultStr2.get(x)==null)
					{
						resultStr2.put(x,1);
					}
					else
					{
						resultStr2.put(x, resultStr2.get(x)+1);
					}
					
					
					
				}
				
				
				if(resultStr1.equals(resultStr2))
				{
					System.out.println("It is anagram");
				}
				else
				{
					System.out.println("It is not anagram...");
				}
			
			
			
		}else
		{
			System.out.println("It is not anagram...");
		}
		
		System.out.println(resultStr1);
		
		System.out.println(resultStr2);
		
	

	}

	}

