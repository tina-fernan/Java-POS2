public class Auto extends Fahrzeug 
{
    private boolean automatik;

    public Auto(String kennzeichen, int baujahr, boolean automatik) throws AutoException
    {
    	super(kennzeichen, baujahr);
        setAutomatik(automatik);
    }

   /* public Auto(String kennzeichen) throws AutoException
    {
    	super(kennzeichen, 2007);
        setAutomatik(false);
    }*/

    public Auto(String kennzeichen, boolean automatik) throws AutoException
    {
    	super(kennzeichen, 2007);
        setAutomatik(automatik);
    }

    public Auto() throws AutoException
    {
    	super();
        setAutomatik(false);        
    }

    public Auto(String zeile) throws AutoException
    {
    	super(zeile);
    	
    	try
    	{
    		String[] eigenschaften=zeile.split(";");
    		// 0       1       2     3
    		//Auto ; W-123A ; 1999 ; A
    		//setAutomatik(eigenschaften[3].startsWith("A"));
    		if(eigenschaften[3].startsWith("A"))
    		{
    			setAutomatik(true);
    		}
    		else
    		{
    			setAutomatik(false);
    		}
    	}
    	catch(ArrayIndexOutOfBoundsException e)
    	{
    		throw new AutoException("Fehler : ungültiges format");
    	}
    }
    
    public boolean getAutomatik()
    {
        return automatik;
    }
    
    public void setAutomatik(boolean automatik)
    {
        this.automatik = automatik;
    }
    
    public String toString()
    {
        if (automatik == true)
        {
            return super.toString() + " (AUTOMATIK)";
        }
        else
        {
            return super.toString() + " (kein AUTOMATIK)";
        }
    }
    public void setBaujahr(int baujahr) throws AutoException
    {
        if (automatik == true)
        {
            //1985..2017
            if ((baujahr>=1985) && (baujahr<=2017))
            {
                super.setBaujahr(baujahr);
            }
            else
            {
                if (baujahr<1985)
                {
                    //zu klein
                	throw new AutoException("Fehler: Automatik Autos gibt erst ab dem Baujahr 1985!");
                }
                else
                {
                    //zu groß
                	throw new AutoException("Fehler: Automatik Autos gibt bis zum Baujahr 2017!");
                }
            }
        }
        else
        {
            //1960..2007
            if ((baujahr>=1960) && (baujahr<=2007))
            {
                super.setBaujahr(baujahr);
            }
            else
            {
                if (baujahr<1960)
                {
                    //zu klein
                	throw new AutoException("Fehler: Autos mit Schaltung gibt es ab dem Baujahr 1960!");
                }
                else
                {
                    //zu groß
                	throw new AutoException("Fehler: Autos mit Schaltung gibt bis zum Baujahr 2007!");
                }
            }
        }
    }

    
    public void ausparken() throws AutoException
    {
        if (getParkplatz() != null)
        {
            super.getParkplatz().ausparken(this);
        }
        else
        {
            throw new AutoException("Fehler: stehe auf keinem Parkplatz!");
        }
    }
    
    public double getGeld()
    {
    	if (automatik == true)
    	{
    		return 12;
    	}
    	else
    	{
    		return 10;
    	}
    }
}











