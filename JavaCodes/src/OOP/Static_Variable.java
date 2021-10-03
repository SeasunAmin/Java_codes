
package OOP;

public class Static_Variable 
{
    String name;
    int id;
    static String uvname = "NUB";
    
    Static_Variable(String n,int i)
    {
        name = n;
        id = i;
        
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Univarsity : "+uvname);
        System.out.println("\n");
    }
     
    public static void main(String[] args)
    {
     Static_Variable sv1 = new Static_Variable("Nazrul Amin",101);
     sv1.display();
     
     Static_Variable sv2 = new Static_Variable("Seasun",102);
     sv2.display();
        
    }
    
}
