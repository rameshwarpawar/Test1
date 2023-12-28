package Polymorohism;

public class Demo3 {

	
	  public static void main()
	  {
		  System.out.println("main method call without parameter");
	  }
	  
	  public static void main(int a)
	  {
		  System.out.println(a);
	  }
	  
	  public static void main(String args[])
	  {
		  main();
		  main(30);
	  }
}
