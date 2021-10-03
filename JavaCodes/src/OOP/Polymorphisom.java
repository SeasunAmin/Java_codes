
package OOP;

public class Polymorphisom
{
 void displayx()
 {
     System.out.println("Polymorphisom is calling...");
 }
 static public class Teachar extends Polymorphisom
 {
     @Override
     void displayx()
     {
         System.out.println("Baler Teacher is calling...");
     }
 }
 
static public class Student
 {
     void displayx()
     {
         System.out.println("Sunar Student is calling...");
     }
 }
 
    public static void main(String[] args) {
        
        Polymorphisom ob1 = new Polymorphisom();
        ob1.displayx();
        
        Teacher ob2 = new Teacher();
        ob2.display();
        
        Student ob3 = new Student();
        ob3.displayx();
        
        
        
        
        
    }
 
}
