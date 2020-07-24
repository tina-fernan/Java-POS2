package model;

public class Kreis implements Figur
{
 private double raduis;
 

public Kreis(double raduis)
{
	setRaduis(raduis);
}

public double getRaduis()
{
	return raduis;
}

public void setRaduis(double raduis)
{
	if(raduis>0)
	{
	this.raduis = raduis;
	}
	else
	{
	 System.out.println("Fehler : ungültige Raduis!");
	 this.raduis=1;
	}
}

@Override
public double berechneUmfang()
{
	return 2*raduis*Math.PI;
}

@Override
public double berechneFlache()
{
	return raduis*raduis*Math.PI;
}

@Override
public String toString()
{
	return "Kreis : " + raduis + " Umfang " + berechneUmfang() + " Flache " + berechneFlache();
}
 
}
