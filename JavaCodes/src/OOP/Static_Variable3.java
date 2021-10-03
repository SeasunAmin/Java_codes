
package OOP;


public class Static_Variable3
{
  static int count = 0;

   Static_Variable3()
   {
       count++;
   }
  
   void display()
   {
       System.out.println("Total Student : "+count);
   }
           
           
    public static void main(String[] args)
    {
     Static_Variable3 s1 = new  Static_Variable3();
     s1.display();
     
     Static_Variable3 s2 = new  Static_Variable3();
     s2.display();
     
     Static_Variable3 s3 = new  Static_Variable3();
     s3.display();
        
    }
  
}
