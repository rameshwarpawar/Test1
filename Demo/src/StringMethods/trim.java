package StringMethods;

public class trim {

	
	public static void main(String args[])
	{
		String str="   Welcome to goa singham     ";
		
		System.out.println();
		System.out.println(str.trim());
		
		String str5="Sachin, Suresh, Priya, Riya, Suresh";
		
		System.out.println(str5.indexOf('i'));//9
		System.out.println(str5.indexOf("Priya"));//16
		System.out.println(str5.indexOf("u"));
		

		System.out.println(str5.lastIndexOf('i'));
		System.out.println(str5.lastIndexOf("Suresh"));
		
	}
}
