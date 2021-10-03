
package swing;

import javax.swing.JFrame;

public class No_7_JFrame_1
{
    public static void main(String[] args)
    {
         JFrame frame = new JFrame();
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         frame.setSize(500, 400);
       
         //frame.setLocationRelativeTo(null);  //cinter
         
         //frame.setLocation(200,50);  // from left sit 200pxl and upper sit 50pxl
         
         frame.setBounds(200,50,500,400); // setSize + setLocation
        
         frame.setTitle("This is my world.");
         frame.setResizable(false); //Frame will not be resizeable any more.
         
    }
   
}
