package interviewquestions;

import java.util.Scanner;

public class Question04 {
/*
           For example; 
           input :  {4, 6, 5, -10, 8, 5, 20} ==> 10
           Output :  4 + 6 = 10, 5 + 5 = 10, -10 + 20 = 10 
 */

	public static void main(String[] args) {
		
		
		int[] arr= {4, 6, 5, -10, 8, 5, 20};
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number...");
		int num= scan.nextInt();
		
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==num)
					System.out.println(arr[i] +" + "  +arr[j]+" = "+ num);
			}
		}

	}

}
