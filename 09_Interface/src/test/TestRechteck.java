package test;

import model.Quadrat;
import model.Rechteck;

public class TestRechteck
{

	public static void  main(String[] args)
	{
		Rechteck r0, r1, r2, r3;
		Quadrat q0,q1;
		r0 = new Rechteck(2,3);
		r1 = new Rechteck(2,-3);
		r2 = new Rechteck(-2,3);
		r3 = new Rechteck(5,2);
		System.out.println(r0);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		q0=new Quadrat(2);
		q1=new Quadrat(3);
		System.out.println(q0);
		System.out.println(q1);
	}
}
