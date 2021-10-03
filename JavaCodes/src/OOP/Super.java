
package OOP;


public class Super
{
  int x = 100;  
  void show()
  {
      System.out.println("Inside the super class");
  }
  
  static public class SuperTest extends Super
          {
              int x = 50;
            void  display()
              {
                 // System.out.println(+x);  
                  System.out.println(super.x);
                  
              }
            void show()
            {
                super.show();
                System.out.println("Inside the SuperTest Class");
            }
          }
    public static void main(String[] args) {
        
       SuperTest ob = new SuperTest(); 
       ob.display();
       ob.show();
    }
}
