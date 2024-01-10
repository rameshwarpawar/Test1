package StringMethods;

public class Palindrome {

	public static void main(String args[])
	{
		String str="LEVEL";
		
		String c="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			c=c+str.charAt(i);
		}
		
		if(c.equalsIgnoreCase(str))
		{
			System.out.println("This String is Palindrome :"+c);
		}
		else
		{
			System.out.println("This String is Not Palindrome ");
		}
	}
}
