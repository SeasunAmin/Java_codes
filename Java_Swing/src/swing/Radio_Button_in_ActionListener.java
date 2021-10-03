
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class  Radio_Button_in_ActionListener extends JFrame 
{
    private Container c;
    private JRadioButton male,female;
    private ButtonGroup gr;
    private Font f;
    private JTextArea ta;
    
    
  Radio_Button_in_ActionListener()
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
        //male.setSelected(true);
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
       
        ta = new JTextArea();
        ta.setBounds(100,140,250,200);
        ta.setFont(f);
        ta.setBackground(Color.yellow);
        c.add(ta);
        
     Output show = new  Output();  
      male.addActionListener(show);
      female.addActionListener(show);
        
    }
    
    class  Output implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            if(ae.getSource()==male)
            {
              // ta.setText("  Hello yeang man..!");
                 ta.append("  Hello yeang man..!\n");
            }
            else
                
            {
               // ta.setText("  Hello yeang leady..!");
                ta.append("  Hello yeang leady..!\n");
            }
        }
        
    }
    
        
    public static void main(String[] args) {
        
        Radio_Button_in_ActionListener frame = new  Radio_Button_in_ActionListener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(350,100,500,450);
        frame.setTitle("seasun......");
        
        
    }
}
