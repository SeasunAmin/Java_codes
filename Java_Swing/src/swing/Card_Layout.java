
package swing;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Card_Layout extends JFrame implements ActionListener
{
    
    private Container c;
    private JButton b1,b2,b3;
    private CardLayout cl;
    
    Card_Layout()
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
        
        cl  = new CardLayout();
        
        c.setLayout(cl);
        
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        
        c.add(b1,"First");
        c.add(b2,"Second");
        c.add(b3,"Thirde");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
    }
       
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
       cl.next(c);
      // cl.previous(c);
    }   
    
    public static void main(String[] args) 
    {
      Card_Layout frame = new Card_Layout();
      frame.setVisible(true);
        
    }

    
}
