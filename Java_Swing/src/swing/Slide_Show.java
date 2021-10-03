
package swing;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Slide_Show extends JFrame implements ActionListener
{
    private Container c;
    private JButton b1,b2;
    private JPanel panel;
    private ImageIcon img;
    private JLabel label;
    private CardLayout cl;
    
    Slide_Show()
    {
        room();
        showImage();
    }
    
    
    public void showImage()
    {
        String[] imageNames = {"1.png","2.png","3.png","4.png","4.png","6.png"};
        for(String n : imageNames)
        {
            img = new ImageIcon("src/image/"+n);
            
            //resizing
            Image re = img.getImage();
            Image newImage = re.getScaledInstance(panel.getWidth(),panel.getHeight(),Image.SCALE_SMOOTH);
            
            img  = new ImageIcon(newImage);
            label = new JLabel(img);
            panel.add(label);
        }
        
    }
    
    private void room()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,150,700,650);
        this.setTitle("seasun");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        cl = new CardLayout();  
        
        panel = new JPanel(cl  );
        panel.setBounds(65 ,30,550,450);
      
        c.add(panel);
        
        b1 = new JButton("Next");
        b1.setBounds(510,500,90,70);
        c.add(b1);
        
        b2 = new JButton("Previous");
        b2.setBounds(70,500,90,70);
        c.add(b2);
     
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    
    {
      if(ae.getSource()==b1)
      {
          cl.next(panel);
      }
      if(ae.getSource()==b2)
      {
          cl.previous(panel);
      }
        
    }
    
    public static void main(String[] args) 
    {
        Slide_Show frame = new Slide_Show();
        frame.setVisible(true);
    }

    
   
}
