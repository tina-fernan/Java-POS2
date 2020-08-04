
public class Motorrad extends Fahrzeug
{
    private int ps;

    public Motorrad(String kennzeichen, int baujahr, int ps) throws AutoException
    {
    	super(kennzeichen, baujahr);
        setPs(ps);
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
