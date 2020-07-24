
public class Student {
	

    private String name;
    private int alter;
    private boolean mannlich;
    private School school;
    
    public Student(String name, int alter, boolean mannlich) throws StudentException
    {
        setName(name);
        setMannlich(mannlich);
        setAlter(alter);
    }
    
    public Student(String name, int alter) throws StudentException
    {
        setName(name);
        setMannlich(true);
        setAlter(alter);
    }
    
    public Student(String name) throws StudentException
    {
        setName(name);
        setMannlich(true);
        setAlter(13);
    }
    
    public Student(int alter) throws StudentException
    {
        setName("Unkn");
        setMannlich(true);
        setAlter(alter);
    }
    
    public Student() throws StudentException
    {
        setName("Unkn");
        setMannlich(true);
        setAlter(13);
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAlter()
    {
        return alter;
    }
    
    public boolean getMannlich()
    {
        return mannlich;
    }

    public School getSchool()
    {
        return school;
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
        if (mannlich == true)
        {
            //13..50
            if ((alter >= 13) && (alter <= 50))
            {
                this.alter = alter;
            }
            else
            {
                if (alter<13)
                {
                    //zu jung
                    throw new StudentException("Fehler: Student zu jung!");
                }
                else
                {
                    //zu alt
                	throw new StudentException("Fehler: Student zu alt!");
                }
            }
        }
        else
        {
            //12..55
            if ((alter >= 12) && (alter <= 55))
            {
                this.alter = alter;
            }
            else
            {
                if (alter<12)
                {
                    //zu jung
                	throw new StudentException("Fehler: Studentin zu jung!");
                }
                else
                {
                    //zu alt
                	throw new StudentException("Fehler: Studentin zu alt!");
                }
            }
        }
    }
    
    public void setMannlich(boolean mannlich)
    {
        this.mannlich = mannlich;
    }
    
    public void setSchool(School school)
    {
        this.school = school;
    }
    
    public String toString()
    {
        if (mannlich == true)
        {
            return "Student: " + name + " (" + alter + " Jahre) - Mann";
        }
        else
        {
            return "Student: " + name + " (" + alter + " Jahre) - Frau";
        }
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
