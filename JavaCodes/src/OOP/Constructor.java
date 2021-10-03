
package OOP;

public class Constructor 
{
    String name;
    String gender;
    int age;
    
    Constructor(String n,String g, int a)
    {
        name = n;
        gender = g;
        age =a;
    }
    
     Constructor()
     {
         System.out.println("No value..!");
     }
    void display()
    {
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Age = "+age);
        System.out.println("\n\n");
    }
}
