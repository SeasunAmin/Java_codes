
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Action_Listener_in_Button extends JFrame
{
        private Container c;
        private JButton bt1 ,bt2;
        private ImageIcon img1,img2;
        private JTextField tf1;
    
    Action_Listener_in_Button ()
    {
        room();
    }
    
    public void room()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
       
      
        img1 = new ImageIcon(getClass().getResource("clear.png"));
        
       tf1 = new  JTextField ();
       tf1.setBounds(50, 40, 250, 60);
       c.add(tf1);
          
        bt1 = new JButton(img1);
        bt1.setBounds(120,150,100,35);
        c.add(bt1);
        
        bt1.addActionListener(new ActionListener (){
       
       public void actionPerformed(ActionEvent e)
            {
                 tf1.setText("");
            }      
       
       });
    }
    
    
    
    public static void main(String[] args) {
        
      Action_Listener_in_Button frame = new Action_Listener_in_Button(); 
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(200, 50, 500, 400);
      frame.setTitle("SEASUN.....");
    }
   
}
