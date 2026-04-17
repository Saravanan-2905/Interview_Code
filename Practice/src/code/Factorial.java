package code;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Integer Value");
		
		int num = s.nextInt();
		
		System.out.println("Factorial Value: "+factorial(num));
		
		s.close();
		
	}
	
	public static int factorial(int num)
	{
		if(num == 0 || num == 1)
		{
			return 1;
		}
		else
		{
		 return num * factorial(num-1);
		}
	}

}
