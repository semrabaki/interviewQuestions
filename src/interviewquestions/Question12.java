package interviewquestions;

import java.util.Scanner;

public class Question12 {
	
	/*
	    Crteate a program checks if a String is PALINDROME or not.
        If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
        For Example : "madam" or "nurses run" .
	 */

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a string");
		String str= scan.next();
		
		 checkPalindrom(str);
	

	}

	private static void checkPalindrom(String str) {
		
		String reversedStr="";
		for(int i=str.length()-1; i>=0; i--)
		{
			 reversedStr+=str.charAt(i);
			
			
		}
		
		System.out.println(reversedStr);
		
		if(str.equalsIgnoreCase(reversedStr))
		{
			System.out.println("the string is palindrom");
		}
		else
		{
			System.out.println("it is not a palindrome");
		}
	}

}
