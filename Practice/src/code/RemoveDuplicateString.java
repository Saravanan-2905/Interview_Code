package code;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the String");

		String str = s.nextLine();

		removeDuplicateString(str);
		
		s.close();

	}
	
	public static void removeDuplicateString(String str)
	{
		String s[] = str.toLowerCase().split(" ");
		Set<String> hs = new HashSet<>();
		
		for(int i=0; i<s.length; i++)
		{
			hs.add(s[i]);
		}
		
		System.out.println(hs);
		
	}

}
