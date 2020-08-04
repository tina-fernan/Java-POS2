public class Test
{
	public static void testExportParkplatz()
	{
		try
		{
			Parkplatz p=new Parkplatz();
			p.importParkplatz("C:\\Users\\tinas\\Documents\\Autos.txt");
			p.einparken(new Auto("I-4534H", true));
			System.out.println(p);
			p.exportParkplatz("C:\\Users\\tinas\\Documents\\Autos2.txt");
		} 
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
			
		}
	}
	
	public static void testImportParkplatz()
	{
		try
		{
			Parkplatz p=new Parkplatz();
			p.importParkplatz("C:\\Users\\tinas\\Documents\\Autos.txt");
			System.out.println(p);
		} 
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
			
		}
	}
	
	
	public static void testSplit()
	{
		try
		{
			Auto a1,a2;
			Motorrad m1;
			a1=new Auto("Auto;W-123A;1999;A");
			a2=new Auto("Auto;BN-456W;1999;S");
			m1=new Motorrad("Motorrad;WN-345V;2001;50");
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(m1);
		} 
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			Auto a;
			a=new Auto("Auto;W-123A;1999");
			System.out.println(a);
		}
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			Auto a;
			a=new Auto("Auto;W-123A;HANS;A");
			System.out.println(a);
		}
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void testSortBaujahr()
	{
		Parkplatz p;
		Auto a0, a1;
		Motorrad m0, m1;
		
		try
		{
			p = new Parkplatz();
			a0 = new Auto("WN-1234A", 1998, true);
			a1 = new Auto("BN-2345A", 2001, true);
			m0 = new Motorrad("WN-6765R", 2009, 100);
			m1 = new Motorrad("ZE-4324R", 2000, 100);
			p.einparken(a0);
			p.einparken(m0);
			p.einparken(a1);
			p.einparken(m1);
			System.out.println(p);
			System.out.println("===========");
			p.sortBaujahr();
			System.out.println(p);
		}
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static void testSortKennzeichen()
	{
		Parkplatz p;
		Auto a0, a1;
		Motorrad m0, m1;
		
		try
		{
			p = new Parkplatz();
			a0 = new Auto("WN-1234A", 2000, true);
			a1 = new Auto("BN-2345A", 2000, true);
			m0 = new Motorrad("WN-6765R", 2000, 100);
			m1 = new Motorrad("ZE-4324R", 2000, 100);
			p.einparken(a0);
			p.einparken(m0);
			p.einparken(a1);
			p.einparken(m1);
			System.out.println(p);
			System.out.println("===========");
			p.sortKennzeichen();
			System.out.println(p);
		}
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static void testSort()
	{
		Parkplatz p;
		Auto a0, a1;
		Motorrad m0, m1;
		
		try
		{
			p = new Parkplatz();
			a0 = new Auto("WN-1234A", 2000, true);
			a1 = new Auto("BN-2345A", 2000, true);
			m0 = new Motorrad("WN-6765R", 2000, 100);
			m1 = new Motorrad("ZE-4324R", 2000, 100);
			p.einparken(a0);
			p.einparken(m0);
			p.einparken(a1);
			p.einparken(m1);
			System.out.println(p);
			System.out.println("===========");
			p.sortAutoId();
			System.out.println(p);
		}
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
		}
	}

	
	public static void testCompareTo()
	{
		Parkplatz p;
		Auto a0, a1, a2, a3, a4;
		Motorrad m0, m1, m2, m3, m4;
		
		try
		{
			p = new Parkplatz();
			a0 = new Auto("WN-1234A", 2000, true);
			a1 = new Auto("BN-2345A", 2000, true);
			a2 = new Auto("W-6789A",  2000, true);
			a3 = new Auto("W-2468A",  2000, true);
			a4 = new Auto("NK-1357A", 2000, true);
			m0 = new Motorrad("WN-6765R", 2000, 100);
			m1 = new Motorrad("ZE-4324R", 2000, 100);
			m2 = new Motorrad("W-6442R", 2000, 100);
			m3 = new Motorrad("BN-4523R", 2000, 100);
			m4 = new Motorrad("NK-6545R", 2000, 100);

			System.out.println(a0.compareTo(a1));
			System.out.println(a0.compareTo(m1));
			System.out.println(a0.compareTo(a0));			
		}
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void testAutoId()
	{
		Parkplatz p;
		Auto a0, a1, a2, a3, a4;
		
		try
		{
			p = new Parkplatz();
			System.out.println(Auto.getLastId());
			a0 = new Auto("WN-1234A", 2000, true);
			System.out.println(Auto.getLastId());
			a1 = new Auto("BN-2345A", 2000, true);
			System.out.println(Auto.getLastId());
			a2 = new Auto("W-6789A",  2000, true);
			System.out.println(Auto.getLastId());
			a3 = new Auto("W-2468A",  2000, true);
			System.out.println(Auto.getLastId());
			a4 = new Auto("NK-1357A", 2000, true);
			System.out.println(Auto.getLastId());
			p.einparken(a0);
			p.einparken(a1);
			p.einparken(a2);
			p.einparken(a3);
			System.out.println(p);
		}
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static void getGeld()
	{
		Parkplatz p;
		Auto a1, a2;
		Motorrad m1, m2;
		
		try
		{
			p = new Parkplatz();
			a1 = new Auto("WN-45646W", 2006, true);
			a2 = new Auto("W-23443A",  2005, false);
			m1 = new Motorrad("BN-3454T", 1998, 110);
			m2 = new Motorrad("NK-4543A", 1998, 45);
			p.einparken(a1);
			p.einparken(m1);			
			p.einparken(a2);
			p.einparken(m2);
			System.out.println(p);
			System.out.println(p.abkassieren());
		}
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void testVererbung()
	{
		Auto a1, a2, a3;
		Motorrad m1, m2, m3;
		
		try
		{
			a1 = new Auto("WN-45646W", 2006, true);
			System.out.println(a1);
			System.out.println(a1.getGeld());
			a2 = new Auto("W-23443A",  2005, false);
			System.out.println(a2);
			System.out.println(a2.getGeld());
			a3 = new Auto("BN-4565W", 2004, true);
			System.out.println(a3);
			System.out.println(a3.getGeld());
			m1 = new Motorrad("BN-3454T", 1998, 110);
			System.out.println(m1);
			System.out.println(m1.getGeld());
			m2 = new Motorrad("NK-4543A", 1998, 45);
			System.out.println(m2);
			System.out.println(m2.getGeld());
			m3 = new Motorrad("WN-3213A", 2010,	105);
			System.out.println(m3);
			System.out.println(m3.getGeld());
		}
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void testNull()
	{
		Auto a;
		
		try
		{
			a = new Auto("WWWW-", 2005, true);
			System.out.println(a);
			System.out.println(a.getOrt());
			System.out.println(a.getNummer());
		}
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
    public static void testEinparken()
    {
        Parkplatz platz, platz2;
        Auto a0, a1, a2, a3, a4, a5, a6;

		try
		{   
			/* FEHLER schon auf einem Parkplatz!*/
			a0 = new Auto("W-23442",   2005, true);
			platz = new Parkplatz();
			platz2 = new Parkplatz();
			platz.einparken(a0);
			platz.einparken(a0);
		}
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
		}

		try
		{
			/* FEHLER schon auf einem anderen Parkplatz!*/
			a0 = new Auto("W-23442",   2005, true);
			platz = new Parkplatz();
			platz2 = new Parkplatz();
			platz.einparken(a0);
			platz2.einparken(a0);
		}
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
		}

		try
		{
			/* kein Auto */
			platz = new Parkplatz();
			platz.einparken(null);
		}
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
		}
		
        
        try
		{
			a0 = new Auto("W-23442",   2005, true);
	        a1 = new Auto("WN-456789", 2004, false);
	        a2 = new Auto("MD-987654", 2005, true);
	        a3 = new Auto("BN-654321", 2004, false);
	        a4 = new Auto("BN-12345",  2005, false);
	        a5 = new Auto("BN-67891",  2004, false);
	        a6 = new Auto("BN-12313",  2005, false);
	        platz = new Parkplatz();
	        platz2 = new Parkplatz();
	        platz.einparken(a0);
	        platz.einparken(a1);
	        platz.einparken(a2);
	        platz.einparken(a3);
	        platz.einparken(a4);
	        System.out.println(platz);
	        platz.einparken(a5); /* FEHLER kein Platz!*/
	        System.out.println(platz);
		}
        catch (AutoException e)
		{
        	System.out.println(e.getMessage());
		}
    }

	
	
	public static void testAuto()
	{
		Auto a0, a1, a2;
		
		try
		{
			a0 = new Auto("W-12345A", 2010, true);
			System.out.println(a0);
			a0.ausparken();
		}
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			a1 = new Auto("WN-23423", 1980, true);
			System.out.println(a1);
		}
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			a2 = new Auto("Q", 2010, true);
			System.out.println(a2);
		}
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			a2 = new Auto("WN-32422", 2040, true);
			System.out.println(a2);
		}
		catch (AutoException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
    public static void main(String[] args)
    {
    	Test.testExportParkplatz();
    }
}





















