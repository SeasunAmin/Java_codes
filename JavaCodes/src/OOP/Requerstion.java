
package OOP;

public class Requerstion 
{
    int seasun(int x)
    {
        if(x==1)
            return 1;
        
        else
            return x*seasun(x-1);
    }
    public static void main(String[] args) {
        
        Requerstion ob = new Requerstion ();
        int result = ob.seasun(5);
        System.out.println(result);
    }
    
}
