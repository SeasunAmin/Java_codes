
package basicjava;

import java.util.Scanner;


public class Series
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int sum = 0, num;
        System.out.print("Enter the last number :");
        num = input.nextInt();
        
        for (int i = 1; i <= num; i=i+2)
        {
           sum = sum + i;
            System.out.print(" "+i);
        }
        System.out.println("");
        System.out.println("Sum = "+sum);
    }
    
}
