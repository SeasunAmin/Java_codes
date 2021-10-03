
package javacodes;

public class String_4 
{
    public static void main(String[] args)
    {
    
        String name = "Hello dear i am abul";
        System.out.println(name);
        
        String name2 = name.replace('i', 'h');
        System.out.println("After replace : "+name2);
        
        String[] name3 = name.split(" ");
        for (String x : name3) 
        {
            System.out.println(x);
        }
        
        
    }
   
}
