package Array;

public class Reversed_array {
	
	public static void main(String args[])
	{
		int [] arr= {40,50,86,47,59,62,14,89,52,32,90,50};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("REVERES ARRAY");
		
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.print(arr[j]+" ");
		}
		
	}

}
