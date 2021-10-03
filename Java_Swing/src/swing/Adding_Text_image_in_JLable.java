
package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Adding_Text_image_in_JLable extends JFrame
{
   private Container c;
   private JLabel label;
   private ImageIcon image; 
   Adding_Text_image_in_JLable ()
   {
       room();
   }
   public void room()
   {
       c = this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.LIGHT_GRAY);
       
       image =  new ImageIcon(getClass().getResource("car.png"));
       
       label = new JLabel("This is my way...!!",image,JLabel.LEFT);
       label.setBounds(90, 50, 400, 70); 
       c.add(label);
   }
   
    public static void main(String[] args) {
        
      Adding_Text_image_in_JLable frame = new Adding_Text_image_in_JLable();
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(200, 50, 500, 400);
      frame.setTitle("What's up bro.....");
    }

}
   
