package StringMethods;

public class Replace_char {
	
	public static void main(String args[])
	{
		
	
	
	String s1="hgedh82gdiduho 92039 hd 880 3 29hiwjho7298yn";
	
	String s2=s1.replace("h", "z");
	
        System.out.println(s2);
        
        System.out.println(s1.replaceFirst("h", "z"));
        
        System.out.println(s1.replaceAll("[^0-9]",""));

}
}