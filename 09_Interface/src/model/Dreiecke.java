package model;

public abstract class Dreiecke implements Figur
{
	private double seiteA;
	private double seiteB;
	private double seiteC;
	
	
	
	public Dreiecke(double seiteA, double seiteB, double seiteC)
	{
		setSeiteA(seiteA);
		setSeiteB(seiteB);
		setSeiteC(seiteC);
	}

	public double getSeiteA()
	{
		return seiteA;
	}
	
	public void setSeiteA(double seiteA)
	{
		if(seiteA>0)
		{
		this.seiteA = seiteA;
		}
		else
		{
			System.out.println("Fehler : ungültige Seitelänge!");
			this.seiteA = 1;
		}
	}
	
	public double getSeiteB()
	{
		return seiteB;
	}
	
	public void setSeiteB(double seiteB)
	{
		if(seiteB>0)
		{
		
		this.seiteB = seiteB;
		
		}
		else
		{

			System.out.println("Fehler : ungültige Seitelänge!");
			this.seiteB = 1;
		}
	}
	
	public double getSeiteC()
	{
		return seiteC;
	}
	
	public void setSeiteC(double seiteC)
	{
		if(seiteC>0)
		{
			this.seiteC = seiteC;
		
		}
		else
		{

			System.out.println("Fehler : ungültige Seitelänge!");
			this.seiteC = 1;
		}
	}
	
	@Override
	public double berechneUmfang()
	{
		return seiteA+seiteB+seiteC;
	}

	@Override
	public String toString()
	{
		return "Dreiecke : " + seiteA + "," + seiteB + "," 
	          + seiteC + " Umfang: " + berechneUmfang()+" Fläche: " + berechneFlache();
	}
	
	/*@Override
	public double berechneFlache()
	{
		return 0;
	}*/
	
	
	
	
	

}
