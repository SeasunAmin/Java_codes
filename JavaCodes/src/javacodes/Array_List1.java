
package javacodes;

import java.util.ArrayList;


public class Array_List1
{
    public static void main(String[] args) {
        
        
        ArrayList<Integer> num = new ArrayList<>();
        
        //Adding elements in array list
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(3,50);
       
       
        /*for (int x : num)
        {
            System.out.print("Array List contains =  "+ x);   
        }
        System.out.println("");
        
        */
        System.out.println("Array List contains"+num); //easy way to print a array list
        num.remove(2);
        
       System.out.print("After removing Array List contains =  "+ num);   
        System.out.println("");
       System.out.println("Size = " + num.size());
        
        
    }
   
}
