
package javacodes;

import java.util.Scanner;


public class Array_6
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      
      int[][] A = new int [2][3];
      int[][] B = new int [2][3];
      
        System.out.println("Enter elements for A metrix :");
        for (int row = 0; row < 2; row++)
        {
            for (int col = 0; col < 3; col++)
            {
               System.out.printf("A[%d][%d] =  ",row,col);
                A[row][col] = input.nextInt();
            }
    
        }
        
      
      System.out.println("Enter elements for B metrix :");
        for (int row = 0; row < 2; row++)
        {
            for (int col = 0; col < 3; col++)
            {
               System.out.printf("B[%d][%d] =  ",row,col);
                B[row][col] = input.nextInt();
            }
    
        }
      
        System.out.println("\nA = ");
        for (int row = 0; row < 2; row++)
        {
            for (int col = 0; col < 3; col++)
            {
                System.out.print(" \t[" +A[row][col]+"]");
              
            }
            System.out.println("");
        }
        
      System.out.println("\nB = ");
        for (int row = 0; row < 2; row++)
        {
            for (int col = 0; col < 3; col++)
            {
                System.out.print(" \t[" +B[row][col]+"]");
              
            }
            System.out.println("");
        }
      
        //adding A&B Matrix
        System.out.println("A+B = ");
        for (int row = 0; row < 2 ; row++) 
        {
            for (int col = 0; col < 3; col++)
            {
                System.out.print("\t" +(A[row][col]+B[row][col]));   
            }
            
            System.out.println("");
        }
        
        
        
    }
    
}
