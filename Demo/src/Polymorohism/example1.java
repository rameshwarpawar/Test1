package Polymorohism;

public class example1 {
	
	  public void m1()  // method declaration stored in heap area
	  {
		  System.out.println("Non static method is called"); // Method defination >> stored in 
		// method area
	  }
		  public void m1(int a)
			{
				System.out.println(a);
		 
	  }
		  
		  public void m1(int a,String b)
		  {
			  System.out.println(a);
			  System.out.println(b);
		  }
		  
		  public static void main(String args[])
		  {
			  example1 ans=new example1();
			  
			  ans.m1();
			  ans.m1(20);
			  ans.m1(30, "Rameshwar");
			  
				  
				  
			  
		  }

		  }


