package interviewquestions;

import java.util.Scanner;

public class Question07 {

	/*
	 Fibonnacchi 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc
	 */
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		

		System.out.println("Enter a number..");
		int num=scan.nextInt();
		
		int a=1, b=1,k=0;
		
		System.out.print("1 1 ");
		
		for(int i=1; i<=num; i++)
		{
			k=a+b;
			System.out.print(k+ " ");
			a=b;
			b=k;
			
		}
		

	}

}
