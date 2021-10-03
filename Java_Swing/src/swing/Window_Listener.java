
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class Window_Listener extends JFrame
{
    private Container c;
    
    
    Window_Listener()
    {
        room();
    }
    public void room()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,150,600,500);
        this.setTitle("seasun");
        
        c = this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        
        this.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent we) 
            {
                System.out.println("Window Opened");
            }

            @Override
            public void windowClosing(WindowEvent we) 
            {
                System.out.println("Window Colosing");
            }

            @Override
            public void windowClosed(WindowEvent we)
            
            {
                System.out.println("WIndow Closing");
            }

            @Override
            public void windowIconified(WindowEvent we) 
            {
                System.out.println("Window Confied ");
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
                System.out.println("Window Deiconified");
            }

            @Override
            public void windowActivated(WindowEvent we) {
                System.out.println("Window Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent we)
            {
                System.out.println("Window Deactivated");
                
            }
        
        
        
        });
        
        
        
    }
    
    public static void main(String[] args) 
    {
       Window_Listener frame = new Window_Listener();   
       frame.setVisible(true);
       
     
    }
}
