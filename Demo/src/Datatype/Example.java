package Datatype;

public class Example {
	
	
	
	
	
	public static void main (String args[])
	{
		
		Test(30,50);
		
	}
	
	public static void Test(int a,int b)
	{
		
		
		int temp;
		
		temp=a;//temp=30  a=30  b=50
		a=b; // a=50 b=50 temp=30
		b=temp;
		
           System.out.println("after swap statement number1" +a+ "number2"+b  );		
		
	}

}
