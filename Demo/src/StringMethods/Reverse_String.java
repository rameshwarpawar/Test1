package StringMethods;

public class Reverse_String {

	public static void main(String args[])
	{
		String s="Voidstarindia";
		
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println("Original String :"+s);
		System.out.println("Reversed String :"+s1);
	}
	  
}
