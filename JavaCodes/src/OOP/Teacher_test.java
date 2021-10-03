
package OOP;

//import java.util.Scanner;


public class Teacher_test
{
    public static void main(String[] args) {
        //Scanner input = new Scanner (System.in);
        
        Teacher teacher  = new Teacher();
        
        System.out.println("Enter name : ");
        
        //teacher.n = input.nextLine();
       
        teacher.n = "Seasun";
        teacher.ge = "Male";
        teacher.ph = 167467;
        teacher.display();
   
        System.out.println("");
        
        Teacher teacher2  = new Teacher();
    
        teacher2.information("Nazrul Amin", "Male", 233455);
        teacher2.display();
    
    
    }
   
}
