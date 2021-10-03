
package javacodes;


public class String_Builder
{
    public static void main(String[] args) {
        
        StringBuilder srt = new StringBuilder("Nazrul Amin");
        System.out.println(srt);
        srt.reverse();
        
        srt.append(" Seasun");
        srt.append(21);
        srt.append(3.67);
        System.out.println(srt);
        
        
    }
  
}
