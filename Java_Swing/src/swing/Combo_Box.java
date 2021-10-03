
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class Combo_Box extends JFrame 
{
    private Container c;
    private JComboBox cb;
    private Font f;
    private ButtonGroup grp;
    private String[] language = {"C","C++","Java","Python","PHP"};
            
    Combo_Box()
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
       // cb.setEditable(true);
        cb.setBounds(70,50,150,50);
        
        cb.setSelectedItem("Java");
       // cb.setBackground(Color.WHITE);
       cb.addItem("C#");
       cb.addItem("BASIC");
       //cb.removeItem("BASIC");
       cb.removeItemAt(4);
       
       
       c.add(cb);
        
        System.out.println("Total aytem is :  "+cb.getItemCount());
        
        
        
        
    }
    
    public static void main(String[] args) {
        
        
        
        Combo_Box frame  = new Combo_Box();
        frame.setVisible(true);
    }
}
