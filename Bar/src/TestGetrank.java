
public class TestGetrank
{
 public static void testGetrank() 
 {
	 Getrank g0,g1,g2,g3,g4;
	 try
	{
		g0= new Getrank(null,400);
		System.out.println(g0);
	} 
	 catch (BarException e)
	{
		System.out.println(e.getMessage());
	}
	 try
	{
		g1= new Getrank("Coca cola",2);
		System.out.println(g1);
	} 
	 catch (BarException e)
	{
		 System.out.println(e.getMessage());
	}
	 try
	{
		g2= new Getrank("Fanta",1000);
		System.out.println(g2);
	} 
	 catch (BarException e)
	{
		 System.out.println(e.getMessage());
	}
	 try
	{
		g3= new Getrank("Spirit",400);
		g4= new Getrank("wasser",500);
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
