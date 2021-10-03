
package javacodes;

import java.util.Scanner;

public class Array_3 
{
    public static void main(String[] args) 
    {
      
        Scanner input = new Scanner(System.in);
      
      double [] number = new double[5];
      double sum = 0;
      
        System.out.print("Enter five number : ");
        for (int i = 0; i < 5; i++)
        {
          number[i] = input.nextDouble();   
        }
        
        for (int i = 0; i <number.length; i++)
        {
          sum = sum + number[i];  
        }
        
        System.out.println("SUM of the array is : " +sum);
        
        double ave = sum/number.length;
        System.out.println("Average is : "+ave);
        
        double max = number[0];
        double min = number[0];
        for (int i = 1; i < 5; i++)
        {
         if (max < number[i])
            max =  number[i];
        }
        
        for (int i = 1; i < 5; i++)
        {
          if(min>number[i])
              min = number[i];
        }
        System.out.println("Maximum value is : "+max);
        System.out.println("Minimum value is : "+min);
    }
   
}
