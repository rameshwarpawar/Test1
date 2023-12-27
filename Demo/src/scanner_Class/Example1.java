package scanner_Class;

import java.util.Scanner;

public class Example1 {
	
	  public static void main(String args[])
	  {
		  Scanner obj=new Scanner(System.in);
		  
		  System.out.println("Enter name,salary,age");
		  
		  //string output
		  
		  String name =obj.nextLine();
		  
		  int salary =obj.nextInt();
		  int age = obj.nextInt();
		  
		  System.out.println("My Name is " + name);
		  System.out.println("My salary is "+ salary);
		  System.out.println("My age is "+ age);
		  
		  
		  
		  
	  }

}
