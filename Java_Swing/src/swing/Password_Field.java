
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Password_Field extends JFrame 
{
    private Container c;
    private JPasswordField pas;
    private JTextField t;
    private Font f;
    
    Password_Field ()
    {
        room();
    }
    
    public void room()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
       f = new Font("Cambria Math",Font.BOLD,25);
        
       pas = new JPasswordField();
       pas.setBounds(50, 40, 250, 60);
       pas.setEchoChar('*');
       pas.setFont(f);
       pas.setForeground(Color.BLACK);
       pas.setBackground(Color.PINK);
       pas.setHorizontalAlignment(JPasswordField.CENTER);
       c.add(pas);
      
      
        
       
    }
    
    public static void main(String[] args)
    {
     Password_Field frame = new Password_Field();
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setBounds(50, 40, 600, 550);
        
        
    }
}
