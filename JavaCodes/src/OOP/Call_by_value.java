
package OOP;


public class Call_by_value
{
 void change(int x)
 {
     x = 20;
 }
    public static void main(String[] args)
    {
        
        Call_by_value ob = new Call_by_value();
        int x = 10;
        System.out.println("Before changing : "+x);
        
        ob.change(x);
        System.out.println("After changing : "+x);
    }
   
}
