package StringMethods;

public class Count_WhiteSpace {

	public static void main(String args[])
	{
		String str="bquh wkjb cwjo weu324 54 5%9 4gef &%98wjheo 7yrwiui";
		
		int count=0;
		
		char s []=str.toCharArray();
		
		for (char c:s)
		{
			if(c ==' ')
			{
				count++;
			}
		}
		System.out.println("No of whitespaces: "+count);
	}
}
