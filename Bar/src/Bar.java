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
