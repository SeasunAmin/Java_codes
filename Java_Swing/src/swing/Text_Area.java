
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class Text_Area extends JFrame
{
    private Container c;
    private JTextArea ar;
    private Font f;
    
    Text_Area()
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
        ar.setBounds(100,70,300,270);
        
        ar.setLineWrap(true);
        ar.setWrapStyleWord(true);
                
        ar.setForeground(Color.DARK_GRAY);
        ar.setBackground(Color.cyan);
        
        f = new Font("Arial",Font.BOLD,18);
        ar.setFont(f);
        c.add(ar);
        
        
    }
    public static void main(String[] args) {
        
        Text_Area frame = new Text_Area();
        frame.setVisible(true);
        
        
        
        
        
    }
}
