
public class Teacher
{
	private String name;
	private boolean fachlehre;
	private double gehalt;

	public Teacher(String name, boolean fachlehre, double gehalt)
	{
		
		setName(name);
		setFachlehre(fachlehre);
		setGehalt(gehalt);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public boolean getFachlehre()
	{
		return fachlehre;
	}

	public void setFachlehre(boolean fachlehre)
	{
		this.fachlehre = fachlehre;
	}

	public double getGehalt()
	{
		return gehalt;
	}

	public void setGehalt(double gehalt)
	{
		this.gehalt = gehalt;
	}

}
