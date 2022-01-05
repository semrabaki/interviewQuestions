package interviewquestions;

import java.util.Scanner;

public class Question11 {
	/*
	  /*
         Create a function that takes an array and returns the difference between
         and the smallest numbers.
         Ask user to enter array elements.
        kullanıcının girdigi bir array'in en buyuk elemani ile
        en kucuk elemanının  farkını bulan bir method create ediniz.
         */
   Scanner scan= new Scanner(System.in);
	public static void main(String[] args) {
		
       Scanner scan= new Scanner(System.in);
		 
		 int [] arr= new int[9];
		 
		 for(int i=0; i<9; i++)
		 {
			 System.out.println("enter the array elements");
			 arr[i]= scan.nextInt();
		 }
		 
		System.out.println(findDifference(arr));
		
	}
	private static int findDifference(int[] arr) {
		int temp=0;
		for(int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int w: arr)
		{
			System.out.print(w+ " ");
		}
		
		System.out.println("=================================================");
		return arr[0]-arr[8];
		
	}
	
	
	

}
