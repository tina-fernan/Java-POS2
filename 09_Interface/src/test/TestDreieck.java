package test;
import model.Dreiecke;
import model.RechtwinkeligesDreieck;
import model.Gleichsetigesdreiecke;

public class TestDreieck
{

	public static void main(String[] args)
	{
		RechtwinkeligesDreieck rd0,rd1,rd2;
		Gleichsetigesdreiecke gd0,gd1,gd2;
		
		rd0 = new RechtwinkeligesDreieck(4,5,6.4);
		rd1 = new RechtwinkeligesDreieck(2,5,3.6);
		rd2 = new RechtwinkeligesDreieck(3,5,5.4);
		System.out.println(rd0);
		System.out.println(rd1);
		System.out.println(rd2);
		gd0 = new Gleichsetigesdreiecke(5,4);
		gd1 = new Gleichsetigesdreiecke(2,4);
		gd2 = new Gleichsetigesdreiecke(8,4);
		System.out.println(gd0);
		System.out.println(gd1);
		System.out.println(gd2);
		

	}

}
