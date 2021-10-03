
package OOP;


public class This
{
    String name;
    int id;
    String sub;
    
    This(String name,int id)
    {
        this.name = name;
        this.id = id;
    }
    
    This(String name,int id,String sub)
    {
        this(name,id);
        this.sub = sub;
    }
    
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Subject : "+sub);
    }
    
    public static void main(String[] args) {
        This ob = new This("seasun",101);
        ob.display();
        
        This ob2 = new This("Nazrul Amin",102,"CSE");
        ob2.display();
    }
}
