
package basicjava;

import java.util.Scanner;


public class Math_Class 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x = 2;
        int y = 3;
        int result;
        
        result = Math.max(x , y);
        System.out.println("Maximum = "+result);
        
        result = Math.min(x , y);
        System.out.println("Maximum = "+result);
        
        double power = Math.pow(x, y);
        System.out.println("Maximum = "+power);
        
        int round = Math.round(8.77f);
        System.out.println("Round of 8.77 is = "+round);
        
        double pi = Math.PI;
        System.out.println("PI = "+pi);
        
        
        
    }
}
