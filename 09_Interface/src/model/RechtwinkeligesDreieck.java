package model;

public class RechtwinkeligesDreieck extends Dreiecke
{

	public RechtwinkeligesDreieck(double seiteA, double seiteB, double seiteC)
	{
		super(seiteA, seiteB, seiteC);
		
	}

	@Override
	public double berechneFlache()
	{
		
		return getSeiteA()*getSeiteB()/2;
	}

	@Override
	public String toString()
	{
		return "Rechtwinkeliges "+ super.toString();
				
	}
	
}
