public class TestReference
{
    public void testFritz()
    {
        Student fritz;
        Student f2;
        Student f3;
    
        fritz = new Student ("Fritz", 29, "rk", true);
        f2 = fritz; //f2 zeigt genau auf fritz
        f3 = f2; //f2 zeit jetzt aufs gleiche objekt und fritz zeigt aufs gleiche Objekt
    }
    
    public void test2()
    {
        //Objektreferenz sind a b c d e f g h
        Student a, b, c, d, e, f, g, h;
        
        b = new Student ("Max", 25, "rk");
        h= new Student ("Susi", 27, "islam");
        e = b;
        f = new Student ("Maria", 29, "ob");
        e = f; // ich kann Objektreferenze auch wo anders hinzeigen lassen! e wurde jetzt neu zugewiesen!
        c = h; //damit zeigt die Objektreferenz genau dorthin wo das h hinzeigt
        h = null; //h zeigt jetzt nicht mehr auf Susi, sondern auf null!
        e.setAlter(30); //zb ändert das Alter von 29 auf 30
        f = new Student("Alex", 29, "ob"); // f zeigt nicht mehr auf Maria drauf, sondern auf Alex!
        //a.printSudent(); zeigt auf Null
        b.printStudent();
        c.printStudent();
        //d.printSudent();zeigt auf null
        e.printStudent();
        f.printStudent();
        //g.printStudent(); zeigt auf null
        //h.printStudent();
        
        
        
        
    }
    
    public void test3()
    {
        //Objektreferenz sind s0, s1, s2, s3, s4, s5
        Student s0, s1, s2, s3, s4, s5;
        
        s0 = new Student("Hans", 30, "rk");
        s4 = new Student("Alex", 20, "ob");
        s0.setName("Hans2");
        s5 = new Student("Hans", 30, "rk"); //mit new wird ein neues Objekt angelet auch wenn es gleich mit einem anderen Objekt heisst!
        s1 = s5;
        s0 = s4;
        s3 = s0;
        s3.setAlter(41);
        //s2 = null; //Null pointer exception
        //s2.setAlter(22);
        s1= s5; //hier ändert sich nichts, sinnloser Befehl
        s5 = s0;
        s1.setAlter(33);
        s0.printStudent();
        s1.printStudent();
        //s2.printStudent(); null pointer exception, deshalb nicht ausführen!
        s3.printStudent();
        s4.printStudent();
        s5.printStudent();
    }
    
     public void test4()
    {
        //Objektreferenz sind q, w, e, r, t, z;
        Student q, w, e, r, t, z;
        
        q = new Student("Alex", 22, "ob");
        e = new Student("Alex", 22, "ob");
        r = new Student("Max", 33, "ob");
        t = q;
        t.setAlter(20);
        q = null;
        t = new Student("Peter", 44, "ob");
        t.setName("Neue");
        w = null;
        r = new Student("Franz", 33, "ob");
        q.setAlter(30);
        z = new Student("Andrea", 55, "ob");
        e.setAlter(40);
        q.printStudent();
        w.printStudent();
        e.printStudent();
        r.printStudent();
        t.printStudent();
        z.printStudent();
     
        
       
    }
    
    
   
    
}