
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class Toggle_Button extends JFrame  implements ActionListener
{
    private Container c;
    private JToggleButton tb;
    private JLabel label;
    
    Toggle_Button()
    {
        room();
    }
    
    public void room()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,150,700,600);
        this.setTitle("seasun");
        
        c = this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        
        tb = new JToggleButton("OFF");
        tb.setBounds(100,100,90,70); 
        c.add(tb);
        
        label = new JLabel("Hello..");
        label.setVisible(false);
        label.setBounds(130,170,190,50);
        c.add(label);
        
        tb.addActionListener(this);
        
    }
    
     @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(tb.isSelected())
        {
            tb.setText("ON");
            label.setVisible(true);
        }
      
        else
        {
            tb.setText("OFF");
            label.setVisible(false);
        }
    
    }
    
    public static void main(String[] args) 
    {
      Toggle_Button frame = new Toggle_Button();
      frame.setVisible(true);
      
        
        
    }

   
    
}
