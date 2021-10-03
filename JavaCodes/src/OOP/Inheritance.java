
package OOP;

public class Inheritance {
 
    String name;
    int age ;
    
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        
    }
    
    public class Teacher extends Inheritance
    {
        String sub;
        void display2()
        {
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
            System.out.println("Subject : "+sub);
        }
    }

    
    public static void main(String[] args) {
        
        
    }
}
