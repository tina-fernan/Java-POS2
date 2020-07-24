package model;

public class Rechteck implements Figur
{

	private double lange;
	private double breite;
	
	
	public Rechteck(double lange, double breite)
	{

		setLange(lange);
		setBreite(breite);
	}
	public double getLange()
	{
		return lange;
	}
	public void setLange(double lange)
	{
		if(lange>0)
		{
		this.lange = lange;
		}
		
		else
		{
			System.out.println("Fehler : ungültige Lange!");
			this.lange=1;
		}
			
	}
	public double getBreite()
	{
		return breite;
	}
	public void setBreite(double breite)
	{
		if(breite>0)
		{
			this.breite = breite;
		
		}
		
		else
		{
			System.out.println("Fehler : ungültige Breite!");
			this.breite=1;
		}
	}
	@Override
	public double berechneUmfang()
	{
		// TODO Auto-generated method stub
		return 2*(lange+breite);
	}
	@Override
	public double berechneFlache()
	{
		return breite*lange;
	}
	@Override
	public String toString()
	{
		return "Rechteck : " + lange + "*" + breite + 
				" umfang : " + berechneUmfang() + " Flache " + berechneFlache();
	}
	
	
}
