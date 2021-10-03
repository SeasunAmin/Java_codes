
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Grid_Layout extends JFrame
{
    
    private Container c;
    private JButton btn[];
    private GridLayout gl;
    
    Grid_Layout()
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
        
        gl  = new GridLayout(3,3);
        
        c.setLayout(gl);
        
        btn = new JButton[9];
        for (int i = 0; i < 9; i++)
        {
            btn[i]  = new JButton(""+(i+1));
            c.add(btn[i]);
           
        }
        
        
    }
       
       
    
    public static void main(String[] args) 
    {
      Grid_Layout frame = new Grid_Layout();
      frame.setVisible(true);
        
    }
}
