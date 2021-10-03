
            // Introduction to  Mrthod
package OOP;
public class Teacher
{
    String n,ge;
    int ph;
    
        // Paramiterize methode
    
    void information(String x,String y,int z)
    {
        n = x;
        ge = y;
        ph = z;
        
    }
    
    void display()
    {
        System.out.println("Name : "+n);
        System.out.println("Gender : "+ge);
        System.out.println("Phn : "+ph);
    }
}
