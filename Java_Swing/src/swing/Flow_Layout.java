
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Flow_Layout extends JFrame
{
    
    private Container c;
    private JButton btn[];
    private FlowLayout fl;
    
    Flow_Layout()
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
        
        fl  = new FlowLayout(FlowLayout.LEFT);
        fl.setHgap(20);
        fl.setVgap(20);
        
        c.setLayout(fl);
        
        btn = new JButton[9];
        for (int i = 0; i < 9; i++)
        {
            btn[i]  = new JButton(""+(i+1));
            c.add(btn[i]);
        }
        
        
    }
       
       
    
    public static void main(String[] args) 
    {
      Flow_Layout frame = new Flow_Layout();
      frame.setVisible(true);
        
    }
}
