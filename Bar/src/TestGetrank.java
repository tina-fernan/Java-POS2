
public class TestGetrank
{
 public static void testGetrank() 
 {
	 Alkoholfrei g0,g1,g2,g3,g4;
	 try
	{
		g0= new Alkoholfrei(null,400,false);
		System.out.println(g0);
	} 
	 catch (BarException e)
	{
		System.out.println(e.getMessage());
	}
	 try
	{
		g1= new Alkoholfrei("Coca cola", 2, false);
		System.out.println(g1);
	}   
	 catch (BarException e)
	{
		 System.out.println(e.getMessage());
	}
	 try
	{
		g2= new Alkoholfrei("Fanta",1000 ,true);
		System.out.println(g2);
	} 
	 catch (BarException e)
	{
		 System.out.println(e.getMessage());
	}
	 try
	{
		g3= new Alkoholfrei("Spirit",400,true);
		g4= new Alkoholfrei("wasser",500,false);
		System.out.println(g3);
		System.out.println(g4);
	}
	 catch (BarException e)
	{
		System.out.println(e.getMessage());
	}
	 
 }
	public static void main(String[] args)
	{
		TestGetrank.testGetrank();
	}

}
