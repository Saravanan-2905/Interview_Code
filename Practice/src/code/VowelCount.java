package code;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str = s.nextLine();
		
		vowelCount(str);
		
		s.close();
	}
	
	public static void vowelCount(String str)
	{
		//char c[] = s;
		int count = 0;
		
		for(char c : str.toLowerCase().toCharArray())
		{
			if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				count++;
			}
		}
		
		System.out.println("Vowel Count:"+count);
	}

}
