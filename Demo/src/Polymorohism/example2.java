package Polymorohism;

public class example2 {
	
	public void add(int a, int b)
	{
		int c=a+b;
		
		System.out.println("ADDITION:"+c);
	}
	
	public void add(int a,int b, int c)
	{
		int d=a+b+c;
		
		System.out.println("ADDITION of three numbers"+ d);
	}
	
	public void add(String name , String adress)
	{
		System.out.println(name);
		System.out.println(adress);
	}
	
	public static void main(String args[])
	{
		example2 ans=new example2();
		ans.add(20, 30);
		ans.add(10, 20, 40);
		ans.add("Ram", "Karvenagar");
		
				
	}

}
