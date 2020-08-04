import java.util.Comparator;

public abstract class Fahrzeug implements Comparable<Fahrzeug>
{
	private static int lastId=100;
	private int autoId;
    private String kennzeichen;
    private int baujahr;
    private Parkplatz parkplatz;

    public Fahrzeug(String kennzeichen, int baujahr) throws AutoException
	{
    	setAutoId();
		setKennzeichen (kennzeichen);
		setBaujahr (baujahr);
	}
    
	public Fahrzeug() throws AutoException
	{
    	setAutoId();
        setKennzeichen("BMW");
        setBaujahr(2007);
	}
	
	public Fahrzeug(String zeile) throws AutoException
	{
		String[] eigenschaften;
    	setAutoId();
    	// 0       1       2     3
    	//Auto ; W-123A ; 1999 ; A
    	eigenschaften= zeile.split(";");
    	setKennzeichen(eigenschaften[1].trim());
    	setBaujahr(Integer.parseInt(eigenschaften[2].trim()));
        
	}

    public int getAutoId()
    {
    	return autoId;
    }
    
	public String getKennzeichen()
    {
        return kennzeichen;
    }

    public int getBaujahr()
    {
        return baujahr;
    }

    public String getOrt()
    {
        //01234567
        //WN-123W
        //WN
        //2
        return kennzeichen.substring(0, kennzeichen.indexOf('-'));
    }
    
    public String getNummer() throws AutoException
    {
    	//01234567
    	//WWWWW-
    	//5+2 = 7
    	//ab der Position 7
    	try
    	{
    		return kennzeichen.substring(kennzeichen.indexOf('-')+2);
    	}
    	catch (IndexOutOfBoundsException e)
    	{
    		throw new AutoException("Fehler: ungültige Autonummer!");
    	}
    }

    public Parkplatz getParkplatz()
    {
        return parkplatz;
    }
    
    public static int getLastId()
    {
    	return Fahrzeug.lastId;
    }
    
    public void setAutoId()
    {
    	lastId++;
    	autoId = lastId;
    }

    public void setKennzeichen(String kennzeichen) throws AutoException
    {
        if ((kennzeichen != null) && (kennzeichen.length() >= 5) && (kennzeichen.contains("-") == true))
        {
            this.kennzeichen = kennzeichen.toUpperCase();
        }
        else
        {
        	throw new AutoException("Fehler: kein Kennzeichen!");
        }
    }

    public void setBaujahr(int baujahr) throws AutoException
    {
    	//1960..2017
    	if ((baujahr>=1960) && (baujahr<=2017))
    	{
    		this.baujahr = baujahr;
    	}
    	else
    	{
    		if (baujahr<1960)
            {
    			//zu klein
    			throw new AutoException("Fehler: Fahrzeuge gibt erst ab dem Baujahr 1960!");
            }
    		else
    		{
    			//zu groß
    			throw new AutoException("Fehler: Fahrzeuge gibt bis zum Baujahr 2017!");
            }
        }
    }

    public void setParkplatz(Parkplatz parkplatz)
    {
        this.parkplatz = parkplatz;
    }

    public String toString()
    {
    	return autoId + ": " + kennzeichen + " - " + baujahr;
    }
    
    public int compareTo(Fahrzeug other)
    {
    	//this.kennzeichen < == > other.getKennzeichen()
    	//return this.kennzeichen.compareTo(other.getKennzeichen());
    	//this.autoId < == > other.getAutoId()
    	return this.autoId - other.getAutoId();
    }
    
    public abstract double getGeld();
    
    public static class KennzeichenComparator implements Comparator<Fahrzeug>
    {
		@Override
		public int compare(Fahrzeug fahrzeug0, Fahrzeug fahrzeug1)
		{
			//fahrzeug0 < == >> fahrzeug1
			return fahrzeug0.getKennzeichen().compareTo(fahrzeug1.getKennzeichen());
		}
    	
    }
    
    public static class BaujahrComparator implements Comparator<Fahrzeug>
    {
		@Override
		public int compare(Fahrzeug fahrzeug0, Fahrzeug fahrzeug1)
		{
			/*if (fahrzeug0.getBaujahr() == fahrzeug1.getBaujahr())
			{
				return 0;
			}
			else
			{
				if (fahrzeug0.getBaujahr() > fahrzeug1.getBaujahr())
				{
					return 1;
				}
				else
				{
					return -1;
				}
			}*/
			return fahrzeug0.getBaujahr() - fahrzeug1.getBaujahr();
		}
    	
    }
}



















