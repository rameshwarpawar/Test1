package Array;

import java.util.Arrays;

public class Ascending_Order {

	public static void main(String args[])
	{
		int []a={50,80,46,12,53,64,72,10};
		
		System.out.println("Original Array");
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("sorted array in Ascending order");
		
		Arrays.sort(a);
		for(int i:a)
		{
		
		System.out.print(i+" ");
	}
}
}
