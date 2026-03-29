package example;

import java.util.*;

public class Example {

	public static void main(String[] args) {
	      
	      String s = "I am Saravanan";
	      
	      String str[] = s.split(" ");
	      
	      StringBuilder sb = new StringBuilder();
	      
	        int left=0;
	        int right= str.length-1;
	        

	        while(left < right)
	        {
	          String temp = str[left]; 
	          str[left] = str[right];
	          str[right] = temp;
	          left++;
	          right--;

	        }
	        
	        for(String c : str)
	        {
	        	sb.append(c).append(" ");
	        	
	        }
	        
	      System.out.println(sb.toString());
	     
	  }
	
}
