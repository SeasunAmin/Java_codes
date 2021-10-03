
package javacodes;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Current_Time 
{
    public static void main(String[] args)
    {
        
    LocalTime time = LocalTime.now();
    
    DateTimeFormatter TimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
    
   String FormetTime = time.format(TimeFormatter);
    
    System.out.println("Time : "+FormetTime);
     
        
        
    }
  
}
