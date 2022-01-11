package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.List;

public class Q3 {
	
	  //Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
	  // toplamını bulunuz. Sonucu ekrana yazdırınız.

	public static void main(String[] args) {
		
		 Scanner scan= new Scanner(System.in);
		 List<Integer>list1= new ArrayList<>();
		 
		 System.out.println("Enter an integer");
		 
		 while(scan.hasNextInt())
		 {
			 System.out.println("Enter an integer");
			 
			 int num= scan.nextInt();
			 
			 list1.add(num);
			 
		 }
		 
		 System.out.println(list1);
		 
		 list1.stream().map(Utils::getSquare).forEach(Utils::printInTheSameLineWithSpace);

	}

}
