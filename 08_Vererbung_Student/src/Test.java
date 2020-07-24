
public class Test
{
	public static void testEinheben()
	   {
		   School s1;
		   Tagesschuler t1,t2,t3,t4;
		   Abendschuler a1,a2,a3,a4;
		   try
		   {
			   s1= new School();
			   t1=new Tagesschuler("Leila",18,false);
			   t2=new Tagesschuler("Lisa",19,false);
			   t3=new Tagesschuler("Anna",20,false);
			   t4=new Tagesschuler("Mathew",19,true);
			   a1=new Abendschuler("franz",40,true);
			   s1.aufnehmen(t1);
			   s1.aufnehmen(t2);
			   s1.aufnehmen(a1);
			   s1.aufnehmen(t3);
			   s1.aufnehmen(t4);
			   System.out.println(s1);
			   System.out.println(s1.einheben());
			   
		   }
		   catch(StudentException e)
		   {
			   System.out.println(e.getMessage());
		   }
		   
		   
	   }
   public static void testAnzahlTagesschulerinnen()
   {
	   School s1;
	   Tagesschuler t1,t2,t3,t4;
	   Abendschuler a1,a2,a3,a4;
	   try
	   {
		   s1= new School();
		   t1=new Tagesschuler("Leila",18,false);
		   t2=new Tagesschuler("Lisa",19,false);
		   t3=new Tagesschuler("Anna",20,false);
		   t4=new Tagesschuler("Mathew",19,true);
		   a1=new Abendschuler("franz",40,true);
		   s1.aufnehmen(t1);
		   s1.aufnehmen(t2);
		   s1.aufnehmen(a1);
		   s1.aufnehmen(t3);
		   s1.aufnehmen(t4);
		   System.out.println(s1);
		   System.out.println(s1.anzahlTagesschulerinnen());
		   
	   }
	   catch(StudentException e)
	   {
		   System.out.println(e.getMessage());
	   }
	   
	   
   }
	public static void testTagesschuler()
   {
	   Tagesschuler t1,t2,t3,t4;
	   Abendschuler a1,a2,a3,a4;
	   try
	   {
		   t1=new Tagesschuler("Leila",18,false);
		   a1=new Abendschuler("franz",43,true);
		   
		   System.out.println(t1);
		   System.out.println(a1);
	   }
	   catch(StudentException e)
	   {
		   System.out.println(e.getMessage());
	   }
	   
   }
   
	public static void main(String[] args)
	{
	  Test.testEinheben();

		

	}

}
