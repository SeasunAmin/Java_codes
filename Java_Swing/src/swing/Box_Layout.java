
package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Box_Layout extends JFrame
{
    
    private Container c;
    private JButton btn[];
    private BoxLayout bx;
    
    Box_Layout()
    {
     room();   
    }
    
    public void room()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,150,500,400);
        this.setTitle("seasun");
        
        c = this.getContentPane();
        c.setBackground(Color.PINK);
        
        bx  = new BoxLayout(c,BoxLayout.X_AXIS);
        
        c.setLayout(bx);
        
        btn = new JButton[9];
        for (int i = 0; i < 9; i++)
        {
            btn[i]  = new JButton(""+(i+1));
            c.add(btn[i]);
            c.add(Box.createHorizontalStrut(10));
        }
        
        
    }
       
       
    
    public static void main(String[] args) 
    {
      Box_Layout frame = new Box_Layout();
      frame.setVisible(true);
        
    }
}
