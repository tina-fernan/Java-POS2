
public class Motorrad extends Fahrzeug
{
    private int ps;

    public Motorrad(String kennzeichen, int baujahr, int ps) throws AutoException
    {
    	super(kennzeichen, baujahr);
        setPs(ps);
    }

    public Motorrad(String zeile) throws AutoException
    {
    	super(zeile);
    	
    	try {
    		String[] eigenschaften=zeile.split(";");
    		//  0        1      2   3
    		//Motorrad;WN-345V;2001;50
    		setPs(Integer.parseInt( eigenschaften[3].trim() ));
    	    }
    	catch(ArrayIndexOutOfBoundsException e)
    	  {
    		throw new AutoException("Fehler : ungültiges format");
    	  }
    	catch(NumberFormatException e)
		{

			throw new AutoException("Fehler : ungültiges PS!");
		}
    	
    }
    
	public int getPs()
	{
		return ps;
	}

	public void setPs(int ps) throws AutoException
	{
		if (ps >= 10)
		{
			this.ps = ps;
		}
		else
		{
			throw new AutoException("Fehler: zu wenig ps.");
		}
	}
	
	
	public String toStringCSV()
	{

		return "Motorrad" + super.toStringCSV()+";" + ps;

	}
	

	public String toString()
	{
		return super.toString() + ": " + ps + " PS";
	}
	
	public double getGeld()
	{
		if (ps < 50)
		{
			return 5;
		}
		else
		{
			return 10;
		}
	}
    
}
