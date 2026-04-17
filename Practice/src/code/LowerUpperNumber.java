	package code;

import java.util.Scanner;

public class LowerUpperNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the String");

		String str = s.nextLine();

		lowerUpperNumber(str);

		s.close();

	}
	
	public static void lowerUpperNumber(String str)
	{
		String upperCase = "";
		String lowerCase = "";
		String numbers = "";
		String specChar = "";
		
		// 1. REGEX - Regular Expression : replaceAll()
		
		 upperCase = str.replaceAll("[^A-Z]", "");
		 lowerCase = str.replaceAll("[^a-z]", ""); 
		 numbers = str.replaceAll("[^0-9]", "");
		 specChar = str.replaceAll("[a-zA-Z0-9]", "");
		
		// 2. Char Range : toCharArray()
		 
		 for(char c : str.toCharArray())
		 {
			 if(c >= 'A' && c <= 'Z')
			 {
				 upperCase += c;
			 }
			 else if(c >= 'a' && c <= 'z')
			 {
				 lowerCase += c;
			 }
			 else if(c >= '0' && c <= '9')
			 {
				 numbers += c;
			 }
			 else 
			 {
				 specChar = specChar + c;
			 }
		 }
		
		// 3. Using Character Class
		
		 for(char c : str.toCharArray())
		 {
			 if(Character.isUpperCase(c))
			 {
				 upperCase += c;
			 }
			 else if(Character.isLowerCase(c))
			 {
				 lowerCase += c;
			 }
			 else if(Character.isDigit(c))
			 {
				 numbers += c;
			 }
			 else 
			 {
				 specChar += c;
			 } 
		 }
		
		
		System.out.println("UpperCase: "+upperCase);
		System.out.println("LowerCase: "+lowerCase);
		System.out.println("Numbers: "+numbers);
		System.out.println("Special Characters: "+specChar);
	}

}
