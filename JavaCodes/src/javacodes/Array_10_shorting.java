
package javacodes;

import java.util.Arrays;

public class Array_10_shorting 
{
    public static void main(String[] args) {
        
        int [] num = {10,3,-5,5,9};
        
        Arrays.sort(num);
        System.out.println("Assending : ");
        for (int i = 0; i <5; i++)
        {
            System.out.print(" "+num[i] +" ");
        }
        System.out.println("\nDessinding :");
        for (int i = 4; i >=0; i--) 
        {
            System.out.print(" "+num[i] +" ");
        }
        
        String[] name = {"seasun","arif","ocean","ali"};
        Arrays.sort(name);
        
        System.out.println("");
        for (int i = 0; i <4; i++) 
        {
            System.out.print(" "+ name[i]);   
        }
        System.out.println("");
        for (int i = 3; i>=0; i--) 
        {
            System.out.print( name[i] + " ");   
        }
        
    }
}
