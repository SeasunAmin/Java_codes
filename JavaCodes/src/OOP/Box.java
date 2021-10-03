
package OOP;

public class Box
{
   double hight,width,depth;
   
   Box(double h,double w,double d)
   {
       hight = h;
       width = w;
       depth = d;
       
   }
    
  void displayVol()
  {
      double vol = hight*width*depth;
      System.out.println("Volume is : "+vol); 
     
  }
  
    public static void main(String[] args)
    {
     Box box1 = new Box(10,10,10);
     box1.displayVol();
     
     Box box2 = new Box(20,10,30);
     box2.displayVol();
    }
}
