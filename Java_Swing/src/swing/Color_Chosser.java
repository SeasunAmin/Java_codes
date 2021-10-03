
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class  Color_Chosser extends JFrame implements ActionListener
{
        private Container c;
        private JButton bt1 ,bt2;
        private Font f;
     Color_Chosser ()
    {
        room ();
    }
    public void room()
    {
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setBounds(200, 50, 500, 400);
       this.setTitle("SEASUN.....");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        
        
        f = new Font("Arial",Font.BOLD,18);
        
        
        bt1 = new JButton("Chosse Color");
        bt1.setBounds(170,120,170,50);
        bt1.setFont(f);
        bt1.setForeground(Color.BLACK);
        bt1.setBackground(Color.PINK);
        c.add(bt1);
        
        
       bt1.addActionListener(this);
        
    }
    
     @Override
    public void actionPerformed(ActionEvent ae)
    {
        Color color = JColorChooser.showDialog(null,"seclect a color", Color.yellow);
        c.setBackground(color);
    }
    
    public static void main(String[] args) {
      
        
      Color_Chosser frame = new  Color_Chosser();  
      frame.setVisible(true);
   
    }

   
}
