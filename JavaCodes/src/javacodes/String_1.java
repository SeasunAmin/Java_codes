
package javacodes;

public class String_1
{
    public static void main(String[] args) {
        
        String name = "SEASUN";
        String name2 = new String("SEASUN");
        
        System.out.println("Name 1 : "+name);
        System.out.println("Name 2 : "+name2);
        
        if(name.equals(name2)) //"equalIgnoreCase" use for fix upper and lowe letter
        {
            System.out.println("Both name is name");
        }
        else 
            System.out.println("They are not same");
        
        boolean con =  name.contains("SEASUN");
        System.out.println(con);
    }
   
}
