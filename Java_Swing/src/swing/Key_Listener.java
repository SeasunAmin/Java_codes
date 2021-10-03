
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Key_Listener extends JFrame
{
    private JTextField tx;
    private JTextArea tr;
    private Container c; 
    private Font f;
    
    Key_Listener ()
    {
        room();
    }
    
    public void room()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,70,600,500);
        this.setTitle("SEASUN");
        
        c =  this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        
        
        f = new Font("Cambria math",Font.BOLD,20);
        
        tx = new JTextField();
        tx.setBounds(170,50,200,60);
        tx.setFont(f);
        c.add(tx);
        
        tr = new JTextArea();
        tr.setBounds(100,150,320,250);
        tr.setFont(f);
        c.add(tr);
        
        tx.addKeyListener(new KeyListener(){
        
            @Override
            public void keyPressed(KeyEvent ke)
            {
                tr.append("Key pressed : "+ke.getKeyChar()+"\n");
            }
            
             @Override
            public void keyTyped(KeyEvent ke)
            {
              
                tr.append("Key typed : "+ke.getKeyChar()+"\n");
             
            }
            @Override
            public void keyReleased(KeyEvent ke)
            {
                tr.append("Key releassed : "+ke.getKeyChar()+"\n");
            }

            
   
        });
        
    }
   
    public static void main(String[] args) {
        
        
        Key_Listener frame = new Key_Listener();
        frame.setVisible(true);
        
    }  
}