
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Logain_Frame extends JFrame
{
   private Container c;
   private JLabel user1,user2,imglabel;
   private JTextField tf;
   private JPasswordField pass;
   private JButton b1,b2;
   private Font f;
   private ImageIcon img;
    
    Logain_Frame ()
    {
       
       
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setBounds(500, 180, 600, 550);
       this.setTitle("seasun...");
       
       c = this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.PINK);
       
       f = new Font("Arial",Font.BOLD,18);
       
       user1 = new JLabel("USER NAME : ");
       user1.setBounds(50,200,200,50);
       user1.setFont(f);
       
       tf = new JTextField();
       tf.setBounds(190,200,230,60);
       tf.setHorizontalAlignment(JPasswordField.CENTER);
       tf.setFont(f);
       c.add(tf);
       c.add(user1);
       
       user2 = new JLabel("PASSWORD : ");
       user2.setBounds(50,300,200,50);
       user2.setFont(f);
       c.add(user2);
       
       pass = new JPasswordField();
       pass.setBounds(190,300,230,60);
       pass.setHorizontalAlignment(JPasswordField.CENTER);
       pass.setFont(f);
       c.add(pass);
       
       b1 = new JButton("Logain");
       b1.setBounds(190,400,100,50);
       b1.setFont(f);
       c.add(b1);
       
       b2 = new JButton("Clear");
       b2.setBounds(320,400,100,50);
       b2.setFont(f);
       c.add(b2);
       
       img = new ImageIcon(getClass().getResource("car.png"));
       
       imglabel = new JLabel(img);
       imglabel.setBounds(170,10,img.getIconWidth(),img.getIconHeight());
       c.add(imglabel);
       
       b1.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent e)
            {
                String name = tf.getText();
                String password = pass.getText();
                
                if(name.equals("seasun") && password.equals("12345"))
                {
                    JOptionPane.showMessageDialog(null,"You are successfully login");
                   // dispose();
                    New_Frame fr = new New_Frame();
                    fr.setVisible(true);
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"Invalid..! username or password","Warning",JOptionPane.ERROR_MESSAGE);
                }
            }      
       
       });
       
       
        b2.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent e)
            {
                 tf.setText("");
                 pass.setText("");
            }      
       
       });
       
    }
    
  
    public static void main(String[] args) {
        
        
     Logain_Frame frame = new Logain_Frame();
     frame.setVisible(true);
     
    }
   
}
