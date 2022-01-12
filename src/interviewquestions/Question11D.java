package interviewquestions;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question11D {
	
	/*
	  /*
       Create a function that takes an array and returns the difference between
       and the smallest numbers.
       Ask user to enter array elements.
      kullanıcının girdigi bir array'in en buyuk elemani ile
      en kucuk elemanının  farkını bulan bir method create ediniz.
       */

	public static void main(String[] args) {
		 System.out.println("Enter numbers below please. Any non numeric value to stop the input:");
	        Set<Integer> set = new HashSet<>();
	        try (Scanner scanner = new Scanner(System.in)) {
	            while (scanner.hasNextInt()) {
	                int n = scanner.nextInt();
	                set.add(n);
	            }
	        }
	        System.out.println(
	                "The difference between the max and the min: " +
	                        differenceBetweenMaxAndMin(set));
	    }

	private static int differenceBetweenMaxAndMin(Set<Integer> set) {
		
		return  Collections.max(set) - Collections.min(set);
	}
	}


