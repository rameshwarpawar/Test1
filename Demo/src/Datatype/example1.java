package Datatype;

public class example1 {

	
	public static void display()
	{
		System.out.println("WELCOME");
	
	}
	
	public static void show()
	{
		System.out.println("Static method is executing");
		display();
	}
	
	    public static void main(String args[])
	    {
	    	display();
	    	display();
	    	
	    	show();
	    }
		
	
}
