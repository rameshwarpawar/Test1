package Constructor;

public class example5 {
	
	  int lenth;
	  int breadth;
	  
	  example5()
	  {
		  System.out.println("Calculating Area of rectangle");
	  }
	  
	  example5(int a ,int b)
	  {
		  lenth=a;
		  breadth=b;
		  
	  }
      
	     public void area()
	     {
	    	 int are=lenth*breadth;
	    	 System.out.println("Area of Rectangle"+ are);
	     }
	     
	     public static void main(String args[])
	     {
	    	 example5 ans=new example5(10,20);
	    	 ans.area();
	    	 }
	     }

