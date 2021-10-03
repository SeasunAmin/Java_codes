/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodes;

import java.util.Scanner;

/**
 *
 * @author Nazrul Amin Seasun
 */
public class Circle_Area
{
     public static void main(String[] args)
    {
     Scanner input = new Scanner (System.in);
     double radius,area;
     System.out.print("Enter Base : ");
     radius = input.nextDouble();
     
     
     
     area = 3.1416*radius*radius;
     
     System.out.println("Circle of Tringle is = "+area);
     
    }
}
