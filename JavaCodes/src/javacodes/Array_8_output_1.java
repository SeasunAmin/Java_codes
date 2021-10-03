
package javacodes;


public class Array_8_output_1 
{
    public static void main(String[] args) {
 
       int[][]A = new int [4][5];
       
       int z = 0;
        for (int row = 0; row < 4; row++)
        {
            for (int col = 0; col < 5; col++) 
            {
                  A[row][col] = z;
                  z++;
            }
        }
        
        for (int row = 0; row < 4; row++) 
        {
            for (int col = 0; col < 5; col++)
            {
                System.out.print(" "+A[row][col]);   
            }
              System.out.println();
        }
        
      
    }
   
}
