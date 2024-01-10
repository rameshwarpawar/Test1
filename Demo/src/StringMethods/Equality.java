package StringMethods;

public class Equality {

	public static void main(String args[])
	{
		String s1="Rameshwar";
		String s2="rameshwar";
		String s3="RameSHwar";
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s1));

		//equalsIgnoreCase()
				System.out.println(s2.equalsIgnoreCase(s3));
				System.out.println(s3.equalsIgnoreCase(s1));
				
	}
}
