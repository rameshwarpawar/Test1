package Constructor;

public class example4 {

	
	//parameterized constructor
	
	int num1;	//global variables
	int num2;	//global variables
	
	example4(int a, int b)//local variables
	{
		num1=a;//50
		num2=b;//5
	}
	public void div() 
	{
		int division=num1/num2;//50/5=10
		System.out.println(division);//10
	}
	 
	   public static void main(String args[])
	   {
		   example4 ans= new example4(50,5);
		   {
			   ans.div();
		   }
	   }
}
