package Array;

import java.util.Arrays;

public class descending_array {
	
	// Sort an array in ascending order
	
		//int []a={50,80,46,12,53,64,72,10};
		
		// 10 12 46 50 53 64 72 80
		
		// sort an array in descending order
		
		// 80 72 64 53 50 46 12 10
	
	public static void main(String args[])
	{
		int []a={50,80,46,12,53,64,72,10};
		
		Arrays.sort(a);
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("Arrays in descending order");
		
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.print(a[j]+" ");
		}
	}

}
