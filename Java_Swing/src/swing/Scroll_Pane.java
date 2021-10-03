
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Scroll_Pane extends JFrame
{
    private Container c;
    private JTextArea ar;
    private Font f;
    private JScrollPane scroll;
    
    Scroll_Pane ()
    {
         room();
    }
    
    public void room()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450,250,600,500);
        this.setTitle("seasun");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        ar = new JTextArea();
        
        
        ar.setLineWrap(true);
        ar.setWrapStyleWord(true);
                
        ar.setForeground(Color.DARK_GRAY);
        ar.setBackground(Color.cyan);
        
        f = new Font("Arial",Font.BOLD,18);
        ar.setFont(f);
       
        
        scroll = new JScrollPane(ar,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(100,70,300,270);
         c.add(scroll);
        
    }
    public static void main(String[] args) {
        
        Scroll_Pane  frame = new Scroll_Pane ();
        frame.setVisible(true);
        
        
        
        
        
    }
}
