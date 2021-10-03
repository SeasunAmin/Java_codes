
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Table extends JFrame  
{
    private Container c;
    private JLabel label;
    private Font f;
    private JTable table;
    private JScrollPane s;
    
    private String[] col = {"ID","Name","GPA"};
    private String[][] row = {
    
         {"200101","Nazrul Amin","3.67"},
          
         {"200102","Nazru","3.67"},
         {"200103"," Amin","3.6"},
         {"200104","Abul","3.7"},
         {"200105","Korim","3.07"},
              
        
        
       };
    Table()
    {
        room();
    }
    
    public void room()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,150,900,700);
        this.setTitle("seasun");
        
        c = this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        
        f = new Font("Cambria Math",Font.BOLD,22);
        
        label = new JLabel("Student Detail's");
        label.setBounds(350,50,200,50);
        label.setFont(f);
        c.add(label);
        
        table = new JTable(row,col);
        table.setSelectionBackground(Color.LIGHT_GRAY);
        //table.setEnabled(false);
        
        s = new JScrollPane(table);
        s.setBounds(90,150,700,200);
        c.add(s);
       
        
       
    }
    
  
    
    public static void main(String[] args) 
    {
      Table frame = new Table();
      frame.setVisible(true);
      
        
        
    }

   
    
}
