
package OOP;


public class Overlode

{
    void display (int a ,int b)
    {
        System.out.println("Resutl "+(a+b));
    }
     
     void display (double a ,double b)
    {
        System.out.println("Resutl "+(a+b));
    }
     
      void display (int a ,int b,int c)
    {
        System.out.println("Resutl "+(a+b+c));
    }
       void display ()
    {
        System.out.println("Nothing ");
    }
    
    public static void main(String[] args) {
        
        Overlode ob = new Overlode();
        ob.display(10,20);
        ob.display(12.45,34.67);
        ob.display(10,30,56);
        ob.display();
    }
}
