package code;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int num = s.nextInt();
		
		oddOrEven(num);
		
		s.close();

	}
	
	public static void oddOrEven(int num)
	{
		if(num%2 == 0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}

}
