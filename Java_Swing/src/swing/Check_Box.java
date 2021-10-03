
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class Check_Box extends JFrame 
{
    private Container c;
    private JCheckBox cb1,cb2,cb3;
    private Font f;
    private ButtonGroup grp;
    
    Check_Box()
    {
        room();
    }
    
    public void room()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300,150,600,500);
        this.setTitle("seasun's  check  box....");
         
       
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
       
        f = new Font ("Cambria Math", Font.BOLD, 25);
        grp = new ButtonGroup(); 
        
        cb1 = new JCheckBox("seasun",true);
       // cb1.setBounds(70,50,120,30);
        cb1.setBackground(Color.PINK);
        cb1.setFont(f);
        c.add(cb1);
        
        cb2 = new JCheckBox("arif");
        cb2.setBounds(190,50,100,30);
        cb2.setBackground(Color.PINK);
        cb2.setFont(f);
        c.add(cb2);
        
        cb3 = new JCheckBox("ocean");
        cb3.setBounds(290,50,100,30);
        cb3.setBackground(Color.PINK);
        cb3.setFont(f);
        c.add(cb3);
        
       grp.add(cb1);
       grp.add(cb2);
       grp.add(cb3);
    }
    
    public static void main(String[] args) {
        
        
        
        Check_Box frame  = new Check_Box();
        frame.setVisible(true);
    }
}
