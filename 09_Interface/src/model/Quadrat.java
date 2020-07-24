package model;

public class Quadrat extends Rechteck
{

	public Quadrat(double lange)
	{
		super(lange, lange);
		
	}

	@Override
	public String toString()
	{
		return "Quadrat " + super.toString();
	}
	

}
