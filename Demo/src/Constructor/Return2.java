package Constructor;

public class Return2 {
	
	public String m1()
	{
		String str="M1 method is called";
		
		return str;
				
	}
	
	public void m2()
	{
		System.out.println("Method calling without return"+"  "+ m1());
		
	}
	 
	  public static void main(String args[])
	  {
		  Return2 call=new Return2();
		  call.m2();
	  }

}
