
package javacodes;

import java.util.Scanner;


public class Reverse_Number 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
      int sum = 0,temp,r,num;
      System.out.print("Enter the number : ");
      num = input.nextInt();
      temp = num;
      while(temp!=0)
      {
          r = temp % 10;
          sum = sum *10 + r;
          temp = temp / 10;
          
      }
       System.out.println("The Reverse number  is = " +sum);
    }
}
