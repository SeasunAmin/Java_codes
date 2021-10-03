
package OOP;

public class Factorial 
{
    int fact (int x)
    {
        if(x == 1)
            return x;
        else 
            return x*fact(x-1);
    }
    public static void main(String[] args) {
        
        Factorial ob = new Factorial();
      int result =  ob.fact(5);
        System.out.println("Factorial "+ result ); 
    }
}
