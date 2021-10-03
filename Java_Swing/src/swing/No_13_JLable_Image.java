
package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class No_13_JLable_Image extends JFrame
{
   private Container c;
   private JLabel imglabel;
   private ImageIcon img;
    
    No_13_JLable_Image()
   {
       baseroom();
   }
   
    public void baseroom()
   {
       c= this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.LIGHT_GRAY);
       
       img = new ImageIcon(getClass().getResource("car.png"));
       
       imglabel = new JLabel(img);
       imglabel.setBounds(70,60,img.getIconWidth(),img.getIconHeight());
       c.add(imglabel);
   }
    
    
   public static void main(String[] args)
    {
          No_13_JLable_Image frame =  new No_13_JLable_Image();
          frame.setVisible(true);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setBounds(300, 150, 500, 400);
          frame.setTitle("Hello All.....");
    }
}
