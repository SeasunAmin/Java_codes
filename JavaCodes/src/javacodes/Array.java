
package javacodes;

public class Array 
{
    public static void main(String[] args)
    {
      int[] num1 = new int [5];
      
       num1[0] = 150;
       num1[1] = 170;
       num1[2] = 140;
       num1[3] = 110;
       num1[4] = 120;
      
      
        int len =num1.length; 
        System.out.println("SIZE of array is = "+len);
        
        int sum = num1[0]+ num1[1] + num1[2] + num1[3] + num1[4];
        System.out.println("SUM of the array is = " +sum);
    
    }
    
   
}
