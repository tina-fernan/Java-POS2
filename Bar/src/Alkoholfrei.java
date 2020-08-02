
public class Alkoholfrei extends Getrank
{

	 private boolean jugendgetrank;
	 
	 

	public Alkoholfrei(String name, int ml,boolean jugendgetrank) throws BarException
	{
		super(name, ml);
		setJugendgetrank(jugendgetrank);
		
	}

	public double getPrice() 
	{
		if(jugendgetrank)
		{
		return 3;
		}
		else
		{
			return 5;
		}
		
	}
	
	public boolean isJugendgetrank()
	{
		return jugendgetrank;
	}

	public void setJugendgetrank(boolean jugendgetrank)
	{
		this.jugendgetrank = jugendgetrank;
	}
	
	public void setMl(int ml) throws BarException
	{
		if((ml>=250)&&(ml<=500))
		{
			super.setMl(ml);
		}
		else
		{
			throw new BarException("Fehler : Alkoholgetrank müssen eine füll menge zw 250 und 500 ml aufweisen!");
		}
	}
	 
	public String toString()
	{
		if(jugendgetrank)
		{
			return super.toString() +" jugendgetränk";
		}
		else
		{
			return super.toString();
		}
	}
	 
	  
}
