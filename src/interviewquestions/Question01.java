package interviewquestions;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		Girilen bir String'i tersten yazdiran bir pr create ediniz
		 */
		System.out.println("Enter a string..");
		Scanner scan=new Scanner(System.in);
		
		String str=scan.next();
		
		for(int i=str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
		
		
		
		

	}

}
