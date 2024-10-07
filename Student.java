public class Student 
{
    private String  name;           // Name des Studierenden
    private int     alter;          // Alter des Studierenden
    private String  religion;       // ...
    private boolean matura;
    
    // Constructor
    public Student(String name, int alter, String religion, boolean matura)
    {
        setName(name);
        setAlter(alter);
        setReligion(religion);
        setMatura(matura);
    }
    
    public Student(String name,int alter, String religion)
    {
        setName(name);
        setAlter(alter);
        setReligion(religion);
        setMatura(false);
    }
    
    public Student(String name)
    {
        setName(name);
        setAlter(14);
        setReligion("ob");
        setMatura(false);       
    }
    
    public Student()
    {
        setName("UNKN");
        setAlter(14);
        setReligion("ob");
        setMatura(false);
    }
    
    public void setName(String name)
    {
        
        this.name = name;
    }

    public void setAlter(int Alter)
    {
        this.alter = Alter;
    }

    public void setReligion(String Religion)
    {
        this.religion = Religion;
    }
    
    public void setMatura(boolean Matura)
    {
        this.matura = Matura;
    }

    public String getName()
    {
        return name;
    }

    public int getAlter()
    {
        return alter;
    }

    public String getReligion()
    {
        return religion;
    }
    
    public boolean getMatura()
    {
        return matura;
    }
    
    public void printStudent()
    
    {
        if(matura == true)
        {
        System.out.println(name + ": " + alter + " Jahre, Rel: " + religion + ", Matura: " + matura);
        }
        else
        {
            System.out.println(name + ": " + alter + " Jahre, Rel: " + religion + ", Matura: " + ", keine matura");
        }
    }
}







