package interviewquestions;

import java.util.Scanner;

public class Question09 {
	/*
	 /*
        Ask user enter a positive number and check if it is prime or not
        Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
         */
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num=-1;
		while (num<0)
		{
		System.out.println("Enter a positive number");
		num= scan.nextInt();
		};
		
		int flag=0;
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				flag=1;
			}
		}
		
		if(flag==1)
		{
			System.out.println(num+" is not a prime number");
		}else
		{
			System.out.println(num+ " is a prime number");
		}

	}

}
