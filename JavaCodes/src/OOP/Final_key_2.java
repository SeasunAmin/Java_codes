
package OOP;


public class Final_key_2
        
{
    final void display()
    {
        System.out.println("NUB information");
    }
  static public class Student
        {
            
            void display2()
            {
                System.out.println("Student information");
            }
        }
    public static void main(String[] args) {
        
        
        Final_key_2 ob1 = new Final_key_2();
                ob1.display();
        
        Student ob2 = new Student();
        ob2.display2();
    }
  
}
