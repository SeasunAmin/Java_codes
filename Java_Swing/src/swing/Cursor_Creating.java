
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Cursor_Creating extends JFrame
{
        private Container c;
        private JButton bt1 ,bt2;
        private Font f;
        private Cursor cur;
        
   Cursor_Creating ()
    {
        room ();
    }
    public void room()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        f = new Font("Arial",Font.BOLD,18);
        cur = new Cursor(Cursor.HAND_CURSOR);
        
        bt1 = new JButton("Submit");
        bt1.setBounds(100,50,100,50);
        bt1.setFont(f);
        bt1.setCursor(cur);
        bt1.setForeground(Color.BLACK);
        bt1.setBackground(Color.PINK);
        c.add(bt1);
        
        
        bt2 = new JButton("Enter");
        bt2.setBounds(210,50,100,50);
        bt2.setFont(f);
        bt2.setForeground(Color.BLACK);
        bt2.setBackground(Color.RED);
        c.add(bt2);
        
    }
    
    public static void main(String[] args) {
      
        
      Cursor_Creating frame = new Cursor_Creating();  
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(200, 50, 500, 400);
      frame.setTitle("SEASUN.....");
    }
}
