
package javacodes;

import java.util.Scanner;

public class String_2
{
    public static void main(String[] args) {
        
        String fname = "Nazrul Amin";
        String lname = " Seasun";
        
        String fullname = fname.concat(lname);
        System.out.println("Full Name :  "+fullname);
        
        String uppername = fullname.toUpperCase();
        System.out.println("Upper letter : "+uppername);
        
        String lowername = fullname.toLowerCase();
        System.out.println("Lower letter : "+lowername);
        
        boolean first = fname.startsWith("Na");
        System.out.println("First : "+first);
        
        boolean last = lname.endsWith("n");
        System.out.println("Last : "+last);
        
        Scanner input = new Scanner(System.in);
      
        
        System.out.println("Enter your name : ");
       String ss = input.nextLine();
        System.out.println("Name : "+ss );
        
        String [] name = {"seasun","Arif","Ocean"};
        for (String x :name)
        {
            System.out.println(x);    
        }
        
        
        
        
    }
}
