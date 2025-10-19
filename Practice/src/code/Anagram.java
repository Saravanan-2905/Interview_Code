package code;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter First String");
		
		String str1 = s.nextLine();
		
		System.out.println("Enter Second String");
		
		String str2 = s.nextLine();
		
		isAnagram(str1, str2);
		
		s.close();

	}
	
	public static void isAnagram(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			System.out.println("Not Anagram");
		}
		else
		{
			char c1[] = str1.toLowerCase().toCharArray();
			char c2[] = str2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}			
			
		}
		
	}

}
