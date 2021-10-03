
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;


import javax.swing.JOptionPane;

public class Action_Listener_2 extends JFrame
{
    private Container c;
    private JTextField tf1,tf2;
    private Font f;
    
    Action_Listener_2()
    {
        room();
    }
    
    public void room()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
       f = new Font ("Arial",Font.BOLD,20);
        
       tf1 = new  JTextField ();
       tf1.setBounds(50, 40, 250, 60);
       tf1.setFont(f);
       tf1.setForeground(Color.BLACK);
       tf1.setBackground(Color.PINK);
       tf1.setHorizontalAlignment(JTextField.CENTER);
       c.add(tf1);
        
       tf2 = new  JTextField ();
       tf2.setBounds(50, 115, 250, 60);
       tf2.setFont(f);
       tf2.setForeground(Color.BLACK);
       tf2.setBackground(Color.PINK);
       c.add(tf2);
       
       Seasun sea = new Seasun();
       tf1.addActionListener(sea);
       tf2.addActionListener(sea);
       
    }
    
    class Seasun implements ActionListener
    {
         public void actionPerformed(ActionEvent e)
            {
                 if(e.getSource()==tf1)
                 {
                     String s = tf1.getText();
                     if(s.isEmpty())
                 {
                    JOptionPane.showMessageDialog(null,"You did not enter nothing...!!!"); 
                 }
                 else
                 JOptionPane.showMessageDialog(null,"hello "+s);
                 }
                 
                 else
                 {
                     String s = tf2.getText();
                     if(s.isEmpty())
                 {
                    JOptionPane.showMessageDialog(null,"You did not enter nothing...!!!"); 
                 }
                 else
                 JOptionPane.showMessageDialog(null,"hello "+s);
                 }
                 
                 
                 
            }      
       
         
    }   
    
    public static void main(String[] args)
    {
     
     Action_Listener_2 frame = new Action_Listener_2();
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setBounds(50, 40, 600, 550);
        
        
    }
  
}
