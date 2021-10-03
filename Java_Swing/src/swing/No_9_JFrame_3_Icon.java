
package swing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class No_9_JFrame_3_Icon extends JFrame
{
  private ImageIcon  icon;
    
   No_9_JFrame_3_Icon()
  {
      initComponents();
  }
  
  public void initComponents()
  {
      icon = new ImageIcon(getClass().getResource("image.png"));
      this.setIconImage(icon.getImage());
  }
    
  
  public static void main(String[] args)
    {
     No_9_JFrame_3_Icon frame = new No_9_JFrame_3_Icon();
      
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(200, 50, 500, 400);
      frame.setTitle("Hello All.....");
      
      
      
      
      
      
      
      
    }
   
}
