
package javacodes;


public class Array_4_String 
{
    public static void main(String[] args) 
    {
     String [] name = {"Nazrul","Amin","Seasun" };
        
     
        System.out.println(name.length);
     
        for (String x : name)     //for each loop
        {
            System.out.println(x);  
        }
        
        int[] num = {10,20,30,40};
        int sum = 0;
        for(int x : num)
        {
            sum = sum + x; 
        }
        System.out.println(sum);
    }
  
}
