
package basicjava;

import java.util.Scanner;


public class Leap_Year
{
    public static void main(String[] args)
    {
            Scanner input = new Scanner(System.in);
            int num;
            System.out.print("Enter any year : ");
            num = input.nextInt();
            
            if(num%4==0 && num%100!=0 || num%400==0)
            System.out.print("Leap Year...!");
            
            else
                System.out.print("It's not Leap Year");
                


    }
    
    
}
