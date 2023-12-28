package Polymorohism;

public class example3 {
	
	public static void mult()
	{
		System.out.println("Multiplication");
	}
	
	public static void mult(int a)
	{
		System.out.println(a);
	}
    
	 public static void mult(int a,int b)
	 {
		 System.out.println(a+b);
	 }
	 
	 public static void mult (String name ,String adress)
	 {
		 System.out.println(name);
		 System.out.println(adress);
		 
	 }
	 
	  public static void main(String args[])
	  {
		  mult();
		  mult(30);
		  mult(50,100);
		  mult("Ram","Nagar");
	  }
}
