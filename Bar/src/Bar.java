import java.util.HashMap;

public class Bar
{

	private HashMap<String, Getrank>getranke;
	
	public Bar()
	{
		getranke=new HashMap<>();
	}
	
	public void aufnehmen(Getrank neu) throws BarException
	{
		if(neu!=null)
		{
			if(neu.getBar()==null)
			{
				getranke.put(neu.getName(), neu);
				neu.setBar(this);
			}
			else
			{
				throw new BarException("Fehler: Getränk schon in einer andere Bar!");
			}
			
		}
		else
		{
			throw new BarException("Fehler: keine Getränk!");
		}
	}
	
	public void loschen(Getrank welches) throws BarException
	{
		if(welches!=null)
		{
			if(welches.getBar()==this)
			{
				getranke.remove(welches.getName());
				welches.setBar(null);
				
			}
			else
			{
				throw new BarException("Fehler : Getränk nicht in dieser Bar vorhanden!");
			}
		}
		else
		{
			throw new BarException("Fehler : keine Getränk!");
		}
	}
	
	public String toString()
	{
		String erg;
		erg="";
		for(Getrank g: getranke.values())
		{
			erg += g.toString()+"\n";
		}
		return erg;
	}
}
