package Lists;

import java.util.List;

public class Utils {

	

		public static void printInTheSameLineWithSpace(Object o) {
			System.out.print(o + " ");
		}
		
		public static boolean checkToBeEven(int x) {
			return x%2==0;
		}
		
		public static boolean checkToBeOdd(int x) {
			return x%2!=0;
		}
		
		public static int getSquare(int x) {
			return x*x;
		}
		
		public static int getCube(int x) {
			return x*x*x;
		}
		
		public static double getHalf(int x) {
			return x/2.0;
		}
		
		public static char getLastChar(String str) {
			return str.charAt(str.length()-1);
		}
		
		public static char getFirstChar(String str) {
			return str.charAt(0);
		}
		
		public static int getSumOfDigits(int x)
		{
			int sum=0;
			while(x!=0)
			{
				sum=sum+x%10;
				x=x/10;
			}
			return sum;
		}
		
		public static int getAvarageScore(List<Integer> list){
			int sum=0;
			for(int w: list)
			{
				sum+=w;
			}
			
			int avg=0;
			avg=sum/list.size();
			
			return avg;
			
		}

	

}
