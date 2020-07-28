
public class Alkoholfrei extends Getrank
{

	 private boolean jugendgetrank;
	 
	 

	public Alkoholfrei(String name, int ml,boolean jugendgetrank) throws BarException
	{
		super(name, ml);
		setJugendgetrank(jugendgetrank);
		
	}

	public boolean isJugendgetrank()
	{
		return jugendgetrank;
	}

	public void setJugendgetrank(boolean jugendgetrank)
	{
		this.jugendgetrank = jugendgetrank;
	}
	 
	public String toString()
	{
		if(jugendgetrank)
		{
			return super.toString() + "jugendgetränk";
		}
		else
		{
			return super.toString();
		}
	}
	 
	  
}
