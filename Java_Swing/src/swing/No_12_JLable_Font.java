
package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;



public class No_12_JLable_Font extends JFrame
{
   private Container c;
   private JLabel  userLabel,passlabel;
   private Font f;
    
    No_12_JLable_Font ()
    {
        initComponents();
    }
    public void initComponents()
    {
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);
        
        f = new Font("Cambria Math",Font.BOLD,20);
        
        userLabel = new JLabel();
        userLabel.setText("Eneter your username : ");
        userLabel.setBounds(50,20, 250, 50);
        userLabel.setFont(f);
        userLabel.setForeground(Color.RED);
        userLabel.setOpaque(true);
        userLabel.setBackground(Color.WHITE);
        userLabel.setToolTipText("Fuck make it quick");
        c.add(userLabel);
        
        passlabel = new JLabel("Enter your password : ");
        passlabel.setBounds(50, 90, 250, 50);
        passlabel.setFont(f);
        passlabel.setForeground(Color.RED);
        passlabel.setOpaque(true);
        passlabel.setBackground(Color.WHITE);
        
        c.add(passlabel);
        
      
    }
    public static void main(String[] args)
    {
      
      No_12_JLable_Font frame = new No_12_JLable_Font();
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(200, 50, 500, 400);
      frame.setTitle("Hello All.....");
        
        
        
    }
   
}
