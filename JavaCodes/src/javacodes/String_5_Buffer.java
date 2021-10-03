
package javacodes;

public class String_5_Buffer 
{
    public static void main(String[] args) {
        
        StringBuffer ss = new StringBuffer("Nazrul Amin");
        System.out.println(ss);
        
        ss.append(" Seasun ");
        ss.append(21);
        System.out.println(ss);
        
        //ss.reverse();
        //System.out.println(ss);
        
        ss.delete(0, 6);
        System.out.println(ss);
        
        ss.setLength(5);
        System.out.println(ss);
                
    }
   
}
