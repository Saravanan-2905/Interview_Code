package code;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter a value: ");
		int a = s.nextInt();
		
		System.out.println("Enter b value: ");
		int b = s.nextInt();
		
		swapNumber(a,b);
		s.close();
	}
	
	public static void swapNumber(int a, int b)
	{
		a = a + b; 
		b = a - b; 
		a = a - b;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
