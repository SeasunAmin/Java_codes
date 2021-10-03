
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class New_Frame extends JFrame
{
    private Container c;
    private JLabel label,imglabel;
    private Font f;
    private ImageIcon img;
    
     New_Frame ()
     {
         
         this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         this.setBounds(600, 90, 700, 600);
         this.setTitle("New Frame...");
         
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.PINK);
         
       label = new JLabel("  Hello dear I was waiting for you thusan's of year");
       label.setBounds(120,350,450,70);
       label.setForeground(Color.RED);
       label.setOpaque(true);
       label.setBackground(Color.BLACK);
       f = new Font("Arial",Font.BOLD,18);
       label.setFont(f);
      
       c.add(label);
       
       img = new ImageIcon(getClass().getResource("test.jpg"));
       
       imglabel = new JLabel(img);
       imglabel.setBounds(200,60,img.getIconWidth(),img.getIconHeight());
       c.add(imglabel);
         
     }
    
    
    public static void main(String[] args) {
       
        
        New_Frame fr = new New_Frame();
        fr.setVisible(true);
    }
}
