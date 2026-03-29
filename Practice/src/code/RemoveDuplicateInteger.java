package code;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInteger {

	public static void main(String[] args) {
		
		int a [] = {1,2,2,3,4,4,5,6,6};
		
		Set<Integer> hs = new HashSet<>(); 
		
		for(int c : a)
		{
			hs.add(c);
			
		}
		
		System.out.println(hs);
		
	}

}
