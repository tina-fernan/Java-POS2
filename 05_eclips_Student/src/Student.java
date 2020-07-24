
public class Student {
	

    private String name;
    private int alter;
    private boolean mannlich;
    private School school;
    
    public Student(String name, int alter, boolean mannlich)
    {
        setName(name);
        setMannlich(mannlich);
        setAlter(alter);
    }
    
    public Student(String name, int alter)
    {
        setName(name);
        setMannlich(true);
        setAlter(alter);
    }
    
    public Student(String name)
    {
        setName(name);
        setMannlich(true);
        setAlter(13);
    }
    
    public Student(int alter)
    {
        setName("Unkn");
        setMannlich(true);
        setAlter(alter);
    }
    
    public Student()
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

    public void setName(String name)
    {
        if ((name != null) && (name.length()>0))
        {
            this.name = name;
        }
        else
        {
            System.out.println("Fehler: kein Name!");
            this.name = "Unkn";
        }
    }
    
    public void setAlter(int alter)
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
                    System.out.println("Fehler: Student zu jung!");
                    this.alter = 13;
                }
                else
                {
                    //zu alt
                    System.out.println("Fehler: Student zu alt!");
                    this.alter = 50;
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
                    System.out.println("Fehler: Studentin zu jung!");
                    this.alter = 12;
                }
                else
                {
                    //zu alt
                    System.out.println("Fehler: Studentin zu alt!");
                    this.alter = 55;
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
    
    public String getAccount()
    {
        //01234567890123456789
        //Thomas Griesmayer
        String account;
        
        if (name.contains(" ") == true)
        {
            account = name.substring(0,2);
            account = account + name.substring(name.indexOf(' ')+1, name.indexOf(' ')+4) + alter;
            return account.toUpperCase();
        }
        else
        {
            System.out.println("Fehler: kein gÃ¼ltiger Name!");
            return null;
        }
    }
    
    public void abmelden()
    {
        if (school != null)
        {
            school.abmelden(this);
        }
        else
        {
            System.out.println("Fehler: in keiner Schule angemeldet!");
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
