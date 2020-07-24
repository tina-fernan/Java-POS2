
public class Test
{
	public void testLosche()
	{
		School schule;

		schule = new School();
		schule.aufnehmen(new Student("Susi", 22, false));
		schule.aufnehmen(new Student("Werner", 29, true));
		schule.aufnehmen(new Student("Alex", 17, true));
		schule.aufnehmen(new Student("Susi", 27, false));
		schule.aufnehmen(new Student("Susi", 29, false));
		schule.aufnehmen(new Student("Max", 33, true));
		schule.aufnehmen(new Student("Susi", 25, false));
		System.out.println(schule.losche(null)); /* Fehler */
		System.out.println(schule.losche("Andrea")); /* 0 */
		System.out.println(schule.losche("Susi")); /* 4 */
		System.out.println(schule); /* Werner Alex Max */
	}

	public void testAufnehmen()
	{
		School schule;
		School andere;
		Student s0, s1, s2, s3, s4, s5, s6;

		s0 = new Student("Susi", 22, false);
		s1 = new Student("Werner", 29, true);
		s2 = new Student("Alex", 17, true);
		s3 = new Student("Karl", 27, true);
		s4 = new Student("Hans", 29, true);
		s5 = new Student("Max", 33, true);
		s6 = new Student("Fritz", 25, true);
		schule = new School();
		andere = new School();
		schule.aufnehmen(s0); /* OK */
		schule.aufnehmen(s1); /* OK */
		schule.aufnehmen(s0); /* Fehler */
		schule.aufnehmen(s2); /* OK */
		schule.aufnehmen(s3); /* OK */
		schule.aufnehmen(s4); /* OK */
		schule.aufnehmen(s5); /* Array umkopieren! */
		schule.aufnehmen(null); /* Fehler */
		andere.aufnehmen(s1); /* Fehler */
	}

	public void testAbmelden()
	{
		School schule, andere;
		Student s0, s1, s2;

		s0 = new Student("Susi", 29, false);
		s1 = new Student("Werner", 21, true);
		s2 = new Student("Gudrun", 31, false);
		schule = new School();
		andere = new School();
		s0.abmelden(); /* Fehler */
		schule.aufnehmen(s0);
		andere.abmelden(s0); /* Fehler nicht in dieser Schule! */
		schule.aufnehmen(s1);
		schule.aufnehmen(s2);
		System.out.println(schule.toString()); /* Susi,Werner,Gudrun */
		System.out.println("-----");
		s1.abmelden();
		System.out.println(schule.toString()); /* Susi,Gudrun */
		System.out.println("-----");
		s2.abmelden();
		System.out.println(schule.toString()); /* Susi */
		System.out.println("-----");
		s0.abmelden();
		System.out.println(schule.toString()); /**/
		System.out.println("-----");
		schule.abmelden(null);
	}

	public void testAvgAlter()
	{
		School schule;
		Student s0, s1, s2;

		s0 = new Student("Susi", 22, false);
		s1 = new Student("Werner", 29, true);
		s2 = new Student("Gudrun", 17, false);
		schule = new School();
		System.out.println(schule.avgAlter()); /* Fehler & -999 */
		schule.aufnehmen(s0);
		System.out.println(schule.avgAlter()); /* 22 */
		schule.aufnehmen(s1);
		System.out.println(schule.avgAlter()); /* 25.5 */
		schule.aufnehmen(s2);
		System.out.println(schule.avgAlter()); /* 22.66 */

	}

	public void testAnzahlStudentinnen()
	{
		School schule;
		Student s0;
		Student s1;
		Student s2;

		s0 = new Student("Susi", 22, false);
		s1 = new Student("Werner", 29, true);
		s2 = new Student("Gudrun", 17, false);
		schule = new School();
		System.out.println(schule.anzahlStudentinnen()); /* 0 */
		schule.aufnehmen(s0);
		System.out.println(schule.anzahlStudentinnen()); /* 1 */
		schule.aufnehmen(s1);
		System.out.println(schule.anzahlStudentinnen()); /* 1 */
		schule.aufnehmen(s2);
		System.out.println(schule.anzahlStudentinnen()); /* 2 */
	}

	public void testMaxAlter()
	{
		School schule;
		Student s0;
		Student s1;
		Student s2;

		s0 = new Student("Susi", 29, false);
		s1 = new Student("Werner", 21, true);
		s2 = new Student("Gudrun", 31, false);
		schule = new School();
		System.out.println(schule.maxAlter()); /*-999*/
		schule.aufnehmen(s0);
		System.out.println(schule.maxAlter()); /* 29 */
		schule.aufnehmen(s1);
		System.out.println(schule.maxAlter()); /* 29 */
		schule.aufnehmen(s2);
		System.out.println(schule.maxAlter()); /* 31 */
	}

	public void testPrintSchool()
	{
		School schule;
		Student s0;
		Student s1;
		Student s2;

		s0 = new Student("Susi", 29, false);
		s1 = new Student("Werner", 21, true);
		s2 = new Student("Gudrun", 31, false);
		schule = new School();
		// System.out.println(schule.toString()); /**/
		System.out.println(schule);
		schule.aufnehmen(s0);
		// System.out.println(schule.toString()); /*Susi...*/
		System.out.println(schule);
		System.out.println("====");
		schule.aufnehmen(s1);
		// System.out.println(schule.toString()); /*Susi..., Werner...*/
		System.out.println(schule);
		System.out.println("====");
		schule.aufnehmen(s2);
		// System.out.println(schule.toString()); /*Susi..., Werner..., Gudrun*/
		System.out.println(schule);
		System.out.println("====");
	}

	public void testEinfugen()
	{
		School schule;
		School andere;
		Student s0, s1, s2, s3, s4, s5, s6;

		s0 = new Student("Susi", 29, false);
		s1 = new Student("Werner", 21, true);
		s2 = new Student("Gudrun", 31, false);
		s3 = new Student("Max", 31, true);
		s4 = new Student("Franz", 31, true);
		s5 = new Student("Hans", 31, true);
		s6 = new Student("Alex", 31, true);

		schule = new School();
		andere = new School();
		schule.aufnehmen(s0);
		schule.aufnehmen(s1);
		schule.aufnehmen(s2);
		schule.aufnehmen(s3);
		schule.einfugen(s4, 2);
		// System.out.println(schule.toString()); /*Susi Werner Franz Gudrun Max*/
		System.out.println(schule); /* Susi Werner Franz Gudrun Max */
		schule.einfugen(s5, 2); /* Fehler */
		schule.einfugen(null, 2); /* Fehler */
		andere.aufnehmen(s6);
		schule.einfugen(s6, 2); /* Fehler */
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Test t = new Test();
		t.testAbmelden();

	}

}
