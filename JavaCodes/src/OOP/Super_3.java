
package OOP;


public class Super_3 
{
   String color;
   double wight;
   
   Super_3(String c, double w)
   {
       color = c;
       wight = w;
   }
   
   void display()
   {
       System.out.println("Color : "+color);
       System.out.println("Wight : " +wight);
   }
   static public class Super_3_Test extends Super_3
   {
       int gear;
       
       Super_3_Test(String c, double w, int g)
       {
           super(c,w);
           gear = g;
       }
    
        void display()
        {
            super.display();
            System.out.println("Gear : "+gear);
        }

   }
    public static void main(String[] args) {
        
        Super_3_Test ob = new Super_3_Test("Black",350,5);
        ob.display();
        
    }
  
}
