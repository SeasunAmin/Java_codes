
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Focus_Listener extends JFrame
{
    private Container c;
    private JTextArea ta;
    private JButton bt;
    
    Focus_Listener()
    {
        room();
    }
    
    public void room()
    {
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setBounds(240,200,600,500);
       this.setTitle("seasun...");
       
       c = this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.PINK);
       
        bt = new JButton("Click");
        bt.setBounds(90,80,90,50);
        c.add(bt);
        
        ta = new JTextArea();
        ta.setBounds(200,70,170,90);
        c.add(ta);
        
        bt.addFocusListener(new FocusListener(){
           @Override
           public void focusGained(FocusEvent fe)
           {
               ta.setText("Focus Gained");
           }

           @Override
           public void focusLost(FocusEvent fe) 
           {
               ta.setText("Focus Lost");
               
               
           }
        
        
        });
       
       
       
    
    }
    
    
    public static void main(String[] args)
    {
      Focus_Listener frame = new Focus_Listener();
      frame.setVisible(true);
        
    }
 
}
