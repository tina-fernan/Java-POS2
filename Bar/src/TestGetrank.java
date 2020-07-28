
public class TestGetrank
{
	public static void testAlkoholisch() 
	{
		Alkoholisch a0,a1,a2,a3,a4;
		try
		{
			a0= new Alkoholisch("Bier", 330, 5);
			System.out.println(a0);
			
		} 
		catch (BarException e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			a1= new Alkoholisch("Alkoholfrei Bier", 330, 0);
			System.out.println(a1);
		} 
		catch (BarException e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			a2= new Alkoholisch("obstler", 10, 40);
			System.out.println(a2);
		} 
		catch (BarException e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			a3= new Alkoholisch("Bier", 400, 5);
			System.out.println(a3);
			
		} 
		catch (BarException e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			a4= new Alkoholisch("Bier", 5, 5);
			System.out.println(a4);
			
		} 
		catch (BarException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
 public static void testAlkohofrei() 
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
		g1= new Alkoholfrei("Coca cola", 240, false);
		System.out.println(g1);
	}   
	 catch (BarException e)
	{
		 System.out.println(e.getMessage());
	}
	 try
	{
		g2= new Alkoholfrei("Fanta",510 ,true);
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
		TestGetrank.testAlkoholisch();
	}

}
