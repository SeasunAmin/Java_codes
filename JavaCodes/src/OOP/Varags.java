
package OOP;

public class Varags 
{
 void   add(int ... num)
 {
     int sum = 0;
     for (int x : num)
     {
         sum = sum + x;  
     }
     System.out.println(sum);
 }
    public static void main(String[] args)
    {
     Varags ob = new Varags();
      ob.add(10, 20);
      ob.add(10, 20,30);
      ob.add(10, 20,40);
    }
}
