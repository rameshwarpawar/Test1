package Constructor;

public class example1 {

	//default constructor=> provided by compiler
		//use: to copy all the members of class into object after object creation 
//		example1()
//		{
//			
//		}
	
	              public void m1()
	              {
	            	  System.out.println("Running M1 Method");
	              }
	              
	              public static void main(String args[])
	              {
	            	  example1 obj=new example1 ();
	            	  
	            	  obj.m1();
	            	  
	            		//example1=> classname=> datatype
	          		//obj=> objectname=> identifier for your object
	          		//new=> keyword=> to create a blank/empty object
	          		//example1()=> constructor=> to copy all the members of class into emptcy object
	              }
}
