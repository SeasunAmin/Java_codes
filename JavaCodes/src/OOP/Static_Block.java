
package OOP;

public class Static_Block
{
    static int id ;
    static String name;
    
    static
    {
        id = 101;
        name = "Seasun";
    }
    
   static void display()
    {
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
    }
     
    public static void main(String[] args)
    {
     Static_Block.display();
    }
    
}
