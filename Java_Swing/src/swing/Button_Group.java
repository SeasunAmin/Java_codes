
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class  Button_Group extends JFrame 
{
    private Container c;
    private JRadioButton male,female;
    private ButtonGroup gr;
    private Font f;
    
    
   Button_Group()
    {
        room();
    }
    
    public void room ()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
         
        gr = new ButtonGroup();
        f = new Font("Cambria Math", Font.BOLD, 25);
        
        male = new JRadioButton("Male");
        male.setBounds(100,70,90,40);
        male.setBackground(Color.PINK);
        male.setSelected(true);
        male.setFont(f);
        c.add(male);
        
        female = new JRadioButton("Femal");
        female.setBounds(210,70,120,40);
        female.setBackground(Color.PINK);
        
        //female.setEnabled(false);
        
        female.setFont(f);
        c.add(female);
        
        
        gr.add(female);
        gr.add(male);
    }
    
    public static void main(String[] args) {
        
        Button_Group frame = new  Button_Group();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(350,100,500,450);
        frame.setTitle("seasun......");
        
        
    }
}
