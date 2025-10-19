package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DuplicateAndUnique {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		
		String str = s.nextLine();
		
		duplicateAndUnique(str);
		
		s.close();
			
	}
	
	public static void duplicateAndUnique(String str)
	{
		Map<String, Integer> hm = new HashMap<>();
		
		String s[] = str.toLowerCase().split(" ");
		
		for(String c : s)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
			
		}
		
		List<String> unique = new ArrayList<>();
		List<String> duplicate = new ArrayList<>();
		
		for(Map.Entry<String, Integer> e : hm.entrySet())
		{
			if(e.getValue()>1)
			{
				duplicate.add(e.getKey());
			}
			else 
			{
				unique.add(e.getKey());
			}
		}
		
		System.out.println("Duplicate:" +duplicate);
		System.out.println("Unique: "+unique);
		
		
	}

}
