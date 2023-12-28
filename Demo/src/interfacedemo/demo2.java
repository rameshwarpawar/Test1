package interfacedemo;

public class demo2 implements demo  //implementation class
	{
		public void show()
		{
			System.out.println("interface method is completed");
		}
		public static void main(String[] args) 
		{
			demo2 d= new demo2();
			d.show();
			System.out.println(d.a);
		}

}
