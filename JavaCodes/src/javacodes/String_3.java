
package javacodes;


public class String_3 
{
    public static void main(String[] args) {
        
        String country = "Bangladesh is my country";
        System.out.println(country);
        
        char ch = country.charAt(0);
        System.out.println(ch);
        
        int value = country.codePointAt(0);
        System.out.println("Asscci value is : "+value);
        
        int ind = country.indexOf("is");
        System.out.println("INDEX is : "+ind);
        
        int last = country.lastIndexOf("n");
        System.out.println("Last index is : "+last);
        
    }
  
}
