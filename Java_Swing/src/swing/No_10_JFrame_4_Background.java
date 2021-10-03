
package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class No_10_JFrame_4_Background extends JFrame
{
  private ImageIcon  icon;
  private Container c;
    
   No_10_JFrame_4_Background()
  {
      initComponents();
  }
  
  public void initComponents()
  {
      c = this.getContentPane();
      c.setBackground(Color.CYAN);
      
      icon = new ImageIcon(getClass().getResource("image.png"));
      this.setIconImage(icon.getImage());
  }
    
  
  public static void main(String[] args)
    {
      No_10_JFrame_4_Background frame = new No_10_JFrame_4_Background();
      
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(200, 50, 500, 400);
      frame.setTitle("Hello All.....");
      
      
      
      
      
      
      
      
    }
   
}
