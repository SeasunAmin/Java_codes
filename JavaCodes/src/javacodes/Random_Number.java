
package javacodes;

import java.util.Random;

public class Random_Number 
{
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        int randomNumber = rand.nextInt(5)+1;
        System.out.println("Random number is : "+randomNumber);
    }
   
}
