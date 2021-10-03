
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Check_Box_Action extends JFrame 
{
    private Container c;
    private JCheckBox cb1,cb2,cb3;
    private Font f;
    private ButtonGroup grp;
    private JLabel label;
    
    Check_Box_Action()
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
        
        cb1 = new JCheckBox("seasun");
        cb1.setBounds(70,50,120,30);
        cb1.setBackground(Color.PINK);
        cb1.setFont(f);
        c.add(cb1);
        
        cb2 = new JCheckBox("arif");
        cb2.setBounds(70,100,100,30);
        cb2.setBackground(Color.PINK);
        cb2.setFont(f);
        c.add(cb2);
        
        cb3 = new JCheckBox("ocean");
        cb3.setBounds(70,150,100,30);
        cb3.setBackground(Color.PINK);
        cb3.setFont(f);
        c.add(cb3);
        
       grp.add(cb1);
       grp.add(cb2);
       grp.add(cb3);
       
       label = new JLabel("Secleact one from here.");
       label.setFont(f);
       label.setBounds(70,200,350,30);
       c.add(label);
       
       Handelar work = new Handelar(); 
       cb1.addActionListener(work);
       cb2.addActionListener(work);
       cb3.addActionListener(work);
       
    }
    
    class Handelar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        
            if(cb1.isSelected())  //e.getSource() == cb1
            {
                label.setText("Ok seasun got 10 Tk");
            }
            else if(cb2.isSelected())
            {
                label.setText("Ok arif got 10 Tk");
                
            }
            
            else
                label.setText("Ok Ocean got 10 Tk");
        }
        
        
        
    }
    
    public static void main(String[] args) {
        
        
        
        Check_Box_Action frame  = new Check_Box_Action();
        frame.setVisible(true);
    }
}
