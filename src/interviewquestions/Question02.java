package interviewquestions;

import java.util.Scanner;

/*
 Check if the integer is an Armstrong numbers
Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
         370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
 */

public class Question02 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a number..");
		int num=scan.nextInt();
		
		int realNum=num;
		
		int digit;
		int result=0;
		
		do
		{
			digit=num%10;
			num=num/10;
			
			result= result+(digit*digit*digit);
			
			
		}while(num!=0);
		System.out.println("Girilen sayinin kuplerinin toplami : " + result);
		
		
		  if (result == realNum) {
	            System.out.println("Girilen sayi Armstrong sayi");
	        } else {
	            System.out.println("Girilen sayi Armstrong sayi degildir");
	        }
		
		

	}

}
