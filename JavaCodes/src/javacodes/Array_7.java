
package javacodes;

import java.util.Scanner;


public class Array_7
{
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);  

      int [][] A = new int [3][3];
      int sum =0;
      int uper =0;
      int lower =0;
      
        System.out.println("Enter the elements of A matrix  : ");
        for (int row = 0; row <3; row++)
        {
            for (int col = 0; col < 3; col++) 
            {
              A[row][col] = input.nextInt();
            }
   
        }
      
        

          for (int row = 0; row <3; row++)
        {
            for (int col = 0; col < 3; col++) 
            {
             if(row==col)
             {
                 sum = sum+A[row][col];
             }
             if(row<col)
             {
                 uper = uper+A[row][col];
             }
             if(row>col)
             {
                lower = lower+A[row][col];
             }
            }
   
        }
         System.out.println("SUM of Diagonal elements is = "+sum);
         System.out.println("Sum of upper elements is = "+uper);
         System.out.println("Sum of lower elements is = "+lower);



    }
   
}
