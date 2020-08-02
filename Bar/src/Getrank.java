
public abstract class Getrank
{
	private static int lastid = 100;
	private int id;
	private String name = "Coca Cola";
	private int ml = 500;
	private Bar bar;
	
	
	
	
	public Getrank(String name, int ml) throws BarException
	{
		setId();
		setName(name);
		setMl(ml);
	}
	public int getId()
	{
		return id;
	}
	public void setId()
	{
		Getrank.lastid++;
		this.id = Getrank.lastid;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) throws BarException
	{
		if(name!=null)
		{
		this.name = name;
		}
		else
		{
			throw new BarException("Fehler: Es gibt kein GetränkName!");
		}
	}
	public int getMl()
	{
		return ml;
	}
	
	public void setMl(int ml) throws BarException
	{
		if((ml >= 10) && (ml <= 500))
		{
		this.ml = ml;
		}
		else
		{
			throw new BarException("Fehler : keine gultige füllmenge!");
		}
	}
	
	public Bar getBar()
	{
		return bar;
	}
	public void setBar(Bar bar)
	{
		this.bar = bar;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return id + " " + name + "("+ ml + " ml)" +" "+ getPrice()+ " EUR ";
	}
	

}
