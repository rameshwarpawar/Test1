package NonStatic;

public class sample2 {
	
	public  void add(int a,int b, int c)
	{
		System.out.println(a+b+c);
		System.out.println(a*b*c);
		System.out.println(a+b/c);
	}
        
	  public void mult(int x, int y) 
	  {
		  System.out.println(x*y);
	  }
	  
	  public static void main(String args[])
	  {
		  sample2 obj1=new sample2();
		  
		  obj1.add(20,40,50);
		  obj1.mult(10,30);
	  }
}
