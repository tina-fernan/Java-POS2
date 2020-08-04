import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Parkplatz
{
    private ArrayList<Fahrzeug> platze;

    public Parkplatz()
    {
        Auto a;

        platze = new ArrayList<Fahrzeug>();
    }
    
    public void importParkplatz(String fileName) throws AutoException
    {
		try
		{
			String zeile;
			FileReader fr = new FileReader(fileName);
			
			BufferedReader br= new BufferedReader(fr);
			
			zeile=br.readLine();
			
			while (zeile != null)
			{
				if(zeile.startsWith("Auto"))
				{
					einparken(new Auto(zeile));
				}
				else
				{
					if(zeile.startsWith("Motorrad"))
					{
						einparken(new Motorrad(zeile));
					}
					else
					{

						throw new AutoException("Fehler : ungültige object in der Datei!");
					}
					
				}
				zeile=br.readLine();
			}
			br.close();
			fr.close();
		} 
		catch (FileNotFoundException e)
		{
			throw new AutoException("Fehler : Datei nicht gefunden!");
		}
		catch(IOException e)
		{
			throw new AutoException("Fehler : Datei nicht gelesen werden!");
		}
    }
    
    public void sortBaujahr()
    {
    	Collections.sort(platze, new Fahrzeug.BaujahrComparator());
    }
    
    public void sortKennzeichen()
    {
    	Collections.sort(platze, new Fahrzeug.KennzeichenComparator());
    }
    
    public void sortAutoId()
    {
    	Collections.sort(platze);
    }

    public void ausparken(String ort) throws AutoException
    {
        Iterator<Fahrzeug> it;
        Fahrzeug a;
        
        if (ort != null)
        {
            it = platze.iterator();
            while (it.hasNext())
            {
                a = it.next();
                if (a.getKennzeichen().startsWith(ort))
                {
                    it.remove();
                    a.setParkplatz(null);
                }
            }
        }
        else
        {
            throw new AutoException("Fehler: kein Ort!");
        }
    }
    
    public void einparken(Fahrzeug neu) throws AutoException
    {
        if (neu != null)
        {
            if (platze.size() < 15)
            {
            	if (neu.getParkplatz() == null)
            	{
            		platze.add(neu);
            		neu.setParkplatz(this);
            	}
            	else
            	{
            		throw new AutoException("FEHLER: schon auf einem anderen Parkplatz!");
            	}
            }
            else
            {
            	throw new AutoException("Fehler: kein Platz mehr!");
            }
        }
        else
        {
        	throw new AutoException("Fehler: kein Auto!");
        }
    }

    public String toString()
    {
        String erg;

        erg = "";
        for (Fahrzeug a: platze)
        {
            erg = erg + a.toString() + "\n";
        }
        return erg;
    }

    public int anzahlAutomatik()
    {
        int anz;

        anz = 0;
        for (Fahrzeug f: platze)
        {
            if (f instanceof Auto)
            {
            	Auto a = (Auto)f;
            	if (a.getAutomatik())
            	{
            		anz++;
            	}
            }
        }
        return anz;
    }

    public double avgBaujahrAutomatik() throws AutoException
    {
        int sum;
        int anz;

        sum=0;
        anz=0;
        for (Fahrzeug f: platze)
        {
        	if (f instanceof Auto)
        	{
        		Auto a = (Auto)f;
        		if (a.getAutomatik() == true)
        		{
        			sum += a.getBaujahr();
        			anz++;
        		}
        	}
        }
        if (anz > 0)
        {
            return (double)sum/anz;
        }
        else
        {
        	throw new AutoException("Fehler: kein automatik Auto!");
        }
    }

    public int minBaujahr()
    {
        int min;

        min = 9999;
        for (Fahrzeug a: platze)
        {
            if (a.getBaujahr() < min)
            {
                min = a.getBaujahr();
            }
        }
        return min;
    }

    public void ausparken(Fahrzeug wer) throws AutoException
    {
        if (wer != null)
        {
            if (platze.remove(wer)) /* == true */
            {
                wer.setParkplatz(null);
            }
            else
            {
            	throw new AutoException("Fehler: Auto nicht am Parkplatz!");
            }
        }
        else
        {
        	throw new AutoException("Fehler: kein Auto!");
        }
    }
    
    public double abkassieren()
    {
    	double summe;
    	
    	summe=0;
    	for (Fahrzeug f: platze)
    	{
    		summe += f.getGeld();
    	}
    	return summe;
    }
}






