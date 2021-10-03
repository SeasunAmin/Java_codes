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
public class Capital_Small_Letter
{
 public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char ch ;
        System.out.print("Enter any letter : ");
        ch = input.next().charAt(0);
        if(ch>='A' && ch<='Z')
            System.out.println("Capital Letter");
        else if (ch>='a' && ch<='z')
            System.out.println("Small Letter");
        else
            System.out.println("Its not a letter");
        
    }   
}
