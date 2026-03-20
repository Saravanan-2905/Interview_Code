package code;

import java.util.Scanner;

public class VowelsConsonantsCharacters {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the String");

		String str = s.nextLine();

		vowelsConsonantsCharacterCount(str);

		s.close();

	}
	
	public static void vowelsConsonantsCharacterCount(String str)
	{
		int characters = 0, vowels = 0, consonants = 0;
		
		for(char c : str.toLowerCase().toCharArray())
		{
			if(c != ' ') 
			{
				characters++;
			}
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			{
				vowels++;
			}
			else if(c >= 'a' && c <= 'z')
			{
				consonants++;
			}
		}
		
		System.out.println("Characters Count: "+characters);
		System.out.println("Vowels Count: "+vowels);
		System.out.println("Consonants Count: "+consonants);
	}

}
