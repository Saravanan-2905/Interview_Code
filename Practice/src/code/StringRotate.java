package code;

import java.util.*;

public class StringRotate {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String st = s.nextLine();
		int n = s.nextInt();
		
		System.out.println(rotate(st, n));
	}
	
	public static String rotate(String s, int n)
	{
		n = n % s.length();
		
		String st = s.substring(s.length()-n) + s.substring(0, s.length()-n);
				
		return st;
	}

}
