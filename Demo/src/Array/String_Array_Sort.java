package Array;

import java.util.Arrays;

public class String_Array_Sort {
	
	  public static void main(String args[])
	  {
		  String [] str= {"Priya","Neha","suresh","Kajal","Pankaj","Aarti"};
		  
		  System.out.println("original array");
		  
		  for(String a:str)
		  {
			  System.out.print(a+" ");
		  }
		  
		  System.out.println();
		  
		  System.out.println("String array ascending order");
		  
		  Arrays.sort(str);
		  
		  for(String b:str)
		  {
			  System.out.print(b+" ");
		  }
	  }

}
