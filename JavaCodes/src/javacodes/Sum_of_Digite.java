
package javacodes;

import java.util.Scanner;


public class Sum_of_Digite
{
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);
      int sum = 0,temp,r,num;
      System.out.print("Enter any number : ");
      num = input.nextInt();
      temp = num;
      while(temp!=0)
      {
          r = temp % 10;
          sum = sum + r;
          temp = temp / 10;
      }
        System.out.println("The sum is = " +sum);
    }
}
