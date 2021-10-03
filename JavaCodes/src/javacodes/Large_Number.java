
package basicjava;

import java.util.Scanner;


public class Large_Number 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter two number : ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        if(num1>num2)
            System.out.println("Large Nmber is = "+num1);
        
        else if(num2>num1)
            System.out.println("Large Nmber is = "+num2);
        else
            System.out.println("Invalide");
    }
}
