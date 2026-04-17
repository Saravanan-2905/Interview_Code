	package code;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str = s.nextLine();
		
		reverseCharacter(str);
		
		s.close();

	}
	
	public static void reverseCharacter(String str)
	{
		String s[] = str.split(" ");
		
		StringBuilder sb =  new StringBuilder();
		
		for(int i=s.length-1; i>=0; i--)
		{
			sb.append(s[i]).append(" ");
		}
		
//		if (sb.length() > 0) {
//		    sb.setLength(sb.length() - 1);
//		}
		
		System.out.println("Reversed String: "+sb);
	}

}
