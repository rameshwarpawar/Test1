package Constructor;

public class Example2 {

	
	         int num1;
	         int num2;
	         
	         Example2()
	         {
	        	 num1=20;
	        	 num2=30;
	        	 
	         }
	         
	         public void add()
	         {
	        	 System.out.println(num1+num2);
	        	 
	         }
	         
	         public static void main(String args[])
	         {
	        	 Example2 ss=new Example2();
	        			 ss.add();
	        			 
	        			 example3 tt=new example3();
	        			 tt.mult();
	        			 tt.sub();
	        	 
	         }
}
