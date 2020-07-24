package model;

import java.util.ArrayList;

public class Zeichnung
{

	private ArrayList<Figur>figuren;
	
	public Zeichnung()
	{
		figuren = new ArrayList<Figur>(20);
	}
	
	public void testDaten()
	{
		
		RechtwinkeligesDreieck rd0,rd1,rd2;
		Gleichsetigesdreiecke gd0,gd1,gd2;
		Kreis k0,k1,k2,k3;
		Rechteck r0, r1, r2, r3;
		Quadrat q0,q1;
		
		rd0 = new RechtwinkeligesDreieck(4,5,6.4);
		rd1 = new RechtwinkeligesDreieck(2,5,3.6);
		rd2 = new RechtwinkeligesDreieck(3,5,5.4);
		gd0 = new Gleichsetigesdreiecke(5,4);
		gd1 = new Gleichsetigesdreiecke(2,4);
		gd2 = new Gleichsetigesdreiecke(8,4);
		k0=new Kreis(3);
		k1=new Kreis(3);
		k2=new Kreis(4);
		k3=new Kreis(8);
		r0 = new Rechteck(2,3);
		r1 = new Rechteck(2,3);
		r2 = new Rechteck(2,3);
		r3 = new Rechteck(5,2);
		q0=new Quadrat(2);
		q1=new Quadrat(3);
		figuren.add(rd0);
		figuren.add(rd1);
		figuren.add(rd2);
		figuren.add(gd0);
		figuren.add(gd1);
		figuren.add(gd2);
		figuren.add(k0);
		figuren.add(k1);
		figuren.add(k2);
		figuren.add(k3);
		figuren.add(r0);
		figuren.add(r1);
		figuren.add(r2);
		figuren.add(r3);
		figuren.add(q0);
		figuren.add(q1);
	}

	@Override
	public String toString()
	{
		String erg= " ";
		
		for(Figur f: figuren)
		{
			erg= erg+f.toString()+"\n";
		}
		erg += "Ges.umfang: " +berechneGesUmfang()+"\n";
	    erg += "Ges.fläche: " +berechneGesflache();
		return erg;
	}
	

	
	public double berechneGesUmfang()
	{
		double umfang=0;
		
		for(Figur f: figuren)
		{
			umfang= umfang + f.berechneUmfang();
		}
		
		
		return umfang;
	}
	
	public double berechneGesflache()
	{
		double flach=0;
		
		for(Figur f: figuren)
		{
			flach=flach + f.berechneFlache();
		}
		
		
		return flach;
	}
}
