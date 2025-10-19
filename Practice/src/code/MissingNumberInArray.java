package code;

import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int a[] = {2,6,1,5,4}; //Must in sorted order
		
		Arrays.sort(a);
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0; i<=a.length-1; i++)
		{
			sum1 += a[i];
		}
		
		for(int j=1; j<=6; j++)
		{
			sum2 += j;
		}
		
		System.out.println("Missing Number: "+(sum2-sum1));

	}

}
