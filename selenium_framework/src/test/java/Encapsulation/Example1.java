package Encapsulation;

public class Example1 {

	
	  
		   // for encapsulation following steps:
		  ////Step 1: variable declaration-> global and private
		   
		   private String address; //security
		   
		 //Step 2: variable initialization-> constructor with public
		   
		   public  Example1(String str) //pune
		   {
			   address=str;
		   }
		   
		 //Step 3:Utilize within a method with access level public
		   
		   public void getadress()
		   {
			   System.out.println(address);
		   }
	   }

