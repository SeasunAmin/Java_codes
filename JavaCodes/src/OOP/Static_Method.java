
package OOP;

public class Static_Method
{
    void display1()
    {
        System.out.println("I am non static method.");
    }
       
    static void display2()
    {
        System.out.println("I am static method");
    }
    
    public static void main(String[] args) 
    {
     
        Static_Method ob1 = new Static_Method();
        ob1.display1();
        
        Static_Method.display2();
        
    }
    
}
