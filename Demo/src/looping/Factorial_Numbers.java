package looping;

public class Factorial_Numbers {

	              
	            public static void main(String args[])
	            {
	            	//Program to find factorial of given number
	            	//4!= 4*3*2*1= 24
	            	//starting point 4
	            	//end point      1
	            	//decrement
	            	
	            	int number=4;
	            	int fact=1;
	            	int i=4;
	            	
	            	while (i>=1)
	            	{
	            		fact=i*fact;
	            		--i;
	            	}
	            	
	            	System.out.println("Factorial of "+number+" is "+fact);
	            }
}
