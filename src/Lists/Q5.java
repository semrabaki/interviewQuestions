package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q5 {
	 // Bir öğretmenden girmek istediği kadar notu alınız, ve
    // ortalamayı geçen öğrenci sayısını bulunuz.

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		List <Integer> list= new ArrayList<>();
		System.out.println("Enter the grades");
		int num=0;
		while(scan.hasNextInt())
		{
			num=scan.nextInt();
			list.add(num);
				
		}
		
		int sum=0;
		for(int w: list)
		{
			sum+=w;
		}
		
		int avg=0;
		avg=sum/list.size();
		
		int counter=0;
		
		for(int x:list)
		{
			if(x>avg)
			{counter++;}
		}
						
     System.out.println( "Ortalamayi gecen ogrenci sayisi: "+counter);
     
     int listSize= list.size();
     
     list.stream().filter(t->t>Utils.getAvarageScore(list)).forEach(t->System.out.print(t + " "));
     
    int avg2= (int) list.stream().filter(t->t>Utils.getAvarageScore(list)).count();
    
    System.out.println(avg2);
    
	
}
	

	}
