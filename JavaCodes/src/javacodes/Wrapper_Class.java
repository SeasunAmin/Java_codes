
package javacodes;


public class Wrapper_Class
{
    public static void main(String[] args) {
        
        //Primitive -> Object
        int x  = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("y = "+y);
        
        Integer z = x;
        System.out.println("z = "+z); //Integer.valueOf Autoboxing
        
        //Object ->Primitive
    
        Double d =  new Double(12.50);
        System.out.println("d = "+d);
        double e = d  ; // d.doubleValue(); Unboxing
        
        System.out.println("e = " +e);
    
    
    }
    
  
}
