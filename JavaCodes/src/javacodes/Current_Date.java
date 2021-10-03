
package javacodes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Current_Date
{
    public static void main(String[] args) {
        
        Date date = new Date();
        DateFormat dateformat = new SimpleDateFormat("dd/MM/YYYY");
        
        String currentDate = dateformat.format(date);
        
        System.out.println("Date : "+currentDate);
    }
  
}
