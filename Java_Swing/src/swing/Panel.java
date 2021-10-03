
package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JFrame
{
    private Container c;
    private JPanel panel1,panel2;
    private JButton b1,b2;
    private JLabel label;
    
    
     Panel()
    {
        room();
    }
    public void room()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,150,750,650);
        this.setTitle("seasun");
        
        c = this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        
        label = new JLabel("Hello all");
        label.setBounds(220,20,100,60);
        c.add(label);
        
        b1 = new JButton(" B1 ");
        b1.setBounds(130,130,90,50);
        c.add(b1);
        
       b2 = new JButton("B2");
       b2.setBounds(450,130,90,50);
       c.add(b2);
        
        panel1 = new JPanel();
        panel1.setBounds(100,100,250,150);
        panel1.setBackground(Color.RED);
        c.add(panel1);
        
        panel2 = new JPanel();
        panel2.setBounds(400,100,250,150);
        panel2.setBackground(Color.GREEN);
        c.add(panel2);
        
        
       
        
        
    }
    
    public static void main(String[] args)
    {
        
       Panel frame = new Panel();   
       frame.setVisible(true);
        
    }
  
}
