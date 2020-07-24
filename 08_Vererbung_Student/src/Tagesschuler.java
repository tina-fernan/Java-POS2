
public class Tagesschuler extends Student
{
	private boolean mannlich;

	public Tagesschuler(String name,int alter,boolean mannlich) throws StudentException 
	{
		super(name,alter);
		setMannlich(mannlich);
		
	}
	public boolean getMannlich()
	{
		return mannlich;
	}

	public void setMannlich(boolean mannlich)
	{
		this.mannlich = mannlich;
	}
	 public void setAlter(int alter) throws StudentException
	    {
	        if (mannlich == true)
	        {
	            //13..50
	            if ((alter >= 13) && (alter <= 21))
	            {
	                super.setAlter(alter);
	            }
	            else
	            {
	                if (alter<13)
	                {
	                    //zu jung
	                    throw new StudentException("Fehler: Student zu jung!");
	                }
	                else
	                {
	                    //zu alt
	                	throw new StudentException("Fehler: Student zu alt!");
	                }
	            }
	        }
	        else
	        {
	            //12..55
	            if ((alter >= 12) && (alter <= 25))
	            {
	                super.setAlter(alter);
	            }
	            else
	            {
	                if (alter<12)
	                {
	                    //zu jung
	                	throw new StudentException("Fehler: Studentin zu jung!");
	                }
	                else
	                {
	                    //zu alt
	                	throw new StudentException("Fehler: Studentin zu alt!");
	                }
	            }
	        }
	    }
	 
	 public String toString()
	 {
		 if(mannlich)
		 {
			return super.toString()+ "Mann";
		 }
		 else
		 {
			 return super.toString()+ "Frau";
		 }
	 }
	 
	 public double uberweisen()
	 {
		 if(mannlich)
		 {
			 return 77;
		 }
		 else
		 {
			 return 67;
		 }
	 }
}
