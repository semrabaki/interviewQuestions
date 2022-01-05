package interviewquestions;

public class Question13 {
	
	/*
    Write a Java Program to swap two numbers
    Swap (takas) islemini --> a=3, b=5 iken  a=5, b=3 degerlerini alması islemidir.
    iki yoldan yaptiginiz java kodunu yaziniz.
    1.Yol: 3. degisken kullanarak
    2.Yol: 3. degisken kullanmadan
*/

    //1.Yol: 3. degisken kullanarak...

	public static void main(String[] args) {
		
		int a=5;
		int b=7;
		int temp=0;
		
		
		System.out.println(" Before swap  a= "+ a+ "b="+ b);
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(" After swap  a= "+ a+ "b="+ b);
		
		
		

	}

}
