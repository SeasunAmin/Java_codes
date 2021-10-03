
package javacodes;

import java.util.Scanner;


public class Array_2 
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
      
      
      
      
    }
}
