package interviewquestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question10 {
	/*
	  /*
         Create  a list by getting the list elements from user
         if there is duplicated elements remove them from the list.
         Kullanıcıdan aldıgınız elemanlardan oluşan bir listede tekrarlanan elemanları silen bir program create ediniz.
         */
	

	public static void main(String[] args) {
	
		
		List<Integer> list= new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		
		int num=0;
		String exit="";
		
		
		do {
			System.out.println("Enter list elements");
			num=scan.nextInt();
			if(list.contains(num))
				continue;
			else
				list.add(num);
			
		}while(scan.hasNextInt());
		
		System.out.print("List after duplicated elements removed: ");
		for(int w: list)
		{
			System.out.print(w+" ");
		}

	}

}
