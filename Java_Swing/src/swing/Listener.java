
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Listener extends JFrame implements ActionListener 
{
    private Container c;
    private Font f;
    private JButton bt1,bt2,bt3;
    
    Listener ()
    {
        room();
    }
    
    public void room()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,90,600,500);
        this.setTitle("seasun.........");
        
        c = this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        
        f = new Font("Cambria Math", Font.BOLD, 20);
        
        bt1 = new JButton("RED");
        bt2 = new JButton("GREEN");
        bt3 = new JButton("BLUE");
        
        bt1.setBounds(100,70,120,50);
        bt1.setFont(f);
        c.add(bt1);
        
        bt2.setBounds(100,140,120,50);
        bt2.setFont(f);
        c.add(bt2);
        
        bt3.setBounds(100,210,120,50);
        bt3.setFont(f);
        c.add(bt3);
                
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        
        
        
    }
    
     @Override
    public void actionPerformed(ActionEvent e) 
       {
         if(e.getSource()==bt1)
         {
             c.setBackground(Color.RED);
         }
         
         else if(e.getSource()==bt2)
         {
             c.setBackground(Color.GREEN);
         }
         else 
         {
             c.setBackground(Color.BLUE);
         }
       }

    
    public static void main(String[] args) {
        
        Listener frame = new Listener();
        frame.setVisible(true);
        
    }

}
