
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Mouse_Motion  extends JFrame
{
    private Container c ;
    private JTextArea ta;
    private JTextField tf;
    private Font f;
    
    Mouse_Motion ()
    {
        room();
    }
    
    private void room()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,100,600,500);
        this.setTitle("seasun");
        
        f = new Font("Cambria Math",Font.BOLD,18);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        tf = new JTextField();
        tf.setBounds(120,70,300,80);
        tf.setFont(f);
        c.add(tf);
        
        ta = new JTextArea ();
        ta.setBounds(115,190,300,200);
        c.add(ta);
        
        ta.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent me) 
            {
                tf.setText("Mouse Dragged :"+me.getX()+" "+me.getY());

            }

            @Override
            public void mouseMoved(MouseEvent me)
            {
                tf.setText("Mouse Moved :"+me.getX()+" "+me.getY());

            }
        
        
        
        
        });
   
    }
    
    public static void main(String[] args)
    {
        
      Mouse_Motion frame = new Mouse_Motion();
      frame.setVisible(true);
        
    }
}
