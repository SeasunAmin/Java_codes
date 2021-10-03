
package javacodes;

public class Primitive_to_String 
{
    public static void main(String[] args) {
        
        //Primitive -> String
        int i = 100;
        String s = Integer.toString(i);
        System.out.println("s = " +s);
        
        boolean b = true;
        String srt = Boolean.toString(b);
        System.out.println("srt = "+srt);
        
        //String -> Primitive
        
        String st = "45";
        double de = Double.parseDouble(st);
        System.out.println("de = "+de);
    }
}
