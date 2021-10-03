 
package OOP;


public class Final_key
{
    final String Name = "NUB";
    String sub = "CSE";
    
    void display()
    {
        System.out.println("Univarsity Name : "+Name);
        System.out.println("Subject : "+sub);
        
    }
    public static void main(String[] args) {
        Final_key ob = new Final_key();
        ob.display();
    }
}
