package code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccurence {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = s.nextLine();
		
		//String str = "I am Saravanan";
		characterOccurernce(str);
		s.close();
		
	}	
	public static void characterOccurernce(String str)
	{
		
		Map<Character, Integer> hm = new HashMap<>();
		
		for(char c : str.toLowerCase().toCharArray())
		{
			if(c == ' ') 
			{
				continue;
			}
			
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		
		
		for(Map.Entry<Character, Integer> e : hm.entrySet())
		{
			System.out.println(e.getKey() +":"+ e.getValue());
		}
			
		
	}

}
