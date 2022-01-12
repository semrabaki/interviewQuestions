package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4D {

	public static void main(String[] args) {
		 // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek elemanlarını ayrı diziye bir metodda atayarak
        // main de yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		
		List<Integer> list1= new ArrayList<>();
		
		for(int i=0; i<6; i++)
		{
			System.out.println("bir sayi giriniz");
			int a=scan.nextInt();
			list1.add(a);
			
		}
		
		System.out.println(list1);
		
		
		list1.stream().filter(t->t%2==1).forEach(t->System.out.print(t+" "));

		System.out.println("Odd elements : "+ list1);
		
	}

}
