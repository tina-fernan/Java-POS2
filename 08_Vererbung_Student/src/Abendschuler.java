
public class Abendschuler extends Student
{
  private boolean beruf;
  
  public Abendschuler(String name,int alter,boolean beruf) throws StudentException
  {
	  super(name,alter);
	  setBeruf(beruf);
  }

public boolean isBeruf()
{
	return beruf;
}

public void setBeruf(boolean beruf)
{
	this.beruf = beruf;
}
  public void setAlter(int alter) throws StudentException
  {
	  if(alter >= 17)
	  {
		  super.setAlter(alter);
	  }
	  else
	  {
		  throw new StudentException("Fehler : Abendschüler musss mind.17 Jahre alt sein");
		  
	  }
  }
  
  public String toString()
	 {
		 if(beruf)
		 {
			return super.toString()+ "Beruf";
		 }
		 else
		 {
			 return super.toString()+ "kein Beruf";
		 }
	 }

@Override
public double uberweisen()
{
	if(beruf)
	{
		return 18;
	}
	else
	{
	return 16;
	}
}
}
