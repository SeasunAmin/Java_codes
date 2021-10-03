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
public class Celsius_to_Fahernhite
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double cel,result,fer;
        System.out.print("Enter celsius : ");
        cel = input.nextDouble();
        result = 1.8*cel+32;
        System.out.println("Fahrenheit is = "+result);
        
        System.out.print("Enter Fahrenheit : ");
        fer = input.nextDouble();
        result = fer-32/1.8;
        System.out.println("Celsius is = "+result);
    }
}
