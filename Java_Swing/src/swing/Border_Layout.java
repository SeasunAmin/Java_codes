
package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Border_Layout extends JFrame
{
    private Container c;
    private JButton b1 ,b2 ,b3 ,b4, b5;
    private BorderLayout bl;
            
    Border_Layout ()
    {
        room();
    }   
    public void room()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("seasun");
        this.setBounds(200,150,600,500);
        
        c = this.getContentPane();
        bl = new BorderLayout();
        c.setLayout(bl);
        
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3= new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        
        c.add(b1,BorderLayout.NORTH);
        c.add(b2,BorderLayout.SOUTH);
          
        c.add(b3,BorderLayout.WEST);
        c.add(b4,BorderLayout.EAST);
        c.add(b5,BorderLayout.CENTER);
        
    }
        
    
    
    public static void main(String[] args) {
        
        Border_Layout frame = new Border_Layout();
        frame.setVisible(true);
    }
            
}
