
package javacodes;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List_2
{
    public static void main(String[] args) {
        
          ArrayList<Integer> num = new ArrayList<>();
        
        //Adding elements in array list
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(3,50);
       
       
       System.out.println("Array List contains"+num); 
       
       System.out.println("");
       System.out.println("Size = " + num.size());
       
       //num.clear();
       boolean check = num.isEmpty();
       System.out.println("Array List empty : "+check);
       
       Scanner input = new Scanner(System.in);
       int check2;
       System.out.println("Enter the number you want to check : ");
       check2 = input.nextInt();
       
       boolean  has = num.contains(check2);
       System.out.println("Your number is in the list : "+has);
    
        num.set(3,70);
        System.out.println("After setting : "+num);
        
        int x = num.get(0);
        System.out.println("Index 0 = "+x);
       
    }
    

      
}
