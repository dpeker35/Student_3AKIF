public class SchoolJung
{
    private Student sessel0;
    private Student sessel1;
    private Student sessel2;
    
    
    //ACHTUNG SELBER ERSTELLT ZUM ÜBEN
    public void anmelden(Student wer)
    {
        if(sessel0 == null)
        {
            
            sessel0 = wer;
        
        }
        else
        {
            if(sessel1 == null)
            {
               sessel1 = wer; 
            }
            else
            {
                if(sessel2 == null)
                {
                    sessel2 = wer;
                }
                else
                {
                     System.out.println("Fehler: Kein Platz!");
                }
        
        
        
        
    
    
            }

    
            }       
        }
        public int jungsterStudent()
        {
            int max;
            max = 999;
            
            if(sessel0 != null)
            {
                if(sessel0.getAlter() < max);
                {
                    max = sessel0.getAlter();
                }
            }
            if(sessel1 != null)
            {
                if(sessel1.getAlter() < max);
                {
                    max = sessel1.getAlter();
                }
            }
            if(sessel2 != null)
            {
                if(sessel2.getAlter() < max);
                {
                    max = sessel2.getAlter();
                }
            }
            
            return max;
        }
        
        
    }