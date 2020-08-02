
public class Alkoholisch extends Getrank
{

	private int prozent;
	
	

	public Alkoholisch(String name, int ml,int prozent) throws BarException
	{
		super(name, ml);
		setProzent(prozent);
		
	}
	
	public double getPrice() 
	{
		return ( (double)getMl()*prozent ) /400;
		
	}

	public int getProzent()
	{
		return prozent;
	}

	public void setProzent(int prozent) throws BarException
	{
		if((prozent> 0) && (prozent < 10))
		{
		this.prozent = prozent;
		}
		else
		{
			throw new BarException("Fehler: ungültige Alkoholgehalt!");
		}
	}
	
	public void setMl(int ml) throws BarException
	{
		if((ml>=10)&&(ml<=330))
		{
			super.setMl(ml);
		}
		else
		{
			throw new BarException("Fehler : Alkoholische Getränke müssen eine füll menge zw 30 und 330 ml aufweisen!");
		}
	}
	
	public String toString() 
	{
		return super.toString()+" "+prozent+" % ";
		
	}
	
}
