package NonStatic;

public class swap_without_third_variable {

	
	    public void swapnum(int a,int b)
	    {
	    	 a= a+b; // 10+20=30
	    	 
	    	 b=a-b; //30-20=10
	    	 
	    	 a=a-b; //30-10=20
	    	 
	    	 System.out.println("After swapping values are num1= "+a+" & num2= "+b);
	    	 
	    }
	    
	    public static void main(String args[])
	    {
	    	swap_without_third_variable ob= new swap_without_third_variable ();
	    	
	    	ob.swapnum(10,20);
	    	
	    }
}
