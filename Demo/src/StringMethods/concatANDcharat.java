package StringMethods;

public class concatANDcharat {

	public static void main(String args[])
	{
	
	//charAt(index):
	
			String s5="Software Testing";
			System.out.println(s5.length());
			System.out.println(s5.charAt(8));
			
			//toUppercase() and toLowercase()
			String s6=" Velocity 12 March Batch";
			System.out.println(s6.toUpperCase());
			System.out.println(s6.toLowerCase());

			//concat()
			System.out.println(s5.concat(s6));
}
}