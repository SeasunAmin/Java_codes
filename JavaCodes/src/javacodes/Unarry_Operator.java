
package basicjava;


public class Unarry_Operator 
{
    public static void main(String[] args)
    {
        int x = -10;
        int result;
        
        result = +x;
        System.out.println("result = "+result);
        
        result = -x;
        System.out.println("result = "+result);
        
        int a=30,b;
       
        b = a++; //post increment
        System.out.println("result = "+b);
        b = a;
        System.out.println("result = "+b);
        
        int c = 40,d,result3;
        d = ++c;
        System.out.println("result3 = "+c);
        d = c;
        System.out.println("result3 = "+c);
    }
}
