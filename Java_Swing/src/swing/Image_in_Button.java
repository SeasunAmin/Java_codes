
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Image_in_Button extends JFrame
{
        private Container c;
        private JButton bt1 ,bt2;
        private Font f;
        private Cursor cur;
        private ImageIcon img1,img2;
   Image_in_Button  ()
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
        
        img1 = new ImageIcon(getClass().getResource("a1.jpg"));
        img2 = new ImageIcon(getClass().getResource("clear.png"));
          
        bt1 = new JButton(img1);
        bt1.setFont(f);
        bt1.setCursor(cur);
        bt1.setBounds(100,50,100,35);
        c.add(bt1);
        
        
        bt2 = new JButton(img2);
        bt2.setBounds(250,50,100,50);
        bt2.setFont(f);
        
        c.add(bt2);
        
    }
    
    public static void main(String[] args) {
      
        
      Image_in_Button  frame = new Image_in_Button ();  
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(200, 50, 500, 400);
      frame.setTitle("SEASUN.....");
    }
}
