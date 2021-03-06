
public class TestGetrank
{
	public static void testLoschen2()
	{
		
		Bar b;
		b=new Bar();
		try
		{
		b.aufnehmen(new Alkoholfrei("Coca Cola",330,false));
		b.aufnehmen(new Alkoholfrei("Coca Cola Zero",400,true));
		b.aufnehmen(new Alkoholisch("Bier",330,5));
		b.aufnehmen(new Alkoholfrei("Coca Cola Light",450,true));
		
		b.aufnehmen(new Alkoholisch("Wein",330,9));
		b.aufnehmen(new Alkoholisch("Spritze",330,4));
		System.out.println(b);
		System.out.println("****************************");
		b.loschen("Coca Cola");
		System.out.println(b);
		}
		catch (BarException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void testLoschen1()
	{
		Alkoholfrei a;
		Bar b;
		b=new Bar();
		try
		{
		b.aufnehmen(new Alkoholfrei("Fanta",330,false));
		b.aufnehmen(new Alkoholfrei("Coca Cola",400,true));
		b.aufnehmen(new Alkoholisch("Bier",330,5));
		b.aufnehmen(new Alkoholfrei("Spirit",450,true));
		a=new Alkoholfrei("Wasser",500,false);
		b.aufnehmen(a);
		b.aufnehmen(new Alkoholisch("Wein",330,9));
		b.aufnehmen(new Alkoholisch("Spritze",330,4));
		System.out.println(b);
		System.out.println("****************************");
		b.loschen(a);
		System.out.println(b);
		}
		catch (BarException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void testAufnehmen()
	{
		Bar b;
		Alkoholfrei a0,a1,a2;
		Alkoholisch a3,a4,a5;
		b=new Bar();
		
		 try
		{
			a0= new Alkoholfrei("Coca cola",450,true);
			b.aufnehmen(a0);
			b.aufnehmen(a0);
			
		} 
		 catch (BarException e)
		{
			System.out.println(e.getMessage());
		}
		
		 try
		{
			b.aufnehmen(null);
			
		} 
		 catch (BarException e)
		{
			System.out.println(e.getMessage());
		}
		 try
			{
				
				b.aufnehmen(new Alkoholfrei("Fanta",330,true));
				b.aufnehmen(new Alkoholfrei("Spirit",500,true));
				b.aufnehmen(new Alkoholfrei("Spirit",330,true));
				b.aufnehmen(new Alkoholisch("Bier",330,5));
				
			} 
			 catch (BarException e)
			{
				System.out.println(e.getMessage());
			}
			
		 System.out.println(b);
	}
	
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
	 
	 public static void testGetMinPrice1()
		{
			
			Bar b;
			b = new Bar();
			try
			{
			b.aufnehmen(new Alkoholfrei("Coca Cola",330,false));
			b.aufnehmen(new Alkoholfrei("Coca Cola Zero",400,true));
			b.aufnehmen(new Alkoholisch("Bier",330,5));
			b.aufnehmen(new Alkoholfrei("Coca Cola Light",450,true));
			
			b.aufnehmen(new Alkoholisch("Wein",330,9));
			b.aufnehmen(new Alkoholisch("Spritze",330,4));
			System.out.println(b);
			System.out.println("****************************");
		
			System.out.println(b.getMinpreice());
			}
			catch (BarException e)
			{
				System.out.println(e.getMessage());
			}
		}
	 
 
	public static void main(String[] args)
	{
		TestGetrank.testGetMinPrice1();
	}

}
