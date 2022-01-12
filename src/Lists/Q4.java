package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		 // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek elemanlarını ayrı diziye bir metodda atayarak
        // main de yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		
		int [] arr= new int[6];
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("bir sayi giriniz");
			arr[i]=scan.nextInt();
			
		}
		
		for(int k=0; k<arr.length; k++)
		{
			
			System.out.println(arr[k]);
		}
		
		List<Integer> list1= new ArrayList<>();
		for(int j=0; j<arr.length; j++)
		{
			if(arr[j%2]==1)
			{
				list1.add(arr[j]);
			}
		}
		

		System.out.println("Odd elements : "+ list1);
		
	}
	
	

}
