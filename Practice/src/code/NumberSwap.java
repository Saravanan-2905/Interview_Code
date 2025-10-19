package code;

import java.util.Scanner;

public class NumberSwap {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter First Integer");
		
		int num1 = s.nextInt();
		
		System.out.println("Enter Second Integer");
		
		int num2 = s.nextInt();
		
		numberSwap(num1, num2);
		
		s.close();

	}
	
	public static void numberSwap(int num1, int num2)
	{
		num1 = num1 + num2; //3, 4 = 7
		num2 = num1 - num2; //3
		num1 = num1 - num2; //4
		
		System.out.println("Num1 : "+num1);
		System.out.println("Num2 : "+num2);
	}

}
