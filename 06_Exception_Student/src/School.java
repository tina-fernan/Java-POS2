import java.util.ArrayList;
import java.util.Iterator;

public class School
{
    private ArrayList<Student> students;

    public School()
    {
        students = new ArrayList(5);
    }

    public void aufnehmen(Student wen) throws StudentException
    {
        if (wen != null)
        {
            if (wen.getSchool() == null)
            {
                students.add(wen);
                wen.setSchool(this);
            }
            else
            {
            	throw new StudentException("Fehler: Student bereits in einer Schule angemeldet!");
            }
        }
        else
        {
        	throw new StudentException("Fehler: kein Student!");            
        }
    }

    public void abmelden(Student wer) throws StudentException
    {
        int pos;
        int i;
        boolean gefunden;

        if (wer != null)
        {
            if (students.remove(wer) == true)
            {
                wer.setSchool(null);
            }
            else
            {
                throw new StudentException("Fehler: Student nicht in dieser Schule!");
            }
        }
    }

    public String toString()
    {
        String erg;

        erg = "";
        for (Student s : students)
        {
            erg = erg + s.toString() + "\n";
        }

        return erg;
    }

    public double avgAlter() throws StudentException
    {
        int summe;

        summe = 0;
        for (Student s: students)
        {
            summe += s.getAlter();
        }
        if (students.size() > 0)
        {
            return (double)summe/students.size();
        }
        else
        {
        	throw new StudentException("Fehler: keine Studenten in der Schule!");
        }
    }

    public int anzahlStudentinnen()
    {
        int anz;

        anz = 0;
        for (Student s: students)
        {
            if (s.getMannlich() == false)
            {
                anz++;
            }
        }
        return anz;
    }

    public int maxAlter()
    {
        int max;

        max = -999;
        for (Student s: students)
        {
            if (s.getAlter() > max)
            {
                max = s.getAlter();
            }
        }
        return max;
    }

    public int losche(String name) throws StudentException
    {
        Iterator<Student> it;
        Student s;
        int anz;

        if (name != null)
        {
            anz = 0;
            it = students.iterator();
            while (it.hasNext())
            {
                s = it.next();
                if (s.getName().equals(name))
                {
                    it.remove();
                    s.setSchool(null);
                    anz++;
                }
            }
            return anz;
        }
        else
        {
        	throw new StudentException("Fehler: ungÃ¼ltiger Name!");
        }
    }

    public void einfugen(Student wen, int pos) throws StudentException
    {
        /* Fehlt PrÃ¼fung des Index!!! */
        if (wen != null)
        {
            if (wen.getSchool() == null)
            {
                students.add(pos, wen);
                wen.setSchool(this);
            }
            else
            {
            	throw new StudentException("Fehler: schon in einer anderen Schule!");
            }
        }
        else
        {
        	throw new StudentException("Fehler: kein Student!");
        }
    }

}
