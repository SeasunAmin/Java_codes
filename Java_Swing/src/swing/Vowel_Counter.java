
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Vowel_Counter extends JFrame 
{
   private Container c;
   private JTextArea tx;
   private JLabel prolabel,vowellabel,alabel,elabel,ilabel,olabel,ulabel;
   private Font f;
   private JScrollPane s;
   
   int total = 0;
   int a = 0;
   int e = 0;
   int i = 0;
   int o = 0;
   int u = 0;
   
    
    Vowel_Counter()
   {
       room();
   }
    public void room()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450,200,700,600);
        this.setTitle("seasun..");
        
        c  =this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        
        f = new Font("Cambria math",Font.BOLD,20); 
        tx = new JTextArea();
       
        tx.setLineWrap(true);
        tx.setWrapStyleWord(true);
        tx.setFont(f);
        s = new JScrollPane(tx);
        s.setBounds(170,50,400,150);
       
        c.add(s);
        
        prolabel = new JLabel("Write Here : ");
        prolabel.setBounds(10,100,150,50);
        prolabel.setFont(f);
        c.add(prolabel);
        
        vowellabel = new JLabel();
        vowellabel.setBounds(10,220,300,50);
        vowellabel.setFont(f);
        c.add(vowellabel);
        
        alabel = new JLabel();
        alabel.setBounds(10,270,200,50);
        alabel.setFont(f);
        c.add(alabel);
        
        elabel = new JLabel();
        elabel.setBounds(10,310,200,50);
        elabel.setFont(f);
        c.add(elabel);
        
        ilabel = new JLabel();
        ilabel.setBounds(10,350,200,50);
        ilabel.setFont(f);
        c.add(ilabel);
        
        olabel = new JLabel();
        olabel.setBounds(10,390,200,50);
        olabel.setFont(f);
        c.add(olabel);
        
        ulabel = new JLabel();
        ulabel.setBounds(10,430,200,50);
        ulabel.setFont(f);
        c.add(ulabel);
        
        
       tx.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent ke)
            {
                
            }

            @Override
            public void keyPressed(KeyEvent ke) 
            {
                
                if(ke.getSource()== tx)
                {
                    if(ke.VK_A == ke.getKeyCode())
                    {
                         a++;
                         total++;
                    }
                    
                     if(ke.VK_E == ke.getKeyCode())
                    {
                         e++;
                         total++;
                    }
                     
                      if(ke.VK_I == ke.getKeyCode())
                    {
                         i++;
                         total++;
                    }
                       if(ke.VK_O == ke.getKeyCode())
                    {
                         o++;
                         total++;
                    }
                    
                    if(ke.VK_U == ke.getKeyCode())
                    {
                         u++;
                         total++;
                    }
                
                
                
                 }
                
                vowellabel.setText("Total number of vowel : "+total);
                alabel.setText("Total A = "+a);
                elabel.setText("Total B = "+e);
                ilabel.setText("Total  I = "+i);
                olabel.setText("Total O = "+o);
                ulabel.setText("Total U = "+u);
                
            }

            @Override
            public void keyReleased(KeyEvent ke)
            {


            }
       
       
       
       });
        
        
    }
    
    public static void main(String[] args) {
   
        
        Vowel_Counter frame =  new Vowel_Counter();
        frame.setVisible(true);
        
    }
}
