
package OOP;


public class Methode_Overiding {
    String name;
    int id;
    
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
    }
    
   static public class Test extends Methode_Overiding
    {
        String  sub;
        
       void display()
       {
         System.out.println("Name : "+name);
         System.out.println("ID : "+id);  
         System.out.println("Subject : "+sub);
       }
            
    
    }

    public static void main(String[] args) {
        
        Test ob;
        ob = new Test();
        ob.name ="seasun";
        ob.id  = 1234;
        ob.sub = "CSE";
        
        ob.display();
        
        Methode_Overiding ob2  = new Methode_Overiding();
        ob2.name ="seasun amin";
        ob2.id  = 123400;
        ob2.display();
        
        
    }
}
