
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Combo_Box_Action extends JFrame 
{
    private Container c;
    private JComboBox cb,cb2;
    private Font f;
    private ButtonGroup grp;
    private String[] language = {"C","C++","Java","Python","PHP"};
    private JLabel label,label2;
    private JButton btn;
            
    Combo_Box_Action()
    {
        room();
    }
    
    public void room()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300,150,600,500);
        this.setTitle("seasun's  Combo  box....");
         
       
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
       
        f = new Font ("Cambria Math", Font.BOLD, 22);
        grp = new ButtonGroup(); 
        
        cb = new JComboBox (language);
        cb.setFont(f);
       
        cb.setBounds(120,120,150,50);
        cb.addItem("C#");
        cb.addItem("BASIC");
        c.add(cb);
        
        label  = new JLabel();
        
        
        label.setBounds(320,120,200,50);
        label.setFont(f);
        c.add(label);
        
        
         cb.addActionListener(new ActionListener (){
       
        public void actionPerformed(ActionEvent e)
            {
                 String s = cb.getSelectedItem().toString();
                 label.setText("You selected : "+s);
            }      
       
       });
         
       
         
        cb2 = new JComboBox(language);
        cb2.setBounds(120,220,150,50);
        cb2.setFont(f);
        c.add(cb2);
        
        btn = new JButton("Show");
        btn.setBounds(120,300,80,60);
        c.add(btn);
        
        label2 = new JLabel();
        label2.setBounds(320,220,300,50);
        label2.setFont(f);
        c.add(label2);
        
        btn.addActionListener(new ActionListener (){
       
        public void actionPerformed(ActionEvent e)
            {
                 String s1 = cb2.getSelectedItem().toString();
                 label2.setText("You selected : "+s1);
            }      
       
       });
         
        
        
    }
    
    public static void main(String[] args) {
        
        
        
        Combo_Box_Action frame  = new Combo_Box_Action();
        frame.setVisible(true);
    }
}
