package interviewquestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

/*
      Count the words in a String one by one
	  Girilen bir String'deki kelimeleri tek tek saydiran java code create ediniz.
	  
	  For Example:
	  Input :  String is "Ali came to school and Ayse came to school"
	  Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
 */
public class Question03 {

	public static void main(String[] args) {
	
		System.out.println("Enter a string..");
		Scanner scan=new Scanner(System.in);
		
		String str=scan.nextLine();
		String []s= str.split(" ");
		
		HashMap<String, Integer>resultMap= new HashMap<>();
		
		for(String w: s)
		{
			Integer numOfOccurences= resultMap.get(w);
			
			if(numOfOccurences==null)
			{
				resultMap.put(w,1);
			}
			else
			{
				resultMap.put(w, numOfOccurences+1);
			}
		}
		
		//System.out.println(resultMap);
		

				Set<Entry<String, Integer>> setFromMap= resultMap.entrySet();////If you want to convert Map to a Collection use entrySEt();
				
				for(Entry<String, Integer> w:setFromMap)
				{
				 System.out.print(w+ ", ");
				}
				//2nd way to print on console
				System.out.println("\nWhile loopp");
				Iterator iterator= resultMap.entrySet().iterator();
				while(iterator.hasNext())
				{ 
					System.out.print(iterator.next()); 
					
					
				}
				
				
				//2.way without hashmap
				System.out.println("Please enter a sentence ");
				String str = scan.nextLine();

				String arr[] = str.split(" ");
				List<String> list = new ArrayList<>();

				for (int i = 0; i < arr.length; i++) {
					int sayac = 1;
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i].equals(arr[j])) {
							sayac++;
						}
					}

					if (!list.contains(arr[i])) {
						list.add(arr[i]);

					}

				}
				for (int k = 0; k < list.size() - 1; k++) {
					System.out.print(list.get(k) + ", ");
				}
				System.out.print(list.get(list.size() - 1));
				scan.close();

		
	}

}
