package IMP_Programmes;

public class Palindrome_Example1 {
	
	
	  public static void main(String args[])
	  {
		  int rev=0 , remainder , number=363;
		  
		  while(number!=0)
		  {
			  remainder=number%10;
			  number=number/10;
			  rev=(rev*10)+remainder;
			 
		  }
		  System.out.println("Reverse number is "+rev);
	  }

}
