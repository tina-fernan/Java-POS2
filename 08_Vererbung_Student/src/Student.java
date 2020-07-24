
public abstract class Student {
	
	private static int lastId = 1000;
    private int studentId;
    private String name;
    private int alter;
   
    private School school;
    
   
    
    public Student(String name, int alter) throws StudentException
    {
    	setStudentId();
        setName(name);
        
        setAlter(alter);
    }
    
    public Student(String name) throws StudentException
    {
    	setStudentId();
        setName(name);
        
        setAlter(13);
    }
    
    public Student(int alter) throws StudentException
    {
    	setStudentId();
        setName("Unkn");
        
        setAlter(alter);
    }
    
    public Student() throws StudentException
    {
    	setStudentId();
        setName("Unkn");
       
        setAlter(13);
    }
    
    public static int getLastId()
    {
    	return Student.lastId;
    }
    
    public int getStudentId()
	{
		return studentId;
	}

	

	public String getName()
    {
        return name;
    }
    
    public int getAlter()
    {
        return alter;
    }
    
    

    public School getSchool()
    {
        return school;
    }
    
    
    private void setStudentId()
	{
    	Student.lastId++;
		this.studentId = Student.lastId;
	}
    
    public void setName(String name) throws StudentException
    {
        if ((name != null) && (name.length()>0))
        {
            this.name = name;
        }
        else
        {
            throw new StudentException("Fehler: kein Name!");
        }
    }
    public void setAlter(int alter) throws StudentException
    {
    	if((alter >= 12) && (alter <= 55))
    	{
    		this.alter = alter;
    		
    	}
    	else
    	{
    		throw new StudentException("Fehler : ungültiges Alter!");
    	}
    }
   
    
  
    
    public void setSchool(School school)
    {
        this.school = school;
    }
    
    public String toString()
    {
        
        
            return  studentId +"  " + name + " (" + alter + " Jahre)";
        
       
    }
    
    public String getInitialen()
    {
        if (name.contains(" ") == true)
        {
            return "" + name.charAt(0) + name.charAt(name.indexOf(' ')+1);
        }
        else
        {
            return "" + name.charAt(0);
        }
    }
    
    public String getAccount() throws StudentException
    {
        //01234567890123456789
        //Thomas Griesmayer
        String account;
        
        try
        {
            account = name.substring(0,2);
            account = account + name.substring(name.indexOf(' ')+1, name.indexOf(' ')+4) + alter;
            return account.toUpperCase();
        }
        catch(IndexOutOfBoundsException e)
        {
            throw new StudentException("Fehler: kein gultige Name!");
        }
    }
    
    public void abmelden() throws StudentException
    {
        if (school != null)
        {
            school.abmelden(this);
        }
        else
        {
            throw new StudentException("Fehler: in keiner Schule angemeldet!");
        }
    }
    
    public abstract double uberweisen();
    
    /*
    public void testen()
    {
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf(' '));
        System.out.println(name.charAt(name.indexOf(' ')+1));
    }
    */


}
