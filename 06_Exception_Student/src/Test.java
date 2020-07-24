
public class Test
{

    public void testAufnehmen()
    {
        School schule;
        School andere;
        Student s0, s1, s2, s3, s4, s5, s6;

        try
		{
			s0 = new Student("Susi",   22, false);
			s1 = new Student("Werner", 29, true);
	        
	        schule = new School();
	        
	        schule.aufnehmen(s0); /*OK*/
	        schule.aufnehmen(s1); /*OK*/
	        schule.aufnehmen(s0); /*Fehler*/
	        
	        
		} 
        catch (StudentException e)
		{
			System.out.println(e.getMessage());
		}
        try
		{
			s0 = new Student("Susi",   22, false);
			s1 = new Student("Werner", 29, true);
	        
	        schule = new School();
	        andere= new School();
	        
	        schule.aufnehmen(s0); /*OK*/
	        schule.aufnehmen(s1); /*OK*/
	        andere.aufnehmen(s0);/*Fehler*/
	        
		} 
        catch (StudentException e)
		{
			System.out.println(e.getMessage());
		}
        
        try
		{
			
        	s0 = new Student("Anderia", 22, false);
	        
	        
	        s0.abmelden(); /*Fehler*/
	        
	        
		} 
        catch (StudentException e)
		{
			System.out.println(e.getMessage());
		}
        
        try
		{

                s0 = new Student("Susi",   22, false);
                s1 = new Student("Werner", 29, true);
                s2 = new Student("Alex",   17, true);
                s3 = new Student("Karl",   27, true);
                s4 = new Student("Hans",   29, true);
                s5 = new Student("Max",    33, true);
                s6 = new Student("Fritz",  25, true);
                schule = new School();
                andere = new School();
                schule.aufnehmen(s0); /*OK*/
                schule.aufnehmen(s1); /*OK*/
                schule.aufnehmen(s2); /*OK*/
                schule.aufnehmen(s3); /*OK*/
                schule.aufnehmen(s4); /*OK*/
                schule.aufnehmen(s5);   /*Array umkopieren!*/
                System.out.println(schule);
                   
	        
		} 
        catch (StudentException e)
		{
			System.out.println(e.getMessage());
		}
        
        
    }


	public void testAbmelden()
	{
		Student s;
		try
		{
			s=new Student("Maria",23,false);
			System.out.println(s);
			s.abmelden();
		} 
		catch (StudentException e)
		{
		
			System.out.println(e.getMessage());
		}
	}
	public void testStudent()
	{
		Student s;
		try
		{
			s=new Student(null,22,true);
			System.out.println(s);
		} 
		catch (StudentException e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try
		{
			s=new Student("",22,true);
			System.out.println(s);
		} 
		catch (StudentException e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try
		{
			s=new Student("Fritz",12,true);
			System.out.println(s);
		} 
		catch (StudentException e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try
		{
			s=new Student("Tom",51,true);
			System.out.println(s);
		} 
		catch (StudentException e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try
		{
			s=new Student("Maria",11,false);
			System.out.println(s);
		} 
		catch (StudentException e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try
		{
			s=new Student("Nina",56,false);
			System.out.println(s);
		} 
		catch (StudentException e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try
		{
			s=new Student("Lisa",22,false);
			System.out.println(s);
		} 
		catch (StudentException e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
    public void testAccount()
    {
    	Student s0,s1;
    	try
		{
			s0= new Student("Ricardo Manual", 34, true);
			System.out.println(s0.getAccount());
			s1= new Student("A Ag", 26, true);
			System.out.println(s1.getAccount());
		} 
    	catch (StudentException e)
		{
    		System.out.println(e.getMessage());
		}
    }
	public static void main(String[] args)
	{
		

		Test t = new Test();
		t.testAccount();
		

	}

}
