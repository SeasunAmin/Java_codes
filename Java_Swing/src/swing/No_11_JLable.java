
package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class No_11_JLable extends JFrame
{
   private Container c;
   private JLabel  userLabel,passlabel;
    
    No_11_JLable ()
    {
        initComponents();
    }
    public void initComponents()
    {
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        userLabel = new JLabel();
        userLabel.setText("Eneter your name : ");
        userLabel.setBounds(50,20, 150, 50);
        c.add(userLabel);
        
        passlabel = new JLabel("Enter your password : ");
        passlabel.setBounds(50, 60, 150, 50);
        c.add(passlabel);
        
      
    }
    public static void main(String[] args)
    {
      
      No_11_JLable frame = new No_11_JLable();
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(200, 50, 500, 400);
      frame.setTitle("Hello All.....");
        
        
        
    }
   
}
