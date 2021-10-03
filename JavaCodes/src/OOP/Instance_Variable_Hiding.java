
package OOP;

public class Instance_Variable_Hiding
{
   double hight,width,depth;
   
  Instance_Variable_Hiding(double h,double w,double d)
   {
        this.hight = hight;
       this.width = width;
      this.depth = depth;
       
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
