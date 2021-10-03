
package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class Raido_Button extends JFrame 
{
    private Container c;
    private JRadioButton male,female;
    
    
    Raido_Button()
    {
        room();
    }
    
    public void room ()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        male = new JRadioButton("Male");
        male.setBounds(100,70,90,40);
        male.setBackground(Color.PINK);
        c.add(male);
        
        female = new JRadioButton("Femal");
        female.setBounds(210,70,90,40);
        female.setBackground(Color.PINK);
        c.add(female);
        
    }
    
    public static void main(String[] args) {
        
        Raido_Button frame = new Raido_Button();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(350,100,500,450);
        frame.setTitle("seasun......");
        
        
    }
}
