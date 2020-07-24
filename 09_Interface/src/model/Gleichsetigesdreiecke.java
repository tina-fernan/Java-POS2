package model;

public class Gleichsetigesdreiecke extends Dreiecke
{

	public Gleichsetigesdreiecke(double seiteA, double seiteC)
	{
		super(seiteA, seiteA, seiteC);
		
	}

	@Override
	public double berechneFlache()
	{
		
		return getSeiteA()*getSeiteA()*Math.sqrt(3)/4;
	}

	@Override
	public String toString()
	{
		return "Gleichsetiges "+ super.toString();
				
	}
	
	

}
