package code;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int a[] = {34, 9, 1, 6, 10};
		
		int min = a[0];
		int max = a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(min < a[i]) min = a[i];
			if(max > a[i]) max = a[i];
		}
		
		System.out.println("Largest Number: "+min);
		System.out.println("Smallest Number: "+max);
		
		
//		for(int i=0; i<a.length; i++)
//		{
//			int temp;
//			for(int j=i+1; j<a.length; j++)
//			{
//				if(a[i] > a[j])
//				{
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//					
//				}
//			}
//		}
//
//		System.out.println("Largest Number: "+a[4]); 
//		System.out.println("Second Largest Number: "+a[3]); 
//		System.out.println("Smallest Number: "+a[0]);
		
		System.out.println("Largest Number: "+Arrays.toString(a));
	}

}
