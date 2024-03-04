package IMP_Programmes;

import java.util.Arrays;

public class second_largest_element_inArray {

	
	public static void main(String args[]){
	      int arr[] = {10, 20, 25, 63, 96, 57};
	      int size = arr.length;
	      Arrays.sort(arr);
	      System.out.println("sorted Array ::"+Arrays.toString(arr));
	      int res = arr[size-2];
	      System.out.println("2nd largest element is ::"+res);
	   }
}
