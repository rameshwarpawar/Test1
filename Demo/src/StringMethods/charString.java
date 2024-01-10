package StringMethods;

public class charString {
	
	public static void main(String args[])
	{
		String str5="Sachin, Suresh, Priya, Riya, Suresh";
		
		char arr[]=str5.toCharArray();
		
		for (char s:arr)
		{
			System.out.print(s+" ");
		}
	}

}
