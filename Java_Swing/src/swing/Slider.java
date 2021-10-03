
package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSlider;


public class Slider extends JFrame
{
    private Container c;
    private JSlider s;
    
    Slider()
    {
        room();
    }
    
    public void room()
    {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(350,200,700,600);
        this.setTitle("seasun");
        
        c = this.getContentPane();
        
        c.setLayout(null);
        
        s = new JSlider(0,20,0);
        s.setBounds(100,170,250,60);
        
        s.setMinorTickSpacing(1);
        s.setMajorTickSpacing(5);
        s.setPaintTicks(true);
        s.setPaintLabels(true);
        c.add(s);
        
    }
    
    
    public static void main(String[] args) {
        
        Slider frame = new Slider();
        frame.setVisible(true);
    }
}
