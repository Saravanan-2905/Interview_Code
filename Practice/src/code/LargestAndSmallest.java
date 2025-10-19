package code;

public class LargestAndSmallest {

	public static void main(String[] args) {
		
		int a[] = {56, 23, -4, 300};
		
		int largest = a[0];
		int smallest = a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] > largest)
			{
				largest = a[i];
			}
			else if(a[i] < smallest)
			{
				smallest = a[i];
			}
		}
		
		System.out.println("Largest Number: "+largest);
		System.out.println("Smallest Number: "+smallest);
	}

}
