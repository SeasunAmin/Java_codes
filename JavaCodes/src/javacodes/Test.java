
package javacodes;

import java.util.Scanner;


public class Test
{
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
     
     char name;
     System.out.println("Enter your name : ");
     name = input.next().charAt(0);
     System.out.print("HEllO "+name);
             
    }
   
}
