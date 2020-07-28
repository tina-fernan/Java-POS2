
public class Alkoholisch extends Getrank
{

	private int prozent;
	
	

	public Alkoholisch(String name, int ml,int prozent) throws BarException
	{
		super(name, ml);
		setProzent(prozent);
		
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
	
	
}
