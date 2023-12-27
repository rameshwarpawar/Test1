package NonStatic;

public class sample1 {
	
	public void display()
	{
		System.out.println("non static method get call diffrent class");
		
	}

	   
	    public static void main(String args[])
	    {
             c1 obb=new c1();
             obb.m1();
             
             sample1 nn=new sample1();
             nn.display();
	    	
	    }
	    
}
