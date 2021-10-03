
package javacodes;

import java.util.Scanner;

public class Area_of_Triangle
{
    public static void main(String[] args) 
    {
     Scanner input = new Scanner (System.in);
     double base,hight,area;
     System.out.print("Enter Base : ");
     base = input.nextDouble();
     
     System.out.print("Enter Hight : ");
     hight = input.nextDouble();
     
     area = 0.5*base*hight;
     
     System.out.println("Area of Tringle is = "+area);   
    }
   
}
