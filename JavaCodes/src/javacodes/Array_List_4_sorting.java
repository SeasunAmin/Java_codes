
package javacodes;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List_4_sorting
{
    public static void main(String[] args)
    {
     ArrayList<Integer> num = new ArrayList<>();
     
      num.add(10);
      num.add(15); 
      num.add(100); 
      num.add(19);
      num.add(-1);
      
      System.out.println("Before Sorting :  "+num);
      
      Collections.sort(num);
      System.out.println("After Sort in Assending : "+num);
        
      Collections.sort(num,Collections.reverseOrder());
        System.out.println("After sort Dessending : "+num);
        
    }
  
}
