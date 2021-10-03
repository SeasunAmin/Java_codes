
package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class Tabbed_Pane extends JFrame
{
    private Container c;
    private JTabbedPane tb;
    private JPanel panel1,panel2,panel3;
    private JLabel label1,label2,label3;
    private ImageIcon img1,img2;
    
    Tabbed_Pane()
    {
        room();
    }
    
    public void room()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(250,200,700,600);
        this.setTitle("seasun");
        
        c = this.getContentPane();
        c.setLayout(null);
        
        tb = new JTabbedPane();
        tb.setBounds(150,110,400,300);
      
        c.add(tb);
        
        img1 = new ImageIcon("src/image/7.png");
       
        label1 = new JLabel("This is label 1");
        label2 = new JLabel("This is label 2");
        label3 = new JLabel("This is label 3");
        
        panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.add(label1);
   
        panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.add(label2);
        panel3 = new JPanel();
        panel3.setBackground(Color.BLUE);
        panel3.add(label3);
    
        tb.addTab("Home", panel1);
        tb.addTab("Help", panel2);
        tb.addTab("Settings",img1, panel3,"hello welcom to setting");
        
    }
    
    
    public static void main(String[] args) 
    {
       Tabbed_Pane frame = new Tabbed_Pane();
       frame.setVisible(true);
       
       
       
    }
}
